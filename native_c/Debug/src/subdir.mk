################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/access_fields.cpp \
../src/native_c.cpp \
../src/object_arrays.cpp \
../src/override.cpp \
../src/primitive_arrays.cpp \
../src/primitives.cpp \
../src/string_c.cpp 

OBJS += \
./src/access_fields.o \
./src/native_c.o \
./src/object_arrays.o \
./src/override.o \
./src/primitive_arrays.o \
./src/primitives.o \
./src/string_c.o 

CPP_DEPS += \
./src/access_fields.d \
./src/native_c.d \
./src/object_arrays.d \
./src/override.d \
./src/primitive_arrays.d \
./src/primitives.d \
./src/string_c.d 


# Each subdirectory must supply rules for building sources it contributes
src/%.o: ../src/%.cpp src/subdir.mk
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -I/usr/lib/jvm/java-11-openjdk-amd64/include/linux -I/usr/lib/jvm/java-11-openjdk-amd64/include -O2 -g3 -Wall -c -fmessage-length=0 -fPIC -MMD -MP -MF"$(@:%.o=%.d)" -MT"$@" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


