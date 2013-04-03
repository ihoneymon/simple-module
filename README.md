simple-module
=============

Spring Framework를 기본으로 해서 Hibernate 를 ORM 프레임워크로 사용하여 ORM으로 프로그래밍하기 위한 환경설정을 해둔 프로젝트다. 나중에 수월하게 가져다 쓰기 위한 필요한 것들을 구성해둔다. 여기에 필요한 기능들을 구현하면서 추가해나가면 된다.

### 모듈 구성 
* simple-module-core : domain, service, repository 묶음
* simple-module-web : web, controller 묶음

### simple-module-core
* 패키지 구성
    * Spring Framework
    * Spring Data JPA
    * Hibernate
    * QueryDSL
    * AspectJ
    * Lombok
    * Apache POI
    * StringTemplate
    * JavaMail
    * Google guava
    * joda-time

### simple-module-web
* 패키지 구성
    * Spring Web MVC
    * Apache Common File, IO

### 목적
    업무에 필요할 때 가져다 쓸 수 있는 Template 스프링 모듈 프로젝트 기록
    
