// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ShortUrlInfo extends TeaModel {
    // 支持卡片短信的手机号
    /**
     * <strong>example:</strong>
     * <p>15012345678</p>
     */
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 解析生成的短链
    /**
     * <strong>example:</strong>
     * <p><a href="https://www.alipay.com/F49v0ifM">https://www.alipay.com/F49v0ifM</a></p>
     */
    @NameInMap("short_url")
    @Validation(required = true)
    public String shortUrl;

    public static ShortUrlInfo build(java.util.Map<String, ?> map) throws Exception {
        ShortUrlInfo self = new ShortUrlInfo();
        return TeaModel.build(map, self);
    }

    public ShortUrlInfo setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public ShortUrlInfo setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
        return this;
    }
    public String getShortUrl() {
        return this.shortUrl;
    }

}
