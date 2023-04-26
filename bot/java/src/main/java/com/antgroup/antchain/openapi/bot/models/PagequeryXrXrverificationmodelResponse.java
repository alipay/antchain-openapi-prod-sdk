// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PagequeryXrXrverificationmodelResponse extends TeaModel {
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

    // 核销实例列表
    @NameInMap("xr_verification_model_list")
    public java.util.List<XrVerificationModelVo> xrVerificationModelList;

    // 当前页
    @NameInMap("current")
    public Long current;

    // 每页数据量
    @NameInMap("page_size")
    public Long pageSize;

    // 数据总条数
    @NameInMap("total")
    public Long total;

    // 总页数
    @NameInMap("total_page")
    public Long totalPage;

    public static PagequeryXrXrverificationmodelResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryXrXrverificationmodelResponse self = new PagequeryXrXrverificationmodelResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryXrXrverificationmodelResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryXrXrverificationmodelResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryXrXrverificationmodelResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryXrXrverificationmodelResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PagequeryXrXrverificationmodelResponse setXrVerificationModelList(java.util.List<XrVerificationModelVo> xrVerificationModelList) {
        this.xrVerificationModelList = xrVerificationModelList;
        return this;
    }
    public java.util.List<XrVerificationModelVo> getXrVerificationModelList() {
        return this.xrVerificationModelList;
    }

    public PagequeryXrXrverificationmodelResponse setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public PagequeryXrXrverificationmodelResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryXrXrverificationmodelResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public PagequeryXrXrverificationmodelResponse setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

}
