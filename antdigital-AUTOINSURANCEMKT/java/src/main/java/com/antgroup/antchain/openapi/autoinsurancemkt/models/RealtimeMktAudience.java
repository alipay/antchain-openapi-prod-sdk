// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.autoinsurancemkt.models;

import com.aliyun.tea.*;

public class RealtimeMktAudience extends TeaModel {
    // 加密用户标识
    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("encrypted_user_id")
    @Validation(required = true)
    public String encryptedUserId;

    // 扩展信息
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ext_info")
    @Validation(required = true)
    public String extInfo;

    public static RealtimeMktAudience build(java.util.Map<String, ?> map) throws Exception {
        RealtimeMktAudience self = new RealtimeMktAudience();
        return TeaModel.build(map, self);
    }

    public RealtimeMktAudience setEncryptedUserId(String encryptedUserId) {
        this.encryptedUserId = encryptedUserId;
        return this;
    }
    public String getEncryptedUserId() {
        return this.encryptedUserId;
    }

    public RealtimeMktAudience setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
