// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_5bb1b66c4aab4cc998c05a36078e45c1.models;

import com.aliyun.tea.*;

public class HoloxCheckEvent extends TeaModel {
    // 是否成功
    @NameInMap("sucess")
    @Validation(required = true)
    public Boolean sucess;

    // 123
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 12
    @NameInMap("app_code")
    @Validation(required = true)
    public String appCode;

    // 123
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 12
    @NameInMap("product_code")
    public String productCode;

    // 123
    @NameInMap("channel")
    @Validation(required = true)
    public String channel;

    // 123
    @NameInMap("app_scene_data_id")
    public String appSceneDataId;

    // 123
    @NameInMap("account_type")
    public String accountType;

    // 123
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 123
    @NameInMap("reciever_id")
    @Validation(required = true)
    public String recieverId;

    // 123
    @NameInMap("publish_date")
    @Validation(required = true)
    public String publishDate;

    // 123
    @NameInMap("is_test")
    @Validation(required = true)
    public Boolean isTest;

    // 123
    @NameInMap("is_load_test")
    @Validation(required = true)
    public Boolean isLoadTest;

    // 123
    @NameInMap("is_fusing")
    @Validation(required = true)
    public Boolean isFusing;

    // 123
    @NameInMap("scene_type")
    @Validation(required = true)
    public String sceneType;

    // 123
    @NameInMap("content_data")
    @Validation(required = true)
    public String contentData;

    // 123
    @NameInMap("event_data")
    @Validation(required = true)
    public String eventData;

    public static HoloxCheckEvent build(java.util.Map<String, ?> map) throws Exception {
        HoloxCheckEvent self = new HoloxCheckEvent();
        return TeaModel.build(map, self);
    }

    public HoloxCheckEvent setSucess(Boolean sucess) {
        this.sucess = sucess;
        return this;
    }
    public Boolean getSucess() {
        return this.sucess;
    }

    public HoloxCheckEvent setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public HoloxCheckEvent setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public HoloxCheckEvent setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public HoloxCheckEvent setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public HoloxCheckEvent setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public HoloxCheckEvent setAppSceneDataId(String appSceneDataId) {
        this.appSceneDataId = appSceneDataId;
        return this;
    }
    public String getAppSceneDataId() {
        return this.appSceneDataId;
    }

    public HoloxCheckEvent setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public HoloxCheckEvent setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public HoloxCheckEvent setRecieverId(String recieverId) {
        this.recieverId = recieverId;
        return this;
    }
    public String getRecieverId() {
        return this.recieverId;
    }

    public HoloxCheckEvent setPublishDate(String publishDate) {
        this.publishDate = publishDate;
        return this;
    }
    public String getPublishDate() {
        return this.publishDate;
    }

    public HoloxCheckEvent setIsTest(Boolean isTest) {
        this.isTest = isTest;
        return this;
    }
    public Boolean getIsTest() {
        return this.isTest;
    }

    public HoloxCheckEvent setIsLoadTest(Boolean isLoadTest) {
        this.isLoadTest = isLoadTest;
        return this;
    }
    public Boolean getIsLoadTest() {
        return this.isLoadTest;
    }

    public HoloxCheckEvent setIsFusing(Boolean isFusing) {
        this.isFusing = isFusing;
        return this;
    }
    public Boolean getIsFusing() {
        return this.isFusing;
    }

    public HoloxCheckEvent setSceneType(String sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public String getSceneType() {
        return this.sceneType;
    }

    public HoloxCheckEvent setContentData(String contentData) {
        this.contentData = contentData;
        return this;
    }
    public String getContentData() {
        return this.contentData;
    }

    public HoloxCheckEvent setEventData(String eventData) {
        this.eventData = eventData;
        return this;
    }
    public String getEventData() {
        return this.eventData;
    }

}
