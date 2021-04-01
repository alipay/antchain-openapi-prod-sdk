// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDigitalassetExchangeEptradeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询截止时间
    @NameInMap("end_date")
    @Validation(required = true)
    public String endDate;

    // 版通代码 （版通代码与用户账户至少选一个）
    @NameInMap("ep_code")
    public String epCode;

    // 交易所代码
    @NameInMap("exchange_code")
    @Validation(required = true)
    public String exchangeCode;

    // 页数 从1开始
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 每页显示数量
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 查询起始时间
    @NameInMap("start_date")
    @Validation(required = true)
    public String startDate;

    // 用户账户 （版通代码与用户账户至少选一个）
    @NameInMap("user_account")
    public String userAccount;

    public static QueryDigitalassetExchangeEptradeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalassetExchangeEptradeRequest self = new QueryDigitalassetExchangeEptradeRequest();
        return TeaModel.build(map, self);
    }

    public QueryDigitalassetExchangeEptradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDigitalassetExchangeEptradeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDigitalassetExchangeEptradeRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryDigitalassetExchangeEptradeRequest setEpCode(String epCode) {
        this.epCode = epCode;
        return this;
    }
    public String getEpCode() {
        return this.epCode;
    }

    public QueryDigitalassetExchangeEptradeRequest setExchangeCode(String exchangeCode) {
        this.exchangeCode = exchangeCode;
        return this;
    }
    public String getExchangeCode() {
        return this.exchangeCode;
    }

    public QueryDigitalassetExchangeEptradeRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryDigitalassetExchangeEptradeRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryDigitalassetExchangeEptradeRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public QueryDigitalassetExchangeEptradeRequest setUserAccount(String userAccount) {
        this.userAccount = userAccount;
        return this;
    }
    public String getUserAccount() {
        return this.userAccount;
    }

}
