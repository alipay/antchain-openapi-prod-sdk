// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class GetDrmDrmattributesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 资源属性
    @NameInMap("drm_attribute")
    public DrmAttribute drmAttribute;

    public static GetDrmDrmattributesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDrmDrmattributesResponse self = new GetDrmDrmattributesResponse();
        return TeaModel.build(map, self);
    }

    public GetDrmDrmattributesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetDrmDrmattributesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDrmDrmattributesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetDrmDrmattributesResponse setDrmAttribute(DrmAttribute drmAttribute) {
        this.drmAttribute = drmAttribute;
        return this;
    }
    public DrmAttribute getDrmAttribute() {
        return this.drmAttribute;
    }

}
