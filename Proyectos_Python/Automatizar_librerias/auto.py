librerias = ["paquete1", "paquete2", "paquete3"]  #Sustituir por las lib usadas

with open("instalar_linux.txt", "w") as linux:
    linux.write("sudo apt update\n")
    for lib in librerias:
        linux.write(f"sudo apt install -y "+lib+ "\n")
with open("instalar_windows.txt", "w") as windows:
    for lib in librerias:
        windows.writelines(f"winget install "+lib+"\n")


#Windows: powershell -ExecutionPolicy Bypass -File instalar_windows.txt
#Linux: bash instalar_linux.txt
