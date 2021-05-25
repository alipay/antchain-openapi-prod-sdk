// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class UpdateIpValueaddRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础字段
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 服务id
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 增值服务名字
    @NameInMap("service_name")
    @Validation(required = true)
    public String serviceName;

    // 主图。存放OSS图片链接,多张用;隔开
    @NameInMap("image")
    @Validation(required = true)
    public String image;

    // 商品详情图  存放OSS图片链接.多张用;隔开
    @NameInMap("image_detail")
    @Validation(required = true)
    public String imageDetail;

    // 描述
    @NameInMap("description")
    public String description;

    // 联系人
    @NameInMap("docking_people")
    @Validation(required = true)
    public java.util.List<DockingPeopleInfo> dockingPeople;

    // 资质证明
    @NameInMap("copy_right")
    public String copyRight;

    // 备注
    @NameInMap("memo")
    public String memo;

    public static UpdateIpValueaddRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpValueaddRequest self = new UpdateIpValueaddRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIpValueaddRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateIpValueaddRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateIpValueaddRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public UpdateIpValueaddRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public UpdateIpValueaddRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public UpdateIpValueaddRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public UpdateIpValueaddRequest setImageDetail(String imageDetail) {
        this.imageDetail = imageDetail;
        return this;
    }
    public String getImageDetail() {
        return this.imageDetail;
    }

    public UpdateIpValueaddRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateIpValueaddRequest setDockingPeople(java.util.List<DockingPeopleInfo> dockingPeople) {
        this.dockingPeople = dockingPeople;
        return this;
    }
    public java.util.List<DockingPeopleInfo> getDockingPeople() {
        return this.dockingPeople;
    }

    public UpdateIpValueaddRequest setCopyRight(String copyRight) {
        this.copyRight = copyRight;
        return this;
    }
    public String getCopyRight() {
        return this.copyRight;
    }

    public UpdateIpValueaddRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

}
