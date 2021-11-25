// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class CertifyLPDTO extends TeaModel {
    // 认证id
    @NameInMap("certify_id")
    @Validation(required = true)
    public String certifyId;

    // 二维码url
    @NameInMap("qr_url")
    @Validation(required = true)
    public String qrUrl;

    //  二维码中的Logo的图片地址
    @NameInMap("img_url")
    @Validation(required = true)
    public String imgUrl;

    //  二维码中Logo缩放的比例系数，如5表示长宽最小值的1/5
    @NameInMap("ratio")
    @Validation(required = true)
    public String ratio;

    // 过期时间戳，单位毫秒
    @NameInMap("expires")
    @Validation(required = true)
    public Long expires;

    public static CertifyLPDTO build(java.util.Map<String, ?> map) throws Exception {
        CertifyLPDTO self = new CertifyLPDTO();
        return TeaModel.build(map, self);
    }

    public CertifyLPDTO setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public CertifyLPDTO setQrUrl(String qrUrl) {
        this.qrUrl = qrUrl;
        return this;
    }
    public String getQrUrl() {
        return this.qrUrl;
    }

    public CertifyLPDTO setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        return this;
    }
    public String getImgUrl() {
        return this.imgUrl;
    }

    public CertifyLPDTO setRatio(String ratio) {
        this.ratio = ratio;
        return this;
    }
    public String getRatio() {
        return this.ratio;
    }

    public CertifyLPDTO setExpires(Long expires) {
        this.expires = expires;
        return this;
    }
    public Long getExpires() {
        return this.expires;
    }

}
