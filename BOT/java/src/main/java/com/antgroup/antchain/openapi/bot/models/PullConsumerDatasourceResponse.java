// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PullConsumerDatasourceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 分页游标
    @NameInMap("cursor")
    public String cursor;

    // 数据包列表
    @NameInMap("data_package_list")
    public java.util.List<DistributeDataPackage> dataPackageList;

    public static PullConsumerDatasourceResponse build(java.util.Map<String, ?> map) throws Exception {
        PullConsumerDatasourceResponse self = new PullConsumerDatasourceResponse();
        return TeaModel.build(map, self);
    }

    public PullConsumerDatasourceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PullConsumerDatasourceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PullConsumerDatasourceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PullConsumerDatasourceResponse setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
    }

    public PullConsumerDatasourceResponse setDataPackageList(java.util.List<DistributeDataPackage> dataPackageList) {
        this.dataPackageList = dataPackageList;
        return this;
    }
    public java.util.List<DistributeDataPackage> getDataPackageList() {
        return this.dataPackageList;
    }

}
