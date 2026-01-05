// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtts.models;

import com.aliyun.tea.*;

public class PagequeryDacWhitelistResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前第几页，为前端的请求值
    @NameInMap("current")
    public Long current;

    // 每页展示多少条，为前端的请求值
    @NameInMap("page_size")
    public Long pageSize;

    // 总共有多少条数据
    @NameInMap("total")
    public Long total;

    // 返回白名单列表
    @NameInMap("list")
    public java.util.List<QueryWhitelistAddressResponse> list;

    public static PagequeryDacWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryDacWhitelistResponse self = new PagequeryDacWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryDacWhitelistResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryDacWhitelistResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryDacWhitelistResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryDacWhitelistResponse setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public PagequeryDacWhitelistResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryDacWhitelistResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public PagequeryDacWhitelistResponse setList(java.util.List<QueryWhitelistAddressResponse> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryWhitelistAddressResponse> getList() {
        return this.list;
    }

}
