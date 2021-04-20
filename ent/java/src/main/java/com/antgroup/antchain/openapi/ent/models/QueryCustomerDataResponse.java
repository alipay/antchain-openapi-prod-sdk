// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class QueryCustomerDataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数据类型，ASSET：资产信息， REVENUE：收益信息
    @NameInMap("data_type")
    public String dataType;

    // 登录支付宝的账号，手机号或者邮箱地址
    @NameInMap("logon_id")
    public String logonId;

    // 登录账号类型，PHONE：手机号， EMAIL：电子邮箱
    @NameInMap("logon_id_type")
    public String logonIdType;

    // 页码
    @NameInMap("page_num")
    public Long pageNum;

    // 页面大小
    @NameInMap("page_size")
    public Long pageSize;

    // 总数
    @NameInMap("total_count")
    public Long totalCount;

    // 用户资产信息列表
    @NameInMap("user_asset_details")
    public java.util.List<UserAssetDetail> userAssetDetails;

    // 用户收益信息
    @NameInMap("user_revenue_data")
    public UserRevenueDetail userRevenueData;

    // 用户虚拟唯一标识
    @NameInMap("vid")
    public String vid;

    public static QueryCustomerDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomerDataResponse self = new QueryCustomerDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryCustomerDataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCustomerDataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCustomerDataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCustomerDataResponse setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public QueryCustomerDataResponse setLogonId(String logonId) {
        this.logonId = logonId;
        return this;
    }
    public String getLogonId() {
        return this.logonId;
    }

    public QueryCustomerDataResponse setLogonIdType(String logonIdType) {
        this.logonIdType = logonIdType;
        return this;
    }
    public String getLogonIdType() {
        return this.logonIdType;
    }

    public QueryCustomerDataResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryCustomerDataResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCustomerDataResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryCustomerDataResponse setUserAssetDetails(java.util.List<UserAssetDetail> userAssetDetails) {
        this.userAssetDetails = userAssetDetails;
        return this;
    }
    public java.util.List<UserAssetDetail> getUserAssetDetails() {
        return this.userAssetDetails;
    }

    public QueryCustomerDataResponse setUserRevenueData(UserRevenueDetail userRevenueData) {
        this.userRevenueData = userRevenueData;
        return this;
    }
    public UserRevenueDetail getUserRevenueData() {
        return this.userRevenueData;
    }

    public QueryCustomerDataResponse setVid(String vid) {
        this.vid = vid;
        return this;
    }
    public String getVid() {
        return this.vid;
    }

}
