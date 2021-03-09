// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DeleteResourceVswitchRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 要删除的交换机的地域identity
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // 要删除的交换机所处专有网络的ID
    @NameInMap("vpc_id")
    @Validation(required = true)
    public String vpcId;

    // 要删除的交换机的ID
    @NameInMap("v_switch_id")
    @Validation(required = true)
    public String vSwitchId;

    public static DeleteResourceVswitchRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceVswitchRequest self = new DeleteResourceVswitchRequest();
        return TeaModel.build(map, self);
    }

    public DeleteResourceVswitchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteResourceVswitchRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DeleteResourceVswitchRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DeleteResourceVswitchRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
