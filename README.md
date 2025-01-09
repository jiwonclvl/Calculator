# Calculator Project
Java 언어를 활용하여 두 값을 입력받아 연산을 수행하는 계산기를 제작하는 프로젝트이다. 

<br>

## 기능 [Features]
-  0을 포함한 양의 정수를 두 번 입력받을 수 있다. 
-  `+`, `-`, `*`, `/` 연산을 수행한다.
-  `exit`를 입력하면 계산을 종료할 수 있다.
-  사용자가 원할 경우, 가장 처음 수행한 연산 값을 삭제할 수 있다.

<br>

## 프로젝트 실행 순서 [Execution Steps]
1. **두 값 입력** <br>

   0을 포함한 두 값을 입력한다.
   
   ![image](https://github.com/user-attachments/assets/6779fb79-ee3f-4db4-844a-d1f1af19a1c1) 
<br>

2. **연산자 입력 및 결과 출력** <br>

    입력 받은 두 값을 연산할 연산자를 입력하면, 해당 연산을 수행한 후 결과 값을 출력한다.
 
    ![image](https://github.com/user-attachments/assets/a5e23f1b-5010-4030-8d04-78b60a06679e)
 <br>

3. **연산 종료** <br>

    연산을 종료하고 싶다면 `exit`를 입력한 후 프로그램을 종료한다.

    ![image](https://github.com/user-attachments/assets/2a4667bb-3b62-4bd5-b8bd-8d35205581ea)
<br>

4. **첫번째 연산 값 삭제 여부 결정 (App2.java)** <br>

    연산을 종료하면 사용자는 처음 수행한 연산 값을 삭제할지 말지 결정한다. <br>
    삭제를 원한다면 `Y`, 원하지 않는다면 `N`을 입력한다. 

    ![image](https://github.com/user-attachments/assets/5b051646-0a29-40da-a507-d143ba3170a9)


<br>

## 입력 예외 처리 [Input Error Handling]
  입력이 잘못된 경우 경고 문자 출력 후 다시 입력할 수 있도록 하였다.
  <br>
  
   - **음수 값 또는 정수 외의 값을 입력한 경우**

      ![image](https://github.com/user-attachments/assets/931277ab-2716-46f3-b864-ae5239ccafa7)


  <br>

  - **연산자 입력이 올바르지 않은 경우**

    ![image](https://github.com/user-attachments/assets/e9868ad4-4afc-4664-9364-8c86f771d054)


<br>

  - **분모가 0인 경우** 

    ![image](https://github.com/user-attachments/assets/7181765d-8479-4afa-a2cd-a3ec85f315a4)




   

  


   

   

