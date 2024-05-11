<template>
<view class="content">
	<view class="box" :style='{"padding":"48rpx","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 auto","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0.5)","borderRadius":"0","borderWidth":"0","width":"96%","borderStyle":"solid","height":"100%"}'>
		<view class="logo" :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="true">
			<image :style='{"padding":"0","boxShadow":"0 0 0px #59f43e","margin":"0 auto","borderColor":"#ccc","borderRadius":"50%","borderWidth":"0","width":"160rpx","borderStyle":"solid","url":"http://codegen.caihongy.cn/20220215/3f51d2afc22a4c89985dda4b49d5626d.jpg","isShow":true,"height":"160rpx"}' src='http://codegen.caihongy.cn/20220215/3f51d2afc22a4c89985dda4b49d5626d.jpg' mode="aspectFill"></image>
		</view>
		<view :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"padding":"0 24rpx","boxShadow":"0px 6rpx 12rpx rgba(0, 0, 0, 0.16)","margin":"0","borderColor":"#ccc","backgroundColor":"#fff","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"12rpx","borderWidth":"0","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.yonghuzhanghao"  type="text"  class="uni-input" name="" placeholder="用户账号" />
		</view>
		<view :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"padding":"0 24rpx","boxShadow":"0px 6rpx 12rpx rgba(0, 0, 0, 0.16)","margin":"0","borderColor":"#ccc","backgroundColor":"#fff","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"12rpx","borderWidth":"0","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.mima" type="password"  class="uni-input" name="" placeholder="密码" />
		</view>
        <view :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
            <input :style='{"padding":"0 24rpx","boxShadow":"0px 6rpx 12rpx rgba(0, 0, 0, 0.16)","margin":"0","borderColor":"#ccc","backgroundColor":"#fff","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"12rpx","borderWidth":"0","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.mima2" type="password" class="uni-input" name="" placeholder="确认密码" />
        </view>
		<view :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"padding":"0 24rpx","boxShadow":"0px 6rpx 12rpx rgba(0, 0, 0, 0.16)","margin":"0","borderColor":"#ccc","backgroundColor":"#fff","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"12rpx","borderWidth":"0","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.yonghuxingming"  type="text"  class="uni-input" name="" placeholder="用户姓名" />
		</view>
		<view :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<picker  @change="yonghuxingbieChange" :value="yonghuxingbieIndex" :range="yonghuxingbieOptions">
				<view :style='{"padding":"0 24rpx","boxShadow":"0px 6rpx 12rpx rgba(0, 0, 0, 0.16)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","color":"#333","textAlign":"left","borderRadius":"12rpx","borderWidth":"0","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}'  class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
			</picker>
		</view>
		<view :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"padding":"0 24rpx","boxShadow":"0px 6rpx 12rpx rgba(0, 0, 0, 0.16)","margin":"0","borderColor":"#ccc","backgroundColor":"#fff","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"12rpx","borderWidth":"0","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.shoujihaoma"  type="text"  class="uni-input" name="" placeholder="手机号码" />
		</view>
		<view :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='fangzhu'" class="uni-form-item uni-column">
			<input :style='{"padding":"0 24rpx","boxShadow":"0px 6rpx 12rpx rgba(0, 0, 0, 0.16)","margin":"0","borderColor":"#ccc","backgroundColor":"#fff","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"12rpx","borderWidth":"0","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.fangzhuzhanghao"  type="text"  class="uni-input" name="" placeholder="房主账号" />
		</view>
		<view :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='fangzhu'" class="uni-form-item uni-column">
			<input :style='{"padding":"0 24rpx","boxShadow":"0px 6rpx 12rpx rgba(0, 0, 0, 0.16)","margin":"0","borderColor":"#ccc","backgroundColor":"#fff","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"12rpx","borderWidth":"0","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.mima" type="password"  class="uni-input" name="" placeholder="密码" />
		</view>
        <view :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='fangzhu'" class="uni-form-item uni-column">
            <input :style='{"padding":"0 24rpx","boxShadow":"0px 6rpx 12rpx rgba(0, 0, 0, 0.16)","margin":"0","borderColor":"#ccc","backgroundColor":"#fff","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"12rpx","borderWidth":"0","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.mima2" type="password" class="uni-input" name="" placeholder="确认密码" />
        </view>
		<view :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='fangzhu'" class="uni-form-item uni-column">
			<input :style='{"padding":"0 24rpx","boxShadow":"0px 6rpx 12rpx rgba(0, 0, 0, 0.16)","margin":"0","borderColor":"#ccc","backgroundColor":"#fff","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"12rpx","borderWidth":"0","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.fangzhuxingming"  type="text"  class="uni-input" name="" placeholder="房主姓名" />
		</view>
		<view :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='fangzhu'" class="uni-form-item uni-column">
			<picker  @change="fangzhuxingbieChange" :value="fangzhuxingbieIndex" :range="fangzhuxingbieOptions">
				<view :style='{"padding":"0 24rpx","boxShadow":"0px 6rpx 12rpx rgba(0, 0, 0, 0.16)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","color":"#333","textAlign":"left","borderRadius":"12rpx","borderWidth":"0","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}'  class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
			</picker>
		</view>
		<view :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='fangzhu'" class="uni-form-item uni-column">
			<input :style='{"padding":"0 24rpx","boxShadow":"0px 6rpx 12rpx rgba(0, 0, 0, 0.16)","margin":"0","borderColor":"#ccc","backgroundColor":"#fff","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"12rpx","borderWidth":"0","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.lianxidianhua"  type="text"  class="uni-input" name="" placeholder="联系电话" />
		</view>
		<view :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0 0 24rpx","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='fangzhu'" class="uni-form-item uni-column">
			<input :style='{"padding":"0 24rpx","boxShadow":"0px 6rpx 12rpx rgba(0, 0, 0, 0.16)","margin":"0","borderColor":"#ccc","backgroundColor":"#fff","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"12rpx","borderWidth":"0","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.shenfenzhenghao"  type="text"  class="uni-input" name="" placeholder="身份证号" />
		</view>
		<button class="btn-submit" @tap="register" type="primary" :style='{"padding":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(239, 184, 101, 1)","borderRadius":"1800rpx 1800rpx 40rpx 40rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0","width":"100%","fontSize":"40rpx","borderStyle":"solid","height":"200rpx"}'>注册</button>
	</view>
