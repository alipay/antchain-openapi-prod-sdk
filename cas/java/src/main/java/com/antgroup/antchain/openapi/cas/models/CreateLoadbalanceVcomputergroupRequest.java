// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateLoadbalanceVcomputergroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // load_balancer_id
    @NameInMap("load_balancer_id")
    @Validation(required = true)
    public String loadBalancerId;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // computer_ids
    @NameInMap("computer_ids")
    @Validation(required = true)
    public java.util.List<String> computerIds;

    // ports
    @NameInMap("ports")
    @Validation(required = true)
    public java.util.List<Long> ports;

    // weights
    @NameInMap("weights")
    @Validation(required = true)
    public java.util.List<Long> weights;

    // is_eip
    @NameInMap("is_eip")
    public Boolean isEip;

    // eips
    @NameInMap("eips")
    public java.util.List<String> eips;

    public static CreateLoadbalanceVcomputergroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadbalanceVcomputergroupRequest self = new CreateLoadbalanceVcomputergroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateLoadbalanceVcomputergroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLoadbalanceVcomputergroupRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public CreateLoadbalanceVcomputergroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLoadbalanceVcomputergroupRequest setComputerIds(java.util.List<String> computerIds) {
        this.computerIds = computerIds;
        return this;
    }
    public java.util.List<String> getComputerIds() {
        return this.computerIds;
    }

    public CreateLoadbalanceVcomputergroupRequest setPorts(java.util.List<Long> ports) {
        this.ports = ports;
        return this;
    }
    public java.util.List<Long> getPorts() {
        return this.ports;
    }

    public CreateLoadbalanceVcomputergroupRequest setWeights(java.util.List<Long> weights) {
        this.weights = weights;
        return this;
    }
    public java.util.List<Long> getWeights() {
        return this.weights;
    }

    public CreateLoadbalanceVcomputergroupRequest setIsEip(Boolean isEip) {
        this.isEip = isEip;
        return this;
    }
    public Boolean getIsEip() {
        return this.isEip;
    }

    public CreateLoadbalanceVcomputergroupRequest setEips(java.util.List<String> eips) {
        this.eips = eips;
        return this;
    }
    public java.util.List<String> getEips() {
        return this.eips;
    }

}
