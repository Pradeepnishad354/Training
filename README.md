Singleton class==========

if  several people have same requirements then it is not recommended to create a separate object for every requirements 
we have to create only one objects and we can reuse same objects for every similar requirements 
so that performance and memory utilization will be improve.

Example====

Runtime r1=Runtime.getRuntime();

Runtime r3=Runtime.getRuntime();

Runtime r2=Runtime.getRuntime();


How to create our own singleton classess===

there are two approach==
1.private constructor 
2.private static variable 
and public factory method

1.private constructor

class Test{

private Static Test t=new Test();  // Test t=Test .getTest();


private Test(){



}
public static Test getTest(){         
return t;

}

}



Note=

runtime class is intrnally implemented by using this approach 




==========================================================================================================================================================================
2.aaproach to create singleton class


class Test{

private Static Test t=null;

private Test(){

}
public static Test getTest(){

if(t==null){

t=new Test();

}
return t;



}



}


==================
class is not final but we are not  allowed to craete child classess how it is possible;;;


declare every constructor as private ; 



class P{

private P(){

}

class C extends P{



}


}

