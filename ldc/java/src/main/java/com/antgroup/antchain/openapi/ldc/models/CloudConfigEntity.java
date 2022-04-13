// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CloudConfigEntity extends TeaModel {
    // 配置详情
    @NameInMap("cloud_config")
    @Validation(required = true)
    public String cloudConfig;

    // 操作时间
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    // 操作类型
    @NameInMap("operation")
    @Validation(required = true)
    public String operation;

    // admin
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    public static CloudConfigEntity build(java.util.Map<String, ?> map) throws Exception {
        CloudConfigEntity self = new CloudConfigEntity();
        return TeaModel.build(map, self);
    }

    public CloudConfigEntity setCloudConfig(String cloudConfig) {
        this.cloudConfig = cloudConfig;
        return this;
    }
    public String getCloudConfig() {
        return this.cloudConfig;
    }

    public CloudConfigEntity setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public CloudConfigEntity setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public CloudConfigEntity setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
