// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.micservice.models;

import com.aliyun.tea.*;

public class FeaturesearchFaceverifyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 业务流程的唯一id
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 场景id
    @NameInMap("scene_id")
    @Validation(required = true)
    public String sceneId;

    // 特征类型
    @NameInMap("feature_type")
    @Validation(required = true)
    public String featureType;

    // 特征向量，维度要求128/256/512
    @NameInMap("feature_vector")
    @Validation(required = true)
    public java.util.List<String> featureVector;

    // 扩展字段，string类型，json格式
    @NameInMap("ext_info")
    public String extInfo;

    public static FeaturesearchFaceverifyRequest build(java.util.Map<String, ?> map) throws Exception {
        FeaturesearchFaceverifyRequest self = new FeaturesearchFaceverifyRequest();
        return TeaModel.build(map, self);
    }

    public FeaturesearchFaceverifyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FeaturesearchFaceverifyRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public FeaturesearchFaceverifyRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public FeaturesearchFaceverifyRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public FeaturesearchFaceverifyRequest setFeatureType(String featureType) {
        this.featureType = featureType;
        return this;
    }
    public String getFeatureType() {
        return this.featureType;
    }

    public FeaturesearchFaceverifyRequest setFeatureVector(java.util.List<String> featureVector) {
        this.featureVector = featureVector;
        return this;
    }
    public java.util.List<String> getFeatureVector() {
        return this.featureVector;
    }

    public FeaturesearchFaceverifyRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
