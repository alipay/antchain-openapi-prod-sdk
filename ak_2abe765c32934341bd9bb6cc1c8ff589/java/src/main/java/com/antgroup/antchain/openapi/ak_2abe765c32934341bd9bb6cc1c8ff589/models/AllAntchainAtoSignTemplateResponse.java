// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_2abe765c32934341bd9bb6cc1c8ff589.models;

import com.aliyun.tea.*;

public class AllAntchainAtoSignTemplateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // List<Object>格式，详细参考：
    // [
    //         {
    //             "templateCode": "TEST_001",
    //             "tenantId": "BIPCCOQY",
    //             "agreementType": "SERVICE_LEASE",
    //             "fileName": "测试模板之协议签署证明",
    //             "templateId": "f28038577d664015bfc1034c4a125121",
    //             "fieldArgs": "{\"sceneName\":\"测试协议合同签署\",\"title\":\"这是一份证明协议\"}",
    //             "userPos": "[{\"required\":true,\"posPage\":\"1\",\"posX\":\"162.44\",\"posY\":\"425\"}]",
    //             "orgPos": "[{\"required\":true,\"posPage\":\"1\",\"posX\":\"449.99\",\"posY\":\"420.03\"}]"
    //         }
    //     ]
    @NameInMap("template_list")
    public String templateList;

    public static AllAntchainAtoSignTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        AllAntchainAtoSignTemplateResponse self = new AllAntchainAtoSignTemplateResponse();
        return TeaModel.build(map, self);
    }

    public AllAntchainAtoSignTemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AllAntchainAtoSignTemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AllAntchainAtoSignTemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AllAntchainAtoSignTemplateResponse setTemplateList(String templateList) {
        this.templateList = templateList;
        return this;
    }
    public String getTemplateList() {
        return this.templateList;
    }

}
