// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IpBasicInfo extends TeaModel {
    // ip名字
    @NameInMap("ip_name")
    @Validation(required = true)
    public String ipName;

    // ip的链上id
    @NameInMap("ip_id")
    @Validation(required = true)
    public String ipId;

    // ip类型，多个用;隔开
    @NameInMap("ip_type")
    @Validation(required = true)
    public String ipType;

    // 受众群体，多个用;隔开
    @NameInMap("audience_group")
    @Validation(required = true)
    public String audienceGroup;

    // ip主图,存放oss图片链接;隔开
    @NameInMap("image")
    @Validation(required = true)
    public String image;

    // 商品详情图 存放OSS图片链接 用;隔开
    @NameInMap("image_detail")
    @Validation(required = true)
    public String imageDetail;

    // ip 描述
    @NameInMap("description")
    @Validation(required = true)
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

    // 资质证书类型，0为自己上传的资质证书，1为区块链版权证书
    @NameInMap("copy_right_type")
    @Validation(required = true)
    public String copyRightType;

    // 资质信息
    @NameInMap("copy_right")
    public String copyRight;

    // 合作案例，图片存放oss链接，多张用,隔开
    @NameInMap("cooperation_case")
    public String cooperationCase;

    // 合作事项
    @NameInMap("cooperation_note")
    public String cooperationNote;

    // 查询渠道
    @NameInMap("channel_name")
    @Validation(required = true)
    public String channelName;

    // ip的外部创建时间，毫秒时间戳
    @NameInMap("ip_create_time")
    public Long ipCreateTime;

    // 未来大事件
    @NameInMap("future_milestones")
    public String futureMilestones;

    // 推广渠道
    @NameInMap("promotion_channels")
    public String promotionChannels;

    // 系统中创建时间
    @NameInMap("system_create_time")
    @Validation(required = true)
    public Long systemCreateTime;

    // ip别名，多个用;隔开
    @NameInMap("ip_other_name")
    @Validation(required = true)
    public String ipOtherName;

    // ip的状态 0 待审批， 1 审批通过 2 审批拒绝
    @NameInMap("approval_status")
    public Long approvalStatus;

    // 审批意见
    @NameInMap("approval_comments")
    public String approvalComments;

    // 备注信息
    @NameInMap("memo")
    @Validation(required = true)
    public String memo;

    // 资质生效时间，毫秒时间戳
    @NameInMap("copy_right_begin_time")
    @Validation(required = true)
    public Long copyRightBeginTime;

    // 创建ip的版权方的链上账户
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 资质生效的结束时间
    @NameInMap("copy_right_end_time")
    @Validation(required = true)
    public Long copyRightEndTime;

    // 账户名称
    @NameInMap("account_name")
    public String accountName;

    public static IpBasicInfo build(java.util.Map<String, ?> map) throws Exception {
        IpBasicInfo self = new IpBasicInfo();
        return TeaModel.build(map, self);
    }

    public IpBasicInfo setIpName(String ipName) {
        this.ipName = ipName;
        return this;
    }
    public String getIpName() {
        return this.ipName;
    }

    public IpBasicInfo setIpId(String ipId) {
        this.ipId = ipId;
        return this;
    }
    public String getIpId() {
        return this.ipId;
    }

    public IpBasicInfo setIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }
    public String getIpType() {
        return this.ipType;
    }

    public IpBasicInfo setAudienceGroup(String audienceGroup) {
        this.audienceGroup = audienceGroup;
        return this;
    }
    public String getAudienceGroup() {
        return this.audienceGroup;
    }

    public IpBasicInfo setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public IpBasicInfo setImageDetail(String imageDetail) {
        this.imageDetail = imageDetail;
        return this;
    }
    public String getImageDetail() {
        return this.imageDetail;
    }

    public IpBasicInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public IpBasicInfo setDockingPeopleInfo(java.util.List<DockingPeopleInfo> dockingPeopleInfo) {
        this.dockingPeopleInfo = dockingPeopleInfo;
        return this;
    }
    public java.util.List<DockingPeopleInfo> getDockingPeopleInfo() {
        return this.dockingPeopleInfo;
    }

    public IpBasicInfo setCopyRightType(String copyRightType) {
        this.copyRightType = copyRightType;
        return this;
    }
    public String getCopyRightType() {
        return this.copyRightType;
    }

    public IpBasicInfo setCopyRight(String copyRight) {
        this.copyRight = copyRight;
        return this;
    }
    public String getCopyRight() {
        return this.copyRight;
    }

    public IpBasicInfo setCooperationCase(String cooperationCase) {
        this.cooperationCase = cooperationCase;
        return this;
    }
    public String getCooperationCase() {
        return this.cooperationCase;
    }

    public IpBasicInfo setCooperationNote(String cooperationNote) {
        this.cooperationNote = cooperationNote;
        return this;
    }
    public String getCooperationNote() {
        return this.cooperationNote;
    }

    public IpBasicInfo setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public IpBasicInfo setIpCreateTime(Long ipCreateTime) {
        this.ipCreateTime = ipCreateTime;
        return this;
    }
    public Long getIpCreateTime() {
        return this.ipCreateTime;
    }

    public IpBasicInfo setFutureMilestones(String futureMilestones) {
        this.futureMilestones = futureMilestones;
        return this;
    }
    public String getFutureMilestones() {
        return this.futureMilestones;
    }

    public IpBasicInfo setPromotionChannels(String promotionChannels) {
        this.promotionChannels = promotionChannels;
        return this;
    }
    public String getPromotionChannels() {
        return this.promotionChannels;
    }

    public IpBasicInfo setSystemCreateTime(Long systemCreateTime) {
        this.systemCreateTime = systemCreateTime;
        return this;
    }
    public Long getSystemCreateTime() {
        return this.systemCreateTime;
    }

    public IpBasicInfo setIpOtherName(String ipOtherName) {
        this.ipOtherName = ipOtherName;
        return this;
    }
    public String getIpOtherName() {
        return this.ipOtherName;
    }

    public IpBasicInfo setApprovalStatus(Long approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }
    public Long getApprovalStatus() {
        return this.approvalStatus;
    }

    public IpBasicInfo setApprovalComments(String approvalComments) {
        this.approvalComments = approvalComments;
        return this;
    }
    public String getApprovalComments() {
        return this.approvalComments;
    }

    public IpBasicInfo setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public IpBasicInfo setCopyRightBeginTime(Long copyRightBeginTime) {
        this.copyRightBeginTime = copyRightBeginTime;
        return this;
    }
    public Long getCopyRightBeginTime() {
        return this.copyRightBeginTime;
    }

    public IpBasicInfo setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public IpBasicInfo setCopyRightEndTime(Long copyRightEndTime) {
        this.copyRightEndTime = copyRightEndTime;
        return this;
    }
    public Long getCopyRightEndTime() {
        return this.copyRightEndTime;
    }

    public IpBasicInfo setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

}
