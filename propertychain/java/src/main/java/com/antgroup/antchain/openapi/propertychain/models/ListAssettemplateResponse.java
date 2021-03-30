// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class ListAssettemplateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数据字典信息
    @NameInMap("template_info_list")
    public java.util.List<AssetTemplate> templateInfoList;

    // 总条目
    @NameInMap("total_count")
    public Long totalCount;

    // 总页数
    @NameInMap("total_page")
    public Long totalPage;

    public static ListAssettemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAssettemplateResponse self = new ListAssettemplateResponse();
        return TeaModel.build(map, self);
    }

    public ListAssettemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListAssettemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAssettemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListAssettemplateResponse setTemplateInfoList(java.util.List<AssetTemplate> templateInfoList) {
        this.templateInfoList = templateInfoList;
        return this;
    }
    public java.util.List<AssetTemplate> getTemplateInfoList() {
        return this.templateInfoList;
    }

    public ListAssettemplateResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListAssettemplateResponse setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

}
