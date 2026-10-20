// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class SaveHealthContactRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 品牌方渠道标识
    @NameInMap("channel_id")
    @Validation(required = true)
    public String channelId;

    // 设备唯一id
    @NameInMap("tuid")
    @Validation(required = true)
    public String tuid;

    // 联系人业务id -为空时新增/不为空时编辑
    @NameInMap("contact_id")
    public String contactId;

    // 键位设置优先级（1=红键, 2=黄键, 3=绿键）
    @NameInMap("priority")
    @Validation(required = true)
    public Long priority;

    // 联系人名称
    @NameInMap("contact_name")
    @Validation(required = true)
    public String contactName;

    // 呼叫联系人手机号
    @NameInMap("contact_phone")
    @Validation(required = true)
    public String contactPhone;

    // 是否锁定 - 锁定时不允许c端用户修改联系人信息，可通过此接口修改相关信息以及解锁
    @NameInMap("locked")
    @Validation(required = true)
    public Boolean locked;

    // 预留可扩展字段
    @NameInMap("extra_info")
    public String extraInfo;

    public static SaveHealthContactRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveHealthContactRequest self = new SaveHealthContactRequest();
        return TeaModel.build(map, self);
    }

    public SaveHealthContactRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveHealthContactRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveHealthContactRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public SaveHealthContactRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public SaveHealthContactRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public SaveHealthContactRequest setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public SaveHealthContactRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public SaveHealthContactRequest setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }
    public String getContactPhone() {
        return this.contactPhone;
    }

    public SaveHealthContactRequest setLocked(Boolean locked) {
        this.locked = locked;
        return this;
    }
    public Boolean getLocked() {
        return this.locked;
    }

    public SaveHealthContactRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}
