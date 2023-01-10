 public void floydremove() {
        Node meet = hasCycle();
        if (meet == null) {
            return;
        }
        Node fast = meet;
        Node slow = head;
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;

        }
        fast.next = null;

    }
