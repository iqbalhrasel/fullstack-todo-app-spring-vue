import { createRouter, createWebHistory } from 'vue-router'
import { useAuthStore } from '@/stores/authStore'
import Home from '@/views/Home.vue'
import TodoApp from '@/views/TodoApp.vue'
import AllTodos from '@/views/todos/AllTodos.vue'
import CompletedTodos from '@/views/todos/CompletedTodos.vue'
import PendingTodos from '@/views/todos/PendingTodos.vue'
import Dashboard from '@/views/Dashboard.vue'
import Login from '@/views/Login.vue'
import LandingPage from '@/views/LandingPage.vue'
import Register from '@/views/Register.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      redirect: '/home',  // Redirect /app to /app/dashboard
    },
    {
      path: '/',
      name: 'landing',
      component: LandingPage,
      children: [
        {
          path: 'home',
          name: 'home',
          component: Home,
          meta: {title: 'Donevo | Best todo app'},
        },
        {
          path: 'login',
          name: 'login',
          component: Login,
          meta: {title: 'Login to Donevo'},
        },
        {
          path: 'register',
          name: 'register',
          component: Register,
          meta: {title: 'Register to Donevo'},
        },
      ]
    },
    
    {
      path: '/app',
      redirect: '/app/dashboard', 
    },
    {
      path: '/app',
      name: 'app',
      component: TodoApp,
      meta: {requiresAuth: true},
      children:[
        {
          path: 'todos',
          name: 'todos',
          component: AllTodos,
          meta: {title: 'All todos | Donevo'},
        },
        {
          path: 'dashboard',
          name: 'dashboard',
          component: Dashboard,
          meta: {title: 'Dashboard | Donevo'},
        },
        {
          path: 'completed',
          name: 'completed',
          component: CompletedTodos,
          meta: {title: 'Completed todos | Donevo'},
        },
        {
          path: 'pending',
          name: 'pending',
          component: PendingTodos,
          meta: {title: 'Pending todos | Donevo'},
        }
      ]
    },
    
  ],
})

// protect a resouce or route
router.beforeEach((to, from, next) =>{
  const authStore = useAuthStore();

  if(to.matched.some(record => record.meta.requiresAuth)){
    if(!authStore.isLoggedin){
      next({name: 'login'})
    }
    else{
      next();
    }
  }
  else{
    next();
  }
})

export default router
