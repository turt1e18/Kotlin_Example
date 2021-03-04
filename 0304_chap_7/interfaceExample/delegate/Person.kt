package interfaceExample.delegate

class Person(name:Nameable, work:Runnable) : Nameable by name, Runnable by work

// 위임을 이용한 멤버 접근 클래스