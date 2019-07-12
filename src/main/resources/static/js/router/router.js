import Vue from 'vue'
import VueRouter from 'vue-router'
import MessagesList from 'components/messages/MessageList.vue'
import Auth from 'pages/Auth.vue'

Vue.use(VueRouter)

const routes = [
    { path: '/', component: MessagesList},
    { path: '/auth', component: Auth}
]

export default new VueRouter({
    mode: 'history',
    routes
})