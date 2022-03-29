// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class SchemaDetailDO extends TeaModel {
    // 注释
    @NameInMap("comment")
    public String comment;

    // schema内容
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 值校验规则
    @NameInMap("field_validate_rule")
    public String fieldValidateRule;

    // 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 命名空间
    @NameInMap("namespace")
    public String namespace;

    // 序列化类型
    @NameInMap("serialization")
    @Validation(required = true)
    public String serialization;

    // 状态
    @NameInMap("state")
    public String state;

    // 租户
    @NameInMap("tenant")
    public String tenant;

    // schema类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 唯一ID
    @NameInMap("uniq_id")
    public String uniqId;

    // 版本
    @NameInMap("version")
    public Long version;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 创建时间
    @NameInMap("gmt_create")
    public Long gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    public Long gmtModified;

    public static SchemaDetailDO build(java.util.Map<String, ?> map) throws Exception {
        SchemaDetailDO self = new SchemaDetailDO();
        return TeaModel.build(map, self);
    }

    public SchemaDetailDO setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public SchemaDetailDO setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SchemaDetailDO setFieldValidateRule(String fieldValidateRule) {
        this.fieldValidateRule = fieldValidateRule;
        return this;
    }
    public String getFieldValidateRule() {
        return this.fieldValidateRule;
    }

    public SchemaDetailDO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SchemaDetailDO setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SchemaDetailDO setSerialization(String serialization) {
        this.serialization = serialization;
        return this;
    }
    public String getSerialization() {
        return this.serialization;
    }

    public SchemaDetailDO setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public SchemaDetailDO setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public SchemaDetailDO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SchemaDetailDO setUniqId(String uniqId) {
        this.uniqId = uniqId;
        return this;
    }
    public String getUniqId() {
        return this.uniqId;
    }

    public SchemaDetailDO setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

    public SchemaDetailDO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public SchemaDetailDO setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public SchemaDetailDO setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

}
