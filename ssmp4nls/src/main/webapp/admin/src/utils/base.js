const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmp4nls/",
            name: "ssmp4nls",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmp4nls/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于微信小程序的民宿短租系统"
        } 
    }
}
export default base
