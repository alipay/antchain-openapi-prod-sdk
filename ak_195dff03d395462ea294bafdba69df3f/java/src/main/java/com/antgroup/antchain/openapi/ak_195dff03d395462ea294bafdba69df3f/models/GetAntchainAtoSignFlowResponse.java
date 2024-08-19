// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class GetAntchainAtoSignFlowResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 签署合同单号
    @NameInMap("sign_no")
    public String signNo;

    // 订单号
    @NameInMap("order_id")
    public String orderId;

    // 签署用户ID
    @NameInMap("account_id")
    public String accountId;

    // 状态：DRAFT - 草稿； SIGNING - 签署中； FINISH - 签署完成；UNDO - 撤销； TERMINATE - 终止； EXPIRE - 过期； REJECTED - 拒签； CANCELLED - 解约
    // 
    @NameInMap("status")
    public String status;

    // 签署流程ID
    @NameInMap("flow_id")
    public String flowId;

    // 签署文件列表，参考：
    // _[{"fileItemNo":"10090801000001699892007791144960","agreementType":"COMMON","fileName":"xxx合同","fileSize":228530,"signAccountId":"fe2eb3814c4e49edba2bc012f790771f","fileId":"2c7684461a0f4d33bc02f6d77f7b3937","downloadUrl":"https://dev.oss-cn-shanghai.aliyuncs.com/ag/ord/xxx/16939683744483057_%E6%B5%8B%E8%AF%95%E6%A8%A1%E6%9D%BF%E4%B9%8B%E5%8D%8F%E8%AE%AE%E7%AD%BE%E7%BD%B2%E8%AF%81%E6%98%8E.pdf?Expires=1693971989&OSSAccessKeyId=LTAI5tR3hHiaXPAh8YsY9Dce&Signature=i%2FfAgDem33guI%2F0KjIFj24XZNCc%3D"}]_
    @NameInMap("doc_list")
    public String docList;

    // 业务场景，主要用于签署合同的标题描述
    @NameInMap("business_scene")
    public String businessScene;

    // 签署合同中的订单的uid。
    @NameInMap("alipay_user_id")
    public String alipayUserId;

    // 签署扩展信息，用于获取签署链接等。JSON格式字符串。
    @NameInMap("sign_info")
    public String signInfo;

    // 发起人账户id
    @NameInMap("initiator_account_id")
    public String initiatorAccountId;

    public static GetAntchainAtoSignFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAntchainAtoSignFlowResponse self = new GetAntchainAtoSignFlowResponse();
        return TeaModel.build(map, self);
    }

    public GetAntchainAtoSignFlowResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAntchainAtoSignFlowResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAntchainAtoSignFlowResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAntchainAtoSignFlowResponse setSignNo(String signNo) {
        this.signNo = signNo;
        return this;
    }
    public String getSignNo() {
        return this.signNo;
    }

    public GetAntchainAtoSignFlowResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public GetAntchainAtoSignFlowResponse setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public GetAntchainAtoSignFlowResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetAntchainAtoSignFlowResponse setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public GetAntchainAtoSignFlowResponse setDocList(String docList) {
        this.docList = docList;
        return this;
    }
    public String getDocList() {
        return this.docList;
    }

    public GetAntchainAtoSignFlowResponse setBusinessScene(String businessScene) {
        this.businessScene = businessScene;
        return this;
    }
    public String getBusinessScene() {
        return this.businessScene;
    }

    public GetAntchainAtoSignFlowResponse setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId;
        return this;
    }
    public String getAlipayUserId() {
        return this.alipayUserId;
    }

    public GetAntchainAtoSignFlowResponse setSignInfo(String signInfo) {
        this.signInfo = signInfo;
        return this;
    }
    public String getSignInfo() {
        return this.signInfo;
    }

    public GetAntchainAtoSignFlowResponse setInitiatorAccountId(String initiatorAccountId) {
        this.initiatorAccountId = initiatorAccountId;
        return this;
    }
    public String getInitiatorAccountId() {
        return this.initiatorAccountId;
    }

}
