// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAuthOrgStatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 业务场景码类型
    @NameInMap("biz_type")
    public String bizType;

    // 列表结果，其中每个元素是一个json的string，这个json实际就是数据源提供的数据上链之前的内容。
    // 
    // [
    //   {
    //     "did": "did:mychain:b11dd863d31c38507d6cf8e615b897c7a9160d145e404b8a991964179c0e0bfd",
    //     "orgName": "XX检查门诊-1",
    //     "orgNo": "机构编号-1",
    //     "logoUrl": "https://gw.alipayobjects.com/mdn/rms_40e4ff/afts/img/A*a8QOSJysDlsAAAAAAAAAAABkARQnAQ",
    //     "status": 1
    //   },
    //   {
    //     "did": "did:mychain:b11dd863d31c38507d6cf8e615b897c7a9160d145e404b8a991964179c0e0bfe",
    //     "orgName": "XX检查门诊-2",
    //     "orgNo": "机构编号-2",
    //     "logoUrl": "https://gw.alipayobjects.com/mdn/rms_40e4ff/afts/img/A*a8QOSJysDlsAAAAAAAAAAABkARQnAQ",
    //     "status": 0
    //   }
    // ]
    @NameInMap("list")
    public java.util.List<String> list;

    public static QueryAuthOrgStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthOrgStatusResponse self = new QueryAuthOrgStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryAuthOrgStatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAuthOrgStatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAuthOrgStatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAuthOrgStatusResponse setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryAuthOrgStatusResponse setList(java.util.List<String> list) {
        this.list = list;
        return this;
    }
    public java.util.List<String> getList() {
        return this.list;
    }

}
