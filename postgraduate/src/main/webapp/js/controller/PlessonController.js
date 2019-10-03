app.controller('PlessonController',function($scope,$http,PlessonService){

	//查询全部课程
    		$scope.selectAll=function(){
    			PlessonService.selectAll().success(
    					function(response){
    						$scope.list=response;
    					}	
    			);
    		}
    		
    		$scope.reloadList=function(){
   			 //切换页码  
   				$scope.search( $scope.paginationConf.currentPage, $scope.paginationConf.itemsPerPage);
   			}
   			
	   		//分页控件配置 
	   		$scope.paginationConf = {
	   				 currentPage: 1,
	   				 totalItems: 1,
	   				 itemsPerPage: 1,
	   				 perPageOptions: [1, 2, 3, 4, 5],
	   				 onChange: function(){
	   				        	 $scope.reloadList();//重新加载
	   				        	 Ids=Ids;//选中的ID集合
	   				 }
	   		};
	   		
	   	    //分页
    		$scope.findPage=function(page,rows){	
    			PlessonService.findPage(page,rows).success(
    					function(response){
    						$scope.list=response.rows;	
    						$scope.paginationConf.totalItems=response.total;//更新总记录数
    					}			
    			);
    		}
	   	    $scope.flag={};
    		//增加保存
    		$scope.save=function(){
    			var object=null;
    			if($scope.flag==1){
    				object=PlessonService.insert($scope.entity);
    			}else{
    				object=PlessonService.update($scope.entity);
    			}
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
    		
    		//查询实体
    		$scope.selectOne=function(id){
    			$scope.flag={};
    			PlessonService.selectOne(id).success(
    				function(response){
    					$scope.entity=response;
    				}		
    			);
    		} 
    		
    		//更新复选
    		$scope.updateSelection = function($event,id){
    			if($event.target.checked){
    				Ids.push(id);
    			}else{
    				var idx = Ids.indexOf(id);
    				Ids.splice(idx,1);//删除
    			}
    		}
    		//批量删除
    		$scope.dele=function(){
    			PlessonService.dele($scope.selectIds).success(
    				function(response){
    					if(response.success){
    						$scope.reloadList();
    					}
    				}	
    			);
    		}
    		$scope.searchEntity={};//定义搜索对象
			//条件查询
			$scope.search=function(page,rows){
				PlessonService.search(page,rows,$scope.searchEntity).success(
					function(response){
						$scope.paginationConf.totalItems=response.total;//总记录数 
						$scope.list=response.rows;//给列表变量赋值 

					}		
				)
			}
			
    	});