// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class UpdateSofamqNodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // cluster
    @NameInMap("cluster")
    public String cluster;

    // data_center
    @NameInMap("data_center")
    public String dataCenter;

    // hostname
    @NameInMap("hostname")
    public String hostname;

    // node_group
    @NameInMap("node_group")
    public String nodeGroup;

    // perm
    @NameInMap("perm")
    public String perm;

    // rip
    @NameInMap("rip")
    public String rip;

    // vip
    @NameInMap("vip")
    public String vip;

    // room
    @NameInMap("room")
    public String room;

    public static UpdateSofamqNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSofamqNodeRequest self = new UpdateSofamqNodeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSofamqNodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSofamqNodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateSofamqNodeRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateSofamqNodeRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public UpdateSofamqNodeRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public UpdateSofamqNodeRequest setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public UpdateSofamqNodeRequest setNodeGroup(String nodeGroup) {
        this.nodeGroup = nodeGroup;
        return this;
    }
    public String getNodeGroup() {
        return this.nodeGroup;
    }

    public UpdateSofamqNodeRequest setPerm(String perm) {
        this.perm = perm;
        return this;
    }
    public String getPerm() {
        return this.perm;
    }

    public UpdateSofamqNodeRequest setRip(String rip) {
        this.rip = rip;
        return this;
    }
    public String getRip() {
        return this.rip;
    }

    public UpdateSofamqNodeRequest setVip(String vip) {
        this.vip = vip;
        return this;
    }
    public String getVip() {
        return this.vip;
    }

    public UpdateSofamqNodeRequest setRoom(String room) {
        this.room = room;
        return this;
    }
    public String getRoom() {
        return this.room;
    }

}
