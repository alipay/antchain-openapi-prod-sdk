// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 版权方申请
    public class IPApplyInfo : TeaModel {
        // 账户Id
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 用户名
        [NameInMap("login_name")]
        [Validation(Required=true)]
        public string LoginName { get; set; }

        // 支付宝账户
        [NameInMap("alipay_login_name")]
        [Validation(Required=true)]
        public string AlipayLoginName { get; set; }

        // 联系人
        [NameInMap("legal_name")]
        [Validation(Required=true)]
        public string LegalName { get; set; }

        // 联系方式
        [NameInMap("phone_number")]
        [Validation(Required=true)]
        public string PhoneNumber { get; set; }

        // 角色(1: 版权方 2:商家)
        [NameInMap("role")]
        [Validation(Required=true)]
        public long? Role { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

    }

}
