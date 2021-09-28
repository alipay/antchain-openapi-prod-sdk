// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftx.models;

import com.aliyun.tea.*;

public class QueryNftCustomerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户支付宝2088账号编码，16位
    @NameInMap("id_no")
    @Validation(required = true)
    public String idNo;

    // 用户的账户类型
    @NameInMap("id_type")
    @Validation(required = true)
    public String idType;

    // NFT资产唯一编码
    @NameInMap("nft_id")
    @Validation(required = true)
    public String nftId;

    public static QueryNftCustomerRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryNftCustomerRequest self = new QueryNftCustomerRequest();
        return TeaModel.build(map, self);
    }

    public QueryNftCustomerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryNftCustomerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryNftCustomerRequest setIdNo(String idNo) {
        this.idNo = idNo;
        return this;
    }
    public String getIdNo() {
        return this.idNo;
    }

    public QueryNftCustomerRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public QueryNftCustomerRequest setNftId(String nftId) {
        this.nftId = nftId;
        return this;
    }
    public String getNftId() {
        return this.nftId;
    }

}
