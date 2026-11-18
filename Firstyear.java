class Fclacc{
String nameofclass,nameofstaff;
int noodstds;
Fclass(String noc,String nod,int numstd){
nameofclass = noc;
nameofstaff = nos;
noofstds = numstd;
}
void display(){
System.out.println(nameofclass +"\t\t"+ nameofstaff + "\t\t" + noofstds);
}
}
class Firstyear{
public static void main(String[] arg){
Fclas std[] = new Fclass[3];

std[0] = new Fclass("BSc CS","RAHUL",120);
std[1] = new Fclass("BA Eco","PRIYA",80);
std[2] = new Fclass("BCA","ARYAN",95);
System.out.println("Course\t\tStaff\t\tNumber of Students");
for int (i=0; i<3; i++)
std[i].display();
}
}
