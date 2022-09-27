// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_b14fc97503f943f48147eb72b47b244d.models;

import com.aliyun.tea.*;

public class GwValidateProduct extends TeaModel {
    // 核审产品码，支持多种核身产品。
    // ZK_FACE_VERIFY：人脸识别
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 产品渲染方式：H5、NATIVE 或 PC
    @NameInMap("group")
    @Validation(required = true)
    public String group;

    // 核身产品参数，因网关限制，暂只支持Map<String,String>
    @NameInMap("product_params")
    public java.util.List<NameValuePair> productParams;

    public static GwValidateProduct build(java.util.Map<String, ?> map) throws Exception {
        GwValidateProduct self = new GwValidateProduct();
        return TeaModel.build(map, self);
    }

    public GwValidateProduct setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public GwValidateProduct setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public GwValidateProduct setProductParams(java.util.List<NameValuePair> productParams) {
        this.productParams = productParams;
        return this;
    }
    public java.util.List<NameValuePair> getProductParams() {
        return this.productParams;
    }

}
