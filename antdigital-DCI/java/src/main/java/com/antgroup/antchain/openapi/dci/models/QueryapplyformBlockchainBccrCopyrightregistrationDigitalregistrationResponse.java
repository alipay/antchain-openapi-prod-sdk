// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dci.models;

import com.aliyun.tea.*;

public class QueryapplyformBlockchainBccrCopyrightregistrationDigitalregistrationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数登申请表OSS下载链接
    @NameInMap("file_url")
    public String fileUrl;

    public static QueryapplyformBlockchainBccrCopyrightregistrationDigitalregistrationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryapplyformBlockchainBccrCopyrightregistrationDigitalregistrationResponse self = new QueryapplyformBlockchainBccrCopyrightregistrationDigitalregistrationResponse();
        return TeaModel.build(map, self);
    }

    public QueryapplyformBlockchainBccrCopyrightregistrationDigitalregistrationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryapplyformBlockchainBccrCopyrightregistrationDigitalregistrationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryapplyformBlockchainBccrCopyrightregistrationDigitalregistrationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryapplyformBlockchainBccrCopyrightregistrationDigitalregistrationResponse setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

}
