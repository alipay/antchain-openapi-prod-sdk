// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ListDataauthorizationAuthorizationPageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权时间终点
    @NameInMap("end_time")
    public Long endTime;

    // 授权人ID
    @NameInMap("issuer_id")
    public String issuerId;

    // 授权人名字
    @NameInMap("issuer_name")
    public String issuerName;

    // 页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 每页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 空间ID
    @NameInMap("space_id")
    @Validation(required = true)
    public String spaceId;

    // 授权时间起点
    @NameInMap("start_ime")
    public Long startIme;

    // 被授权人ID
    @NameInMap("subject_id")
    public String subjectId;

    // 被授权人名字
    @NameInMap("subject_name")
    public String subjectName;

    // 数据资产ID
    @NameInMap("data_id")
    public String dataId;

    // 数据模型ID
    @NameInMap("data_model_id")
    public String dataModelId;

    public static ListDataauthorizationAuthorizationPageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataauthorizationAuthorizationPageRequest self = new ListDataauthorizationAuthorizationPageRequest();
        return TeaModel.build(map, self);
    }

    public ListDataauthorizationAuthorizationPageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListDataauthorizationAuthorizationPageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListDataauthorizationAuthorizationPageRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListDataauthorizationAuthorizationPageRequest setIssuerId(String issuerId) {
        this.issuerId = issuerId;
        return this;
    }
    public String getIssuerId() {
        return this.issuerId;
    }

    public ListDataauthorizationAuthorizationPageRequest setIssuerName(String issuerName) {
        this.issuerName = issuerName;
        return this;
    }
    public String getIssuerName() {
        return this.issuerName;
    }

    public ListDataauthorizationAuthorizationPageRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListDataauthorizationAuthorizationPageRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDataauthorizationAuthorizationPageRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public ListDataauthorizationAuthorizationPageRequest setStartIme(Long startIme) {
        this.startIme = startIme;
        return this;
    }
    public Long getStartIme() {
        return this.startIme;
    }

    public ListDataauthorizationAuthorizationPageRequest setSubjectId(String subjectId) {
        this.subjectId = subjectId;
        return this;
    }
    public String getSubjectId() {
        return this.subjectId;
    }

    public ListDataauthorizationAuthorizationPageRequest setSubjectName(String subjectName) {
        this.subjectName = subjectName;
        return this;
    }
    public String getSubjectName() {
        return this.subjectName;
    }

    public ListDataauthorizationAuthorizationPageRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ListDataauthorizationAuthorizationPageRequest setDataModelId(String dataModelId) {
        this.dataModelId = dataModelId;
        return this;
    }
    public String getDataModelId() {
        return this.dataModelId;
    }

}
