// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class QrCodeValue extends TeaModel {
    // 二维码链接
    /**
     * <strong>example:</strong>
     * <p>二维码链接</p>
     */
    @NameInMap("qr_code_url")
    @Validation(required = true)
    public String qrCodeUrl;

    // 二维码描述信息。例如：请使用 xxx app 扫码登录
    /**
     * <strong>example:</strong>
     * <p>二维码描述信息。例如：请使用 xxx app 扫码登录</p>
     */
    @NameInMap("desc")
    @Validation(required = true)
    public String desc;

    // 二维码在多长时间后失效，单位：秒
    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("timeout")
    @Validation(required = true)
    public Long timeout;

    public static QrCodeValue build(java.util.Map<String, ?> map) throws Exception {
        QrCodeValue self = new QrCodeValue();
        return TeaModel.build(map, self);
    }

    public QrCodeValue setQrCodeUrl(String qrCodeUrl) {
        this.qrCodeUrl = qrCodeUrl;
        return this;
    }
    public String getQrCodeUrl() {
        return this.qrCodeUrl;
    }

    public QrCodeValue setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public QrCodeValue setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

}
