// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class EvidenceWebUrlInfo extends TeaModel {
    // 取证网址
    /**
     * <strong>example:</strong>
     * <p>取证网址</p>
     */
    @NameInMap("web_url")
    @Validation(required = true)
    public String webUrl;

    // 取证名称
    /**
     * <strong>example:</strong>
     * <p>取证名称</p>
     */
    @NameInMap("title")
    public String title;

    public static EvidenceWebUrlInfo build(java.util.Map<String, ?> map) throws Exception {
        EvidenceWebUrlInfo self = new EvidenceWebUrlInfo();
        return TeaModel.build(map, self);
    }

    public EvidenceWebUrlInfo setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }
    public String getWebUrl() {
        return this.webUrl;
    }

    public EvidenceWebUrlInfo setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
