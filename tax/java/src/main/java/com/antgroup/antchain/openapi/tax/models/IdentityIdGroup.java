// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class IdentityIdGroup extends TeaModel {
    // 44-20230810-9-channel
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    // 打标数据返回的url
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

    public IdentityIdGroup setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

}
