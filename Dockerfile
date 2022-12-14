# 该镜像需要依赖的基础镜像
FROM openjdk:8
# 将targer目录下的jar包复制到docker容器下，也叫eureka.jar，目录暂时不知
ADD ./target/eureka.jar eureka.jar
# 声明服务运行在8080端口
EXPOSE 2100
# 执行命令
CMD ["java","-jar","/eureka.jar"]
# 指定维护者名称
MAINTAINER luohw 1270447358@qq.com