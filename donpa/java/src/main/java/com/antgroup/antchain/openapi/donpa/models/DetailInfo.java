// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.donpa.models;

import com.aliyun.tea.*;

public class DetailInfo extends TeaModel {
    // 修复人
    @NameInMap("person_data")
    @Validation(required = true)
    public PersonData personData;

    // “0”: 修复中，”1":修复失败,”2":修复成功,”3":修复出错
    @NameInMap("repair_status")
    @Validation(required = true)
    public String repairStatus;

    // 修复结果过期时间
    @NameInMap("expire_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String expireTime;

    // 修复结果数
    @NameInMap("count")
    @Validation(required = true)
    public Long count;

    public static DetailInfo build(java.util.Map<String, ?> map) throws Exception {
        DetailInfo self = new DetailInfo();
        return TeaModel.build(map, self);
    }

    public DetailInfo setPersonData(PersonData personData) {
        this.personData = personData;
        return this;
    }
    public PersonData getPersonData() {
        return this.personData;
    }

    public DetailInfo setRepairStatus(String repairStatus) {
        this.repairStatus = repairStatus;
        return this;
    }
    public String getRepairStatus() {
        return this.repairStatus;
    }

    public DetailInfo setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DetailInfo setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

}
