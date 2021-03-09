// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class UpdateLoadbalanceSpecRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 公网类型实例的付费方式。取值： PAY_BY_BANDWIDTH：按带宽计费。 PAY_BY_TRAFFIC：按流量计费（默认值）。
    @NameInMap("internet_charge_type")
    @Validation(required = true)
    public String internetChargeType;

    // 若为按带宽计费类型需填写此字段
    @NameInMap("bandwidth")
    public Long bandwidth;

    // lb paas id
    @NameInMap("loadbalance_sequence")
    @Validation(required = true)
    public String loadbalanceSequence;

    public static UpdateLoadbalanceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadbalanceSpecRequest self = new UpdateLoadbalanceSpecRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLoadbalanceSpecRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateLoadbalanceSpecRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public UpdateLoadbalanceSpecRequest setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public UpdateLoadbalanceSpecRequest setLoadbalanceSequence(String loadbalanceSequence) {
        this.loadbalanceSequence = loadbalanceSequence;
        return this;
    }
    public String getLoadbalanceSequence() {
        return this.loadbalanceSequence;
    }

}
