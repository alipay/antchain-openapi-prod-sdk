// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaasspi.models;

import com.aliyun.tea.*;

public class DownloadAntchainSdsStockUseflowResponse extends TeaModel {
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

    // 【核销批次账单文件摘要】默认算法SHA1
    @NameInMap("stock_useflow_hash")
    public String stockUseflowHash;

    // 【核销批次账单记录总条数】记录该批次在该请求日期下的核销记录条数
    @NameInMap("stock_useflow_count")
    public Long stockUseflowCount;

    public static DownloadAntchainSdsStockUseflowResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadAntchainSdsStockUseflowResponse self = new DownloadAntchainSdsStockUseflowResponse();
        return TeaModel.build(map, self);
    }

    public DownloadAntchainSdsStockUseflowResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DownloadAntchainSdsStockUseflowResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DownloadAntchainSdsStockUseflowResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DownloadAntchainSdsStockUseflowResponse setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public DownloadAntchainSdsStockUseflowResponse setStockUseflowHash(String stockUseflowHash) {
        this.stockUseflowHash = stockUseflowHash;
        return this;
    }
    public String getStockUseflowHash() {
        return this.stockUseflowHash;
    }

    public DownloadAntchainSdsStockUseflowResponse setStockUseflowCount(Long stockUseflowCount) {
        this.stockUseflowCount = stockUseflowCount;
        return this;
    }
    public Long getStockUseflowCount() {
        return this.stockUseflowCount;
    }

}
