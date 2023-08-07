// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class QueryMerchantUgcimagesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // ugc资产铸造记录id列表
    @NameInMap("record_id_list")
    @Validation(required = true)
    public java.util.List<String> recordIdList;

    // 场景
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    public static QueryMerchantUgcimagesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMerchantUgcimagesRequest self = new QueryMerchantUgcimagesRequest();
        return TeaModel.build(map, self);
    }

    public QueryMerchantUgcimagesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMerchantUgcimagesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMerchantUgcimagesRequest setRecordIdList(java.util.List<String> recordIdList) {
        this.recordIdList = recordIdList;
        return this;
    }
    public java.util.List<String> getRecordIdList() {
        return this.recordIdList;
    }

    public QueryMerchantUgcimagesRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

}
