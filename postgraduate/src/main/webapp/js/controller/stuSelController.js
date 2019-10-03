app.controller('stuSelController',function($scope,$http,stuSelService){

	
	//学生查询开放课程
	$scope.stuSelAll=function(){
		stuSelService.stuSelAll().success(
				function(response){
					$scope.list=response;
					
				}	
		);
	}
	$scope.reloadList=function(){
			 //切换页码  
				$scope.findPage( $scope.paginationConf.currentPage, $scope.paginationConf.itemsPerPage);
			}
			
  		//分页控件配置 
  		$scope.paginationConf = {
  				 currentPage: 1,
  				 totalItems: 1,
  				 itemsPerPage: 1,
  				 perPageOptions: [1, 2, 3, 4, 5],
  				 onChange: function(){
  				        	 $scope.reloadList();//重新加载
  				 }
  		};
  		
  	    //分页
		$scope.findPage=function(page,rows){	
			stuSelService.findPage(page,rows).success(
					function(response){
						console.log(response);
						$scope.list=response.rows;	
						$scope.paginationConf.totalItems=response.total;//更新总记录数
					}			
			);
		}
	//查询实体
	$scope.selectOne=function(id){
		stuSelService.selectOne(id).success(
			function(response){
				$scope.entity=response;
			}		
		);
	} 	
	//修改状态
	$scope.save=function(){
		var object=null;
		
		object=stuSelService.update($scope.entity);
	
		object.success(
				function(response){
					if(response.success){
						$scope.reloadList();
					}else{
						alert(response.message);
					}
				}
		);
	}	
	$scope.state=['不可选','开放选课'];
});