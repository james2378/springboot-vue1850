const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmuizhd/",
            name: "ssmuizhd",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmuizhd/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "传统文化网站"
        } 
    }
}
export default base
