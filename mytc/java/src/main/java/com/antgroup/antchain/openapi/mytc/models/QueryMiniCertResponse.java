// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class QueryMiniCertResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 区块信息
    @NameInMap("block_info")
    public BlockInfo blockInfo;

    // 上传者信息
    @NameInMap("upload_info")
    public UploaderInfo uploadInfo;

    public static QueryMiniCertResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMiniCertResponse self = new QueryMiniCertResponse();
        return TeaModel.build(map, self);
    }

    public QueryMiniCertResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMiniCertResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMiniCertResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMiniCertResponse setBlockInfo(BlockInfo blockInfo) {
        this.blockInfo = blockInfo;
        return this;
    }
    public BlockInfo getBlockInfo() {
        return this.blockInfo;
    }

    public QueryMiniCertResponse setUploadInfo(UploaderInfo uploadInfo) {
        this.uploadInfo = uploadInfo;
        return this;
    }
    public UploaderInfo getUploadInfo() {
        return this.uploadInfo;
    }

}
