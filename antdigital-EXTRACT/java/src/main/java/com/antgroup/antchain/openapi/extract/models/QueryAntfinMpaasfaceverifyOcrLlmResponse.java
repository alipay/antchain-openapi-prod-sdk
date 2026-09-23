// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.extract.models;

import com.aliyun.tea.*;

public class QueryAntfinMpaasfaceverifyOcrLlmResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 识别成功后生成的zhub OCR单据号，用于链路排查和对账。
    @NameInMap("certify_id")
    public String certifyId;

    // OCR识别结果的JSON字符串，保留算法result.data结构。raw_text为全文文本，fields为字段对象，字段值包含value，line_items为明细行数组；具体字段按材料和抽取模式返回，不保证每次全部存在。
    @NameInMap("ocr_data")
    public String ocrData;

    public static QueryAntfinMpaasfaceverifyOcrLlmResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntfinMpaasfaceverifyOcrLlmResponse self = new QueryAntfinMpaasfaceverifyOcrLlmResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntfinMpaasfaceverifyOcrLlmResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntfinMpaasfaceverifyOcrLlmResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntfinMpaasfaceverifyOcrLlmResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntfinMpaasfaceverifyOcrLlmResponse setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public QueryAntfinMpaasfaceverifyOcrLlmResponse setOcrData(String ocrData) {
        this.ocrData = ocrData;
        return this;
    }
    public String getOcrData() {
        return this.ocrData;
    }

}
