app.service("PlessonService",function($http){
    		

			//查询全部课程
    		this.selectAll=function(){
    			return $http.get('../Plesson/selectAll.do');
    		}
    		//分页
    		this.findPage=function(page,rows){
    			return $http.get('../Plesson/findPage.do?page='+page+'&rows='+rows);
    		}
    		this.insert=function(entity){
    			return $http.post('../Plesson/insert.do',entity);
    		}
    		this.update=function(entity){
    			return $http.post('../Plesson/update.do',entity);
    		}
    		this.selectOne=function(id){
    			return $http.get('../Plesson/selectOne.do?id='+id);
    		}
    		this.dele=function(ids){
    			return $http.get('../Plesson/delete.do?ids='+ids);
    		}
    		this.search=function(page,rows,searchEntity){
    			return $http.post('../Plesson/search.do?page='+page+'&rows='+rows,searchEntity);
    		}
    	
    	});