.PHONY: build run test clean stop bootjar tests

build:
	./gradlew build

run:
	./gradlew bootRun

test:
	./gradlew test

clean:
	./gradlew clean

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
