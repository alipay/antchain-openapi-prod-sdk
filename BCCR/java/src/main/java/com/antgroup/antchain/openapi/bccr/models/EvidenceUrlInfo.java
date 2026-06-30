// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class EvidenceUrlInfo extends TeaModel {
    // 取证网址
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.baidu.com">www.baidu.com</a></p>
     */
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    // 音视频取证时间
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("auto_surfing_minute")
    public Long autoSurfingMinute;

    public static EvidenceUrlInfo build(java.util.Map<String, ?> map) throws Exception {
        EvidenceUrlInfo self = new EvidenceUrlInfo();
        return TeaModel.build(map, self);
    }

    public EvidenceUrlInfo setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public EvidenceUrlInfo setAutoSurfingMinute(Long autoSurfingMinute) {
        this.autoSurfingMinute = autoSurfingMinute;
        return this;
    }
    public Long getAutoSurfingMinute() {
        return this.autoSurfingMinute;
    }

}
