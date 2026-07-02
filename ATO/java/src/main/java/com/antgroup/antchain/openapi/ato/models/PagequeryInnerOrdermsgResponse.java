// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerOrdermsgResponse extends TeaModel {
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

    // 消息内容列表
    @NameInMap("order_msg_infos")
    public java.util.List<OrderMsgInfo> orderMsgInfos;

    public static PagequeryInnerOrdermsgResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerOrdermsgResponse self = new PagequeryInnerOrdermsgResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerOrdermsgResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryInnerOrdermsgResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryInnerOrdermsgResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryInnerOrdermsgResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public PagequeryInnerOrdermsgResponse setOrderMsgInfos(java.util.List<OrderMsgInfo> orderMsgInfos) {
        this.orderMsgInfos = orderMsgInfos;
        return this;
    }
    public java.util.List<OrderMsgInfo> getOrderMsgInfos() {
        return this.orderMsgInfos;
    }

}
