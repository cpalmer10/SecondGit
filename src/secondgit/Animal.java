/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondgit;

/**
 *
 * @author Chris
 */
public class Animal {
    public int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 999){
            System.out.println("bad value");
        }
        else {
            this.age = age;
        }
        
    }
}
