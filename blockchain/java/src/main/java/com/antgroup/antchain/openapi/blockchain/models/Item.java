// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class Item extends TeaModel {
    // 溯源项的具体内容
    @NameInMap("desc")
    @Validation(required = true)
    public String desc;

    // 扩展信息 ，json格式
    @NameInMap("ext_info")
    @Validation(required = true)
    public String extInfo;

    // 溯源项的键值
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 溯源项的中文标题 
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 内容类型 
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static Item build(java.util.Map<String, ?> map) throws Exception {
        Item self = new Item();
        return TeaModel.build(map, self);
    }

    public Item setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public Item setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public Item setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public Item setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public Item setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
