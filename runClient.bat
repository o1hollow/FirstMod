@echo off
cd /d "E:\Repositories\Forge\First Mod"
gradlew runClient -Dnet.minecraftforge.gradle.check.certs=false
pause