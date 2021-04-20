// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class QueryCustomerDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资产类型：PRE_ALLOCATION（待发放），RELEASED（已到账），CANCELLED（已取消），REDEEMING（兑现中），REDEEMED（已兑现）
    @NameInMap("asset_type")
    public String assetType;

    // 合约ID
    @NameInMap("contract_id")
    public String contractId;

    // 数据类型，ASSET：资产信息， REVENUE：收益信息
    @NameInMap("data_type")
    @Validation(required = true)
    public String dataType;

    // 截止时间，时区GMT+8，精确到毫秒
    @NameInMap("end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    // 登录支付宝的账号，手机号或者邮箱
    @NameInMap("logon_id")
    @Validation(required = true)
    public String logonId;

    // 登录账号类型，PHONE：手机号， EMAIL：邮箱地址
    @NameInMap("logon_id_type")
    @Validation(required = true)
    public String logonIdType;

    // 排序方式，ASC：升序， DESC：降序，默认按照时间降序
    @NameInMap("order_by")
    public String orderBy;

    // 页码
    @NameInMap("page_num")
    public Long pageNum;

    // 页面大小
    @NameInMap("page_size")
    public Long pageSize;

    // 起始时间，时区GMT+8，精确到毫秒
    @NameInMap("start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    public static QueryCustomerDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomerDataRequest self = new QueryCustomerDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryCustomerDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCustomerDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCustomerDataRequest setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
    }

    public QueryCustomerDataRequest setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

    public QueryCustomerDataRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public QueryCustomerDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryCustomerDataRequest setLogonId(String logonId) {
        this.logonId = logonId;
        return this;
    }
    public String getLogonId() {
        return this.logonId;
    }

    public QueryCustomerDataRequest setLogonIdType(String logonIdType) {
        this.logonIdType = logonIdType;
        return this;
    }
    public String getLogonIdType() {
        return this.logonIdType;
    }

    public QueryCustomerDataRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public QueryCustomerDataRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryCustomerDataRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCustomerDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
