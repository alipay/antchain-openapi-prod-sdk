// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class DataMarkFileResult extends TeaModel {
    // 返回数据再oss上的地址
    /**
     * <strong>example:</strong>
     * <p><a href="http://invoice">http://invoice</a></p>
     */
    @NameInMap("file_url")
    @Validation(required = true)
    public String fileUrl;

    // 秘钥
    /**
     * <strong>example:</strong>
     * <p>秘钥</p>
     */
    @NameInMap("secret")
    @Validation(required = true)
    public String secret;

    public static DataMarkFileResult build(java.util.Map<String, ?> map) throws Exception {
        DataMarkFileResult self = new DataMarkFileResult();
        return TeaModel.build(map, self);
    }

    public DataMarkFileResult setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public DataMarkFileResult setSecret(String secret) {
        this.secret = secret;
        return this;
    }
    public String getSecret() {
        return this.secret;
    }

}
