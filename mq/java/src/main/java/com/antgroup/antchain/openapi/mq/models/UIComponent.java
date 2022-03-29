// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class UIComponent extends TeaModel {
    // UI组件类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // UI组件中的 内容组成部分，可以由多个Content对象组成
    @NameInMap("contents")
    @Validation(required = true)
    public java.util.List<ComponentContent> contents;

    // 列表内元素组件集合
    @NameInMap("list_items")
    public java.util.List<ItemComponent> listItems;

    public static UIComponent build(java.util.Map<String, ?> map) throws Exception {
        UIComponent self = new UIComponent();
        return TeaModel.build(map, self);
    }

    public UIComponent setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UIComponent setContents(java.util.List<ComponentContent> contents) {
        this.contents = contents;
        return this;
    }
    public java.util.List<ComponentContent> getContents() {
        return this.contents;
    }

    public UIComponent setListItems(java.util.List<ItemComponent> listItems) {
        this.listItems = listItems;
        return this;
    }
    public java.util.List<ItemComponent> getListItems() {
        return this.listItems;
    }

}
