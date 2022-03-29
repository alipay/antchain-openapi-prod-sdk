// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class WhitelistDO extends TeaModel {
    // instance_id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // topic
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // groupid
    @NameInMap("groupid")
    @Validation(required = true)
    public String groupid;

    // gmt_create
    @NameInMap("gmt_create")
    public String gmtCreate;

    // gmt_modified
    @NameInMap("gmt_modified")
    public String gmtModified;

    public static WhitelistDO build(java.util.Map<String, ?> map) throws Exception {
        WhitelistDO self = new WhitelistDO();
        return TeaModel.build(map, self);
    }

    public WhitelistDO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public WhitelistDO setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public WhitelistDO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public WhitelistDO setGroupid(String groupid) {
        this.groupid = groupid;
        return this;
    }
    public String getGroupid() {
        return this.groupid;
    }

    public WhitelistDO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public WhitelistDO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

}
