require rpb-console-image.bb

CORE_IMAGE_BASE_INSTALL += " \
    packagegroup-core-buildessential \
    \
    ltp \
    \
    python \
    python-misc \
    python-modules \
    python-numpy \
    python-scons \
    "
