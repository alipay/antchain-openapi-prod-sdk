// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryFundAssetpackageResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 资产包id
    @NameInMap("asset_package_id")
    public String assetPackageId;

    // 用信id
    @NameInMap("utilization_id")
    public String utilizationId;

    // 资产包状态
    @NameInMap("status")
    public String status;

    // 组包完成时间， yyyy-MM-dd HH:mm:ss
    @NameInMap("gmt_grouping_end")
    public String gmtGroupingEnd;

    // 订单列表
    @NameInMap("order_list")
    public java.util.List<AssetPackageOrderInfo> orderList;

    public static QueryFundAssetpackageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFundAssetpackageResponse self = new QueryFundAssetpackageResponse();
        return TeaModel.build(map, self);
    }

    public QueryFundAssetpackageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryFundAssetpackageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryFundAssetpackageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryFundAssetpackageResponse setAssetPackageId(String assetPackageId) {
        this.assetPackageId = assetPackageId;
        return this;
    }
    public String getAssetPackageId() {
        return this.assetPackageId;
    }

    public QueryFundAssetpackageResponse setUtilizationId(String utilizationId) {
        this.utilizationId = utilizationId;
        return this;
    }
    public String getUtilizationId() {
        return this.utilizationId;
    }

    public QueryFundAssetpackageResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryFundAssetpackageResponse setGmtGroupingEnd(String gmtGroupingEnd) {
        this.gmtGroupingEnd = gmtGroupingEnd;
        return this;
    }
    public String getGmtGroupingEnd() {
        return this.gmtGroupingEnd;
    }

    public QueryFundAssetpackageResponse setOrderList(java.util.List<AssetPackageOrderInfo> orderList) {
        this.orderList = orderList;
        return this;
    }
    public java.util.List<AssetPackageOrderInfo> getOrderList() {
        return this.orderList;
    }

}
