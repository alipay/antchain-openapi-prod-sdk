// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CreateIpGoodsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础字段
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 版权方的链上账户Id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // ip的名字
    @NameInMap("ip_name")
    @Validation(required = true)
    public String ipName;

    // 受众群体，多个用;隔开
    @NameInMap("audience_group")
    @Validation(required = true)
    public String audienceGroup;

    // ip类型，多个用;隔开
    @NameInMap("ip_type")
    @Validation(required = true)
    public String ipType;

    // ip主图,存放oss图片链接;隔开
    @NameInMap("image")
    @Validation(required = true)
    public String image;

    // 商品详情图  存放OSS图片链接 用;隔开
    @NameInMap("image_detail")
    @Validation(required = true)
    public String imageDetail;

    // ip描述
    @NameInMap("description")
    public String description;

    // 对接人信息，json列表
    // [{
    // "name":"123", //联系人名字，必填
    // "mobilePhone":"123",// 联系人手机号,必填
    // "email":"456",// 联系人邮箱,选填
    // "dingDing":"999",// 联系人钉钉号,选填
    // "telePhone":"8888",// 联系人座机,选填
    // "position":"aaa"// 联系人职务,必填
    // }]
    @NameInMap("docking_people_info")
    @Validation(required = true)
    public java.util.List<DockingPeopleInfo> dockingPeopleInfo;

    // 资质证书类型，0为用户上传，1申请
    @NameInMap("copy_right_type")
    public String copyRightType;

    // 资质，copy_right_type为0的时候，copy_right不能为空，copy_right_type为1的时候，copy_right可以为空
    @NameInMap("copy_right")
    public String copyRight;

    // 合作事项
    @NameInMap("cooperation_note")
    public String cooperationNote;

    // 传入的渠道信息
    @NameInMap("channel_name")
    @Validation(required = true)
    public String channelName;

    // 合作案例，图片存放oss链接，多张用,隔开
    @NameInMap("cooperation_case")
    public String cooperationCase;

    // ip创建时间,毫秒时间戳
    @NameInMap("ip_create_time")
    public Long ipCreateTime;

    // 未来大事件
    @NameInMap("future_milestones")
    public String futureMilestones;

    // 推广渠道
    @NameInMap("promotion_channels")
    public String promotionChannels;

    // ip别称，多个用;隔开
    @NameInMap("ip_other_name")
    public String ipOtherName;

    // 备注信息
    @NameInMap("memo")
    public String memo;

    // 资质生效时间， 毫秒时间戳
    @NameInMap("copy_right_begin_time")
    @Validation(required = true)
    public Long copyRightBeginTime;

    // 资质生效的结束时间
    @NameInMap("copy_right_end_time")
    @Validation(required = true)
    public Long copyRightEndTime;

    // IP图库链接
    @NameInMap("ip_gallery_url")
    public String ipGalleryUrl;

    // IP授权信息
    @NameInMap("authorization_info")
    public IPAuthorizationInfo authorizationInfo;

    public static CreateIpGoodsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIpGoodsRequest self = new CreateIpGoodsRequest();
        return TeaModel.build(map, self);
    }

    public CreateIpGoodsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateIpGoodsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateIpGoodsRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public CreateIpGoodsRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CreateIpGoodsRequest setIpName(String ipName) {
        this.ipName = ipName;
        return this;
    }
    public String getIpName() {
        return this.ipName;
    }

    public CreateIpGoodsRequest setAudienceGroup(String audienceGroup) {
        this.audienceGroup = audienceGroup;
        return this;
    }
    public String getAudienceGroup() {
        return this.audienceGroup;
    }

    public CreateIpGoodsRequest setIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }
    public String getIpType() {
        return this.ipType;
    }

    public CreateIpGoodsRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public CreateIpGoodsRequest setImageDetail(String imageDetail) {
        this.imageDetail = imageDetail;
        return this;
    }
    public String getImageDetail() {
        return this.imageDetail;
    }

    public CreateIpGoodsRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateIpGoodsRequest setDockingPeopleInfo(java.util.List<DockingPeopleInfo> dockingPeopleInfo) {
        this.dockingPeopleInfo = dockingPeopleInfo;
        return this;
    }
    public java.util.List<DockingPeopleInfo> getDockingPeopleInfo() {
        return this.dockingPeopleInfo;
    }

    public CreateIpGoodsRequest setCopyRightType(String copyRightType) {
        this.copyRightType = copyRightType;
        return this;
    }
    public String getCopyRightType() {
        return this.copyRightType;
    }

    public CreateIpGoodsRequest setCopyRight(String copyRight) {
        this.copyRight = copyRight;
        return this;
    }
    public String getCopyRight() {
        return this.copyRight;
    }

    public CreateIpGoodsRequest setCooperationNote(String cooperationNote) {
        this.cooperationNote = cooperationNote;
        return this;
    }
    public String getCooperationNote() {
        return this.cooperationNote;
    }

    public CreateIpGoodsRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public CreateIpGoodsRequest setCooperationCase(String cooperationCase) {
        this.cooperationCase = cooperationCase;
        return this;
    }
    public String getCooperationCase() {
        return this.cooperationCase;
    }

    public CreateIpGoodsRequest setIpCreateTime(Long ipCreateTime) {
        this.ipCreateTime = ipCreateTime;
        return this;
    }
    public Long getIpCreateTime() {
        return this.ipCreateTime;
    }

    public CreateIpGoodsRequest setFutureMilestones(String futureMilestones) {
        this.futureMilestones = futureMilestones;
        return this;
    }
    public String getFutureMilestones() {
        return this.futureMilestones;
    }

    public CreateIpGoodsRequest setPromotionChannels(String promotionChannels) {
        this.promotionChannels = promotionChannels;
        return this;
    }
    public String getPromotionChannels() {
        return this.promotionChannels;
    }

    public CreateIpGoodsRequest setIpOtherName(String ipOtherName) {
        this.ipOtherName = ipOtherName;
        return this;
    }
    public String getIpOtherName() {
        return this.ipOtherName;
    }

    public CreateIpGoodsRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public CreateIpGoodsRequest setCopyRightBeginTime(Long copyRightBeginTime) {
        this.copyRightBeginTime = copyRightBeginTime;
        return this;
    }
    public Long getCopyRightBeginTime() {
        return this.copyRightBeginTime;
    }

    public CreateIpGoodsRequest setCopyRightEndTime(Long copyRightEndTime) {
        this.copyRightEndTime = copyRightEndTime;
        return this;
    }
    public Long getCopyRightEndTime() {
        return this.copyRightEndTime;
    }

    public CreateIpGoodsRequest setIpGalleryUrl(String ipGalleryUrl) {
        this.ipGalleryUrl = ipGalleryUrl;
        return this;
    }
    public String getIpGalleryUrl() {
        return this.ipGalleryUrl;
    }

    public CreateIpGoodsRequest setAuthorizationInfo(IPAuthorizationInfo authorizationInfo) {
        this.authorizationInfo = authorizationInfo;
        return this;
    }
    public IPAuthorizationInfo getAuthorizationInfo() {
        return this.authorizationInfo;
    }

}
