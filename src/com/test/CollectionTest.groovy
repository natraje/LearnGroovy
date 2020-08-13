package com.test

class CollectionTest {
	static main(args){
		def c=new CollectionTest();
		c.arrayTest()
		c.mapTest()	
		c.arrayTestWithClosures()
		println c.sumArry()
	}
	
	void arrayTest(){
		def arr=[1,2,3..8]
		 print "for loop :"
		 for(i in arr)
		 print i
		 println ""
	}
	
	void mapTest(){
		def map=["a":1,"b":2,"c":3]
		println "Map Testing :"
		def s=map.keySet();
		for(key in s){
			 print key : map.get(key)
		}
		println ""
		map.each() { i, value -> println "${i} = ${value}" };
	}

	void arrayTestWithClosures(){
		def arr=[1,2,3..8]
		 print "for loop :"
		 arr.each { print "${it}" }
		 println ""
	}
	
	def sumArry(){
		def arr=[1,2,3,4,5,6,7,8]
		arr.sum()
	}
}
