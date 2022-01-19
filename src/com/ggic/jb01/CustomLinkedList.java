package com.ggic.jb01;

public class CustomLinkedList<T> implements CustomList<T>{

    private final Node<T> node = new Node<>();

    @Override
    public void add(T element) {
       node.add(element);
    }

    @Override
    public String toString() {
        return "";
    }

    static class Node<T> {
        private Node<T> start = null;
        private Node<T> end = null;
        private Node<T> curr = null;
        private Node<T> prev = null;
        private Node<T> next = null;
        private T data = null;

        public Node<T> getCurr() {
            return curr;
        }

        public void setCurr(Node<T> curr) {
            this.curr = curr;
        }

        public Node<T> getPrev() {
            return prev;
        }

        public void setPrev(Node<T> prev) {
            this.prev = prev;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public void add(T element){

            if(curr == null){
                data = element;
                start = this;
                curr = this;
                end = this;
            }else{
                Node<T> node = new Node<>();
                node.setData(element);
                curr.setNext(node);
                node.setPrev(curr);
                curr = node;
                end = node;
            }
        }
    }
}
