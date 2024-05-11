package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.MinsuyudingEntity;
import com.entity.view.MinsuyudingView;

import com.service.MinsuyudingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 民宿预订
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-16 16:55:50
 */
@RestController
@RequestMapping("/minsuyuding")
public class MinsuyudingController {
    @Autowired
    private MinsuyudingService minsuyudingService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,MinsuyudingEntity minsuyuding, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date ruzhuriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date ruzhuriqiend,
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fangzhu")) {
			minsuyuding.setFangzhuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			minsuyuding.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<MinsuyudingEntity> ew = new EntityWrapper<MinsuyudingEntity>();
                if(ruzhuriqistart!=null) ew.ge("ruzhuriqi", ruzhuriqistart);
                if(ruzhuriqiend!=null) ew.le("ruzhuriqi", ruzhuriqiend);
		PageUtils page = minsuyudingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, minsuyuding), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,MinsuyudingEntity minsuyuding, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date ruzhuriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date ruzhuriqiend,
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fangzhu")) {
			minsuyuding.setFangzhuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			minsuyuding.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<MinsuyudingEntity> ew = new EntityWrapper<MinsuyudingEntity>();
                if(ruzhuriqistart!=null) ew.ge("ruzhuriqi", ruzhuriqistart);
                if(ruzhuriqiend!=null) ew.le("ruzhuriqi", ruzhuriqiend);
		PageUtils page = minsuyudingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, minsuyuding), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( MinsuyudingEntity minsuyuding){
       	EntityWrapper<MinsuyudingEntity> ew = new EntityWrapper<MinsuyudingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( minsuyuding, "minsuyuding")); 
        return R.ok().put("data", minsuyudingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(MinsuyudingEntity minsuyuding){
        EntityWrapper< MinsuyudingEntity> ew = new EntityWrapper< MinsuyudingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( minsuyuding, "minsuyuding")); 
		MinsuyudingView minsuyudingView =  minsuyudingService.selectView(ew);
		return R.ok("查询民宿预订成功").put("data", minsuyudingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        MinsuyudingEntity minsuyuding = minsuyudingService.selectById(id);
        return R.ok().put("data", minsuyuding);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        MinsuyudingEntity minsuyuding = minsuyudingService.selectById(id);
        return R.ok().put("data", minsuyuding);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MinsuyudingEntity minsuyuding, HttpServletRequest request){
    	minsuyuding.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(minsuyuding);

        minsuyudingService.insert(minsuyuding);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody MinsuyudingEntity minsuyuding, HttpServletRequest request){
    	minsuyuding.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(minsuyuding);
    	minsuyuding.setUserid((Long)request.getSession().getAttribute("userId"));

        minsuyudingService.insert(minsuyuding);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MinsuyudingEntity minsuyuding, HttpServletRequest request){
        //ValidatorUtils.validateEntity(minsuyuding);
        minsuyudingService.updateById(minsuyuding);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        minsuyudingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<MinsuyudingEntity> wrapper = new EntityWrapper<MinsuyudingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fangzhu")) {
			wrapper.eq("fangzhuzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = minsuyudingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
