// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class CreateIpGoodsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础字段
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // 版权方的链上账户Id
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // ip的名字
        [NameInMap("ip_name")]
        [Validation(Required=true)]
        public string IpName { get; set; }

        // 受众群体，多个用;隔开
        [NameInMap("audience_group")]
        [Validation(Required=true)]
        public string AudienceGroup { get; set; }

        // ip类型，多个用;隔开
        [NameInMap("ip_type")]
        [Validation(Required=true)]
        public string IpType { get; set; }

        // ip主图,存放oss图片链接;隔开
        [NameInMap("image")]
        [Validation(Required=true)]
        public string Image { get; set; }

        // 商品详情图  存放OSS图片链接 用;隔开
        [NameInMap("image_detail")]
        [Validation(Required=true)]
        public string ImageDetail { get; set; }

        // ip描述
        [NameInMap("description")]
        [Validation(Required=false)]
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

        // 资质证书类型，0为用户上传，1申请
        [NameInMap("copy_right_type")]
        [Validation(Required=false)]
        public string CopyRightType { get; set; }

        // 资质，copy_right_type为0的时候，copy_right不能为空，copy_right_type为1的时候，copy_right可以为空
        [NameInMap("copy_right")]
        [Validation(Required=false)]
        public string CopyRight { get; set; }

        // 合作事项
        [NameInMap("cooperation_note")]
        [Validation(Required=false)]
        public string CooperationNote { get; set; }

        // 传入的渠道信息
        [NameInMap("channel_name")]
        [Validation(Required=true)]
        public string ChannelName { get; set; }

        // 合作案例，图片存放oss链接，多张用,隔开
        [NameInMap("cooperation_case")]
        [Validation(Required=false)]
        public string CooperationCase { get; set; }

        // ip创建时间,毫秒时间戳
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

        // ip别称，多个用;隔开
        [NameInMap("ip_other_name")]
        [Validation(Required=false)]
        public string IpOtherName { get; set; }

        // 备注信息
        [NameInMap("memo")]
        [Validation(Required=false)]
        public string Memo { get; set; }

        // 资质生效时间， 毫秒时间戳
        [NameInMap("copy_right_begin_time")]
        [Validation(Required=true)]
        public long? CopyRightBeginTime { get; set; }

        // 资质生效的结束时间
        [NameInMap("copy_right_end_time")]
        [Validation(Required=true)]
        public long? CopyRightEndTime { get; set; }

        // IP图库链接
        [NameInMap("ip_gallery_url")]
        [Validation(Required=false)]
        public string IpGalleryUrl { get; set; }

        // IP授权信息
        [NameInMap("authorization_info")]
        [Validation(Required=false)]
        public IPAuthorizationInfo AuthorizationInfo { get; set; }

    }

}
