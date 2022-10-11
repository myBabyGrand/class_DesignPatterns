# OOP/OOAD/UML(기본 이론)
```
Object-Oriented : 10
Object-Oriented Principles : 28
Object-Oriented Development : 47
An Introduction to UML : 66
Use Case Diagram : 91
Class Diagram : 116
Sequence Diagram : 182
Statechart Diagram : 228
Activity Diagram : 261
Component Diagram : 282
Part 1. Introduction : 303
Part 2. Inception : 331
Part 3. Elaboration - OOA : 362
Part 3. Elaboration - OOD : 406
Part 3. Elaboration - OOI : 435
OOAD Summary : 463

Types of Class RelationShip : 136
```

![enter image description here](https://github.com/myBabyGrand/class-fastcapmus_cs_online_challenge/blob/main/images/typesOfClassRelationship.jpg?raw=true)

# Design Patterns(기본 이론)
```
설계패턴 소개 : 3
객체지향 패러다임 : 22
SOLID Principle : 54
GRASP Principle : 105
Strategy Pattern : 144
Observer Pattern : 187
Template Method : 222
Iterator Pattern : 244
State Pattern : 274
Mediator Pattern : 310
Factory Method & Abstract Factory Patterns : 326
Builder : 371
Singleton : 391
Decorator : 418
Adapter : 444
Composite : 460
Bridge : 485
MVC : 515
Pattern Summary : 535
```

### Category of GoF Patterns : 14
\ | creational | structural | behavioral
---|---|---|---
Class|Fatory Method | Adapter | Template
Object | Abstract Fatory|Adapter | Interator
Object | Builder|Bridge | Mediator
Object | Singleton|Composite| Observer
Object | .|Decorator| State
Object | .|.| Strategy

![](/../img/100.jpg)




### SOLID
두문자 | 약어 |내용
---|---|---
S	|SRP	|단일 책임 원칙 (Single responsibility principle)한 클래스는 하나의 책임만 가져야 한다.
O	|OCP	|개방-폐쇄 원칙 (Open/closed principle) “소프트웨어 요소는 확장에는 열려 있으나 변경에는 닫혀 있어야 한다.”
L	|LSP	|리스코프 치환 원칙 (Liskov substitution principle)“프로그램의 객체는 프로그램의 정확성을 깨뜨리지 않으면서 하위 타입의 인스턴스로 바꿀 수 있어야 한다.” 계약에 의한 설계를 참고하라.
I	|ISP	|인터페이스 분리 원칙 (Interface segregation principle) “특정 클라이언트를 위한 인터페이스 여러 개가 범용 인터페이스 하나보다 낫다.”
D	|DIP	|의존관계 역전 원칙 (Dependency inversion principle) 프로그래머는 “추상화에 의존해야지, 구체화에 의존하면 안된다.” 의존성 주입은 이 원칙을 따르는 방법 중 하나다.

```
Casher가 시작한 makeNewSale - 물리버튼과 같은 하드웨어 또는 GUI를 통해 입력 되는 system operation을 domain layer에 전달 될 수 있도록 forwarding 또는 delegation 한다.
UI Layer의 makeNewSale - 비즈니스 로직의 operation을 호출하여 실제 기능이 수행될 수 있도록 한다.
```
<!--stackedit_data:
eyJoaXN0b3J5IjpbNDY2NjQyNDhdfQ==
-->