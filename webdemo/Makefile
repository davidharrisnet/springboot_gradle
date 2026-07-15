.PHONY: build run test clean stop bootjar tests
JVM = java

default: stop clean build run 


build:
	./gradlew build

run:
	./gradlew bootRun
runjar:
	$(JVM) -jar ./build/libs/demo-0.0.1-SNAPSHOT.jar

test:
	./gradlew test

clean:
	./gradlew clean

assemble:
	./gradlew assemble

bootjar:
	./gradlew bootJar

# Run a single test class or method: make tests T=com.example.demo.DemoApplicationTests
tests:
	./gradlew test --tests "$(T)"

stop:
	@PID=$$(lsof -ti tcp:8080); \
	if [ -n "$$PID" ]; then \
		echo "Killing process on port 8080 (PID $$PID)"; \
		kill -9 $$PID; \
	else \
		echo "No process found on port 8080"; \
	fi
