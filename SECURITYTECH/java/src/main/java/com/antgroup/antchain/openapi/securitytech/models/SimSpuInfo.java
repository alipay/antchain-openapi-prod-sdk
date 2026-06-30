// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class SimSpuInfo extends TeaModel {
    // SPU ID
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("spu_id")
    @Validation(required = true)
    public String spuId;

    // spu名称
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("spu_name")
    @Validation(required = true)
    public String spuName;

    // spu图片信息
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("spu_picture_info")
    @Validation(required = true)
    public SpuPictureInfo spuPictureInfo;

    public static SimSpuInfo build(java.util.Map<String, ?> map) throws Exception {
        SimSpuInfo self = new SimSpuInfo();
        return TeaModel.build(map, self);
    }

    public SimSpuInfo setSpuId(String spuId) {
        this.spuId = spuId;
        return this;
    }
    public String getSpuId() {
        return this.spuId;
    }

    public SimSpuInfo setSpuName(String spuName) {
        this.spuName = spuName;
        return this;
    }
    public String getSpuName() {
        return this.spuName;
    }

    public SimSpuInfo setSpuPictureInfo(SpuPictureInfo spuPictureInfo) {
        this.spuPictureInfo = spuPictureInfo;
        return this;
    }
    public SpuPictureInfo getSpuPictureInfo() {
        return this.spuPictureInfo;
    }

}
