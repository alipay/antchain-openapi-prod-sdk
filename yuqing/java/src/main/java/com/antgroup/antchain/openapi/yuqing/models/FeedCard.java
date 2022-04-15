// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class FeedCard extends TeaModel {
    // 卡片流
    @NameInMap("links")
    public java.util.List<Link> links;

    public static FeedCard build(java.util.Map<String, ?> map) throws Exception {
        FeedCard self = new FeedCard();
        return TeaModel.build(map, self);
    }

    public FeedCard setLinks(java.util.List<Link> links) {
        this.links = links;
        return this;
    }
    public java.util.List<Link> getLinks() {
        return this.links;
    }

}
