// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class PagequeryCaasContractServiceRequest extends TeaModel {
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

    // 业务数据
    @NameInMap("data")
    public ContractListReq data;

    public static PagequeryCaasContractServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryCaasContractServiceRequest self = new PagequeryCaasContractServiceRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryCaasContractServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryCaasContractServiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryCaasContractServiceRequest setNum(Long num) {
        this.num = num;
        return this;
    }
    public Long getNum() {
        return this.num;
    }

    public PagequeryCaasContractServiceRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public PagequeryCaasContractServiceRequest setData(ContractListReq data) {
        this.data = data;
        return this;
    }
    public ContractListReq getData() {
        return this.data;
    }

}
