// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class ImportIdmapPsiresultfileResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结果文件路径
    @NameInMap("result_file_path")
    public String resultFilePath;

    // 结果文件名称
    @NameInMap("result_file_name")
    public String resultFileName;

    public static ImportIdmapPsiresultfileResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportIdmapPsiresultfileResponse self = new ImportIdmapPsiresultfileResponse();
        return TeaModel.build(map, self);
    }

    public ImportIdmapPsiresultfileResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ImportIdmapPsiresultfileResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportIdmapPsiresultfileResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ImportIdmapPsiresultfileResponse setResultFilePath(String resultFilePath) {
        this.resultFilePath = resultFilePath;
        return this;
    }
    public String getResultFilePath() {
        return this.resultFilePath;
    }

    public ImportIdmapPsiresultfileResponse setResultFileName(String resultFileName) {
        this.resultFileName = resultFileName;
        return this;
    }
    public String getResultFileName() {
        return this.resultFileName;
    }

}
