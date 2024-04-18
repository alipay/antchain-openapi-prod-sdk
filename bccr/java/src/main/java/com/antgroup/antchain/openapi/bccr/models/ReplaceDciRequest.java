// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ReplaceDciRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // id
    @NameInMap("dci_content_id")
    @Validation(required = true)
    public String dciContentId;

    // 作品名称
    @NameInMap("work_name")
    public String workName;

    // 作品类别
    @NameInMap("work_category")
    public String workCategory;

    // 创作信息
    @NameInMap("creation_info")
    public DciCreationInfo creationInfo;

    // 发表信息
    @NameInMap("publication_info")
    public DciPublicationInfo publicationInfo;

    // 申领人id
    @NameInMap("dci_user_id")
    public String dciUserId;

    // 著作权人
    @NameInMap("copyright_owner_ids")
    public java.util.List<String> copyrightOwnerIds;

    // 作者姓名
    @NameInMap("author_name")
    public String authorName;

    // 作者署名
    @NameInMap("author_signature")
    public String authorSignature;

    // 权利信息
    @NameInMap("right_info")
    public DciRightInfo rightInfo;

    // 幂等字段
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    // 代理信息
    @NameInMap("proxy_data")
    public ProxyData proxyData;

    public static ReplaceDciRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceDciRequest self = new ReplaceDciRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceDciRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReplaceDciRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ReplaceDciRequest setDciContentId(String dciContentId) {
        this.dciContentId = dciContentId;
        return this;
    }
    public String getDciContentId() {
        return this.dciContentId;
    }

    public ReplaceDciRequest setWorkName(String workName) {
        this.workName = workName;
        return this;
    }
    public String getWorkName() {
        return this.workName;
    }

    public ReplaceDciRequest setWorkCategory(String workCategory) {
        this.workCategory = workCategory;
        return this;
    }
    public String getWorkCategory() {
        return this.workCategory;
    }

    public ReplaceDciRequest setCreationInfo(DciCreationInfo creationInfo) {
        this.creationInfo = creationInfo;
        return this;
    }
    public DciCreationInfo getCreationInfo() {
        return this.creationInfo;
    }

    public ReplaceDciRequest setPublicationInfo(DciPublicationInfo publicationInfo) {
        this.publicationInfo = publicationInfo;
        return this;
    }
    public DciPublicationInfo getPublicationInfo() {
        return this.publicationInfo;
    }

    public ReplaceDciRequest setDciUserId(String dciUserId) {
        this.dciUserId = dciUserId;
        return this;
    }
    public String getDciUserId() {
        return this.dciUserId;
    }

    public ReplaceDciRequest setCopyrightOwnerIds(java.util.List<String> copyrightOwnerIds) {
        this.copyrightOwnerIds = copyrightOwnerIds;
        return this;
    }
    public java.util.List<String> getCopyrightOwnerIds() {
        return this.copyrightOwnerIds;
    }

    public ReplaceDciRequest setAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }
    public String getAuthorName() {
        return this.authorName;
    }

    public ReplaceDciRequest setAuthorSignature(String authorSignature) {
        this.authorSignature = authorSignature;
        return this;
    }
    public String getAuthorSignature() {
        return this.authorSignature;
    }

    public ReplaceDciRequest setRightInfo(DciRightInfo rightInfo) {
        this.rightInfo = rightInfo;
        return this;
    }
    public DciRightInfo getRightInfo() {
        return this.rightInfo;
    }

    public ReplaceDciRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ReplaceDciRequest setProxyData(ProxyData proxyData) {
        this.proxyData = proxyData;
        return this;
    }
    public ProxyData getProxyData() {
        return this.proxyData;
    }

}
