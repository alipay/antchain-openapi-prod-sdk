// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightEvent extends TeaModel {
    // 事件的 topics 列表
    @NameInMap("topics")
    @Validation(required = true)
    public java.util.List<String> topics;

    // 解析后的交易 topics 列表
    @NameInMap("topics_decoded")
    public java.util.List<String> topicsDecoded;

    // 事件的内容
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 解析后的事件内容
    @NameInMap("content_decoded")
    public String contentDecoded;

    public static ChainInsightEvent build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightEvent self = new ChainInsightEvent();
        return TeaModel.build(map, self);
    }

    public ChainInsightEvent setTopics(java.util.List<String> topics) {
        this.topics = topics;
        return this;
    }
    public java.util.List<String> getTopics() {
        return this.topics;
    }

    public ChainInsightEvent setTopicsDecoded(java.util.List<String> topicsDecoded) {
        this.topicsDecoded = topicsDecoded;
        return this;
    }
    public java.util.List<String> getTopicsDecoded() {
        return this.topicsDecoded;
    }

    public ChainInsightEvent setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ChainInsightEvent setContentDecoded(String contentDecoded) {
        this.contentDecoded = contentDecoded;
        return this;
    }
    public String getContentDecoded() {
        return this.contentDecoded;
    }

}
