// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CreateIpValueaddRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础字段
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 创建增值服务的账户id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 服务名字
    @NameInMap("service_name")
    @Validation(required = true)
    public String serviceName;

    // 商品主图，存放OSS图片链接,多张用;隔开
    @NameInMap("images")
    @Validation(required = true)
    public String images;

    // 商品详情图  存放OSS图片链接,多张用;隔开
    @NameInMap("images_detail")
    @Validation(required = true)
    public String imagesDetail;

    // 商品描述
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

    public static CreateIpValueaddRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIpValueaddRequest self = new CreateIpValueaddRequest();
        return TeaModel.build(map, self);
    }

    public CreateIpValueaddRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateIpValueaddRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateIpValueaddRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public CreateIpValueaddRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CreateIpValueaddRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public CreateIpValueaddRequest setImages(String images) {
        this.images = images;
        return this;
    }
    public String getImages() {
        return this.images;
    }

    public CreateIpValueaddRequest setImagesDetail(String imagesDetail) {
        this.imagesDetail = imagesDetail;
        return this;
    }
    public String getImagesDetail() {
        return this.imagesDetail;
    }

    public CreateIpValueaddRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateIpValueaddRequest setDockingPeople(java.util.List<DockingPeopleInfo> dockingPeople) {
        this.dockingPeople = dockingPeople;
        return this;
    }
    public java.util.List<DockingPeopleInfo> getDockingPeople() {
        return this.dockingPeople;
    }

    public CreateIpValueaddRequest setCopyRight(String copyRight) {
        this.copyRight = copyRight;
        return this;
    }
    public String getCopyRight() {
        return this.copyRight;
    }

    public CreateIpValueaddRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

}
