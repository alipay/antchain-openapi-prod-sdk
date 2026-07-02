// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class TlsnotaryUploadOssLinks extends TeaModel {
    // 证书链摘要文件的oss链接
    /**
     * <strong>example:</strong>
     * <p>tlsnotary/{taskId}.json</p>
     */
    @NameInMap("cert_chain_digest_link")
    @Validation(required = true)
    public String certChainDigestLink;

    // 邮件eml文件的oss链接
    /**
     * <strong>example:</strong>
     * <p>tlsnotary/{taskId}.eml</p>
     */
    @NameInMap("eml_file_link")
    @Validation(required = true)
    public String emlFileLink;

    public static TlsnotaryUploadOssLinks build(java.util.Map<String, ?> map) throws Exception {
        TlsnotaryUploadOssLinks self = new TlsnotaryUploadOssLinks();
        return TeaModel.build(map, self);
    }

    public TlsnotaryUploadOssLinks setCertChainDigestLink(String certChainDigestLink) {
        this.certChainDigestLink = certChainDigestLink;
        return this;
    }
    public String getCertChainDigestLink() {
        return this.certChainDigestLink;
    }

    public TlsnotaryUploadOssLinks setEmlFileLink(String emlFileLink) {
        this.emlFileLink = emlFileLink;
        return this;
    }
    public String getEmlFileLink() {
        return this.emlFileLink;
    }

}
