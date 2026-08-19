// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ChatAiotdatalinkAntfinanceassistantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 支付宝用户UID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 语言
    @NameInMap("language")
    @Validation(required = true)
    public String language;

    // 用户/会话维度的扩展信息，JSON对应类型：map<string,string>
    @NameInMap("user_info_map")
    @Validation(required = true)
    public String userInfoMap;

    // 透传扩展参数，JSON对应类型：map<string,string>
    @NameInMap("ext_params")
    @Validation(required = true)
    public String extParams;

    // 科技板块怎么样
    @NameInMap("user_query")
    @Validation(required = true)
    public String userQuery;

    // query 类型，枚举（手输：user_input、语音输入：voice_input、sug点击：card_click）
    @NameInMap("query_type")
    @Validation(required = true)
    public String queryType;

    // 会话 ID，用于上下文延续
    @NameInMap("session_id")
    public String sessionId;

    // 引用的上一轮 chatId（上下文引用，可空）
    @NameInMap("ref_chat_id")
    public String refChatId;

    public static ChatAiotdatalinkAntfinanceassistantRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatAiotdatalinkAntfinanceassistantRequest self = new ChatAiotdatalinkAntfinanceassistantRequest();
        return TeaModel.build(map, self);
    }

    public ChatAiotdatalinkAntfinanceassistantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ChatAiotdatalinkAntfinanceassistantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ChatAiotdatalinkAntfinanceassistantRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ChatAiotdatalinkAntfinanceassistantRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ChatAiotdatalinkAntfinanceassistantRequest setUserInfoMap(String userInfoMap) {
        this.userInfoMap = userInfoMap;
        return this;
    }
    public String getUserInfoMap() {
        return this.userInfoMap;
    }

    public ChatAiotdatalinkAntfinanceassistantRequest setExtParams(String extParams) {
        this.extParams = extParams;
        return this;
    }
    public String getExtParams() {
        return this.extParams;
    }

    public ChatAiotdatalinkAntfinanceassistantRequest setUserQuery(String userQuery) {
        this.userQuery = userQuery;
        return this;
    }
    public String getUserQuery() {
        return this.userQuery;
    }

    public ChatAiotdatalinkAntfinanceassistantRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public ChatAiotdatalinkAntfinanceassistantRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ChatAiotdatalinkAntfinanceassistantRequest setRefChatId(String refChatId) {
        this.refChatId = refChatId;
        return this;
    }
    public String getRefChatId() {
        return this.refChatId;
    }

}
