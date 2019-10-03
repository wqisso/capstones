app.service('TrainService',function($http){
	//增加培养计划
	this.insert=function(entity){
		return $http.post('../Train/insert.do',entity);
	}
	//单条查询
	this.selectOne=function(id){
		return $http.get('../Train/selectOne.do?id='+id);
	}
	this.selectAll=function(){
		return $http.get('../Train/selectAll.do');
	}
	//分页
	this.findPage=function(page,rows){
		return $http.get('../Train/findPage.do?page='+page+'&rows='+rows);
	}
	//审核
	this.updateState=function(id,state){
		return $http.post('../Train/updateState.do?id='+id+'&state='+state);
	}
	//模糊查询分页
	this.search=function(page,rows,searchEntity){
		return $http.post('../Train/search.do?page='+page+'&rows='+rows,searchEntity);
	}
	this.insertLesTra=function(lesid,traid){
		return $http.post('../Train/insertLesTra.do?lesid='+lesid+'&traid='+traid);
	}
});