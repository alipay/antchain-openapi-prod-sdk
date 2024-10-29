// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 订单用户信息
    public class OrderUserInfo : TeaModel {
        // 承租人名称
        [NameInMap("user_name")]
        [Validation(Required=false)]
        public string UserName { get; set; }

        // 承租人手机号
        [NameInMap("user_phone_number")]
        [Validation(Required=false)]
        public string UserPhoneNumber { get; set; }

        // 地址
        [NameInMap("user_address")]
        [Validation(Required=false)]
        public string UserAddress { get; set; }

        // 支付宝账号
        [NameInMap("alipay_uid")]
        [Validation(Required=false)]
        public string AlipayUid { get; set; }

        // 租赁类别
        // 1:个人用户
        // 2:企业用户
        [NameInMap("lessee_type")]
        [Validation(Required=false)]
        public long? LesseeType { get; set; }

        // 承租人身份证
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

    }

}
