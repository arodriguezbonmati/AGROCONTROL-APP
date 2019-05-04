#!/usr/bin/env python
import time
import RPi.GPIO as GPIO
import cgi;
import cgitb;
cgitb.enable()
print("Content-Type: text/plain")
print("")
form = cgi.FieldStorage()
GPIO.setmode(GPIO.BOARD)
led = 11
Trigger = 10
Echo = 12
fondo =  9 
GPIO.setup(led,GPIO.OUT)
GPIO.setup(Trigger,GPIO.OUT)
GPIO.setup(Echo,GPIO.IN)
try:
    GPIO.output(Trigger,False)
    time.sleep(0.5)
    GPIO.output(Trigger,True)
    time.sleep(0.00001)
    GPIO.output(Trigger,False)
    inicio = time.time()
    while GPIO.input(Echo) == 0:
        inicio = time.time()
    while GPIO.input(Echo) == 1:
        final = time.time()
    t_transcurrido = final - inicio
    distancia = t_transcurrido * 34000
    distancia = distancia/2
    porcentaje = distancia*100/fondo
    print 'El deposito esta al ' "{0:.2f}".format(porcentaje), '%'
    if porcentaje < 40.000:
        print "El comedero esta casi vacio"
    GPIO.cleanup()
except KeyboardInterrupt:
    GPIO.cleanup();
