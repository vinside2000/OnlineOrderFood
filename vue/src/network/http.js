import {request} from './request'
import axios from 'axios'

//用户
export function userRegister(user){
	//用户注册，传参user(昵称，密码，手机号)
	return axios.post('http://localhost:31005/user/register',
		user
	)
	// .then((response)=>{
	// 	//console.log(response);
	// }).catch((error) => {
	// 	//console.log(error);
	// })
}

export function getUserInfo(phone){
	//通过手机号获取用户的信息
	return request({
		url: 'http://localhost:31005/user/finduser/'+phone
	})
}

export function getHistoryOrder(id){
	//通过用户phone获取该用户的所有订单
	return request({
		url: 'http://localhost:31005/shop/findorder/' + id
	})
}

export function getMakingOrder(phone){
	//通过用户手机获取该用户未完成的订单
	return request({
		url: ''
	})
}



export function getGoodsort() {
	return request({
		url: 'http://localhost:31005/food/selectallattribute'
	})
}

export function getAllGoods() {
	//获取所有菜品的信息，包含菜品id 名字 价格
	return request({
		url: 'http://localhost:31005/food/selectall'
		//url:'http://localhost:3000/good'
	})
}

export function SubmitShopCar(infos) {
	//将购买信息上传到数据库
	axios.post('http://localhost:31005/shop/addorder',
		infos
	).then((response)=>{
		console.log(response);
	}).catch((error) => {
		console.log(error);
	})
}

export function getShopInfo() {
	//获取店铺信息
	return request({
		url: ''
	})
}


//获取所有订单
export function getAllOrders(){
	return request({
		url:'http://localhost:31005/shop/findallorder'
	})
}
//查看未完成订单
export function getWaitingOrder(){
	return request({
		url:'http://localhost:31005/shop/findfail'
	})
}
//查看已完成订单
export function getFinishOrder(){
	return request({
		url:'http://localhost:31005/shop/findsucc'
	})
}
//完成订货单
export function completeOrder(id){
	return request({
		url:'http://localhost:31005/shop/complete/'+id+'/完成'
	})
}
//取消订单
export function cancelOrder(id){
	return request({
		url:'http://localhost:31005/shop/complete/'+id+'/取消'
	})
}
