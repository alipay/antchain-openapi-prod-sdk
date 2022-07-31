// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rcsmart.models;

import com.aliyun.tea.*;

public class MessageDataVO extends TeaModel {
    // 检测文本
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    // xxxx
    @NameInMap("extends_map")
    public Pair extendsMap;

    public static MessageDataVO build(java.util.Map<String, ?> map) throws Exception {
        MessageDataVO self = new MessageDataVO();
        return TeaModel.build(map, self);
    }

    public MessageDataVO setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public MessageDataVO setExtendsMap(Pair extendsMap) {
        this.extendsMap = extendsMap;
        return this;
    }
    public Pair getExtendsMap() {
        return this.extendsMap;
    }

}
