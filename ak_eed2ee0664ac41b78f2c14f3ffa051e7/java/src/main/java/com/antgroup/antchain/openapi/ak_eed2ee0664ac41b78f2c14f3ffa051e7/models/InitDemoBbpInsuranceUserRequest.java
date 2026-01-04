// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_eed2ee0664ac41b78f2c14f3ffa051e7.models;

import com.aliyun.tea.*;

public class InitDemoBbpInsuranceUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 保司编码
    @NameInMap("business_code")
    @Validation(required = true)
    public String businessCode;

    // 第三方id，此处为天猫uid
    @NameInMap("third_part_id")
    @Validation(required = true)
    public String thirdPartId;

    // 来源渠道
    @NameInMap("channel")
    @Validation(required = true)
    public String channel;

    // 埋点信息
    @NameInMap("burieds")
    @Validation(required = true)
    public QueryMap burieds;

    public static InitDemoBbpInsuranceUserRequest build(java.util.Map<String, ?> map) throws Exception {
        InitDemoBbpInsuranceUserRequest self = new InitDemoBbpInsuranceUserRequest();
        return TeaModel.build(map, self);
    }

    public InitDemoBbpInsuranceUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitDemoBbpInsuranceUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitDemoBbpInsuranceUserRequest setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }
    public String getBusinessCode() {
        return this.businessCode;
    }

    public InitDemoBbpInsuranceUserRequest setThirdPartId(String thirdPartId) {
        this.thirdPartId = thirdPartId;
        return this;
    }
    public String getThirdPartId() {
        return this.thirdPartId;
    }

    public InitDemoBbpInsuranceUserRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public InitDemoBbpInsuranceUserRequest setBurieds(QueryMap burieds) {
        this.burieds = burieds;
        return this;
    }
    public QueryMap getBurieds() {
        return this.burieds;
    }

}
