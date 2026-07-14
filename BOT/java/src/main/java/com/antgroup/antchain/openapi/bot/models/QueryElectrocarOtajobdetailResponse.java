// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarOtajobdetailResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否操作成功
    @NameInMap("success")
    public Boolean success;

    // 响应编码
    @NameInMap("code")
    public String code;

    // 响应消息
    @NameInMap("message")
    public String message;

    // 详情数据
    @NameInMap("detail_data")
    public IotxOTAJobResponse detailData;

    public static QueryElectrocarOtajobdetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarOtajobdetailResponse self = new QueryElectrocarOtajobdetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarOtajobdetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryElectrocarOtajobdetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryElectrocarOtajobdetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryElectrocarOtajobdetailResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryElectrocarOtajobdetailResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryElectrocarOtajobdetailResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryElectrocarOtajobdetailResponse setDetailData(IotxOTAJobResponse detailData) {
        this.detailData = detailData;
        return this;
    }
    public IotxOTAJobResponse getDetailData() {
        return this.detailData;
    }

}
