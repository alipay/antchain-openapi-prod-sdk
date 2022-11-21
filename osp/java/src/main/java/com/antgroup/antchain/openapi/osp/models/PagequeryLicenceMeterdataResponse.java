// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.osp.models;

import com.aliyun.tea.*;

public class PagequeryLicenceMeterdataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    // 当前页码
    @NameInMap("current_page")
    public Long currentPage;

    // 总页数
    @NameInMap("total_page")
    public String totalPage;

    // 计量数据
    @NameInMap("meter_data_list")
    public java.util.List<MeterDataModel> meterDataList;

    public static PagequeryLicenceMeterdataResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryLicenceMeterdataResponse self = new PagequeryLicenceMeterdataResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryLicenceMeterdataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryLicenceMeterdataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryLicenceMeterdataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryLicenceMeterdataResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PagequeryLicenceMeterdataResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public PagequeryLicenceMeterdataResponse setTotalPage(String totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public String getTotalPage() {
        return this.totalPage;
    }

    public PagequeryLicenceMeterdataResponse setMeterDataList(java.util.List<MeterDataModel> meterDataList) {
        this.meterDataList = meterDataList;
        return this;
    }
    public java.util.List<MeterDataModel> getMeterDataList() {
        return this.meterDataList;
    }

}
