// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryCustompluginResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 自定义指标监控配置列表
    @NameInMap("custom_plugins")
    public java.util.List<CustomPluginDO> customPlugins;

    // 页面大小
    @NameInMap("page_size")
    public Long pageSize;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 总记录数
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryCustompluginResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCustompluginResponse self = new QueryCustompluginResponse();
        return TeaModel.build(map, self);
    }

    public QueryCustompluginResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCustompluginResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCustompluginResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCustompluginResponse setCustomPlugins(java.util.List<CustomPluginDO> customPlugins) {
        this.customPlugins = customPlugins;
        return this;
    }
    public java.util.List<CustomPluginDO> getCustomPlugins() {
        return this.customPlugins;
    }

    public QueryCustompluginResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCustompluginResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryCustompluginResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
