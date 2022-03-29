// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class CreateSofamqNodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // cluster
    @NameInMap("cluster")
    public String cluster;

    // hostname
    @NameInMap("hostname")
    @Validation(required = true)
    public String hostname;

    // node_group
    @NameInMap("node_group")
    public String nodeGroup;

    // node_type
    @NameInMap("node_type")
    public String nodeType;

    // perm
    @NameInMap("perm")
    public String perm;

    // rip
    @NameInMap("rip")
    public String rip;

    // room
    @NameInMap("room")
    public String room;

    // vip
    @NameInMap("vip")
    public String vip;

    // default
    @NameInMap("data_center")
    public String dataCenter;

    public static CreateSofamqNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSofamqNodeRequest self = new CreateSofamqNodeRequest();
        return TeaModel.build(map, self);
    }

    public CreateSofamqNodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSofamqNodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateSofamqNodeRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public CreateSofamqNodeRequest setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public CreateSofamqNodeRequest setNodeGroup(String nodeGroup) {
        this.nodeGroup = nodeGroup;
        return this;
    }
    public String getNodeGroup() {
        return this.nodeGroup;
    }

    public CreateSofamqNodeRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public CreateSofamqNodeRequest setPerm(String perm) {
        this.perm = perm;
        return this;
    }
    public String getPerm() {
        return this.perm;
    }

    public CreateSofamqNodeRequest setRip(String rip) {
        this.rip = rip;
        return this;
    }
    public String getRip() {
        return this.rip;
    }

    public CreateSofamqNodeRequest setRoom(String room) {
        this.room = room;
        return this;
    }
    public String getRoom() {
        return this.room;
    }

    public CreateSofamqNodeRequest setVip(String vip) {
        this.vip = vip;
        return this;
    }
    public String getVip() {
        return this.vip;
    }

    public CreateSofamqNodeRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

}
