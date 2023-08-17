// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bc907d13969a4eb68852866122b96ffd.models;

import com.aliyun.tea.*;

public class Exif extends TeaModel {
    // exif
    @NameInMap("exif")
    @Validation(required = true)
    public java.util.List<MapObject> exif;

    public static Exif build(java.util.Map<String, ?> map) throws Exception {
        Exif self = new Exif();
        return TeaModel.build(map, self);
    }

    public Exif setExif(java.util.List<MapObject> exif) {
        this.exif = exif;
        return this;
    }
    public java.util.List<MapObject> getExif() {
        return this.exif;
    }

}
