// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class ImportIdmapSamplefileResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 上传结果地址路径
    @NameInMap("result_file_path")
    public String resultFilePath;

    // oss结果文件名称
    @NameInMap("result_file_name")
    public String resultFileName;

    public static ImportIdmapSamplefileResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportIdmapSamplefileResponse self = new ImportIdmapSamplefileResponse();
        return TeaModel.build(map, self);
    }

    public ImportIdmapSamplefileResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ImportIdmapSamplefileResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportIdmapSamplefileResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ImportIdmapSamplefileResponse setResultFilePath(String resultFilePath) {
        this.resultFilePath = resultFilePath;
        return this;
    }
    public String getResultFilePath() {
        return this.resultFilePath;
    }

    public ImportIdmapSamplefileResponse setResultFileName(String resultFileName) {
        this.resultFileName = resultFileName;
        return this;
    }
    public String getResultFileName() {
        return this.resultFileName;
    }

}
