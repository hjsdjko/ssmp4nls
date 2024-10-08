const menu = {
    list() {
        return [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["新增","查看","修改","删除"],"menu":"房主","menuJump":"列表","tableName":"fangzhu"}],"menu":"房主管理"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["新增","查看","修改","删除"],"menu":"房间类型","menuJump":"列表","tableName":"fangjianleixing"}],"menu":"房间类型管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看","修改","删除"],"menu":"民宿信息","menuJump":"列表","tableName":"minsuxinxi"}],"menu":"民宿信息管理"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看","删除"],"menu":"民宿预订","menuJump":"列表","tableName":"minsuyuding"}],"menu":"民宿预订管理"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"公告信息","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["民宿预订"],"menu":"民宿信息列表","menuJump":"列表","tableName":"minsuxinxi"}],"menu":"民宿信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看","支付"],"menu":"民宿预订","menuJump":"列表","tableName":"minsuyuding"}],"menu":"民宿预订管理"},{"child":[{"appFrontIcon":"cuIcon-favor","buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["民宿预订"],"menu":"民宿信息列表","menuJump":"列表","tableName":"minsuxinxi"}],"menu":"民宿信息模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["新增","查看","修改","删除","查看评论"],"menu":"民宿信息","menuJump":"列表","tableName":"minsuxinxi"}],"menu":"民宿信息管理"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看","审核"],"menu":"民宿预订","menuJump":"列表","tableName":"minsuyuding"}],"menu":"民宿预订管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["民宿预订"],"menu":"民宿信息列表","menuJump":"列表","tableName":"minsuxinxi"}],"menu":"民宿信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"房主","tableName":"fangzhu"}]
    }
}
export default menu;
