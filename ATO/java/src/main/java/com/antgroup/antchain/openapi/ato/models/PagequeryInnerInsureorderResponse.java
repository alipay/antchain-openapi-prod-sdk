// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerInsureorderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数据总量
    @NameInMap("total_size")
    public Long totalSize;

    // 保单信息
    @NameInMap("inusre_order_infos")
    public java.util.List<InsureOrderInfo> inusreOrderInfos;

    public static PagequeryInnerInsureorderResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerInsureorderResponse self = new PagequeryInnerInsureorderResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerInsureorderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryInnerInsureorderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryInnerInsureorderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryInnerInsureorderResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public PagequeryInnerInsureorderResponse setInusreOrderInfos(java.util.List<InsureOrderInfo> inusreOrderInfos) {
        this.inusreOrderInfos = inusreOrderInfos;
        return this;
    }
    public java.util.List<InsureOrderInfo> getInusreOrderInfos() {
        return this.inusreOrderInfos;
    }

}
