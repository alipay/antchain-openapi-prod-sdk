// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.smartpromotion.models;

import com.aliyun.tea.*;

public class SignUrlResult extends TeaModel {
    // 签署（长）链接
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxxx.com">https://xxxx.com</a></p>
     */
    @NameInMap("url")
    public String url;

    // 签署短链接
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxxx.com">https://xxxx.com</a></p>
     */
    @NameInMap("short_url")
    public String shortUrl;

    // 签署链接提示信息
    /**
     * <strong>example:</strong>
     * <p>签署链接创建成功</p>
     */
    @NameInMap("sign_msg")
    public String signMsg;

    public static SignUrlResult build(java.util.Map<String, ?> map) throws Exception {
        SignUrlResult self = new SignUrlResult();
        return TeaModel.build(map, self);
    }

    public SignUrlResult setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public SignUrlResult setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
        return this;
    }
    public String getShortUrl() {
        return this.shortUrl;
    }

    public SignUrlResult setSignMsg(String signMsg) {
        this.signMsg = signMsg;
        return this;
    }
    public String getSignMsg() {
        return this.signMsg;
    }

}
