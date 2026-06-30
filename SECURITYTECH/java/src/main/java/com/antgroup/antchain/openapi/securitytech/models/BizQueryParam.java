// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class BizQueryParam extends TeaModel {
    // 参数列表，数组
    @NameInMap("biz_params")
    @Validation(required = true)
    public java.util.List<BizParam> bizParams;

    public static BizQueryParam build(java.util.Map<String, ?> map) throws Exception {
        BizQueryParam self = new BizQueryParam();
        return TeaModel.build(map, self);
    }

    public BizQueryParam setBizParams(java.util.List<BizParam> bizParams) {
        this.bizParams = bizParams;
        return this;
    }
    public java.util.List<BizParam> getBizParams() {
        return this.bizParams;
    }

}
