package hibernate1;
// Generated 11 nov 2021 9:23:24 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Departamentos generated by hbm2java
 */
public class Departamentos  implements java.io.Serializable {


     private int deptNo;
     private String dnombre;
     private String loc;
     private Set empleadoses = new HashSet(0);

    public Departamentos() {
    }

	
    public Departamentos(int deptNo) {
        this.deptNo = deptNo;
    }
    public Departamentos(int deptNo, String dnombre, String loc, Set empleadoses) {
       this.deptNo = deptNo;
       this.dnombre = dno
   
    public int getDeptNo() {mbre;
       this.loc = loc;
       this.empleadoses = empleadoses;
    }
        return this.deptNo;
    }
    
    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }
    public String getDnombre() {
        return this.dnombre;
    }
    
    public void setDnombre(String dnombre) {
        this.dnombre = dnombre;
    }
    public String getLoc() {
        return this.loc;
    }
    
    public void setLoc(String loc) {
        this.loc = loc;
    }
    public Set getEmpleadoses() {
        return this.empleadoses;
    }
    
    public void setEmpleadoses(Set empleadoses) {
        this.empleadoses = empleadoses;
    }




}


