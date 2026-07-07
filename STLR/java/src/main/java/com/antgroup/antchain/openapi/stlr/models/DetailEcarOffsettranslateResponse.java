// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class DetailEcarOffsettranslateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 业务方的业务单号
    @NameInMap("translation_item_no")
    public String translationItemNo;

    // 发生时间
    @NameInMap("occurrence_time")
    public String occurrenceTime;

    // 业务发生量：转移量
    @NameInMap("amount")
    public String amount;

    // 碳补偿项目编码
    @NameInMap("project_no")
    public String projectNo;

    // 碳普惠项目名称
    @NameInMap("project_name")
    public String projectName;

    // 转出碳账户DID
    @NameInMap("drawing_account_did")
    public String drawingAccountDid;

    // 转入碳账户DID
    @NameInMap("receipt_account_did")
    public String receiptAccountDid;

    public static DetailEcarOffsettranslateResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailEcarOffsettranslateResponse self = new DetailEcarOffsettranslateResponse();
        return TeaModel.build(map, self);
    }

    public DetailEcarOffsettranslateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailEcarOffsettranslateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailEcarOffsettranslateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailEcarOffsettranslateResponse setTranslationItemNo(String translationItemNo) {
        this.translationItemNo = translationItemNo;
        return this;
    }
    public String getTranslationItemNo() {
        return this.translationItemNo;
    }

    public DetailEcarOffsettranslateResponse setOccurrenceTime(String occurrenceTime) {
        this.occurrenceTime = occurrenceTime;
        return this;
    }
    public String getOccurrenceTime() {
        return this.occurrenceTime;
    }

    public DetailEcarOffsettranslateResponse setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public DetailEcarOffsettranslateResponse setProjectNo(String projectNo) {
        this.projectNo = projectNo;
        return this;
    }
    public String getProjectNo() {
        return this.projectNo;
    }

    public DetailEcarOffsettranslateResponse setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DetailEcarOffsettranslateResponse setDrawingAccountDid(String drawingAccountDid) {
        this.drawingAccountDid = drawingAccountDid;
        return this;
    }
    public String getDrawingAccountDid() {
        return this.drawingAccountDid;
    }

    public DetailEcarOffsettranslateResponse setReceiptAccountDid(String receiptAccountDid) {
        this.receiptAccountDid = receiptAccountDid;
        return this;
    }
    public String getReceiptAccountDid() {
        return this.receiptAccountDid;
    }

}