</view>
</template>

<style>
	.btn-submit {
		height: auto !important;
		line-height: 200rpx;
	}
</style>
<script>
	export default {
		data() {
			return {
                                yonghuxingbieOptions: [],
                                yonghuxingbieIndex: 0,
                                fangzhuxingbieOptions: [],
                                fangzhuxingbieIndex: 0,
				ruleForm: {
				},
				emailcode: "",
				tableName:""
			}
		},
		async onLoad() {
			let res = [];
			let table = uni.getStorageSync("loginTable");
	    		this.tableName = table;

                        // 自定义下拉框值
			if(this.tableName=='yonghu'){
                this.yonghuxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.yonghuxingbieOptions[0]
			}
                        // 自定义下拉框值
			if(this.tableName=='fangzhu'){
                this.fangzhuxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.fangzhuxingbieOptions[0]
			}
			
			this.styleChange()
		},
		methods: {

                        // 下拉变化
                        yonghuxingbieChange(e) {
                                this.yonghuxingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.yonghuxingbieOptions[this.yonghuxingbieIndex]
                        },
                        // 下拉变化
                        fangzhuxingbieChange(e) {
                                this.fangzhuxingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.fangzhuxingbieOptions[this.fangzhuxingbieIndex]
                        },

			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.registerFrom.content.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			// 注册
			async register() {
				if((!this.ruleForm.yonghuzhanghao) && `yonghu` == this.tableName){
					this.$utils.msg(`用户账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `yonghu` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
                if(`yonghu` == this.tableName && (this.ruleForm.mima!=this.ruleForm.mima2)){
                    this.$utils.msg(`两次密码输入不一致`);
                    return
                }
				if((!this.ruleForm.yonghuxingming) && `yonghu` == this.tableName){
					this.$utils.msg(`用户姓名不能为空`);
					return
				}
				if(`yonghu` == this.tableName && this.ruleForm.shoujihaoma&&(!this.$validate.isMobile(this.ruleForm.shoujihaoma))){
					this.$utils.msg(`手机号码应输入手机格式`);
					return
				}
				if((!this.ruleForm.fangzhuzhanghao) && `fangzhu` == this.tableName){
					this.$utils.msg(`房主账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `fangzhu` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
                if(`fangzhu` == this.tableName && (this.ruleForm.mima!=this.ruleForm.mima2)){
                    this.$utils.msg(`两次密码输入不一致`);
                    return
                }
				if((!this.ruleForm.fangzhuxingming) && `fangzhu` == this.tableName){
					this.$utils.msg(`房主姓名不能为空`);
					return
				}
				if(`fangzhu` == this.tableName && this.ruleForm.lianxidianhua&&(!this.$validate.isMobile(this.ruleForm.lianxidianhua))){
					this.$utils.msg(`联系电话应输入手机格式`);
					return
				}
				if(`fangzhu` == this.tableName && this.ruleForm.shenfenzhenghao&&(!this.$validate.checkIdCard(this.ruleForm.shenfenzhenghao))){
					this.$utils.msg(`身份证号应输入身份证格式`);
					return
				}
				await this.$api.register(`${this.tableName}`, this.ruleForm, this.emailcode);
				this.$utils.msgBack('注册成功');;
			}
		}
	}
</script>

<style lang="scss" scoped>
	$color-primary: #b49950;
	.content {
		height: calc(100vh - 44px);
		overflow: auto;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-image: url(http://codegen.caihongy.cn/20210306/57c665540aad4d5d8f9ace74ee0a5c97.jpg);
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	.logo {
		text-align: center;

		image {
			height: 200upx;
			width: 200upx;
			margin: 0 0 60upx;
		}
	}

	.uni-form-item {
		margin-bottom: 40upx;
		padding: 0;

		.uni-input {
			font-size: 30upx;
			padding: 7px 0;
		}
	}

	button[type="primary"] {
		background-color: $color-primary;
		border-radius: 0;
		font-size: 34upx;
		margin-top: 60upx;
	}

	.links {
		text-align: center;
		margin-top: 40upx;
		font-size: 26upx;
		color: #999;

		view {
			display: inline-block;
			vertical-align: top;
			margin: 0 10upx;
		}

		.link-highlight {
			color: $color-primary
		}
	}
.picker-select-input {
	line-height: 88rpx;
}

</style>
