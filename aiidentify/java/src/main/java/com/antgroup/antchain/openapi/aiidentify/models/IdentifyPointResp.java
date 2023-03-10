// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiidentify.models;

import com.aliyun.tea.*;

public class IdentifyPointResp extends TeaModel {
    // 鉴定点名称
    @NameInMap("identify_point_name")
    @Validation(required = true)
    public String identifyPointName;

    // 鉴定点序号
    @NameInMap("order")
    @Validation(required = true)
    public Long order;

    // 鉴定点编号
    @NameInMap("identify_point_code")
    @Validation(required = true)
    public String identifyPointCode;

    // 标签图片oss链接
    @NameInMap("label_img")
    @Validation(required = true)
    public String labelImg;

    // 示例图片oss链接
    @NameInMap("example_img")
    @Validation(required = true)
    public String exampleImg;

    // 是否必传鉴定点
    @NameInMap("is_required")
    @Validation(required = true)
    public Boolean isRequired;

    public static IdentifyPointResp build(java.util.Map<String, ?> map) throws Exception {
        IdentifyPointResp self = new IdentifyPointResp();
        return TeaModel.build(map, self);
    }

    public IdentifyPointResp setIdentifyPointName(String identifyPointName) {
        this.identifyPointName = identifyPointName;
        return this;
    }
    public String getIdentifyPointName() {
        return this.identifyPointName;
    }

    public IdentifyPointResp setOrder(Long order) {
        this.order = order;
        return this;
    }
    public Long getOrder() {
        return this.order;
    }

    public IdentifyPointResp setIdentifyPointCode(String identifyPointCode) {
        this.identifyPointCode = identifyPointCode;
        return this;
    }
    public String getIdentifyPointCode() {
        return this.identifyPointCode;
    }

    public IdentifyPointResp setLabelImg(String labelImg) {
        this.labelImg = labelImg;
        return this;
    }
    public String getLabelImg() {
        return this.labelImg;
    }

    public IdentifyPointResp setExampleImg(String exampleImg) {
        this.exampleImg = exampleImg;
        return this;
    }
    public String getExampleImg() {
        return this.exampleImg;
    }

    public IdentifyPointResp setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
        return this;
    }
    public Boolean getIsRequired() {
        return this.isRequired;
    }

}
