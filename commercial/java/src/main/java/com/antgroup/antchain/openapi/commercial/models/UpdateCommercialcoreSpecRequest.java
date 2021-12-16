// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class UpdateCommercialcoreSpecRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 规格code
    @NameInMap("spec_code")
    @Validation(required = true)
    public String specCode;

    // 规格名称
    @NameInMap("spec_name")
    @Validation(required = true)
    public String specName;

    // 主要付款方式
    @NameInMap("main_pay_method")
    public String mainPayMethod;

    // 售卖模式
    @NameInMap("sales_mode")
    public String salesMode;

    // 规格描述
    @NameInMap("desc")
    public String desc;

    public static UpdateCommercialcoreSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCommercialcoreSpecRequest self = new UpdateCommercialcoreSpecRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCommercialcoreSpecRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateCommercialcoreSpecRequest setSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }
    public String getSpecCode() {
        return this.specCode;
    }

    public UpdateCommercialcoreSpecRequest setSpecName(String specName) {
        this.specName = specName;
        return this;
    }
    public String getSpecName() {
        return this.specName;
    }

    public UpdateCommercialcoreSpecRequest setMainPayMethod(String mainPayMethod) {
        this.mainPayMethod = mainPayMethod;
        return this;
    }
    public String getMainPayMethod() {
        return this.mainPayMethod;
    }

    public UpdateCommercialcoreSpecRequest setSalesMode(String salesMode) {
        this.salesMode = salesMode;
        return this;
    }
    public String getSalesMode() {
        return this.salesMode;
    }

    public UpdateCommercialcoreSpecRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

}
