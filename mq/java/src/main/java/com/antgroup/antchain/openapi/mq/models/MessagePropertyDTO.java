// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class MessagePropertyDTO extends TeaModel {
    // Key 名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static MessagePropertyDTO build(java.util.Map<String, ?> map) throws Exception {
        MessagePropertyDTO self = new MessagePropertyDTO();
        return TeaModel.build(map, self);
    }

    public MessagePropertyDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MessagePropertyDTO setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
