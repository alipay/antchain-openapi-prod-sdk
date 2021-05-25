// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ValueAddedServiceInfo extends TeaModel {
    // 增值服务归属账户id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 增值服务id
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 增值服务名字
    @NameInMap("service_name")
    @Validation(required = true)
    public String serviceName;

    // 主图 链接地址
    @NameInMap("images")
    @Validation(required = true)
    public String images;

    // 详情图
    @NameInMap("images_detail")
    @Validation(required = true)
    public String imagesDetail;

    // 增值服务描述
    @NameInMap("description")
    public String description;

    // 联系人列表
    @NameInMap("docking_people")
    @Validation(required = true)
    public java.util.List<DockingPeopleInfo> dockingPeople;

    // 资质证明
    @NameInMap("copy_right")
    public String copyRight;

    // 备注
    @NameInMap("memo")
    public String memo;

    // 服务状态（0:待审核 1:审核拒绝 2:上线【审核通过】 3: 下线）
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    public static ValueAddedServiceInfo build(java.util.Map<String, ?> map) throws Exception {
        ValueAddedServiceInfo self = new ValueAddedServiceInfo();
        return TeaModel.build(map, self);
    }

    public ValueAddedServiceInfo setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ValueAddedServiceInfo setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public ValueAddedServiceInfo setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ValueAddedServiceInfo setImages(String images) {
        this.images = images;
        return this;
    }
    public String getImages() {
        return this.images;
    }

    public ValueAddedServiceInfo setImagesDetail(String imagesDetail) {
        this.imagesDetail = imagesDetail;
        return this;
    }
    public String getImagesDetail() {
        return this.imagesDetail;
    }

    public ValueAddedServiceInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ValueAddedServiceInfo setDockingPeople(java.util.List<DockingPeopleInfo> dockingPeople) {
        this.dockingPeople = dockingPeople;
        return this;
    }
    public java.util.List<DockingPeopleInfo> getDockingPeople() {
        return this.dockingPeople;
    }

    public ValueAddedServiceInfo setCopyRight(String copyRight) {
        this.copyRight = copyRight;
        return this;
    }
    public String getCopyRight() {
        return this.copyRight;
    }

    public ValueAddedServiceInfo setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public ValueAddedServiceInfo setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
