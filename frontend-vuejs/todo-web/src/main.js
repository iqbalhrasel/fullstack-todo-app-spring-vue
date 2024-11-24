import './assets/main.css'

import { createApp } from 'vue'
import { createPinia } from 'pinia'

import App from './App.vue'
import router from './router'

const app = createApp(App)

router.beforeEach((to, from, next) => {
  document.title = to.meta.title || 'Donevo | Best todo app';
  next();
})

app.use(createPinia())
app.use(router)

app.mount('#app')
