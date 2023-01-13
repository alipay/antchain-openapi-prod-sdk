// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_1f51f68dfc5d438387dbbaa76f5997f4.models;

import com.aliyun.tea.*;

public class QueryAntchainMytcMiniCertResponse extends TeaModel {
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

    public static QueryAntchainMytcMiniCertResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainMytcMiniCertResponse self = new QueryAntchainMytcMiniCertResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainMytcMiniCertResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainMytcMiniCertResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainMytcMiniCertResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainMytcMiniCertResponse setBlockInfo(BlockInfo blockInfo) {
        this.blockInfo = blockInfo;
        return this;
    }
    public BlockInfo getBlockInfo() {
        return this.blockInfo;
    }

    public QueryAntchainMytcMiniCertResponse setUploadInfo(UploaderInfo uploadInfo) {
        this.uploadInfo = uploadInfo;
        return this;
    }
    public UploaderInfo getUploadInfo() {
        return this.uploadInfo;
    }

}
