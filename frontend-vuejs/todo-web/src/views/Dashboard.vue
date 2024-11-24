<template>
  <div>
    
    <div class="flex justify-between mx-10 my-5">
      <p class="text-2xl font-semibold">Dashboard</p>

      <div class=" block border pr-3 rounded-full">
        <select class="bg-white pl-6 pr-3 py-3 rounded-full text-gray-400 text-sm font-semibold">
          <option>Last Week</option>
        </select>
      </div>
      
    </div>

    <div v-if="!todoStore.isLoading" class="grid lg:grid-cols-3 sm:grid-cols-2 gap-10 mx-10 mt-16">
      <div class="col-span-1 ">
        <div class="bg-red-50 rounded-lg py-14 shadow-lg">
          <p class="text-center text-3xl font-semibold text-green-500">{{ completed }}</p>
          <p class="text-center mt-5 text-gray-400 font-medium">Task Completed</p>
        </div>
      </div>

      <div class="col-span-1">
        <div class="bg-blue-100 rounded-lg py-14 shadow-lg">
          <p class="text-center text-3xl font-semibold text-blue-500">{{ pending }}</p>
          <p class="text-center mt-5 text-gray-400 font-medium">Task Pending</p>
        </div>
      </div>
      <div class="col-span-1">
        <div class="bg-orange-100 rounded-lg py-14 shadow-lg">
          <p class="text-center text-3xl font-semibold text-orange-500">{{ todoStore.todos.length }}</p>
          <p class="text-center mt-5 text-gray-400 font-medium">Total Tasks</p>
        </div>
      </div>
    </div>

    <div v-else class="grid lg:grid-cols-3 sm:grid-cols-2 gap-10 mx-10 mt-16 animate-pulse">
      <div class="col-span-1 ">
        <div class="bg-red-50 rounded-lg py-14 shadow-lg">
          <p class="text-center text-3xl font-semibold text-green-500 bg-gray-300 py-4 mx-4 rounded-lg"></p>
          <p class="text-center text-3xl font-semibold text-green-500 bg-gray-300 py-3 mx-4 mt-8 rounded-lg"></p>
        </div>
      </div>

      <div class="col-span-1">
        <div class="bg-blue-100 rounded-lg py-14 shadow-lg">
          <p class="text-center text-3xl font-semibold text-green-500 bg-gray-300 py-4 mx-4 rounded-lg"></p>
          <p class="text-center text-3xl font-semibold text-green-500 bg-gray-300 py-3 mx-4 mt-8 rounded-lg"></p>
        </div>
      </div>
      <div class="col-span-1">
        <div class="bg-orange-100 rounded-lg py-14 shadow-lg">
          <p class="text-center text-3xl font-semibold text-green-500 bg-gray-300 py-4 mx-4 rounded-lg"></p>
          <p class="text-center text-3xl font-semibold text-green-500 bg-gray-300 py-3 mx-4 mt-8 rounded-lg"></p>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import { onMounted, computed } from 'vue';
import { useTodoStore } from '@/stores/todoStore';

const todoStore = useTodoStore();

const completed = computed(() => {
  const todos = todoStore.todos;
  const completedTodos = todos.filter(t => t.done);
  return completedTodos.length
})

const pending = computed(() => {
  const todos = todoStore.todos;
  const pendingTodos = todos.filter(t => !t.done);
  return pendingTodos.length
})

onMounted(() => {
  window.scrollTo(0, 0);

  todoStore.fetchTodos();
})
</script>