// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class UploadInsuranceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 文件类型
    @NameInMap("file_biz_type")
    public String fileBizType;

    // 文件名称
    @NameInMap("file_name")
    public String fileName;

    // 文件访问路径
    @NameInMap("oss_url")
    public String ossUrl;

    public static UploadInsuranceResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadInsuranceResponse self = new UploadInsuranceResponse();
        return TeaModel.build(map, self);
    }

    public UploadInsuranceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UploadInsuranceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadInsuranceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UploadInsuranceResponse setFileBizType(String fileBizType) {
        this.fileBizType = fileBizType;
        return this;
    }
    public String getFileBizType() {
        return this.fileBizType;
    }

    public UploadInsuranceResponse setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadInsuranceResponse setOssUrl(String ossUrl) {
        this.ossUrl = ossUrl;
        return this;
    }
    public String getOssUrl() {
        return this.ossUrl;
    }

}
