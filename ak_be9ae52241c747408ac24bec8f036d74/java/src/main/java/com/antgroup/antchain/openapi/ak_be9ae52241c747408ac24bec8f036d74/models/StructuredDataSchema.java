// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class StructuredDataSchema extends TeaModel {
    // 结构化数据字段列表
    @NameInMap("field_list")
    public java.util.List<StructuredDataField> fieldList;

    public static StructuredDataSchema build(java.util.Map<String, ?> map) throws Exception {
        StructuredDataSchema self = new StructuredDataSchema();
        return TeaModel.build(map, self);
    }

    public StructuredDataSchema setFieldList(java.util.List<StructuredDataField> fieldList) {
        this.fieldList = fieldList;
        return this;
    }
    public java.util.List<StructuredDataField> getFieldList() {
        return this.fieldList;
    }

}
