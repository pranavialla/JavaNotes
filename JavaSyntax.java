import java.lang.Math;
import java.util.*;
public class Main{
    public static void main(String args[]){
        String s22="<"+2;
        /*to print 
        cursour goes to next line*/
        System.out.println("hey"+s22);
        
        /*to print 
        cursour doesn't goes to next line
        string format printf*/
        System.out.print("good ");
        System.out.print("morning");
        
        /*declaration in java*/
        int int_variable=9;
        System.out.println();
        System.out.println(int_variable);
        
        /*printing other data types in java
        append it with string*/
        System.out.println( 5/5);
        System.out.println( 5/5 +" "+  5/4.2 +" "+  5.3/4);
        
        /*command line arguments
        convert string to int 
        convert string to double
        convert string to double
        */
        
        int str_to_int=Integer.parseInt("321");
        System.out.println(str_to_int);
        
        double str_to_double=Double.parseDouble("321.2323423");
        System.out.println(str_to_double);
        
        long str_to_long=Long.parseLong("321");
        System.out.println(str_to_long);
        
        /*read input
        import util package*/
        //read a single token
        
        int int_var;
        char char_var;
        //has next token or not 
        Scanner in = new Scanner(System.in);

        //taking nextLine
        String ss = in.nextLine();
        System.out.println("You entered string " + ss);
 
        //similar syntax to other Double, Long and all */
        //next integer value
        if (in.hasNext()){
        int aa = in.nextInt();
        System.out.println("You entered integer " + aa);}
        
        if (in.hasNext()){
        float bb = in.nextFloat();
        System.out.println("You entered float " + bb);}
        while (in.hasNext()){
            String s = in.nextLine();
            System.out.println(s);}
        
        /*to math libraries 
        
        import java.lang.Math;
        similar with min , max 2 numbers, these methods also valid for the array
        round to nearest integers, log, exp, sqrt*/
        
        //convert to positive nums
        System.out.println(Math.abs(-3));
        
        //a to the power b
        System.out.println(Math.pow(2,3));
        
        /*if else statements
        bracket is mandatory*/
        int a=2,b=3;
        if (a>b){
            a=a+23;
            System.out.println(b);
            
        }
        // if one line
        else if (a<b) System.out.println(a);
        else{
            System.out.println(a+b);
        }
        
        
        /*while loop*/
        int i=0;
        while(i<5){
            i++;
        }
        System.out.println(i);
        
        /*do while loop*/
        int j=5;
        do {
            j++;
        }while(j<5);
        System.out.println(j);
        
        /*data type of switch case should be same as case after data type*/
        System.out.println("switch case");
        switch("hi"){
            case "fi":
                System.out.println(1);
            case "hi":
                System.out.println(2);
            case "di":
                System.out.println(3);
            default:
                System.out.println(4);
        }
        
        switch("hi"){
            case "fi":
                System.out.println(1);
                break;
            case "hi":
                System.out.println(2);
                break;
            case "di":
                System.out.println(3);
                break;
            default:
                System.out.println(4);
                break;
        }
        
        /*arrays
        Arrays.fill(dp, Integer.MAX_VALUE);*/
        int[] arr_int=new int[10];
        for (int index=0; index<10;index++){
            System.out.println(arr_int[index]);
        }
        
        //array declaration with initialisation
        char[] arr_char=new char[10];
        for (int index=0; index<10;index++){
            //it will print nothing
            System.out.println(arr_char[index]);
        }
        
        //to get length of array 
        char[] arr_char_def={'a','b','c','d','e'};
        for (int index=0; index<arr_char_def.length;index++){
            //it will print nothing
            System.out.println(arr_char_def[index]);
        }
        
        String[] arr_String={"as", "dssd","efef", "ffwe", "huh"};
        for (int index=0; index<arr_String.length;index++){
            //it will print nothing
            System.out.println(arr_String[index]);
            arr_String[index]="";
            System.out.println(arr_String[index]);
        }
        
        String im_string="hi pranavi";
        System.out.println(im_string.substring(0,3)+"raj"+ im_string.length());
        
        /*2d arrays*/
        int[][] arr_arr={{1,2,3},{4,5,6}};
        for (int index=0; index<arr_arr.length;index++){
            for (int ii=0; ii<arr_arr[index].length;ii++)
            System.out.println(arr_arr[index][ii]);
        }
        
        int[] arr={1,2,2,3,3,4,1,1,1,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        //String declaration both are same
        String s1=new String("hello ra"); 
        String s2="hai ra";
        
        //length
        System.out.println(s1.length());
        
        //char at at index
        System.out.println(s1.charAt(0));
        
        
        //substring
        System.out.println(s1.substring(0,2));
        
        //assign concatinated string to new reference
        System.out.println(s1.concat(s2));
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        
        //replace the string and assign it to new variable it wont reflect it's value
        System.out.println(s1.replace("h","g"));
        System.out.println("s1:"+s1);
        
        //split the string
        String[] s1_array=s1.split(" ");
        System.out.println("splited string : "+ s1_array);
        System.out.println("s1 string : "+ s1);
        for (int index=0; index<s1_array.length;index++)
            System.out.println(index+" index of s1_array : "+ s1_array[index]);
        
        //joins the array with 1st argument delimeter
        System.out.println(String.join(" ",s1_array));
        
        //compare 2 strings as equal
        System.out.println(s1.equals(s2));
        
        //convert to uppercase
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        
        //ascii value
        char ch='a';
        int i1=(int) ch;
        System.out.println("ASCII VALUE :"+ i1);
        
        /*using premitive datatypes as objects or wrapperclass for collections
        primitive   wrapper (difference is first letter capital and for integer and character full name
        byte        Byte
        char        character
        int         integer
        */
        //primitive to obj
        Integer int_val =new Integer(12);
        System.out.println(int_val);
        
        /* @-interface
        @Iterable
            @Collection
                @List
                    ArrayList
                    LinkedList
                    Vector
                        Stack
                @Queue
                    PriorityQueue
                    @Deque
                        ArrayDeque(implenments LinkedList & Dequeue)
                @Set
                    HashSet
                    LinkedHashSet
                    @SortedSet
                        TreeSet
                        
                */
                
            /*methods of Collection
            
            .size()
            
            .add(Type var)
            .addAll()
            
            .get()
            
            .add(index, insertValue) //insert 
            .set(index, newvalue)   //modify
            
            .remove(Object ele)
            
            .contains(Object ele)
            
            methods of Iterable
            
            hasNext()  if there are next ele then true else false
            next()      return the current and move to the next ele
            
            Collections.sort()
            
            */
            
        /*
        
        @List
            ordered Collection of ele
            can have dup values
            
            ~ArrayList
                maintain insertion order
                can have duplicates
                randomly access ele
                non synchronized
            ~LinkedList(double linked list implementation internally)
                maintain insertion order
                can have duplicates
                manupulation is easy as there is no shifting
                non synchronized
                    addFirst()	    Adds an item to the beginning of the list	
                    addLast()	    Add an item to the end of the list	
                    removeFirst()	Remove an item from the beginning of the list	
                    removeLast()	Remove an item from the end of the list	
                    getFirst()	    Get the item at the beginning of the list	
                    getLast()	    Get the item at the end of the list
            ~Vector
                similar to ArrayList
                synchronized
                ~Stack
                    last in first out
                    push(), peek(), pop()
                    empty()
                    search(Object)
        
        @Queue
            first in first out
            ordered list used to hold which are about to process
            boolean add(object)	        It is used to insert the specified element into this queue and return true upon success.
            boolean offer(object)	    It is used to insert the specified element into this queue.
            Object remove()	            It is used to retrieves and removes the head of this queue.
            Object poll()	            It is used to retrieves and removes the head of this queue, or returns null if this queue is empty.
            Object element()	        It is used to retrieves, but does not remove, the head of this queue.
            Object peek()	            It is used to retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
            
            ~PriorityQueue
                
            @Deque
                double ended queue
                can add remove from both ends
                
                ~ArrayDeque
                ~LinkedList
        
        @Set
            unordered elements
            no duplicates
            only single null is allowed
                addAll() method is used to perform the union,
                retainAll() method is used to perform the intersection and 
                removeAll() method is used to perform difference
                ~HashSet
            ~LinkedHashSet
                LinkedList implementation of HashSet
                ordered
                null ele's is allowed
            @SortedSet
                increasing order of ele
                ~TreeSet
                    tree implementation internally
                    can contains duplicates
                            
    
    iterating through elements
    
    iterator itr=Collection_variable_name.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
    
    for (Strign each_ele : colletions_array){
        System.out.println(each);
    }
    */
    
    /*
    @Map
        @SortedMap
            TreeMap
        HashMap
            LinkedHashMap
        
    @Map
        contains key value pairs
        unique keys, can have duplicate values
        
        @SortedMap
            ~TreeMap
                no null key or values
                assesnding order of ele maintained
        ~HashMap
            order not maintained
            can have null keys and values
            ~LinkedHashMap
                insertion order maintained
    
    
    methods
    
    .size()
    
    .put(Object key, Object value)  // new pair creates if not there are not there similar to dict
    .putAll(Map)
    
    .get(Object key)
    .values()               //returns collection view of values in the hashmap
    .keySet()               // set view of keys. changes in the set reflect to map vice versa

    
    .put(Object key, Object value)
    
    .remove(Object key)     //removes key if present
    
    .containsKey(Object)    //particular key is present in map
    .containsValue(Object)  //particular value 
    
    int[] charArr=str.toCharArray();  //converting string to char arry
    Arrays.sort(charArr) //sorting array
    Collections.sort(nameofcollection)  //sort
    Collections.reverse(nameofcollection)  //sort
    
    
       // printing total array
        System.out.println(Arrays.toString(arr));
        
        //printing collection
        System.out.println(Arrays.toString(l.toArray()));
        
        //printing hasmap
        System.out.println(Arrays.toString(Arrays.asList(map).toArray()));
        System.out.println(Arrays.asList(d));
    */
    
    Map<Integer, String> map=new HashMap<>();  
    
    //create  
    map.put(1,"Amit");  
    map.put(5,"Rahul");  
    map.put(2,"Jai");  
    map.put(6,"Amit");  
    
    //read
    System.out.println("read :"+ map.get(1));
    
    //update
    map.put(1,"Ameer");
    
    //delete
    map.remove(2);
    for (Integer each : map.keySet()){
        System.out.println( each+ " "+ map.get(each));
    }
    
    System.out.println("map values :----------------"+map.values()+". keys :-----"+" "+ map.keySet()+" "+ map.values().getClass().getSimpleName());
    
    List <String> array=new ArrayList<>();
    
    //create
    array.add("1");
    array.add("sdwd");
    array.add("232");
    array.add("dsd ded");
    
    //read
    System.out.println(array.get(0));
    
    //update
    array.add(1,"2");
    
    //delete
    array.remove(2);
    
    //iterate
    for (String e: array){
        
        //comparision of 2 strings
        if (e.equals("1"))
        System.out.println("array value at index "+ e);
    }
    
    String v=array.get(0);
    boolean bo=true;
    try{
        int i0=Integer.parseInt(v);}
    catch (Exception e){
        bo=false;}
    System.out.println("string :"+ bo);
    }
}






