FROM eclipse-temurin:17-jdk

WORKDIR /expt-9

COPY . .

RUN javac BankAccount.java

CMD ["java", "BankAccount"]