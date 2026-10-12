// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeRepayofflineaccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求唯一id
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 关联的天枢用信申请订单号
    @NameInMap("use_credit_order_no")
    @Validation(required = true)
    public String useCreditOrderNo;

    // 开始日期
    @NameInMap("start_date")
    @Validation(required = true)
    public String startDate;

    // 结束日期
    @NameInMap("end_date")
    @Validation(required = true)
    public String endDate;

    // 账号
    @NameInMap("account_no")
    @Validation(required = true)
    public String accountNo;

    // 借贷标识:D-借,C-贷
    @NameInMap("dc_flag")
    public String dcFlag;

    // 当前页码
    @NameInMap("current_page")
    @Validation(required = true)
    public String currentPage;

    // 每页记录数
    @NameInMap("page_num")
    @Validation(required = true)
    public String pageNum;

    public static QueryDubbridgeRepayofflineaccountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeRepayofflineaccountRequest self = new QueryDubbridgeRepayofflineaccountRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeRepayofflineaccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeRepayofflineaccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeRepayofflineaccountRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public QueryDubbridgeRepayofflineaccountRequest setUseCreditOrderNo(String useCreditOrderNo) {
        this.useCreditOrderNo = useCreditOrderNo;
        return this;
    }
    public String getUseCreditOrderNo() {
        return this.useCreditOrderNo;
    }

    public QueryDubbridgeRepayofflineaccountRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public QueryDubbridgeRepayofflineaccountRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryDubbridgeRepayofflineaccountRequest setAccountNo(String accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public String getAccountNo() {
        return this.accountNo;
    }

    public QueryDubbridgeRepayofflineaccountRequest setDcFlag(String dcFlag) {
        this.dcFlag = dcFlag;
        return this;
    }
    public String getDcFlag() {
        return this.dcFlag;
    }

    public QueryDubbridgeRepayofflineaccountRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public QueryDubbridgeRepayofflineaccountRequest setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

}
