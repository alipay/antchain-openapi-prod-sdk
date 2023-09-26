// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightSearchResultItem extends TeaModel {
    // 结果类型，枚举：Chain、ChainData、ChainAddress、ChainBlock、ChainTx、ChainTxTimeline
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 结果所在的链ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 结果链ID对应的区块链名称
    @NameInMap("biz_name")
    public String bizName;

    // 结果与搜索请求的相关性程度，(0, 10000000]
    @NameInMap("score")
    @Validation(required = true)
    public Long score;

    // 搜索结果值
    @NameInMap("values")
    @Validation(required = true)
    public java.util.List<MapEntry> values;

    public static ChainInsightSearchResultItem build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightSearchResultItem self = new ChainInsightSearchResultItem();
        return TeaModel.build(map, self);
    }

    public ChainInsightSearchResultItem setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ChainInsightSearchResultItem setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ChainInsightSearchResultItem setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public ChainInsightSearchResultItem setScore(Long score) {
        this.score = score;
        return this;
    }
    public Long getScore() {
        return this.score;
    }

    public ChainInsightSearchResultItem setValues(java.util.List<MapEntry> values) {
        this.values = values;
        return this;
    }
    public java.util.List<MapEntry> getValues() {
        return this.values;
    }

}
