// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ApplicationGetSkResp extends TeaModel {
    // 应用秘钥
    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("sk")
    public String sk;

    public static ApplicationGetSkResp build(java.util.Map<String, ?> map) throws Exception {
        ApplicationGetSkResp self = new ApplicationGetSkResp();
        return TeaModel.build(map, self);
    }

    public ApplicationGetSkResp setSk(String sk) {
        this.sk = sk;
        return this;
    }
    public String getSk() {
        return this.sk;
    }

}
