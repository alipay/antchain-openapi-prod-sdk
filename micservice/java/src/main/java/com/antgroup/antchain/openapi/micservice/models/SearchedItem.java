// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.micservice.models;

import com.aliyun.tea.*;

public class SearchedItem extends TeaModel {
    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 业务流程唯一id
    @NameInMap("biz_id")
    public String bizId;

    // 场景id
    @NameInMap("scene_id")
    public String sceneId;

    // 如余弦相似度(-1,1)
    @NameInMap("similarity")
    @Validation(required = true)
    public String similarity;

    // 扩展字段，string类型，json格式
    @NameInMap("ext_info")
    public String extInfo;

    public static SearchedItem build(java.util.Map<String, ?> map) throws Exception {
        SearchedItem self = new SearchedItem();
        return TeaModel.build(map, self);
    }

    public SearchedItem setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public SearchedItem setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SearchedItem setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public SearchedItem setSimilarity(String similarity) {
        this.similarity = similarity;
        return this;
    }
    public String getSimilarity() {
        return this.similarity;
    }

    public SearchedItem setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
