// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class DataExportTableField extends TeaModel {
    // 列名称
    @NameInMap("column_name")
    public String columnName;

    // 事件中字段提取的 jq 表达式
    @NameInMap("field")
    public String field;

    // 列类型
    @NameInMap("column_type")
    public String columnType;

    // 列大小
    @NameInMap("column_size")
    public Long columnSize;

    // 列描述
    @NameInMap("column_description")
    public String columnDescription;

    public static DataExportTableField build(java.util.Map<String, ?> map) throws Exception {
        DataExportTableField self = new DataExportTableField();
        return TeaModel.build(map, self);
    }

    public DataExportTableField setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }
    public String getColumnName() {
        return this.columnName;
    }

    public DataExportTableField setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public DataExportTableField setColumnType(String columnType) {
        this.columnType = columnType;
        return this;
    }
    public String getColumnType() {
        return this.columnType;
    }

    public DataExportTableField setColumnSize(Long columnSize) {
        this.columnSize = columnSize;
        return this;
    }
    public Long getColumnSize() {
        return this.columnSize;
    }

    public DataExportTableField setColumnDescription(String columnDescription) {
        this.columnDescription = columnDescription;
        return this;
    }
    public String getColumnDescription() {
        return this.columnDescription;
    }

}
