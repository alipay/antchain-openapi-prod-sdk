// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class RemoveLoadbalanceVcomputergroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // computer_ids
    @NameInMap("computer_ids")
    @Validation(required = true)
    public java.util.List<String> computerIds;

    // 后端是否是弹性网卡
    @NameInMap("is_eip")
    public Boolean isEip;

    // ports
    @NameInMap("ports")
    @Validation(required = true)
    public java.util.List<Long> ports;

    // weights
    @NameInMap("weights")
    @Validation(required = true)
    public java.util.List<Long> weights;

    // eips
    @NameInMap("eips")
    public java.util.List<String> eips;

    // v_computer_group_id
    @NameInMap("v_computer_group_id")
    @Validation(required = true)
    public String vComputerGroupId;

    // workspace_id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    public static RemoveLoadbalanceVcomputergroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveLoadbalanceVcomputergroupRequest self = new RemoveLoadbalanceVcomputergroupRequest();
        return TeaModel.build(map, self);
    }

    public RemoveLoadbalanceVcomputergroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RemoveLoadbalanceVcomputergroupRequest setComputerIds(java.util.List<String> computerIds) {
        this.computerIds = computerIds;
        return this;
    }
    public java.util.List<String> getComputerIds() {
        return this.computerIds;
    }

    public RemoveLoadbalanceVcomputergroupRequest setIsEip(Boolean isEip) {
        this.isEip = isEip;
        return this;
    }
    public Boolean getIsEip() {
        return this.isEip;
    }

    public RemoveLoadbalanceVcomputergroupRequest setPorts(java.util.List<Long> ports) {
        this.ports = ports;
        return this;
    }
    public java.util.List<Long> getPorts() {
        return this.ports;
    }

    public RemoveLoadbalanceVcomputergroupRequest setWeights(java.util.List<Long> weights) {
        this.weights = weights;
        return this;
    }
    public java.util.List<Long> getWeights() {
        return this.weights;
    }

    public RemoveLoadbalanceVcomputergroupRequest setEips(java.util.List<String> eips) {
        this.eips = eips;
        return this;
    }
    public java.util.List<String> getEips() {
        return this.eips;
    }

    public RemoveLoadbalanceVcomputergroupRequest setVComputerGroupId(String vComputerGroupId) {
        this.vComputerGroupId = vComputerGroupId;
        return this;
    }
    public String getVComputerGroupId() {
        return this.vComputerGroupId;
    }

    public RemoveLoadbalanceVcomputergroupRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
