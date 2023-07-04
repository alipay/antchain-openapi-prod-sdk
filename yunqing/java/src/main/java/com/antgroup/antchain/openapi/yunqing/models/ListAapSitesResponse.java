// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ListAapSitesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // site list
    @NameInMap("sites")
    public java.util.List<SiteInfo> sites;

    public static ListAapSitesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAapSitesResponse self = new ListAapSitesResponse();
        return TeaModel.build(map, self);
    }

    public ListAapSitesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListAapSitesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAapSitesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListAapSitesResponse setSites(java.util.List<SiteInfo> sites) {
        this.sites = sites;
        return this;
    }
    public java.util.List<SiteInfo> getSites() {
        return this.sites;
    }

}
