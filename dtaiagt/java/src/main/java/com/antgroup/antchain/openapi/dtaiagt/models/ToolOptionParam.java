// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class ToolOptionParam extends TeaModel {
    // 参数名称
    /**
     * <strong>example:</strong>
     * <p>参数名称</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 参数code
    /**
     * <strong>example:</strong>
     * <p>参数code</p>
     */
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 参数描述
    /**
     * <strong>example:</strong>
     * <p>参数描述</p>
     */
    @NameInMap("desc")
    @Validation(required = true)
    public String desc;

    // 参数值
    /**
     * <strong>example:</strong>
     * <p>参数值</p>
     */
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static ToolOptionParam build(java.util.Map<String, ?> map) throws Exception {
        ToolOptionParam self = new ToolOptionParam();
        return TeaModel.build(map, self);
    }

    public ToolOptionParam setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ToolOptionParam setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ToolOptionParam setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public ToolOptionParam setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
