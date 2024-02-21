// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class IdentityIdGroup extends TeaModel {
    // 44-20230810-9-channel
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    // 请求id，用于幂等控制
    @NameInMap("biz_unique_id")
    @Validation(required = true)
    public String bizUniqueId;

    // 数据源
    @NameInMap("channel")
    @Validation(required = true)
    public String channel;

    // 上传的文件
    @NameInMap("file_url")
    @Validation(required = true)
    public String fileUrl;

    public static IdentityIdGroup build(java.util.Map<String, ?> map) throws Exception {
        IdentityIdGroup self = new IdentityIdGroup();
        return TeaModel.build(map, self);
    }

    public IdentityIdGroup setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public IdentityIdGroup setBizUniqueId(String bizUniqueId) {
        this.bizUniqueId = bizUniqueId;
        return this;
    }
    public String getBizUniqueId() {
        return this.bizUniqueId;
    }

    public IdentityIdGroup setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public IdentityIdGroup setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

}
