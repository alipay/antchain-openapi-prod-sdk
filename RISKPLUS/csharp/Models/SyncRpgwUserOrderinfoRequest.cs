// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class SyncRpgwUserOrderinfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单号
        [NameInMap("order_number")]
        [Validation(Required=true)]
        public string OrderNumber { get; set; }

        // REGISTER与PURCHASE二选一
        [NameInMap("order_type")]
        [Validation(Required=true)]
        public string OrderType { get; set; }

        // 注册/下单总佣金
        [NameInMap("order_amount")]
        [Validation(Required=true)]
        public string OrderAmount { get; set; }

        // 时间，格式为yyyy-MM-dd HH:mm:ss
        [NameInMap("order_time")]
        [Validation(Required=true)]
        public string OrderTime { get; set; }

        // 邀请人id
        [NameInMap("inviter_id")]
        [Validation(Required=true)]
        public string InviterId { get; set; }

        // 邀请人姓名
        [NameInMap("inviter_name")]
        [Validation(Required=true)]
        public string InviterName { get; set; }

        // 邀请人手机号
        [NameInMap("inviter_phone_number")]
        [Validation(Required=true)]
        public string InviterPhoneNumber { get; set; }

        // 邀请人身份证号
        [NameInMap("inviter_id_number")]
        [Validation(Required=true)]
        public string InviterIdNumber { get; set; }

        // 邀请码
        [NameInMap("invitation_code")]
        [Validation(Required=false)]
        public string InvitationCode { get; set; }

        // 被邀请人id
        [NameInMap("invitee_id")]
        [Validation(Required=true)]
        public string InviteeId { get; set; }

        // 被邀请人姓名
        [NameInMap("invitee_name")]
        [Validation(Required=false)]
        public string InviteeName { get; set; }

        // 被邀请人手机号
        [NameInMap("invitee_phone_number")]
        [Validation(Required=true)]
        public string InviteePhoneNumber { get; set; }

        // 被邀请人身份证
        [NameInMap("invitee_id_number")]
        [Validation(Required=false)]
        public string InviteeIdNumber { get; set; }

    }

}
