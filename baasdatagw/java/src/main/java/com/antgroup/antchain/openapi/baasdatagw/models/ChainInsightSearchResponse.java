// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightSearchResponse extends TeaModel {
    // 搜索命中的结果总数
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    // 搜索总共消耗了多长时间，时间单位毫秒
    @NameInMap("took")
    @Validation(required = true)
    public Long took;

    // 当前搜索的 context；翻页时请求中的 context 需要配置为该值
    @NameInMap("context")
    @Validation(required = true)
    public String context;

    // 搜索结果
    @NameInMap("items")
    @Validation(required = true)
    public java.util.List<ChainInsightSearchResultItem> items;

    public static ChainInsightSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightSearchResponse self = new ChainInsightSearchResponse();
        return TeaModel.build(map, self);
    }

    public ChainInsightSearchResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ChainInsightSearchResponse setTook(Long took) {
        this.took = took;
        return this;
    }
    public Long getTook() {
        return this.took;
    }

    public ChainInsightSearchResponse setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public ChainInsightSearchResponse setItems(java.util.List<ChainInsightSearchResultItem> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ChainInsightSearchResultItem> getItems() {
        return this.items;
    }

}
