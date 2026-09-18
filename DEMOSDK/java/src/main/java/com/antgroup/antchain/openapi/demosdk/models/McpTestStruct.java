// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class McpTestStruct extends TeaModel {
    // string入参
    /**
     * <strong>example:</strong>
     * <p>string入参</p>
     */
    @NameInMap("struct_string")
    @Validation(required = true)
    public String structString;

    // number入参
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("struct_number")
    @Validation(required = true)
    public Long structNumber;

    // boolean入参
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("struct_boolean")
    @Validation(required = true)
    public Boolean structBoolean;

    // date入参
    /**
     * <strong>example:</strong>
     * <p>2026-09-16 10:00:00</p>
     */
    @NameInMap("struct_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String structDate;

    // list_string入参
    /**
     * <strong>example:</strong>
     * <p>[&quot;VIP&quot;,&quot;新用户&quot;]</p>
     */
    @NameInMap("struct_list")
    @Validation(required = true)
    public java.util.List<String> structList;

    // struct入参
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("struct_struct")
    @Validation(required = true)
    public ResultTest structStruct;

    public static McpTestStruct build(java.util.Map<String, ?> map) throws Exception {
        McpTestStruct self = new McpTestStruct();
        return TeaModel.build(map, self);
    }

    public McpTestStruct setStructString(String structString) {
        this.structString = structString;
        return this;
    }
    public String getStructString() {
        return this.structString;
    }

    public McpTestStruct setStructNumber(Long structNumber) {
        this.structNumber = structNumber;
        return this;
    }
    public Long getStructNumber() {
        return this.structNumber;
    }

    public McpTestStruct setStructBoolean(Boolean structBoolean) {
        this.structBoolean = structBoolean;
        return this;
    }
    public Boolean getStructBoolean() {
        return this.structBoolean;
    }

    public McpTestStruct setStructDate(String structDate) {
        this.structDate = structDate;
        return this;
    }
    public String getStructDate() {
        return this.structDate;
    }

    public McpTestStruct setStructList(java.util.List<String> structList) {
        this.structList = structList;
        return this;
    }
    public java.util.List<String> getStructList() {
        return this.structList;
    }

    public McpTestStruct setStructStruct(ResultTest structStruct) {
        this.structStruct = structStruct;
        return this;
    }
    public ResultTest getStructStruct() {
        return this.structStruct;
    }

}
