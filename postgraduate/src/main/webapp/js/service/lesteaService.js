app.service("lesteaService",function($http){
			//查询全部
    		this.selectAll=function(){
    			return $http.get('../LesTea/selectAll.do');
    		}
    		//学生查询开放选课
    		this.stuSelectAll=function(){
    			return $http.get('../LesTea/stuSelectAll.do');
    		}
    		//查询单个
    		this.selectOne=function(id){
    			return $http.get('../LesTea/selectOne.do?id='+id);
    		}
    		this.update=function(entity){
    			return $http.post('../LesTea/update.do',entity);
    		}
    		//分页
    		this.findPage=function(page,rows){
    			return $http.get('../LesTea/findPage.do?page='+page+'&rows='+rows);
    		}
    	
});