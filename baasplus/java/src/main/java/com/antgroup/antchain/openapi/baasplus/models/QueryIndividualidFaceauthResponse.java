// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryIndividualidFaceauthResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 认证的唯一性id
    // 
    @NameInMap("certify_id")
    public String certifyId;

    // 是否认证通过
    @NameInMap("passed")
    public Boolean passed;

    // 用户是否完成刷脸
    @NameInMap("finished")
    public Boolean finished;

    public static QueryIndividualidFaceauthResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIndividualidFaceauthResponse self = new QueryIndividualidFaceauthResponse();
        return TeaModel.build(map, self);
    }

    public QueryIndividualidFaceauthResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIndividualidFaceauthResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIndividualidFaceauthResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIndividualidFaceauthResponse setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public QueryIndividualidFaceauthResponse setPassed(Boolean passed) {
        this.passed = passed;
        return this;
    }
    public Boolean getPassed() {
        return this.passed;
    }

    public QueryIndividualidFaceauthResponse setFinished(Boolean finished) {
        this.finished = finished;
        return this;
    }
    public Boolean getFinished() {
        return this.finished;
    }

}
