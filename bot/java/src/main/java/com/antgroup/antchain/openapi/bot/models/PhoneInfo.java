// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PhoneInfo extends TeaModel {
    // 颜色
    /**
     * <strong>example:</strong>
     * <p>红色</p>
     */
    @NameInMap("colour")
    @Validation(required = true)
    public String colour;

    // 色值
    /**
     * <strong>example:</strong>
     * <p>#BA0F2F</p>
     */
    @NameInMap("colour_number")
    @Validation(required = true)
    public String colourNumber;

    // 内存大小
    /**
     * <strong>example:</strong>
     * <p>128GB</p>
     */
    @NameInMap("memory")
    @Validation(required = true)
    public String memory;

    public static PhoneInfo build(java.util.Map<String, ?> map) throws Exception {
        PhoneInfo self = new PhoneInfo();
        return TeaModel.build(map, self);
    }

    public PhoneInfo setColour(String colour) {
        this.colour = colour;
        return this;
    }
    public String getColour() {
        return this.colour;
    }

    public PhoneInfo setColourNumber(String colourNumber) {
        this.colourNumber = colourNumber;
        return this;
    }
    public String getColourNumber() {
        return this.colourNumber;
    }

    public PhoneInfo setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public String getMemory() {
        return this.memory;
    }

}
