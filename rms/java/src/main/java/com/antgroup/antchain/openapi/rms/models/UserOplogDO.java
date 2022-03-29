// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UserOplogDO extends TeaModel {
    // 操作记录ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 表名
    @NameInMap("table_name")
    @Validation(required = true)
    public String tableName;

    // 表实体对应ID
    @NameInMap("table_entity_id")
    @Validation(required = true)
    public Long tableEntityId;

    // 操作类型(可以是CREATE、UPDATE、DELETE)
    @NameInMap("op_type")
    @Validation(required = true)
    public String opType;

    // 操作时间 (直接取日志创建时间)
    @NameInMap("gmt_create")
    @Validation(required = true)
    public Long gmtCreate;

    // 操作人
    @NameInMap("creater")
    @Validation(required = true)
    public String creater;

    // tableName+table_entity_id，方便查询
    @NameInMap("combine_query")
    @Validation(required = true)
    public String combineQuery;

    // 实体类型
    @NameInMap("entity_type")
    public String entityType;

    // 名称
    @NameInMap("name")
    public String name;

    // 操作前的内容 (JSON String)
    @NameInMap("op_before_context")
    public String opBeforeContext;

    // 操作后的内容 (JSON String)
    @NameInMap("op_after_context")
    public String opAfterContext;

    public static UserOplogDO build(java.util.Map<String, ?> map) throws Exception {
        UserOplogDO self = new UserOplogDO();
        return TeaModel.build(map, self);
    }

    public UserOplogDO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UserOplogDO setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public UserOplogDO setTableEntityId(Long tableEntityId) {
        this.tableEntityId = tableEntityId;
        return this;
    }
    public Long getTableEntityId() {
        return this.tableEntityId;
    }

    public UserOplogDO setOpType(String opType) {
        this.opType = opType;
        return this;
    }
    public String getOpType() {
        return this.opType;
    }

    public UserOplogDO setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public UserOplogDO setCreater(String creater) {
        this.creater = creater;
        return this;
    }
    public String getCreater() {
        return this.creater;
    }

    public UserOplogDO setCombineQuery(String combineQuery) {
        this.combineQuery = combineQuery;
        return this;
    }
    public String getCombineQuery() {
        return this.combineQuery;
    }

    public UserOplogDO setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public UserOplogDO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UserOplogDO setOpBeforeContext(String opBeforeContext) {
        this.opBeforeContext = opBeforeContext;
        return this;
    }
    public String getOpBeforeContext() {
        return this.opBeforeContext;
    }

    public UserOplogDO setOpAfterContext(String opAfterContext) {
        this.opAfterContext = opAfterContext;
        return this;
    }
    public String getOpAfterContext() {
        return this.opAfterContext;
    }

}
