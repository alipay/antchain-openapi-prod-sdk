// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class BaiQrcodeParseReqData extends TeaModel {
    // 待识别图片的url
    @NameInMap("image_url")
    @Validation(required = true)
    public String imageUrl;

    public static BaiQrcodeParseReqData build(java.util.Map<String, ?> map) throws Exception {
        BaiQrcodeParseReqData self = new BaiQrcodeParseReqData();
        return TeaModel.build(map, self);
    }

    public BaiQrcodeParseReqData setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

}
