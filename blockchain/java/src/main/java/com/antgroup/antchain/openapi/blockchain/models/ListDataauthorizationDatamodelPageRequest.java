// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ListDataauthorizationDatamodelPageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 模型业务ID
    @NameInMap("model_biz_id")
    public String modelBizId;

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

    // 空间ID
    @NameInMap("space_id")
    @Validation(required = true)
    public String spaceId;

    // 提交人名字
    @NameInMap("submitter_name")
    public String submitterName;

    public static ListDataauthorizationDatamodelPageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataauthorizationDatamodelPageRequest self = new ListDataauthorizationDatamodelPageRequest();
        return TeaModel.build(map, self);
    }

    public ListDataauthorizationDatamodelPageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListDataauthorizationDatamodelPageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListDataauthorizationDatamodelPageRequest setModelBizId(String modelBizId) {
        this.modelBizId = modelBizId;
        return this;
    }
    public String getModelBizId() {
        return this.modelBizId;
    }

    public ListDataauthorizationDatamodelPageRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ListDataauthorizationDatamodelPageRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListDataauthorizationDatamodelPageRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDataauthorizationDatamodelPageRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public ListDataauthorizationDatamodelPageRequest setSubmitterName(String submitterName) {
        this.submitterName = submitterName;
        return this;
    }
    public String getSubmitterName() {
        return this.submitterName;
    }

}
