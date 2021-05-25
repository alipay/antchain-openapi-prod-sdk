// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class PagequeryIpValueaddResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 增值服务列表
    @NameInMap("data")
    public java.util.List<ValueAddedServiceInfo> data;

    // 总数
    @NameInMap("all_count")
    public Long allCount;

    public static PagequeryIpValueaddResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryIpValueaddResponse self = new PagequeryIpValueaddResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryIpValueaddResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryIpValueaddResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryIpValueaddResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryIpValueaddResponse setData(java.util.List<ValueAddedServiceInfo> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ValueAddedServiceInfo> getData() {
        return this.data;
    }

    public PagequeryIpValueaddResponse setAllCount(Long allCount) {
        this.allCount = allCount;
        return this;
    }
    public Long getAllCount() {
        return this.allCount;
    }

}
