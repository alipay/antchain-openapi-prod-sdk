// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class UpdateLoadbalanceVcomputergroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // v_computergroup_id
    @NameInMap("v_computergroup_id")
    @Validation(required = true)
    public String vComputergroupId;

    // is_eip
    @NameInMap("is_eip")
    public Boolean isEip;

    // eips
    @NameInMap("eips")
    @Validation(required = true)
    public java.util.List<String> eips;

    // computer_ids
    @NameInMap("computer_ids")
    public java.util.List<String> computerIds;

    // weights
    @NameInMap("weights")
    @Validation(required = true)
    public java.util.List<Long> weights;

    // ports
    @NameInMap("ports")
    @Validation(required = true)
    public java.util.List<Long> ports;

    // 是否只是调整权重，不增删后端服务器
    @NameInMap("update_weight_only")
    public Boolean updateWeightOnly;

    public static UpdateLoadbalanceVcomputergroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadbalanceVcomputergroupRequest self = new UpdateLoadbalanceVcomputergroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLoadbalanceVcomputergroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateLoadbalanceVcomputergroupRequest setVComputergroupId(String vComputergroupId) {
        this.vComputergroupId = vComputergroupId;
        return this;
    }
    public String getVComputergroupId() {
        return this.vComputergroupId;
    }

    public UpdateLoadbalanceVcomputergroupRequest setIsEip(Boolean isEip) {
        this.isEip = isEip;
        return this;
    }
    public Boolean getIsEip() {
        return this.isEip;
    }

    public UpdateLoadbalanceVcomputergroupRequest setEips(java.util.List<String> eips) {
        this.eips = eips;
        return this;
    }
    public java.util.List<String> getEips() {
        return this.eips;
    }

    public UpdateLoadbalanceVcomputergroupRequest setComputerIds(java.util.List<String> computerIds) {
        this.computerIds = computerIds;
        return this;
    }
    public java.util.List<String> getComputerIds() {
        return this.computerIds;
    }

    public UpdateLoadbalanceVcomputergroupRequest setWeights(java.util.List<Long> weights) {
        this.weights = weights;
        return this;
    }
    public java.util.List<Long> getWeights() {
        return this.weights;
    }

    public UpdateLoadbalanceVcomputergroupRequest setPorts(java.util.List<Long> ports) {
        this.ports = ports;
        return this;
    }
    public java.util.List<Long> getPorts() {
        return this.ports;
    }

    public UpdateLoadbalanceVcomputergroupRequest setUpdateWeightOnly(Boolean updateWeightOnly) {
        this.updateWeightOnly = updateWeightOnly;
        return this;
    }
    public Boolean getUpdateWeightOnly() {
        return this.updateWeightOnly;
    }

}
