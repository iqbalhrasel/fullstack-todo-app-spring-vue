<template>
  <div>
    <div class=" mx-10 my-5 flex sm:flex-row flex-col justify-between">
      <p class="text-2xl font-bold">Pending Todos</p>

      <input v-model="filterText" type="text" placeholder="Search todo" class="border border-gray-200 px-3 py-1 rounded-3xl mt-3 sm:mt-0">
    </div>

    <div v-if="!todoStore.isLoading" class="grid lg:grid-cols-4 md:grid-cols-3 grid-cols-2 gap-6 sm:mx-10 mx-5">
      <TodoCard v-for="todo in pendingTodos" :key="todo" :todo="todo" @update="toggleForm(todo)" @delete="deleteTodo"/>      
    </div>

    <div v-else class="grid lg:grid-cols-4 md:grid-cols-3 grid-cols-2 gap-6 sm:mx-10 mx-5">
      <LoadingSkeleton v-for="i in 5" :key="i"/>      
    </div>

    <div>
      <TodoForm v-if="showForm" @close-form="toggleForm" :todo="setTodo" @updateTodo="updateTodo"/>
    </div>
  </div>
  
</template>

<script setup>
import TodoCard from '@/components/TodoCard.vue';
import LoadingSkeleton from '@/components/LoadingSkeleton.vue';
import TodoForm from '@/components/TodoForm.vue';
import { ref, onMounted, computed } from 'vue';
import { useTodoStore } from '@/stores/todoStore';

const todoStore = useTodoStore();
const setTodo = ref({});
const showForm = ref(false);
const filterText = ref('');

const pendingTodos = computed(() => {
  if(todoStore.isTodosFetched){
    const todos = todoStore.todos.filter(t => !t.done)
    return todos.filter(t => t.description.toLowerCase().includes(filterText.value.toLowerCase()))
  }
  else{
    todoStore.fetchTodos();
    const todos = todoStore.todos.filter(t => !t.done)
    return todos.filter(t => t.description.toLowerCase().includes(filterText.value.toLowerCase()))
  }
})

function updateTodo(modifiedTodo) {
  todoStore.updateTodo(modifiedTodo)
  setTodo.value = {}
}

function deleteTodo(id) {
  todoStore.deleteTodo(id);
}

function toggleForm(todo = {}) {
  setTodo.value = todo;
  showForm.value = !showForm.value
}

onMounted(() => {
  window.scrollTo(0, 0);  
})
</script>