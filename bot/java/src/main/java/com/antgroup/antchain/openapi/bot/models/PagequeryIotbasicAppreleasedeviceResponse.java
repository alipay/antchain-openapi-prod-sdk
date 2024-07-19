// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PagequeryIotbasicAppreleasedeviceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 接口调用结果
    @NameInMap("success")
    public Boolean success;

    // 当前页
    @NameInMap("current")
    public Long current;

    // 每页数量
    @NameInMap("page_size")
    public Long pageSize;

    // 总记录
    @NameInMap("total")
    public Long total;

    // 结果列表数据
    @NameInMap("data")
    public java.util.List<IotbasicReleaseDeviceInfo> data;

    public static PagequeryIotbasicAppreleasedeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryIotbasicAppreleasedeviceResponse self = new PagequeryIotbasicAppreleasedeviceResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryIotbasicAppreleasedeviceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryIotbasicAppreleasedeviceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryIotbasicAppreleasedeviceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryIotbasicAppreleasedeviceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PagequeryIotbasicAppreleasedeviceResponse setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public PagequeryIotbasicAppreleasedeviceResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryIotbasicAppreleasedeviceResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public PagequeryIotbasicAppreleasedeviceResponse setData(java.util.List<IotbasicReleaseDeviceInfo> data) {
        this.data = data;
        return this;
    }
    public java.util.List<IotbasicReleaseDeviceInfo> getData() {
        return this.data;
    }

}
