import Vue from 'vue'
import Router from 'vue-router'

const Home = () => import('@/components/home/Home')
const Order = () => import('@/components/order/Order')
const Profile = () => import('@/components/profile/Profile')
//购物有关的组件
const ChooseGood = () => import('@/components/home/options/ChooseGood')
const SubmitOrder = () => import('@/components/home/options/SubmitOrder')
const Discount = () => import('@/components/home/options/Discount')
const PaySuccess = () => import('@/components/home/options/PaySuccess')
//用户登录注册
const Register = () => import('@/components/userdao/Register')
const Login = () => import('@/components/userdao/Login')
//用户首页
const MyDiscount = () => import('@/components/profile/MyDiscount')
const History = () => import('@/components/profile/History')
const Userinfo = () => import('@/components/profile/Userinfo')
const Howuse = () => import('@/components/profile/Howuse')
Vue.use(Router)

export default new Router({
  mode:"history",
  routes: [
  	{
  		path: '/',
  		redirect: '/login'
  	},
    {
    	path: '/home',
    	component: Home
    },
    {
    	path: '/order',
    	component: Order
    },
    {
    	path: '/profile',
    	component: Profile
    },
    {
      path: '/choosegood',
      component: ChooseGood,
      meta: {
        keepAlive: true // 需要缓存
      }
    },
    {
      path: '/submitorder',
      component: SubmitOrder
    },
    {
      path: '/discount',
      component: Discount
    },
    {
      path: '/paysuccess',
      component: PaySuccess
    },
    {
      path: '/register',
      component: Register
    },
    {
      path: '/login',
      component: Login
    },
    {
      path: '/mydiscount',
      component: MyDiscount
    },
    {
      path: '/history',
      component: History
    },
    {
      path: '/userinfo',
      component: Userinfo
    },
    {
      path: '/howuse',
      component: Howuse
    }
  ]
})
