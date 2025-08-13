// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class BaiQrcodeVerifyReqData extends TeaModel {
    // 二维码图片url
    /**
     * <strong>example:</strong>
     * <p><a href="http://xxxxxx">http://xxxxxx</a></p>
     */
    @NameInMap("query_image_url")
    @Validation(required = true)
    public String queryImageUrl;

    public static BaiQrcodeVerifyReqData build(java.util.Map<String, ?> map) throws Exception {
        BaiQrcodeVerifyReqData self = new BaiQrcodeVerifyReqData();
        return TeaModel.build(map, self);
    }

    public BaiQrcodeVerifyReqData setQueryImageUrl(String queryImageUrl) {
        this.queryImageUrl = queryImageUrl;
        return this;
    }
    public String getQueryImageUrl() {
        return this.queryImageUrl;
    }

}
