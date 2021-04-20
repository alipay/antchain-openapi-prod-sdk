// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class QueryTppAllinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 累计全部参与收益
    @NameInMap("accumulative_revenue")
    public Revenue accumulativeRevenue;

    // 累计参与用书
    @NameInMap("accumulative_users")
    public Long accumulativeUsers;

    // 用户资产详情列表
    @NameInMap("asset_detail_list")
    public java.util.List<AssetDetail> assetDetailList;

    // 用户当前累计收益
    @NameInMap("current_accumulative_revenue")
    public Revenue currentAccumulativeRevenue;

    // 当前用户收益
    @NameInMap("current_revenue")
    public Revenue currentRevenue;

    public static QueryTppAllinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTppAllinfoResponse self = new QueryTppAllinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryTppAllinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTppAllinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTppAllinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTppAllinfoResponse setAccumulativeRevenue(Revenue accumulativeRevenue) {
        this.accumulativeRevenue = accumulativeRevenue;
        return this;
    }
    public Revenue getAccumulativeRevenue() {
        return this.accumulativeRevenue;
    }

    public QueryTppAllinfoResponse setAccumulativeUsers(Long accumulativeUsers) {
        this.accumulativeUsers = accumulativeUsers;
        return this;
    }
    public Long getAccumulativeUsers() {
        return this.accumulativeUsers;
    }

    public QueryTppAllinfoResponse setAssetDetailList(java.util.List<AssetDetail> assetDetailList) {
        this.assetDetailList = assetDetailList;
        return this;
    }
    public java.util.List<AssetDetail> getAssetDetailList() {
        return this.assetDetailList;
    }

    public QueryTppAllinfoResponse setCurrentAccumulativeRevenue(Revenue currentAccumulativeRevenue) {
        this.currentAccumulativeRevenue = currentAccumulativeRevenue;
        return this;
    }
    public Revenue getCurrentAccumulativeRevenue() {
        return this.currentAccumulativeRevenue;
    }

    public QueryTppAllinfoResponse setCurrentRevenue(Revenue currentRevenue) {
        this.currentRevenue = currentRevenue;
        return this;
    }
    public Revenue getCurrentRevenue() {
        return this.currentRevenue;
    }

}
