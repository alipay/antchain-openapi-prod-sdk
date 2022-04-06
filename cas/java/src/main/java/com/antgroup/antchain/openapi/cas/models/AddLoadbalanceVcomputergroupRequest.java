// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AddLoadbalanceVcomputergroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // workspace_id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // v_computer_group_id
    @NameInMap("v_computer_group_id")
    @Validation(required = true)
    public String vComputerGroupId;

    // is_eip
    @NameInMap("is_eip")
    public Boolean isEip;

    // computer 的id数组
    @NameInMap("computer_ids")
    public java.util.List<String> computerIds;

    // 权重
    @NameInMap("weights")
    @Validation(required = true)
    public java.util.List<Long> weights;

    // ports
    @NameInMap("ports")
    @Validation(required = true)
    public java.util.List<String> ports;

    // 当is_eip时必填
    @NameInMap("eips")
    public java.util.List<String> eips;

    public static AddLoadbalanceVcomputergroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLoadbalanceVcomputergroupRequest self = new AddLoadbalanceVcomputergroupRequest();
        return TeaModel.build(map, self);
    }

    public AddLoadbalanceVcomputergroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddLoadbalanceVcomputergroupRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public AddLoadbalanceVcomputergroupRequest setVComputerGroupId(String vComputerGroupId) {
        this.vComputerGroupId = vComputerGroupId;
        return this;
    }
    public String getVComputerGroupId() {
        return this.vComputerGroupId;
    }

    public AddLoadbalanceVcomputergroupRequest setIsEip(Boolean isEip) {
        this.isEip = isEip;
        return this;
    }
    public Boolean getIsEip() {
        return this.isEip;
    }

    public AddLoadbalanceVcomputergroupRequest setComputerIds(java.util.List<String> computerIds) {
        this.computerIds = computerIds;
        return this;
    }
    public java.util.List<String> getComputerIds() {
        return this.computerIds;
    }

    public AddLoadbalanceVcomputergroupRequest setWeights(java.util.List<Long> weights) {
        this.weights = weights;
        return this;
    }
    public java.util.List<Long> getWeights() {
        return this.weights;
    }

    public AddLoadbalanceVcomputergroupRequest setPorts(java.util.List<String> ports) {
        this.ports = ports;
        return this;
    }
    public java.util.List<String> getPorts() {
        return this.ports;
    }

    public AddLoadbalanceVcomputergroupRequest setEips(java.util.List<String> eips) {
        this.eips = eips;
        return this;
    }
    public java.util.List<String> getEips() {
        return this.eips;
    }

}
