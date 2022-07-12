// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class GetInternalFileResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 文件存证模式，FILE_RAW(文件原文内容) 和 FILE_HASH(文件hash)
    @NameInMap("file_notary_type")
    public String fileNotaryType;

    // 文件下载地址，当fileNotaryType 为 FILE_RAW 时才有此值，下载链接有效期1个小时
    @NameInMap("oss_path")
    public String ossPath;

    // 文件哈希，当 fileNotaryType 为 FILE_HASH 时才有此值
    @NameInMap("file_hash")
    public String fileHash;

    // 哈希算法，当 fileNotaryType 为 FILE_HASH 时，此返回值才有效
    @NameInMap("hash_algorithm")
    public String hashAlgorithm;

    public static GetInternalFileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInternalFileResponse self = new GetInternalFileResponse();
        return TeaModel.build(map, self);
    }

    public GetInternalFileResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetInternalFileResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetInternalFileResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetInternalFileResponse setFileNotaryType(String fileNotaryType) {
        this.fileNotaryType = fileNotaryType;
        return this;
    }
    public String getFileNotaryType() {
        return this.fileNotaryType;
    }

    public GetInternalFileResponse setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

    public GetInternalFileResponse setFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }
    public String getFileHash() {
        return this.fileHash;
    }

    public GetInternalFileResponse setHashAlgorithm(String hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
        return this;
    }
    public String getHashAlgorithm() {
        return this.hashAlgorithm;
    }

}
