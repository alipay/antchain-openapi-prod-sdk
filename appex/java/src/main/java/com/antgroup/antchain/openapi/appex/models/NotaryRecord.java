// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class NotaryRecord extends TeaModel {
    // 存证记录
    @NameInMap("attributes")
    @Validation(required = true)
    public java.util.List<NameValuePair> attributes;

    // 二维码链接
    @NameInMap("qr_code_url")
    @Validation(required = true)
    public String qrCodeUrl;

    public static NotaryRecord build(java.util.Map<String, ?> map) throws Exception {
        NotaryRecord self = new NotaryRecord();
        return TeaModel.build(map, self);
    }

    public NotaryRecord setAttributes(java.util.List<NameValuePair> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.List<NameValuePair> getAttributes() {
        return this.attributes;
    }

    public NotaryRecord setQrCodeUrl(String qrCodeUrl) {
        this.qrCodeUrl = qrCodeUrl;
        return this;
    }
    public String getQrCodeUrl() {
        return this.qrCodeUrl;
    }

}
