#!/usr/bin/env python
import time
import RPi.GPIO as GPIO
import cgi;
import cgitb;
cgitb.enable()
print("Content-Type: text/plain")
print ("")
GPIO.setmode(GPIO.BOARD)
led = 11
servo = 13
mucho = 30
GPIO.setup(led,GPIO.OUT)
GPIO.setup(servo,GPIO.OUT)
p = GPIO.PWM(servo,50)
p.start(5)

GPIO.output(led,True)
p.ChangeDutyCycle(10.5)
time.sleep(mucho)
GPIO.output(led,False)
p.ChangeDutyCycle(5)
time.sleep(0.5)
p.stop()
print "Se ha realizado con exito"
GPIO.cleanup()
