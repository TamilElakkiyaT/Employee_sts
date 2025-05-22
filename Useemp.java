package com.Package.For2;

public class Useemp {
			public static void main(String[] args) {			
				emp e=new emp();
				e.id=121;
				e.name="tamil elakkiya";
				e.role="developer";
				e.gender="female";
				e.salary=100000;
				emp e1=new emp();
				e1.id=122;
				e1.name="elakkiya";
				e1.role="tech";
				e1.gender="female";
				e1.salary=10000;
				emp e2=new emp();
				e2.id=123;
				e2.name="raju";
				e2.role="mech";
				e2.gender="male";
				e2.salary=20000;
			emp e3=new emp();
				e3.id=124;
				e3.name="ram";
				e3.role="engineering";
				e3.gender="male";
				e3.salary=30000;
				emp e4=new emp();
				e4.id=125;
				e4.name="vivek";
				e4.role="quality";
				e4.gender="male";
				e4.salary=100000;
				emp e5=new emp();
				e5.id=126;
				e5.name="seetha";
				e5.role="deve";
				e5.gender="female";
				e5.salary=10000;
				emp e6=new emp();
				e6.id=127;
				e6.name="rachu";
				e6.role="secentis";
				e6.gender="female";
				e6.salary=100000;
				emp[] emps= {e,e1,e2,e3,e4,e5,e6};
				emp max=emps[0];
				for(int i=0;i<emps.length;i++) {
					if(emps[i].salary>=max.salary) {
						max=emps[i];
					}}
					System.out.println(max.id+" "+max.name+" "+max.salary+" "+max.role+" "+max.gender+" "+max.salary);
			}	
}
			class emp {
				int id;
				String name;
				String role;
				String gender;
				int salary;
		}
