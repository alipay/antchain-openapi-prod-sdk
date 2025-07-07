// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DepositMetaDataItem extends TeaModel {
    // 结构化存证时该item的描述
    /**
     * <strong>example:</strong>
     * <p>货物个数</p>
     */
    @NameInMap("desc")
    @Validation(required = true)
    public String desc;

    // 结构化存证该数据字段的唯一索引
    /**
     * <strong>example:</strong>
     * <p>item_id</p>
     */
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 结构化存证时该item的类型
    // 0 text
    // 1 encrypt text
    // 2 txHash
    // 3 image url
    // 4 vedio url
    // 5 map url
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public Long type;

    // 结构化数据存证时，该item的值
    /**
     * <strong>example:</strong>
     * <p>10个</p>
     */
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static DepositMetaDataItem build(java.util.Map<String, ?> map) throws Exception {
        DepositMetaDataItem self = new DepositMetaDataItem();
        return TeaModel.build(map, self);
    }

    public DepositMetaDataItem setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public DepositMetaDataItem setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DepositMetaDataItem setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public DepositMetaDataItem setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
