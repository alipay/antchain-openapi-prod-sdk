// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListUnifiedresourceVswitchRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // region name
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // 要查询的交换机所属VPC的ID
    @NameInMap("vpc_id")
    public String vpcId;

    // 要查询的交换机的ID
    @NameInMap("v_switch_id")
    public String vSwitchId;

    public static ListUnifiedresourceVswitchRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUnifiedresourceVswitchRequest self = new ListUnifiedresourceVswitchRequest();
        return TeaModel.build(map, self);
    }

    public ListUnifiedresourceVswitchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListUnifiedresourceVswitchRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListUnifiedresourceVswitchRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public ListUnifiedresourceVswitchRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
