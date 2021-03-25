// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CertificateInfo extends TeaModel {
    // 存证证明的证书内容的SHA256哈希值
    @NameInMap("hash")
    @Validation(required = true)
    public String hash;

    // 存证证明的证书文件名
    @NameInMap("resource_name")
    @Validation(required = true)
    public String resourceName;

    // 存证证明的证书下载地址
    @NameInMap("resource_url")
    @Validation(required = true)
    public String resourceUrl;

    public static CertificateInfo build(java.util.Map<String, ?> map) throws Exception {
        CertificateInfo self = new CertificateInfo();
        return TeaModel.build(map, self);
    }

    public CertificateInfo setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public CertificateInfo setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public CertificateInfo setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
        return this;
    }
    public String getResourceUrl() {
        return this.resourceUrl;
    }

}
