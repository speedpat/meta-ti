require u-boot-ti.inc

DESCRIPTION = "u-boot bootloader for TI devices"

LIC_FILES_CHKSUM = "file://Licenses/README;md5=025bf9f768cbcb1a165dbe1a110babfb"

PV = "2013.10"
PR = "r7+gitr${SRCPV}"

SRC_URI = "git://git.ti.com/ti-u-boot/ti-u-boot.git;protocol=git;branch=${BRANCH}"

BRANCH ?= "ti-u-boot-2013.10"

# Corresponds to tag ti2013.12.01
SRCREV = "78d8ebd4a0214b72a125f5b98c5ed2f9a3e5e783"

SPL_BINARY = "MLO"
SPL_UART_BINARY = "u-boot-spl.bin"
