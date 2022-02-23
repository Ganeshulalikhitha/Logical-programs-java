
/*WAP to read project score, internal score, external score from student.
==> check student got pass in 3 subjects (Project+external+internal) : pass marks=50
==> if student got pass in 3 subjects then find total score
total = 70% on project +20% on external +10 % on internal
==> Print grade based on total score
90+ A grade
75--90 B
50-75 C
==> if student got failed in subjects, print failed subject subname along with scor*/
    import java.util.Scanner;
class Example5{​​​
public static void main(String args[]){​​​
Scanner s=new Scanner(System.in);
System.out.println("Enter project score, external score and internal score");
int project=s.nextInt();
int external=s.nextInt();
int internal=s.nextInt();
int total=0;

if(project>=50 && external>=50 && internal>=50){​​​
total=(project*70)/100 + (external*20)/100+ (internal*10)/100;
System.out.println("Total score: "+total);
if(total>=90){​​​
System.out.println("A grade");
}​​​
else if(total>=75){​​​
System.out.println("B grade");
}​​​
else{​​​
System.out.println("C grade");
}​​​
}​​​
else{​​​
if(project<50){​​​
System.out.println("You got failed in project and score is: "+project);
}​​​
if(external<50){​​​
System.out.println("You got failed in External and score is: "+external);
}​​​
if(internal<50){​​​
System.out.println("You got failed in internal and score is: "+internal);
}​​​
}​​​
}​​​
}​​​
