// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CheckStatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 存证核验数据组
    @NameInMap("notary_check_meta_list")
    @Validation(required = true)
    public java.util.List<NotaryCheckMeta> notaryCheckMetaList;

    public static CheckStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckStatusRequest self = new CheckStatusRequest();
        return TeaModel.build(map, self);
    }

    public CheckStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckStatusRequest setNotaryCheckMetaList(java.util.List<NotaryCheckMeta> notaryCheckMetaList) {
        this.notaryCheckMetaList = notaryCheckMetaList;
        return this;
    }
    public java.util.List<NotaryCheckMeta> getNotaryCheckMetaList() {
        return this.notaryCheckMetaList;
    }

}
