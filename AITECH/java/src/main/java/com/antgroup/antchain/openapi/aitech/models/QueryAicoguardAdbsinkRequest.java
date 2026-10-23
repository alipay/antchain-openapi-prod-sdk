// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class QueryAicoguardAdbsinkRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 区域id
    @NameInMap("region_id")
    @Validation(required = true)
    public String regionId;

    // DB实例id
    @NameInMap("db_instance_id")
    @Validation(required = true)
    public String dbInstanceId;

    // 数据库空间名称
    @NameInMap("name_space")
    @Validation(required = true)
    public String nameSpace;

    // 数据库空间密码
    @NameInMap("name_space_password")
    @Validation(required = true)
    public String nameSpacePassword;

    // 数据库表名
    @NameInMap("collection_name")
    @Validation(required = true)
    public String collectionName;

    // 要查询的内容
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    public static QueryAicoguardAdbsinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAicoguardAdbsinkRequest self = new QueryAicoguardAdbsinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryAicoguardAdbsinkRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAicoguardAdbsinkRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAicoguardAdbsinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryAicoguardAdbsinkRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public QueryAicoguardAdbsinkRequest setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }
    public String getNameSpace() {
        return this.nameSpace;
    }

    public QueryAicoguardAdbsinkRequest setNameSpacePassword(String nameSpacePassword) {
        this.nameSpacePassword = nameSpacePassword;
        return this;
    }
    public String getNameSpacePassword() {
        return this.nameSpacePassword;
    }

    public QueryAicoguardAdbsinkRequest setCollectionName(String collectionName) {
        this.collectionName = collectionName;
        return this;
    }
    public String getCollectionName() {
        return this.collectionName;
    }

    public QueryAicoguardAdbsinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
