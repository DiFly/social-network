import Vue from 'vue'

const comments = Vue.resource('/comment{/id}')

export default  {
    add: comment => comment.save({}, comment)
}