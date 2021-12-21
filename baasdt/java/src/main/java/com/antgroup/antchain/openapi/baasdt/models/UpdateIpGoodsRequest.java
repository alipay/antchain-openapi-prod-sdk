// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class UpdateIpGoodsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础字段
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // ip的名字
    @NameInMap("ip_name")
    @Validation(required = true)
    public String ipName;

    // ip类型，多个用;隔开
    @NameInMap("ip_type")
    @Validation(required = true)
    public String ipType;

    // 受众人群，多个用;隔开
    @NameInMap("audience_group")
    @Validation(required = true)
    public String audienceGroup;

    // ip链上id
    @NameInMap("ip_id")
    @Validation(required = true)
    public String ipId;

    // ip主图,存放oss图片链接 多个用;隔开
    @NameInMap("image")
    @Validation(required = true)
    public String image;

    // 商品详情图  存放OSS图片链接 多个用;隔开
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

    // 资质
    @NameInMap("copy_right")
    public String copyRight;

    // 合作事项
    @NameInMap("cooperation_note")
    public String cooperationNote;

    // 传入的渠道信息，不是更新项
    @NameInMap("channel_name")
    @Validation(required = true)
    public String channelName;

    // 合作案例，图片存放oss链接，多张用;隔开
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

    // ip别名，多个通过;隔开
    @NameInMap("ip_other_name")
    public String ipOtherName;

    // 备注信息
    @NameInMap("memo")
    public String memo;

    // 资质生效时间 毫秒时间戳
    @NameInMap("copy_right_begin_time")
    @Validation(required = true)
    public Long copyRightBeginTime;

    // 资质生效的结束时间
    @NameInMap("copy_right_end_time")
    @Validation(required = true)
    public Long copyRightEndTime;

    // 如果商品是审批通过状态，是否需要审批，默认false。该字段提供给运营使用，慎用！！！
    @NameInMap("need_approval")
    public Boolean needApproval;

    // 授权信息
    @NameInMap("authorization_info")
    public IPAuthorizationInfo authorizationInfo;

    public static UpdateIpGoodsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpGoodsRequest self = new UpdateIpGoodsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIpGoodsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateIpGoodsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateIpGoodsRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public UpdateIpGoodsRequest setIpName(String ipName) {
        this.ipName = ipName;
        return this;
    }
    public String getIpName() {
        return this.ipName;
    }

    public UpdateIpGoodsRequest setIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }
    public String getIpType() {
        return this.ipType;
    }

    public UpdateIpGoodsRequest setAudienceGroup(String audienceGroup) {
        this.audienceGroup = audienceGroup;
        return this;
    }
    public String getAudienceGroup() {
        return this.audienceGroup;
    }

    public UpdateIpGoodsRequest setIpId(String ipId) {
        this.ipId = ipId;
        return this;
    }
    public String getIpId() {
        return this.ipId;
    }

    public UpdateIpGoodsRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public UpdateIpGoodsRequest setImageDetail(String imageDetail) {
        this.imageDetail = imageDetail;
        return this;
    }
    public String getImageDetail() {
        return this.imageDetail;
    }

    public UpdateIpGoodsRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateIpGoodsRequest setDockingPeopleInfo(java.util.List<DockingPeopleInfo> dockingPeopleInfo) {
        this.dockingPeopleInfo = dockingPeopleInfo;
        return this;
    }
    public java.util.List<DockingPeopleInfo> getDockingPeopleInfo() {
        return this.dockingPeopleInfo;
    }

    public UpdateIpGoodsRequest setCopyRightType(String copyRightType) {
        this.copyRightType = copyRightType;
        return this;
    }
    public String getCopyRightType() {
        return this.copyRightType;
    }

    public UpdateIpGoodsRequest setCopyRight(String copyRight) {
        this.copyRight = copyRight;
        return this;
    }
    public String getCopyRight() {
        return this.copyRight;
    }

    public UpdateIpGoodsRequest setCooperationNote(String cooperationNote) {
        this.cooperationNote = cooperationNote;
        return this;
    }
    public String getCooperationNote() {
        return this.cooperationNote;
    }

    public UpdateIpGoodsRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public UpdateIpGoodsRequest setCooperationCase(String cooperationCase) {
        this.cooperationCase = cooperationCase;
        return this;
    }
    public String getCooperationCase() {
        return this.cooperationCase;
    }

    public UpdateIpGoodsRequest setIpCreateTime(Long ipCreateTime) {
        this.ipCreateTime = ipCreateTime;
        return this;
    }
    public Long getIpCreateTime() {
        return this.ipCreateTime;
    }

    public UpdateIpGoodsRequest setFutureMilestones(String futureMilestones) {
        this.futureMilestones = futureMilestones;
        return this;
    }
    public String getFutureMilestones() {
        return this.futureMilestones;
    }

    public UpdateIpGoodsRequest setPromotionChannels(String promotionChannels) {
        this.promotionChannels = promotionChannels;
        return this;
    }
    public String getPromotionChannels() {
        return this.promotionChannels;
    }

    public UpdateIpGoodsRequest setIpOtherName(String ipOtherName) {
        this.ipOtherName = ipOtherName;
        return this;
    }
    public String getIpOtherName() {
        return this.ipOtherName;
    }

    public UpdateIpGoodsRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public UpdateIpGoodsRequest setCopyRightBeginTime(Long copyRightBeginTime) {
        this.copyRightBeginTime = copyRightBeginTime;
        return this;
    }
    public Long getCopyRightBeginTime() {
        return this.copyRightBeginTime;
    }

    public UpdateIpGoodsRequest setCopyRightEndTime(Long copyRightEndTime) {
        this.copyRightEndTime = copyRightEndTime;
        return this;
    }
    public Long getCopyRightEndTime() {
        return this.copyRightEndTime;
    }

    public UpdateIpGoodsRequest setNeedApproval(Boolean needApproval) {
        this.needApproval = needApproval;
        return this;
    }
    public Boolean getNeedApproval() {
        return this.needApproval;
    }

    public UpdateIpGoodsRequest setAuthorizationInfo(IPAuthorizationInfo authorizationInfo) {
        this.authorizationInfo = authorizationInfo;
        return this;
    }
    public IPAuthorizationInfo getAuthorizationInfo() {
        return this.authorizationInfo;
    }

}
