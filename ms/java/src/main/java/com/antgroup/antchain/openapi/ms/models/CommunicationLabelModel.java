// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class CommunicationLabelModel extends TeaModel {
    // 关键字
    @NameInMap("key")
    public String key;

    // 值
    @NameInMap("value")
    public String value;

    // 类型(0-应用,1-标签)
    @NameInMap("type")
    public Long type;

    public static CommunicationLabelModel build(java.util.Map<String, ?> map) throws Exception {
        CommunicationLabelModel self = new CommunicationLabelModel();
        return TeaModel.build(map, self);
    }

    public CommunicationLabelModel setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public CommunicationLabelModel setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public CommunicationLabelModel setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
