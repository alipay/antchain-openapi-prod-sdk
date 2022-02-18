// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class PullIpCodeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数字凭证列表(小程序扫描可跳转)
    @NameInMap("code_list")
    public java.util.List<String> codeList;

    // 展示码列表(和code_list一一对应)
    @NameInMap("show_code_list")
    public java.util.List<String> showCodeList;

    // 交易订单ID
    @NameInMap("order_id")
    public String orderId;

    // IP商家的链上账户ID
    @NameInMap("buyer_account_id")
    public String buyerAccountId;

    // IP版权方的链上账户ID
    @NameInMap("seller_account_id")
    public String sellerAccountId;

    // IPID
    @NameInMap("ip_id")
    public String ipId;

    // IP名称
    @NameInMap("ip_name")
    public String ipName;

    // IP主图的OSS地址
    @NameInMap("ip_image")
    public String ipImage;

    // IP描述
    @NameInMap("ip_desc")
    public String ipDesc;

    // 该批次数字凭证的过期时间戳(毫秒)
    @NameInMap("expired_date")
    public Long expiredDate;

    // 已经申请的总数量
    @NameInMap("total_count")
    public Long totalCount;

    public static PullIpCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        PullIpCodeResponse self = new PullIpCodeResponse();
        return TeaModel.build(map, self);
    }

    public PullIpCodeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PullIpCodeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PullIpCodeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PullIpCodeResponse setCodeList(java.util.List<String> codeList) {
        this.codeList = codeList;
        return this;
    }
    public java.util.List<String> getCodeList() {
        return this.codeList;
    }

    public PullIpCodeResponse setShowCodeList(java.util.List<String> showCodeList) {
        this.showCodeList = showCodeList;
        return this;
    }
    public java.util.List<String> getShowCodeList() {
        return this.showCodeList;
    }

    public PullIpCodeResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public PullIpCodeResponse setBuyerAccountId(String buyerAccountId) {
        this.buyerAccountId = buyerAccountId;
        return this;
    }
    public String getBuyerAccountId() {
        return this.buyerAccountId;
    }

    public PullIpCodeResponse setSellerAccountId(String sellerAccountId) {
        this.sellerAccountId = sellerAccountId;
        return this;
    }
    public String getSellerAccountId() {
        return this.sellerAccountId;
    }

    public PullIpCodeResponse setIpId(String ipId) {
        this.ipId = ipId;
        return this;
    }
    public String getIpId() {
        return this.ipId;
    }

    public PullIpCodeResponse setIpName(String ipName) {
        this.ipName = ipName;
        return this;
    }
    public String getIpName() {
        return this.ipName;
    }

    public PullIpCodeResponse setIpImage(String ipImage) {
        this.ipImage = ipImage;
        return this;
    }
    public String getIpImage() {
        return this.ipImage;
    }

    public PullIpCodeResponse setIpDesc(String ipDesc) {
        this.ipDesc = ipDesc;
        return this;
    }
    public String getIpDesc() {
        return this.ipDesc;
    }

    public PullIpCodeResponse setExpiredDate(Long expiredDate) {
        this.expiredDate = expiredDate;
        return this;
    }
    public Long getExpiredDate() {
        return this.expiredDate;
    }

    public PullIpCodeResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
