// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class ContentUrl extends TeaModel {
    // url
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.test.com/123">www.test.com/123</a></p>
     */
    @NameInMap("url")
    public String url;

    public static ContentUrl build(java.util.Map<String, ?> map) throws Exception {
        ContentUrl self = new ContentUrl();
        return TeaModel.build(map, self);
    }

    public ContentUrl setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
