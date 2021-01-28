// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateEcocontractTransRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 存证关联实体（个人/企业）的身份识别信息
    @NameInMap("customer")
    @Validation(required = true)
    public Identity customer;

    // 扩展属性
    @NameInMap("properties")
    public String properties;

    // 业务子类型标识
    @NameInMap("sub_biz_id")
    public String subBizId;

    // 是否使用可信时间戳，默认为false
    @NameInMap("tsr")
    public Boolean tsr;

    public static CreateEcocontractTransRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEcocontractTransRequest self = new CreateEcocontractTransRequest();
        return TeaModel.build(map, self);
    }

    public CreateEcocontractTransRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateEcocontractTransRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateEcocontractTransRequest setCustomer(Identity customer) {
        this.customer = customer;
        return this;
    }
    public Identity getCustomer() {
        return this.customer;
    }

    public CreateEcocontractTransRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public CreateEcocontractTransRequest setSubBizId(String subBizId) {
        this.subBizId = subBizId;
        return this;
    }
    public String getSubBizId() {
        return this.subBizId;
    }

    public CreateEcocontractTransRequest setTsr(Boolean tsr) {
        this.tsr = tsr;
        return this;
    }
    public Boolean getTsr() {
        return this.tsr;
    }

}
