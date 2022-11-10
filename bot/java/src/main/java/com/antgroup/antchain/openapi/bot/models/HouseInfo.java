// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class HouseInfo extends TeaModel {
    // 房源唯一ID
    @NameInMap("house_id")
    @Validation(required = true)
    public String houseId;

    // 租赁模式
    @NameInMap("lease_mode")
    public String leaseMode;

    // 面积平方
    @NameInMap("acreage")
    public String acreage;

    // 房源类型：0住宅、1别墅、
    // 2商铺、3写字楼
    @NameInMap("structure")
    @Validation(required = true)
    public Long structure;

    // 房屋地址
    @NameInMap("addr")
    public String addr;

    // 门锁设备DID
    @NameInMap("lock_id")
    public String lockId;

    // 电表设备DID
    @NameInMap("ammeter_id")
    public String ammeterId;

    public static HouseInfo build(java.util.Map<String, ?> map) throws Exception {
        HouseInfo self = new HouseInfo();
        return TeaModel.build(map, self);
    }

    public HouseInfo setHouseId(String houseId) {
        this.houseId = houseId;
        return this;
    }
    public String getHouseId() {
        return this.houseId;
    }

    public HouseInfo setLeaseMode(String leaseMode) {
        this.leaseMode = leaseMode;
        return this;
    }
    public String getLeaseMode() {
        return this.leaseMode;
    }

    public HouseInfo setAcreage(String acreage) {
        this.acreage = acreage;
        return this;
    }
    public String getAcreage() {
        return this.acreage;
    }

    public HouseInfo setStructure(Long structure) {
        this.structure = structure;
        return this;
    }
    public Long getStructure() {
        return this.structure;
    }

    public HouseInfo setAddr(String addr) {
        this.addr = addr;
        return this;
    }
    public String getAddr() {
        return this.addr;
    }

    public HouseInfo setLockId(String lockId) {
        this.lockId = lockId;
        return this;
    }
    public String getLockId() {
        return this.lockId;
    }

    public HouseInfo setAmmeterId(String ammeterId) {
        this.ammeterId = ammeterId;
        return this;
    }
    public String getAmmeterId() {
        return this.ammeterId;
    }

}
