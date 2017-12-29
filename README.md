# BevisILoveYou
我愛教練，教練愛我<br>
題目:試用新技術做出CRM網頁

### 環境架設:<br>
  - Java : *JDK* 1.8
  - MySQL(Schema已附在專案中)

※非必要<br>
Spring Tool Suite(STS) : Eclipse plugin也可<br>
nodeJs : https://nodejs.org/en/download/<br>

### 開發方式推薦(需安裝好nodeJS) : <br>

frontend:使用windows cmd<br>
指令:<br>
node -v & npm -v 確認node 及 npm 有無安裝<br>

-------node npm 安裝成功------

※位置: xxxx\AngularAndSpringBoot\frontend<br>
ex:C:\Users\user\Desktop\GitHub\PracticeCrm\AngularAndSpringBoot\frontend

npm start <br>
開啟lite serve (可至localhost:4200確認是否開啟成功)<br>

ng build <br>
編譯TypeScript檔案至dist資料夾內，因後台有寫POM檔可自行將此資料夾檔案移至SpringBootJ網頁開起畫面，不需手動移檔案<br>

------------------------------

frotend:Eclipse <br>

Run As ->Maven Clean

Run As ->Mave install<br>
等同於ng build (POM內有使用maven編譯Angular5套件)

-------------------------------

backend:Eclipse
Run As -> Maven Clean<br>

Run As -> Maven Build<br>

Goals 輸入spring-boot:run<br> 

Apply -> Run<br>

將frontend dist內資料移至 backend內架起(localhost:8080)


#初始專案內容
 - localhost:8080/api/hi  確認是否架起SpringBoot
 - localhost:4200         確認是否架起lite server
 - localhost:4200/api/hi  確認是否可從lite server打請求至localhost:8080/api/hi <br>
       - 設定檔在 fronted/proxy.conf.json <br>
     - 更改設定需重啟4200(ctrl + c停止伺服器 -> npm start)




#參考文件:<br />
angular_quickStart : https://angular.io/guide/quickstart

How to integrate Angular 4 with SpringBoot RestApi using SpringToolSuite :　http://javasampleapproach.com/java-integration/integrate-angular-4-springboot-web-app-springtoolsuite

Spring Boot Angular 5 Applications : https://shekhargulati.com/2017/11/08/a-minimalist-guide-to-building-spring-boot-angular-5-applications/

Accessing data with MySQL : https://spring.io/guides/gs/accessing-data-mysql/
