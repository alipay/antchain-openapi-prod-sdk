// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryBaicorpInternalsearchlibraryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 账户ID，账户粒度ID。
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 产品ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 商户ID，即平台用户ID。
    @NameInMap("company_id")
    @Validation(required = true)
    public String companyId;

    //  内容ID
    @NameInMap("content_id")
    @Validation(required = true)
    public String contentId;

    // 基于安全考虑，填充NonceId
    @NameInMap("custom_id")
    @Validation(required = true)
    public String customId;

    // 待检测内容的raw data，这期暂不使用
    @NameInMap("entity_data")
    public String entityData;

    // 待检测字段的描述信息，包括标题、描述或关键词，json格式字符串
    @NameInMap("entity_desc")
    public String entityDesc;

    // 待检测内容类型，[TEXT, PICTURE, VIDEO, HTML]
    @NameInMap("entity_type")
    @Validation(required = true)
    public String entityType;

    // 1、待检测内容oss url（后续可以扩展为非oss的文件url）
    // 2、假如使用AK访问，此处填写fileid。
    @NameInMap("entity_url")
    @Validation(required = true)
    public String entityUrl;

    // 时间戳
    @NameInMap("timestamp")
    @Validation(required = true)
    public String timestamp;

    public static QueryBaicorpInternalsearchlibraryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBaicorpInternalsearchlibraryRequest self = new QueryBaicorpInternalsearchlibraryRequest();
        return TeaModel.build(map, self);
    }

    public QueryBaicorpInternalsearchlibraryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBaicorpInternalsearchlibraryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBaicorpInternalsearchlibraryRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public QueryBaicorpInternalsearchlibraryRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryBaicorpInternalsearchlibraryRequest setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }
    public String getCompanyId() {
        return this.companyId;
    }

    public QueryBaicorpInternalsearchlibraryRequest setContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }
    public String getContentId() {
        return this.contentId;
    }

    public QueryBaicorpInternalsearchlibraryRequest setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
    public String getCustomId() {
        return this.customId;
    }

    public QueryBaicorpInternalsearchlibraryRequest setEntityData(String entityData) {
        this.entityData = entityData;
        return this;
    }
    public String getEntityData() {
        return this.entityData;
    }

    public QueryBaicorpInternalsearchlibraryRequest setEntityDesc(String entityDesc) {
        this.entityDesc = entityDesc;
        return this;
    }
    public String getEntityDesc() {
        return this.entityDesc;
    }

    public QueryBaicorpInternalsearchlibraryRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public QueryBaicorpInternalsearchlibraryRequest setEntityUrl(String entityUrl) {
        this.entityUrl = entityUrl;
        return this;
    }
    public String getEntityUrl() {
        return this.entityUrl;
    }

    public QueryBaicorpInternalsearchlibraryRequest setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

}
