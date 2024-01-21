
> create database:
```bash
docker run --name database -p 3306:3306 -e MYSQL_ROOT_PASSWORD=msecretPw -d mysql
```
> inside db_manager install dependencies:
```bash
npm i
```
> inside db_manager run migrations:
```bash
npm run m
```