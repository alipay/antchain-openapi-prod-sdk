// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ChainPurpose extends TeaModel {
    // 用途id
    @NameInMap("id")
    public String id;

    // 用途key
    @NameInMap("key")
    public String key;

    // 用途内容
    @NameInMap("name")
    public String name;

    // 用途申报时间
    @NameInMap("time")
    public String time;

    // 用途申报状态
    @NameInMap("status")
    public String status;

    // 简短描述开关
    @NameInMap("item")
    public Boolean item;

    // 详细描述开关
    @NameInMap("extend")
    public Boolean extend;

    // 用途申报简短描述
    @NameInMap("purpose_item")
    public String purposeItem;

    public static ChainPurpose build(java.util.Map<String, ?> map) throws Exception {
        ChainPurpose self = new ChainPurpose();
        return TeaModel.build(map, self);
    }

    public ChainPurpose setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ChainPurpose setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ChainPurpose setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ChainPurpose setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public ChainPurpose setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ChainPurpose setItem(Boolean item) {
        this.item = item;
        return this;
    }
    public Boolean getItem() {
        return this.item;
    }

    public ChainPurpose setExtend(Boolean extend) {
        this.extend = extend;
        return this;
    }
    public Boolean getExtend() {
        return this.extend;
    }

    public ChainPurpose setPurposeItem(String purposeItem) {
        this.purposeItem = purposeItem;
        return this;
    }
    public String getPurposeItem() {
        return this.purposeItem;
    }

}
