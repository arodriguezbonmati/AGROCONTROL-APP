#!/usr/bin/env python
import cgi;
import cgitb;
cgitb.enable()
print("Content-Type: text/plain")
print("")
import time
import RPi.GPIO as GPIO
GPIO.setmode(GPIO.BOARD)
led = 11
Trigger = 10
Echo = 12
fondo = 13
GPIO.setup(led,GPIO.OUT)
GPIO.setup(Trigger,GPIO.OUT)
GPIO.setup(Echo,GPIO.IN)
sumadistancia = 0
mean = 10
try:
        for i in range (mean):
            GPIO.output(Trigger,False)
            time.sleep(0.0001)
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
            sumadistancia = (sumadistancia + distancia)
            time.sleep(0.1)
        sumadistancia /= mean
        porcentaje =sumadistancia*100/fondo
        print (sumadistancia)
        print 'El deposito esta al ' "{0:.2f}".format(porcentaje), '%'
        if porcentaje < 40.000:
            print "Le recomendamos que rellene el deposito"
        if porcentaje > 100.000:
            print "Se ha producido un error en la medida,vuelva a probar y si falla llame a mantenimiento"
        GPIO.cleanup()
except KeyboardInterrupt:
    GPIO.cleanup();
