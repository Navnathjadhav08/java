import java.util.*;

public class program524
{
    public static void main(String arg[])
    {
        DBMS obj = new DBMS();
        obj.StartDBMS();

        obj.InsertIntoTable("Rahul", 23, 89);
        obj.InsertIntoTable("Sagar", 26, 60);
        obj.InsertIntoTable("Pooja", 20, 70);
        obj.InsertIntoTable("Sayali", 30, 99);
        obj.InsertIntoTable("Tejas", 29, 91);

        obj.SelectFrom();
        obj.SelectFrom(4);
       obj.SelectFrom("Tejas");


        System.out.println("MAximum value from record "+Aggregate_Max());
         System.out.println("MAximum value from record "+Aggregate_Min());

    }
    
}

class Student
{
    public int Rno;
    public String Name;
    public int Age;
    public int Marks;

    public static int Generator;

    static
    {
        Generator = 0;
    }

    public Student(String str,int X,int Y)
    {
        this.Rno = ++Generator;
        this.Name = str;
        this.Age = X;
        this.Marks = Y; 
    }

    public void Display()
    {
        System.out.println(this.Rno + " " +this.Name +" "+this.Age+" "+this.Marks);
    }
}

class DBMS
{
    public LinkedList <Student> lobj;

    public DBMS()
    {
        lobj = new LinkedList<Student>();
    }

    public void StartDBMS()
    {
        System.out.println("Marvellous DataBase Management System Started......");
        System.out.println("MArve");

        //logic
    }

    //Insert into Table Student Values(----------,---------,-------);
    public void InsertIntoTable(String name,int age,int Marks)
    {
        Student sobj = new Student(name, age, Marks);
        lobj.add( sobj);
    }

    //Select * from student
    public void SelectFrom()
    {
        System.out.println("Record from the student database are : ");

        for(Student sref : lobj)
        {
            sref.Display();
        }
    }

    //Select * from student where Rno = 11
     public void SelectFrom(int no)
    {
        

        for(Student sref : lobj)
        {
            if(sref.Rno == no)
            {
                 sref.Display();
                 break;
            }
           
        }
    }

    //Select * from student where name = Rahul
     public void SelectFrom(String str)
    {
        

        for(Student sref : lobj)
        {
            if(str.equals(sref.Name))
            {
                 sref.Display();
                 break;
            }
           
        }
    }

     //Select Max(marks) from students
     public int Aggregate_Max()
    {
        int iMax = 0;

        for(Student sref : lobj)
        {
            if(sref.Marks > iMax)
            {
                 iMax = sref.Marks;
            }
           
        }

        return iMax;
    }

     //Select MIN(marks) from students
     public int Aggregate_Min()
    {
        int iMin = 0;

        for(Student sref : lobj)
        {
            if(sref.Marks > iMin)
            {
                 iMin = sref.Marks;
            }
           
        }

        return iMin;
    }
}