// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class NodeDO extends TeaModel {
    // cluster
    @NameInMap("cluster")
    public String cluster;

    // default
    @NameInMap("data_center")
    public String dataCenter;

    // hostname
    @NameInMap("hostname")
    @Validation(required = true)
    public String hostname;

    // node group
    @NameInMap("node_group")
    public String nodeGroup;

    // node type
    @NameInMap("node_type")
    public String nodeType;

    // node perm
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

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // gmt_create
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    // gmt_modified
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public String gmtModified;

    // 节点状态 MASTER|SLAVE|OFFLINE
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 节点所属环境
    @NameInMap("env")
    public String env;

    // 节点所在城市
    @NameInMap("city")
    public String city;

    public static NodeDO build(java.util.Map<String, ?> map) throws Exception {
        NodeDO self = new NodeDO();
        return TeaModel.build(map, self);
    }

    public NodeDO setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public NodeDO setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public NodeDO setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public NodeDO setNodeGroup(String nodeGroup) {
        this.nodeGroup = nodeGroup;
        return this;
    }
    public String getNodeGroup() {
        return this.nodeGroup;
    }

    public NodeDO setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public NodeDO setPerm(String perm) {
        this.perm = perm;
        return this;
    }
    public String getPerm() {
        return this.perm;
    }

    public NodeDO setRip(String rip) {
        this.rip = rip;
        return this;
    }
    public String getRip() {
        return this.rip;
    }

    public NodeDO setRoom(String room) {
        this.room = room;
        return this;
    }
    public String getRoom() {
        return this.room;
    }

    public NodeDO setVip(String vip) {
        this.vip = vip;
        return this;
    }
    public String getVip() {
        return this.vip;
    }

    public NodeDO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public NodeDO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public NodeDO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public NodeDO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public NodeDO setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public NodeDO setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

}
