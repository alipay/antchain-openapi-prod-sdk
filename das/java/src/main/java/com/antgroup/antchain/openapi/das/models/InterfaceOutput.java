// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class InterfaceOutput extends TeaModel {
    // 接口出参名称
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("name")
    @Validation(maxLength = 50)
    public String name;

    // 接口出参类型
    /**
     * <strong>example:</strong>
     * <p>String</p>
     */
    @NameInMap("type")
    @Validation(maxLength = 50)
    public String type;

    // 接口出参描述
    /**
     * <strong>example:</strong>
     * <p>描述</p>
     */
    @NameInMap("description")
    @Validation(maxLength = 100)
    public String description;

    public static InterfaceOutput build(java.util.Map<String, ?> map) throws Exception {
        InterfaceOutput self = new InterfaceOutput();
        return TeaModel.build(map, self);
    }

    public InterfaceOutput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public InterfaceOutput setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public InterfaceOutput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
