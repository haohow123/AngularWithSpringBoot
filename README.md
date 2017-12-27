# BevisILoveYou
我愛教練，教練愛我

#環境架設:
Spring Tool Suite(STS) : Eclipse plugin也可

※非必要
nodeJs : https://nodejs.org/en/download/
Java : JDK 1.8 up

#開發方式推薦(需安裝好nodeJS) : 
frontend:使用windows cmd
指令:
node -v & npm -v 確認node 及 npm 有無安裝
-------node npm 安裝成功------
npm start 
開啟lite serve (可至localhost:4200確認是否開啟成功)

ng build 
編譯TypeScript檔案至dist資料夾內，因後台有寫POM檔可自行將此資料夾檔案移至SpringBootJ網頁開起畫面，不需手動移檔案
------------------------------

frotend:Eclipse
Run As ->Maven Clean
Run As ->Mave install
等同於ng build (POM內有使用maven編譯Angular5套件)

-------------------------------
backend:Eclipse
Run As -> Maven Clean

Run As -> Maven Build
Goals 輸入spring-boot:run
Apply -> Run
將frontend dist內資料移至 backend內
架起(localhost:8080)


#參考文件:
angular_quickStart : https://angular.io/guide/quickstart
How to integrate Angular 4 with SpringBoot RestApi using SpringToolSuite :　http://javasampleapproach.com/java-integration/integrate-angular-4-springboot-web-app-springtoolsuite
Spring Boot Angular 5 Applications : https://shekhargulati.com/2017/11/08/a-minimalist-guide-to-building-spring-boot-angular-5-applications/

Accessing data with MySQL : https://spring.io/guides/gs/accessing-data-mysql/
