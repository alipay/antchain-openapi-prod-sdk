// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class BatchqueryIpAccountsettlementRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 渠道名称
    @NameInMap("channel_name")
    @Validation(required = true)
    public String channelName;

    // 申请状态，0为全部，1为待审核，2为已审核
    @NameInMap("apply_status")
    @Validation(required = true)
    public String applyStatus;

    // 分页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 分页索引
    @NameInMap("page_index")
    @Validation(required = true)
    public Long pageIndex;

    // 备注信息
    @NameInMap("memo")
    public String memo;

    public static BatchqueryIpAccountsettlementRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryIpAccountsettlementRequest self = new BatchqueryIpAccountsettlementRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryIpAccountsettlementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryIpAccountsettlementRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryIpAccountsettlementRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public BatchqueryIpAccountsettlementRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public BatchqueryIpAccountsettlementRequest setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
        return this;
    }
    public String getApplyStatus() {
        return this.applyStatus;
    }

    public BatchqueryIpAccountsettlementRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public BatchqueryIpAccountsettlementRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public BatchqueryIpAccountsettlementRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

}
