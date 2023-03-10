// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiidentify.models;

import com.aliyun.tea.*;

public class IdentifyPointReq extends TeaModel {
    // 鉴定点名称
    @NameInMap("identify_point_name")
    @Validation(required = true)
    public String identifyPointName;

    // 鉴定点编号
    @NameInMap("identify_point_code")
    @Validation(required = true)
    public String identifyPointCode;

    // 鉴定商品此鉴定点的图片
    @NameInMap("identify_point_img")
    @Validation(required = true)
    public String identifyPointImg;

    public static IdentifyPointReq build(java.util.Map<String, ?> map) throws Exception {
        IdentifyPointReq self = new IdentifyPointReq();
        return TeaModel.build(map, self);
    }

    public IdentifyPointReq setIdentifyPointName(String identifyPointName) {
        this.identifyPointName = identifyPointName;
        return this;
    }
    public String getIdentifyPointName() {
        return this.identifyPointName;
    }

    public IdentifyPointReq setIdentifyPointCode(String identifyPointCode) {
        this.identifyPointCode = identifyPointCode;
        return this;
    }
    public String getIdentifyPointCode() {
        return this.identifyPointCode;
    }

    public IdentifyPointReq setIdentifyPointImg(String identifyPointImg) {
        this.identifyPointImg = identifyPointImg;
        return this;
    }
    public String getIdentifyPointImg() {
        return this.identifyPointImg;
    }

}
