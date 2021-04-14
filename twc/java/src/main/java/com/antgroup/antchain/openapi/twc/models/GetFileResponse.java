// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class GetFileResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 文件哈希，当 file_notary_type 为 FILE_HASH 时才有此值。
    @NameInMap("file_hash")
    public String fileHash;

    // 文件存证模式，有 FILE_RAW 和 FILE_HASH 两种可能值。
    @NameInMap("file_notary_type")
    public String fileNotaryType;

    // 哈希算法，当 file_notary_type 为 FILE_HASH 时，此返回值才有效。
    @NameInMap("hash_algorithm")
    public String hashAlgorithm;

    // 文件下载地址，当 file_notary_type 为 FILE_RAW 时才有此值。
    @NameInMap("oss_path")
    public String ossPath;

    public static GetFileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileResponse self = new GetFileResponse();
        return TeaModel.build(map, self);
    }

    public GetFileResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetFileResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetFileResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetFileResponse setFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }
    public String getFileHash() {
        return this.fileHash;
    }

    public GetFileResponse setFileNotaryType(String fileNotaryType) {
        this.fileNotaryType = fileNotaryType;
        return this;
    }
    public String getFileNotaryType() {
        return this.fileNotaryType;
    }

    public GetFileResponse setHashAlgorithm(String hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
        return this;
    }
    public String getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public GetFileResponse setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

}
