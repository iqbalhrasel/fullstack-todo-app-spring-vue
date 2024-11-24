<template>
  <div class="border bg-blue-50 sm:h-screen sm:block flex justify-between items-center px-5 sm:px-0 sticky top-0" id="side-nav">
      <div class="sm:block flex space-x-6 sm:space-x-0">
        
        <RouterLink :to="{name: 'dashboard'}" title="Dashboard" class="nav-link">
          <squareicon class="sm:size-8 size-6"/>
        </RouterLink>
        
        <RouterLink :to="{name: 'todos'}" title="Dashboard" class="nav-link"> 
          <collectionico class="sm:size-8 size-6"/>
        </RouterLink>

      
        <RouterLink :to="{name: 'completed'}" title="Completed" class="nav-link"> 
          <tickcircleico class="sm:size-8 size-6"/>
        </RouterLink>
      
        <RouterLink :to="{name: 'pending'}" title="Completed" class="nav-link"> 
          <clockico class="sm:size-8 size-6"/>
        </RouterLink>    
      </div>
      
      <div class="sm:hidden block">
        <slot name="logout"></slot>
      </div>
  </div>
</template>

<script setup>
import squareicon from '@/components/icons/squareicon.vue';
import clockico from '../icons/clockico.vue';
import tickcircleico from '../icons/tickcircleico.vue';
import collectionico from '../icons/collectionico.vue';
</script>

<style>
#side-nav a.router-link-exact-active {
  @apply border-orange-500
}

#side-nav .nav-link{
  @apply flex sm:flex-row flex-col justify-center text-blue-400 sm:mt-10 sm:border-r-[6px] border-b-[6px] sm:border-b-0 sm:rounded-r rounded-b border-blue-50 py-2 sm:py-0
}
</style>