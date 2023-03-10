// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiidentify.models;

import com.aliyun.tea.*;

public class IdentifyPointResultResp extends TeaModel {
    // 234
    @NameInMap("identify_point_name")
    @Validation(required = true)
    public String identifyPointName;

    // 鉴定点唯一编号
    @NameInMap("identify_point_code")
    @Validation(required = true)
    public String identifyPointCode;

    // 鉴定点图片
    @NameInMap("identify_point_img")
    @Validation(required = true)
    public String identifyPointImg;

    // 鉴定点的鉴定结果
    // SUCCESS：符合鉴定标准
    // FAILED：不符合鉴定标准
    // NOT_IDENTIFY：无法鉴定
    @NameInMap("identify_point_result")
    @Validation(required = true)
    public String identifyPointResult;

    public static IdentifyPointResultResp build(java.util.Map<String, ?> map) throws Exception {
        IdentifyPointResultResp self = new IdentifyPointResultResp();
        return TeaModel.build(map, self);
    }

    public IdentifyPointResultResp setIdentifyPointName(String identifyPointName) {
        this.identifyPointName = identifyPointName;
        return this;
    }
    public String getIdentifyPointName() {
        return this.identifyPointName;
    }

    public IdentifyPointResultResp setIdentifyPointCode(String identifyPointCode) {
        this.identifyPointCode = identifyPointCode;
        return this;
    }
    public String getIdentifyPointCode() {
        return this.identifyPointCode;
    }

    public IdentifyPointResultResp setIdentifyPointImg(String identifyPointImg) {
        this.identifyPointImg = identifyPointImg;
        return this;
    }
    public String getIdentifyPointImg() {
        return this.identifyPointImg;
    }

    public IdentifyPointResultResp setIdentifyPointResult(String identifyPointResult) {
        this.identifyPointResult = identifyPointResult;
        return this;
    }
    public String getIdentifyPointResult() {
        return this.identifyPointResult;
    }

}
