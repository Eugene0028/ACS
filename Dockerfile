FROM openjdk:11-jdk
WORKDIR /app
COPY . /app
RUN javac FileReader.java
CMD ["java", "FileReader", "in.txt", "in2.txt"]