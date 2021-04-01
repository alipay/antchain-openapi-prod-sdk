// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // ip的基础信息字段
    public class IpBasicInfo : TeaModel {
        // ip名字
        [NameInMap("ip_name")]
        [Validation(Required=true)]
        public string IpName { get; set; }

        // ip的链上id
        [NameInMap("ip_id")]
        [Validation(Required=true)]
        public string IpId { get; set; }

        // ip类型，多个用;隔开
        [NameInMap("ip_type")]
        [Validation(Required=true)]
        public string IpType { get; set; }

        // 受众群体，多个用;隔开
        [NameInMap("audience_group")]
        [Validation(Required=true)]
        public string AudienceGroup { get; set; }

        // ip主图,存放oss图片链接;隔开
        [NameInMap("image")]
        [Validation(Required=true)]
        public string Image { get; set; }

        // 商品详情图 存放OSS图片链接 用;隔开
        [NameInMap("image_detail")]
        [Validation(Required=true)]
        public string ImageDetail { get; set; }

        // ip 描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 对接人信息，json列表
        // [{
        // "name":"123", //联系人名字，必填
        // "mobilePhone":"123",// 联系人手机号,必填
        // "email":"456",// 联系人邮箱,选填
        // "dingDing":"999",// 联系人钉钉号,选填
        // "telePhone":"8888",// 联系人座机,选填
        // "position":"aaa"// 联系人职务,必填
        // }]
        [NameInMap("docking_people_info")]
        [Validation(Required=true)]
        public List<DockingPeopleInfo> DockingPeopleInfo { get; set; }

        // 资质信息
        [NameInMap("copy_right")]
        [Validation(Required=true)]
        public string CopyRight { get; set; }

        // 合作案例，图片存放oss链接，多张用,隔开
        [NameInMap("cooperation_case")]
        [Validation(Required=false)]
        public string CooperationCase { get; set; }

        // 合作事项
        [NameInMap("cooperation_note")]
        [Validation(Required=false)]
        public string CooperationNote { get; set; }

        // 查询渠道
        [NameInMap("channel_name")]
        [Validation(Required=true)]
        public string ChannelName { get; set; }

        // ip的外部创建时间，毫秒时间戳
        [NameInMap("ip_create_time")]
        [Validation(Required=false)]
        public long? IpCreateTime { get; set; }

        // 未来大事件
        [NameInMap("future_milestones")]
        [Validation(Required=false)]
        public string FutureMilestones { get; set; }

        // 推广渠道
        [NameInMap("promotion_channels")]
        [Validation(Required=false)]
        public string PromotionChannels { get; set; }

        // 系统中创建时间
        [NameInMap("system_create_time")]
        [Validation(Required=true)]
        public long? SystemCreateTime { get; set; }

        // ip别名，多个用;隔开
        [NameInMap("ip_other_name")]
        [Validation(Required=true)]
        public string IpOtherName { get; set; }

        // ip的状态 0 待审批， 1 审批通过 2 审批拒绝
        [NameInMap("approval_status")]
        [Validation(Required=false)]
        public long? ApprovalStatus { get; set; }

        // 审批意见
        [NameInMap("approval_comments")]
        [Validation(Required=false)]
        public string ApprovalComments { get; set; }

        // 备注信息
        [NameInMap("memo")]
        [Validation(Required=true)]
        public string Memo { get; set; }

        // 资质生效时间，毫秒时间戳
        [NameInMap("copy_right_begin_time")]
        [Validation(Required=true)]
        public long? CopyRightBeginTime { get; set; }

        // 创建ip的版权方的链上账户
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 资质生效的结束时间
        [NameInMap("copy_right_end_time")]
        [Validation(Required=true)]
        public long? CopyRightEndTime { get; set; }

        // 账户名称
        [NameInMap("account_name")]
        [Validation(Required=false)]
        public string AccountName { get; set; }

    }

}
