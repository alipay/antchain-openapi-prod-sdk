// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_b14fc97503f943f48147eb72b47b244d.models;

import com.aliyun.tea.*;

public class InitAntchainBbpInsuranceUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 保司编码
    @NameInMap("business_code")
    @Validation(required = true)
    public String businessCode;

    // 三方Id，此处为天猫id
    @NameInMap("third_part_id")
    @Validation(required = true)
    public String thirdPartId;

    // 来源渠道，TIANMAO（天猫）
    @NameInMap("channel")
    @Validation(required = true)
    public String channel;

    // 埋点信息，JSON格式字符串
    @NameInMap("burieds")
    public String burieds;

    public static InitAntchainBbpInsuranceUserRequest build(java.util.Map<String, ?> map) throws Exception {
        InitAntchainBbpInsuranceUserRequest self = new InitAntchainBbpInsuranceUserRequest();
        return TeaModel.build(map, self);
    }

    public InitAntchainBbpInsuranceUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitAntchainBbpInsuranceUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitAntchainBbpInsuranceUserRequest setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }
    public String getBusinessCode() {
        return this.businessCode;
    }

    public InitAntchainBbpInsuranceUserRequest setThirdPartId(String thirdPartId) {
        this.thirdPartId = thirdPartId;
        return this;
    }
    public String getThirdPartId() {
        return this.thirdPartId;
    }

    public InitAntchainBbpInsuranceUserRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public InitAntchainBbpInsuranceUserRequest setBurieds(String burieds) {
        this.burieds = burieds;
        return this;
    }
    public String getBurieds() {
        return this.burieds;
    }

}
