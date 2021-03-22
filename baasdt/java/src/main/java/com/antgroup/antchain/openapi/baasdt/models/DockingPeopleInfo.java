// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class DockingPeopleInfo extends TeaModel {
    // 名字
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 手机号
    @NameInMap("mobile_phone")
    @Validation(required = true)
    public String mobilePhone;

    // 职位
    @NameInMap("position")
    @Validation(required = true)
    public String position;

    // 邮箱
    @NameInMap("email")
    public String email;

    // 钉钉号
    @NameInMap("ding_ding")
    public String dingDing;

    // 座机
    @NameInMap("tele_phone")
    public String telePhone;

    public static DockingPeopleInfo build(java.util.Map<String, ?> map) throws Exception {
        DockingPeopleInfo self = new DockingPeopleInfo();
        return TeaModel.build(map, self);
    }

    public DockingPeopleInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DockingPeopleInfo setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }
    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public DockingPeopleInfo setPosition(String position) {
        this.position = position;
        return this;
    }
    public String getPosition() {
        return this.position;
    }

    public DockingPeopleInfo setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public DockingPeopleInfo setDingDing(String dingDing) {
        this.dingDing = dingDing;
        return this;
    }
    public String getDingDing() {
        return this.dingDing;
    }

    public DockingPeopleInfo setTelePhone(String telePhone) {
        this.telePhone = telePhone;
        return this;
    }
    public String getTelePhone() {
        return this.telePhone;
    }

}
