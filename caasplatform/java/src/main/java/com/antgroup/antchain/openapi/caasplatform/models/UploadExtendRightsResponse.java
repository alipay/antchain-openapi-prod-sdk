// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform.models;

import com.aliyun.tea.*;

public class UploadExtendRightsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数据资产id
    @NameInMap("rights_id")
    public Long rightsId;

    public static UploadExtendRightsResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadExtendRightsResponse self = new UploadExtendRightsResponse();
        return TeaModel.build(map, self);
    }

    public UploadExtendRightsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UploadExtendRightsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadExtendRightsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UploadExtendRightsResponse setRightsId(Long rightsId) {
        this.rightsId = rightsId;
        return this;
    }
    public Long getRightsId() {
        return this.rightsId;
    }

}
