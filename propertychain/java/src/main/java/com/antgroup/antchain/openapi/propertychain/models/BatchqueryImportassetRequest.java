// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class BatchqueryImportassetRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 当前页
    @NameInMap("current_page")
    @Validation(required = true)
    public Long currentPage;

    // 页面大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // string (enum: PICK_UP, WEAK_ASSET, WEAK_ASSET_TRANSFER, WAREHOUSE_RECEIPT_TRANSFER, WAREHOUSE_RECEIPT_REGISTER, PLEDGE_APPLICATION, PLEDGE_RELEASE, WAREHOUSE_RECEIPT_CANCEL, WAREHOUSE_RECEIPT_UPDATE) 
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 用户id
    @NameInMap("user_id")
    public String userId;

    // 资产id
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    public static BatchqueryImportassetRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryImportassetRequest self = new BatchqueryImportassetRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryImportassetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryImportassetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryImportassetRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public BatchqueryImportassetRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public BatchqueryImportassetRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public BatchqueryImportassetRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public BatchqueryImportassetRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

}
