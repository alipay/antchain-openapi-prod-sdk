// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ChainPurpose extends TeaModel {
    // 用途id
    /**
     * <strong>example:</strong>
     * <p>4356</p>
     */
    @NameInMap("id")
    public String id;

    // 用途key
    /**
     * <strong>example:</strong>
     * <p>3uhhf</p>
     */
    @NameInMap("key")
    public String key;

    // 用途内容
    /**
     * <strong>example:</strong>
     * <p>用途内容</p>
     */
    @NameInMap("name")
    public String name;

    // 用途申报时间
    /**
     * <strong>example:</strong>
     * <p>22-01-01</p>
     */
    @NameInMap("time")
    public String time;

    // 用途申报状态
    /**
     * <strong>example:</strong>
     * <p>用途申报状态</p>
     */
    @NameInMap("status")
    public String status;

    // 简短描述开关
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("item")
    public Boolean item;

    // 详细描述开关
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("extend")
    public Boolean extend;

    // 用途申报简短描述
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
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
