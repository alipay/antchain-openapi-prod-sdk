// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sds.models;

import com.aliyun.tea.*;

public class DownloadStockRefundflowResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 【下载链接】流水文件下载链接，30s内有效
    @NameInMap("url")
    public String url;

    // 【退款批次账单文件摘要】默认算法SHA1
    @NameInMap("stock_refundflow_hash")
    public String stockRefundflowHash;

    // 【退款批次账单记录总条数】记录该批次在请求日期下的退款记录条数
    @NameInMap("stock_refundflow_count")
    public Long stockRefundflowCount;

    public static DownloadStockRefundflowResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadStockRefundflowResponse self = new DownloadStockRefundflowResponse();
        return TeaModel.build(map, self);
    }

    public DownloadStockRefundflowResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DownloadStockRefundflowResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DownloadStockRefundflowResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DownloadStockRefundflowResponse setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public DownloadStockRefundflowResponse setStockRefundflowHash(String stockRefundflowHash) {
        this.stockRefundflowHash = stockRefundflowHash;
        return this;
    }
    public String getStockRefundflowHash() {
        return this.stockRefundflowHash;
    }

    public DownloadStockRefundflowResponse setStockRefundflowCount(Long stockRefundflowCount) {
        this.stockRefundflowCount = stockRefundflowCount;
        return this;
    }
    public Long getStockRefundflowCount() {
        return this.stockRefundflowCount;
    }

}
