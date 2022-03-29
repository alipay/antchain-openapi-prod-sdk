// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryTraasmetaEntityResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 实体名称
    @NameInMap("name")
    public String name;

    // 展示名称
    @NameInMap("display_name")
    public String displayName;

    // 实体所属分组名称
    @NameInMap("group_name")
    public String groupName;

    // 实例所属分组展示名称
    @NameInMap("group_display_name")
    public String groupDisplayName;

    public static QueryTraasmetaEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTraasmetaEntityResponse self = new QueryTraasmetaEntityResponse();
        return TeaModel.build(map, self);
    }

    public QueryTraasmetaEntityResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTraasmetaEntityResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTraasmetaEntityResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTraasmetaEntityResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryTraasmetaEntityResponse setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public QueryTraasmetaEntityResponse setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public QueryTraasmetaEntityResponse setGroupDisplayName(String groupDisplayName) {
        this.groupDisplayName = groupDisplayName;
        return this;
    }
    public String getGroupDisplayName() {
        return this.groupDisplayName;
    }

}
