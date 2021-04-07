// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListApplicationPackageResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // List<AppPackageListView>
    @NameInMap("data")
    public java.util.List<AppPackageListView> data;

    // 总数
    @NameInMap("total_count")
    public Long totalCount;

    public static ListApplicationPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationPackageResponse self = new ListApplicationPackageResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationPackageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListApplicationPackageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListApplicationPackageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListApplicationPackageResponse setData(java.util.List<AppPackageListView> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AppPackageListView> getData() {
        return this.data;
    }

    public ListApplicationPackageResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
