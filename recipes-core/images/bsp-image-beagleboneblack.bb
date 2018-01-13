
inherit core-image

DEPENDS = "parted-native dosfstools-native mtools-native e2fsprogs-native"

IMAGE_FEATURES += ""

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${FILE_DIRNAME}/${BPN}/COPYING;md5=35088ff006d41b8e2499350c3840d844"

SRC_URI = "file://${FILE_DIRNAME}/${BPN}/beagleboneblack-sdimage.wks"
WKS_FILE = "${BPN}/beagleboneblack-sdimage.wks"

IMAGE_INSTALL += ""
