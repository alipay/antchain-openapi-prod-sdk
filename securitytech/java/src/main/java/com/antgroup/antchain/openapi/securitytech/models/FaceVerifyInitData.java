// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class FaceVerifyInitData extends TeaModel {
    // 请求唯一标识Id
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 可信实人认证的唯一标识
    @NameInMap("certify_id")
    @Validation(required = true)
    public String certifyId;

    // 认证流程入口 URL
    @NameInMap("certify_url")
    @Validation(required = true)
    public String certifyUrl;

    public static FaceVerifyInitData build(java.util.Map<String, ?> map) throws Exception {
        FaceVerifyInitData self = new FaceVerifyInitData();
        return TeaModel.build(map, self);
    }

    public FaceVerifyInitData setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FaceVerifyInitData setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public FaceVerifyInitData setCertifyUrl(String certifyUrl) {
        this.certifyUrl = certifyUrl;
        return this;
    }
    public String getCertifyUrl() {
        return this.certifyUrl;
    }

}
