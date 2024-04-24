package dw.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Employee {
    @Id
    @Column(name = "사원ID")
    private long employeeId;

    @Column(name = "이름")
    private String name;

    @Column(name = "영어이름")
    private String englishName;

    @Column(name = "직책")
    private String position;

    @Column(name = "성별")
    private String gender;

    @Column(name = "생일")
    private int birthDate;

    @Column(name = "입사일")
    private int hireDate;

    @Column(name = "주소")
    private String address;

    @Column(name = "도시")
    private String city;

    @Column(name = "지역")
    private String area;

    @Column(name = "전화번호")
    private int telephoneNo;

    @Column(name = "직원ID")
    private long managerId;

    private String department;

    public Employee() {
    }

    public Employee(long employeeId, String name, String englishName, String position, String gender,
                    int birthDate, int hireDate, String address, String city, String area, int telephoneNo,
                    long managerId, String department) {
        this.employeeId = employeeId;
        this.name = name;
        this.englishName = englishName;
        this.position = position;
        this.gender = gender;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.address = address;
        this.city = city;
        this.area = area;
        this.telephoneNo = telephoneNo;
        this.managerId = managerId;
        this.department = department;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public int getHireDate() {
        return hireDate;
    }

    public void setHireDate(int hireDate) {
        this.hireDate = hireDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(int telephoneNo) {
        this.telephoneNo = telephoneNo;
    }

    public long getManagerId() {
        return managerId;
    }

    public void setManagerId(long managerId) {
        this.managerId = managerId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
