// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_aafd16538edd4fc0ab50acd01355adb6.models;

import com.aliyun.tea.*;

public class ImportDataBccCompanyPersonResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数据模型唯一key
    @NameInMap("data_key")
    public String dataKey;

    // 模型码
    @NameInMap("data_code")
    public String dataCode;

    public static ImportDataBccCompanyPersonResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportDataBccCompanyPersonResponse self = new ImportDataBccCompanyPersonResponse();
        return TeaModel.build(map, self);
    }

    public ImportDataBccCompanyPersonResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ImportDataBccCompanyPersonResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportDataBccCompanyPersonResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ImportDataBccCompanyPersonResponse setDataKey(String dataKey) {
        this.dataKey = dataKey;
        return this;
    }
    public String getDataKey() {
        return this.dataKey;
    }

    public ImportDataBccCompanyPersonResponse setDataCode(String dataCode) {
        this.dataCode = dataCode;
        return this;
    }
    public String getDataCode() {
        return this.dataCode;
    }

}
