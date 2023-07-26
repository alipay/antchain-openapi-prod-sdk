// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class PagequeryCaasApplicationManageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 页码
    @NameInMap("num")
    @Validation(required = true)
    public Long num;

    // 页大小
    @NameInMap("size")
    @Validation(required = true)
    public Long size;

    public static PagequeryCaasApplicationManageRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryCaasApplicationManageRequest self = new PagequeryCaasApplicationManageRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryCaasApplicationManageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryCaasApplicationManageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryCaasApplicationManageRequest setNum(Long num) {
        this.num = num;
        return this;
    }
    public Long getNum() {
        return this.num;
    }

    public PagequeryCaasApplicationManageRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
