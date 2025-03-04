// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class PagequeryDistributorSubuserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 当前页码(默认为第一页)
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 页面显示条数(默认10，最小为5)
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 钱包地址
    @NameInMap("wallet_address")
    public String walletAddress;

    // 项目合约地址
    @NameInMap("asset_project_address")
    public String assetProjectAddress;

    // 项目名称
    @NameInMap("project_name")
    public String projectName;

    // 项目id
    @NameInMap("project_id")
    public String projectId;

    // 数据类型 
    // REDEEM 
    // ISSUE 
    // 不传为全部
    @NameInMap("transaction_type")
    public String transactionType;

    public static PagequeryDistributorSubuserRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryDistributorSubuserRequest self = new PagequeryDistributorSubuserRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryDistributorSubuserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryDistributorSubuserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryDistributorSubuserRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public PagequeryDistributorSubuserRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryDistributorSubuserRequest setWalletAddress(String walletAddress) {
        this.walletAddress = walletAddress;
        return this;
    }
    public String getWalletAddress() {
        return this.walletAddress;
    }

    public PagequeryDistributorSubuserRequest setAssetProjectAddress(String assetProjectAddress) {
        this.assetProjectAddress = assetProjectAddress;
        return this;
    }
    public String getAssetProjectAddress() {
        return this.assetProjectAddress;
    }

    public PagequeryDistributorSubuserRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public PagequeryDistributorSubuserRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public PagequeryDistributorSubuserRequest setTransactionType(String transactionType) {
        this.transactionType = transactionType;
        return this;
    }
    public String getTransactionType() {
        return this.transactionType;
    }

}
