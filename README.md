# yalooStore-common-utils
여러 서버에서 공통으로 사용되는 코드를 jitpack을 통해서 모듈화 시킬 때 사용한 레포지토리입니다.<br>
해당 작업은 JDK 17로 진행되었습니다.

## Project architecture
![image](https://github.com/yalooStore/yalooStore-common-utils/assets/81970382/e6cb6d73-0bed-4ca1-8a7f-c00be121a048)

## Features
### Response Dto
- 공통으로 사용되는 응답 객체

### Error Code
- 사용자의 비정상적 접근을 막고 예외를 핸들링하기 위해서 특정 상황에 따른 Error code 정의 

### Exception(Custom)
- Client Exception
  - 클라이언트 측 오류로 ErrorCode, HttpStatus, ErrorMessage를 돌려줍니다.  
- Server Exception
  - 서버 측 오류로 ErrorCode, HttpStatus, ErrorMessage를 돌려줍니다.  

## Tech Stack
### Languages
![Java](https://img.shields.io/badge/Java-007396?style=flat-square&logo=Java)

### Frameworks
![Spring](https://img.shields.io/badge/Spring-6DB33F?style=flat&logo=Spring&logoColor=white)

### Common Code Module Library
![jitpack](https://img.shields.io/badge/jitpack-181717?style=flat&logo=Jitpack&logoColor=white)

### Build Tool
![ApacheMaven](https://img.shields.io/badge/Maven-C71A36?style=flat&logo=ApacheMaven&logoColor=white)

### 형상 관리 전략
![Git](https://img.shields.io/badge/Git-F05032?style=flat&logo=Git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=GitHub&logoColor=white)

