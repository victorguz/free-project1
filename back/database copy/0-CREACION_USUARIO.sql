CREATE USER GOYA
  IDENTIFIED BY  GOYA
  DEFAULT TABLESPACE USERS
  TEMPORARY TABLESPACE TEMP
  PROFILE DEFAULT
  ACCOUNT UNLOCK;
  -- 4 Roles for GOYA 
  GRANT RESOURCE TO GOYA WITH ADMIN OPTION;
  GRANT DBA TO GOYA WITH ADMIN OPTION;
  GRANT CONNECT TO GOYA WITH ADMIN OPTION;
  GRANT APP_PRIVILEGES TO GOYA WITH ADMIN OPTION;
  ALTER USER GOYA DEFAULT ROLE ALL;
  -- 1 System Privilege for GOYA 
  GRANT UNLIMITED TABLESPACE TO GOYA WITH ADMIN OPTION; 