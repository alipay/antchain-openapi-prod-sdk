// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryResourceVswitchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 交换机所属地域的identity
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // 要查询的交换机所属VPC的ID
    @NameInMap("vpc_id")
    public String vpcId;

    // 要查询的交换机的ID
    @NameInMap("v_switch_id")
    public String vSwitchId;

    public static QueryResourceVswitchRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryResourceVswitchRequest self = new QueryResourceVswitchRequest();
        return TeaModel.build(map, self);
    }

    public QueryResourceVswitchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryResourceVswitchRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public QueryResourceVswitchRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public QueryResourceVswitchRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
