 public void reorderList(ListNode head) {
          ArrayList<Integer> list = new ArrayList<>();
        ListNode n = head;
        while(n!=null){
            list.add(n.val);
            n = n.next;
        }
        
        int  l =0 , h = list.size()-1;
        int count = 0;
        ListNode newHead = null;
        ListNode ctr = null;
        
       
    
    
    
    
    
        while(l<=h){
            if(count%2==0){
                int val = list.get(l);
                if(newHead==null){
                    newHead = new ListNode(val);
                    ctr = newHead;
                }
                else{
                    ListNode n1 = new ListNode(val);
                    ctr.next = n1;
                    ctr = n1;
                    
                }
                l++;
                count++;
                
                
                
            }
            else{
                
                int val = list.get(h);
                
                   ListNode n1 = new ListNode(val);
                    ctr.next = n1;
                    ctr = n1;
                
                h--;
                count++;
                
            }
            
            
            
        }
        ListNode n2 = head;
        while(n2!=null){
            n2.val = newHead.val;
            n2 = n2.next;
            newHead = newHead.next;

        }
    }
