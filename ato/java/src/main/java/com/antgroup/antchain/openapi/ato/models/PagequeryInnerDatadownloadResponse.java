// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerDatadownloadResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总数
    @NameInMap("total")
    public Long total;

    // 下载数据列表
    @NameInMap("data_download_info")
    public java.util.List<DataDownloadInfo> dataDownloadInfo;

    public static PagequeryInnerDatadownloadResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerDatadownloadResponse self = new PagequeryInnerDatadownloadResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerDatadownloadResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryInnerDatadownloadResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryInnerDatadownloadResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryInnerDatadownloadResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public PagequeryInnerDatadownloadResponse setDataDownloadInfo(java.util.List<DataDownloadInfo> dataDownloadInfo) {
        this.dataDownloadInfo = dataDownloadInfo;
        return this;
    }
    public java.util.List<DataDownloadInfo> getDataDownloadInfo() {
        return this.dataDownloadInfo;
    }

}
