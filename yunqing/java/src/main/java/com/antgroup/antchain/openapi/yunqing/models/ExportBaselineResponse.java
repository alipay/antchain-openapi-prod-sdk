// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ExportBaselineResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 回流数据箱
    @NameInMap("datas")
    public java.util.List<BoxData> datas;

    // 基线导出固定为BACK_FLOW
    @NameInMap("type")
    public String type;

    // 回流数据版本
    @NameInMap("version")
    public String version;

    public static ExportBaselineResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportBaselineResponse self = new ExportBaselineResponse();
        return TeaModel.build(map, self);
    }

    public ExportBaselineResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExportBaselineResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExportBaselineResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExportBaselineResponse setDatas(java.util.List<BoxData> datas) {
        this.datas = datas;
        return this;
    }
    public java.util.List<BoxData> getDatas() {
        return this.datas;
    }

    public ExportBaselineResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ExportBaselineResponse setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
