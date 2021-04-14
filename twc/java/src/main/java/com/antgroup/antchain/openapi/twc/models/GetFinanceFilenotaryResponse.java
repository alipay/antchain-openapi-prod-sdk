// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class GetFinanceFilenotaryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 存证文件名称
    @NameInMap("file_name")
    public String fileName;

    // 文件存证类型
    @NameInMap("file_notary_type")
    public String fileNotaryType;

    // 哈希算法
    @NameInMap("hash_algorithm")
    public String hashAlgorithm;

    // FILE_HASH 模式时该值为文件哈希；FILE_RAW 模式时该值为临时 oss 下载地址
    @NameInMap("notary_content")
    public String notaryContent;

    // 存证阶段
    @NameInMap("phase")
    public String phase;

    // 扩展属性
    @NameInMap("properties")
    public String properties;

    // 可信时间戳
    @NameInMap("tsr")
    public TsrResponse tsr;

    public static GetFinanceFilenotaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFinanceFilenotaryResponse self = new GetFinanceFilenotaryResponse();
        return TeaModel.build(map, self);
    }

    public GetFinanceFilenotaryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetFinanceFilenotaryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetFinanceFilenotaryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetFinanceFilenotaryResponse setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetFinanceFilenotaryResponse setFileNotaryType(String fileNotaryType) {
        this.fileNotaryType = fileNotaryType;
        return this;
    }
    public String getFileNotaryType() {
        return this.fileNotaryType;
    }

    public GetFinanceFilenotaryResponse setHashAlgorithm(String hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
        return this;
    }
    public String getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public GetFinanceFilenotaryResponse setNotaryContent(String notaryContent) {
        this.notaryContent = notaryContent;
        return this;
    }
    public String getNotaryContent() {
        return this.notaryContent;
    }

    public GetFinanceFilenotaryResponse setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public GetFinanceFilenotaryResponse setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public GetFinanceFilenotaryResponse setTsr(TsrResponse tsr) {
        this.tsr = tsr;
        return this;
    }
    public TsrResponse getTsr() {
        return this.tsr;
    }

}
