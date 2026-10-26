.PHONY: build run-dist

build:
	./gradlew installDist

run-dist:
	./app/build/install/app/bin/app