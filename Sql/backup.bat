@ECHO OFF
for /f %%a in ('powershell -Command "Get-Date -format yyyy_MM_dd__HH_mm_ss"') do set datetime=%%a
c:\xampp\mysql\bin\mysqldump -uroot edunovajp28 > c:\Users\Ivan\Documents\GitHub\EdunovaJP28\edunovajp28_backup%datetime%.sql