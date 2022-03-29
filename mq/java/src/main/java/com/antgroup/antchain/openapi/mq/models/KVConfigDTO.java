// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class KVConfigDTO extends TeaModel {
    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true)
    public Long gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public Long gmtModified;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // key
    @NameInMap("uniform_key")
    @Validation(required = true)
    public String uniformKey;

    // 命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // value
    @NameInMap("uniform_value")
    @Validation(required = true)
    public String uniformValue;

    public static KVConfigDTO build(java.util.Map<String, ?> map) throws Exception {
        KVConfigDTO self = new KVConfigDTO();
        return TeaModel.build(map, self);
    }

    public KVConfigDTO setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public KVConfigDTO setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public KVConfigDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public KVConfigDTO setUniformKey(String uniformKey) {
        this.uniformKey = uniformKey;
        return this;
    }
    public String getUniformKey() {
        return this.uniformKey;
    }

    public KVConfigDTO setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public KVConfigDTO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public KVConfigDTO setUniformValue(String uniformValue) {
        this.uniformValue = uniformValue;
        return this;
    }
    public String getUniformValue() {
        return this.uniformValue;
    }

}
