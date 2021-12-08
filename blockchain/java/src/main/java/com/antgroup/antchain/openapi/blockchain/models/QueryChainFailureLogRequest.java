// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryChainFailureLogRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链id
    @NameInMap("ant_chain_id")
    @Validation(required = true)
    public String antChainId;

    // 联盟id
    @NameInMap("consortium_id")
    @Validation(required = true)
    public String consortiumId;

    // ""
    @NameInMap("trigger_name")
    @Validation(required = true)
    public String triggerName;

    // ""
    @NameInMap("status_action")
    public String statusAction;

    // 当前页码
    @NameInMap("page_no")
    public String pageNo;

    // 页面规格
    @NameInMap("page_size")
    public String pageSize;

    public static QueryChainFailureLogRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryChainFailureLogRequest self = new QueryChainFailureLogRequest();
        return TeaModel.build(map, self);
    }

    public QueryChainFailureLogRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryChainFailureLogRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryChainFailureLogRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public QueryChainFailureLogRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public QueryChainFailureLogRequest setTriggerName(String triggerName) {
        this.triggerName = triggerName;
        return this;
    }
    public String getTriggerName() {
        return this.triggerName;
    }

    public QueryChainFailureLogRequest setStatusAction(String statusAction) {
        this.statusAction = statusAction;
        return this;
    }
    public String getStatusAction() {
        return this.statusAction;
    }

    public QueryChainFailureLogRequest setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public QueryChainFailureLogRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
