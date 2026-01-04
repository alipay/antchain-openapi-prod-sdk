// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class AgentChatHistoryPreviewVO extends TeaModel {
    // 对话历史列表
    @NameInMap("session_list")
    @Validation(required = true)
    public java.util.List<SingleAgentChatHistoryPreview> sessionList;

    public static AgentChatHistoryPreviewVO build(java.util.Map<String, ?> map) throws Exception {
        AgentChatHistoryPreviewVO self = new AgentChatHistoryPreviewVO();
        return TeaModel.build(map, self);
    }

    public AgentChatHistoryPreviewVO setSessionList(java.util.List<SingleAgentChatHistoryPreview> sessionList) {
        this.sessionList = sessionList;
        return this;
    }
    public java.util.List<SingleAgentChatHistoryPreview> getSessionList() {
        return this.sessionList;
    }

}
