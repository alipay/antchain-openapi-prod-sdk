// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class BaiQrcodeGenerateReqData extends TeaModel {
    // 二维码的码值
    /**
     * <strong>example:</strong>
     * <p>TEST1234567890</p>
     */
    @NameInMap("qrcode_content")
    @Validation(required = true)
    public String qrcodeContent;

    public static BaiQrcodeGenerateReqData build(java.util.Map<String, ?> map) throws Exception {
        BaiQrcodeGenerateReqData self = new BaiQrcodeGenerateReqData();
        return TeaModel.build(map, self);
    }

    public BaiQrcodeGenerateReqData setQrcodeContent(String qrcodeContent) {
        this.qrcodeContent = qrcodeContent;
        return this;
    }
    public String getQrcodeContent() {
        return this.qrcodeContent;
    }

}
