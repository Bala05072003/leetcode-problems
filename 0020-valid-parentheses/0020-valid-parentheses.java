class Solution {
    public boolean isValid(String s) {
        Stack<Character> para=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='{'||ch=='['||ch=='('){
                para.push(ch);
            }
            else{
             if(para.isEmpty()){
                return false;
            }
            char p=para.pop();
                if(ch=='}' && p!='{'||
                ch==']' && p!='[' ||
                ch==')' && p!='('){
                    return false;
                } 
            }            
        }
        return para.isEmpty();
    }
}