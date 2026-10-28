// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class HealthContactInfo extends TeaModel {
    // 联系人业务id
    /**
     * <strong>example:</strong>
     * <p>1749795036983016</p>
     */
    @NameInMap("contact_id")
    public String contactId;

    // 键位设置优先级（1=红键, 2=黄键, 3=绿键）
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("priority")
    public Long priority;

    // 联系人姓名
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("contact_name")
    public String contactName;

    // 联系人手机号
    /**
     * <strong>example:</strong>
     * <p>13027589188</p>
     */
    @NameInMap("contact_phone")
    public String contactPhone;

    // 是否锁定 - 锁定时不允许c端用户修改联系人信息
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("locked")
    public Boolean locked;

    // 预留可扩展字段json
    @NameInMap("extra_info")
    public String extraInfo;

    public static HealthContactInfo build(java.util.Map<String, ?> map) throws Exception {
        HealthContactInfo self = new HealthContactInfo();
        return TeaModel.build(map, self);
    }

    public HealthContactInfo setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public HealthContactInfo setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public HealthContactInfo setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public HealthContactInfo setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }
    public String getContactPhone() {
        return this.contactPhone;
    }

    public HealthContactInfo setLocked(Boolean locked) {
        this.locked = locked;
        return this;
    }
    public Boolean getLocked() {
        return this.locked;
    }

    public HealthContactInfo setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}
