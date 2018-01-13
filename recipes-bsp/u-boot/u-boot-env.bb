DESCRIPTION = "BeagleBone Black-Boot environment script"

inherit deploy

SRC_URI = " \
    file://uEnv.txt \
    file://LICENSE \
    "

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=956139f0411412ea77671fedb9915d38"

S = "${WORKDIR}"

do_deploy() {
    install uEnv.txt ${DEPLOYDIR}/uEnv.txt
}

addtask deploy after do_install
