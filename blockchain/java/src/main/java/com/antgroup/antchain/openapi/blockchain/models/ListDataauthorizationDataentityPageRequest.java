// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ListDataauthorizationDataentityPageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权状态
    @NameInMap("auth_status")
    public String authStatus;

    // 模型名称
    @NameInMap("model_name")
    public String modelName;

    // 页码
    @NameInMap("page_num")
    @Validation(required = true, minimum = 1)
    public Long pageNum;

    // 每页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 参与方DID
    @NameInMap("participant_id")
    @Validation(required = true)
    public String participantId;

    // 数据模型业务ID
    @NameInMap("model_biz_id")
    public String modelBizId;

    public static ListDataauthorizationDataentityPageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataauthorizationDataentityPageRequest self = new ListDataauthorizationDataentityPageRequest();
        return TeaModel.build(map, self);
    }

    public ListDataauthorizationDataentityPageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListDataauthorizationDataentityPageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListDataauthorizationDataentityPageRequest setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
        return this;
    }
    public String getAuthStatus() {
        return this.authStatus;
    }

    public ListDataauthorizationDataentityPageRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ListDataauthorizationDataentityPageRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListDataauthorizationDataentityPageRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDataauthorizationDataentityPageRequest setParticipantId(String participantId) {
        this.participantId = participantId;
        return this;
    }
    public String getParticipantId() {
        return this.participantId;
    }

    public ListDataauthorizationDataentityPageRequest setModelBizId(String modelBizId) {
        this.modelBizId = modelBizId;
        return this;
    }
    public String getModelBizId() {
        return this.modelBizId;
    }

}
