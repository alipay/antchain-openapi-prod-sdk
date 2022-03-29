// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ItemComponent extends TeaModel {
    // 内容
    @NameInMap("contents")
    @Validation(required = true)
    public java.util.List<ComponentContent> contents;

    public static ItemComponent build(java.util.Map<String, ?> map) throws Exception {
        ItemComponent self = new ItemComponent();
        return TeaModel.build(map, self);
    }

    public ItemComponent setContents(java.util.List<ComponentContent> contents) {
        this.contents = contents;
        return this;
    }
    public java.util.List<ComponentContent> getContents() {
        return this.contents;
    }

}
