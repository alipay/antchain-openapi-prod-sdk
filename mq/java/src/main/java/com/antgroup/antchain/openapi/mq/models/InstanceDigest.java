// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class InstanceDigest extends TeaModel {
    // job instance id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 分区信息
    @NameInMap("partition")
    @Validation(required = true)
    public String partition;

    // 时间
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    // 任务状态
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    public static InstanceDigest build(java.util.Map<String, ?> map) throws Exception {
        InstanceDigest self = new InstanceDigest();
        return TeaModel.build(map, self);
    }

    public InstanceDigest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public InstanceDigest setPartition(String partition) {
        this.partition = partition;
        return this;
    }
    public String getPartition() {
        return this.partition;
    }

    public InstanceDigest setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public InstanceDigest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
