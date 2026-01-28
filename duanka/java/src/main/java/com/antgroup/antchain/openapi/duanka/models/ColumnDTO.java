// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class ColumnDTO extends TeaModel {
    // tableGuid
    /**
     * <strong>example:</strong>
     * <p>tableGuid</p>
     */
    @NameInMap("table_guid")
    @Validation(required = true)
    public String tableGuid;

    // name
    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // desc
    /**
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("desc")
    @Validation(required = true)
    public String desc;

    // dataType
    /**
     * <strong>example:</strong>
     * <p>dataType</p>
     */
    @NameInMap("data_type")
    @Validation(required = true)
    public String dataType;

    // columnSeq
    /**
     * <strong>example:</strong>
     * <p>columnSeq</p>
     */
    @NameInMap("column_seq")
    @Validation(required = true)
    public Long columnSeq;

    // securityLevel
    /**
     * <strong>example:</strong>
     * <p>securityLevel</p>
     */
    @NameInMap("security_level")
    @Validation(required = true)
    public String securityLevel;

    // true, false
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("is_p_k")
    @Validation(required = true)
    public Boolean isPK;

    // isPartition
    /**
     * <strong>example:</strong>
     * <p>isPartition</p>
     */
    @NameInMap("is_partition")
    @Validation(required = true)
    public Boolean isPartition;

    // columnId
    /**
     * <strong>example:</strong>
     * <p>columnId</p>
     */
    @NameInMap("column_id")
    @Validation(required = true)
    public String columnId;

    // code
    /**
     * <strong>example:</strong>
     * <p>code</p>
     */
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // visitCount
    /**
     * <strong>example:</strong>
     * <p>visitCount</p>
     */
    @NameInMap("visit_count")
    @Validation(required = true)
    public Long visitCount;

    public static ColumnDTO build(java.util.Map<String, ?> map) throws Exception {
        ColumnDTO self = new ColumnDTO();
        return TeaModel.build(map, self);
    }

    public ColumnDTO setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public ColumnDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ColumnDTO setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public ColumnDTO setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public ColumnDTO setColumnSeq(Long columnSeq) {
        this.columnSeq = columnSeq;
        return this;
    }
    public Long getColumnSeq() {
        return this.columnSeq;
    }

    public ColumnDTO setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
        return this;
    }
    public String getSecurityLevel() {
        return this.securityLevel;
    }

    public ColumnDTO setIsPK(Boolean isPK) {
        this.isPK = isPK;
        return this;
    }
    public Boolean getIsPK() {
        return this.isPK;
    }

    public ColumnDTO setIsPartition(Boolean isPartition) {
        this.isPartition = isPartition;
        return this;
    }
    public Boolean getIsPartition() {
        return this.isPartition;
    }

    public ColumnDTO setColumnId(String columnId) {
        this.columnId = columnId;
        return this;
    }
    public String getColumnId() {
        return this.columnId;
    }

    public ColumnDTO setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ColumnDTO setVisitCount(Long visitCount) {
        this.visitCount = visitCount;
        return this;
    }
    public Long getVisitCount() {
        return this.visitCount;
    }

}
