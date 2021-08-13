// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 渠道对应的账户信息
    public class AccountSettlementInfo : TeaModel {
        // 账户id
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 版权方名字
        [NameInMap("account_name")]
        [Validation(Required=true)]
        public string AccountName { get; set; }

        // WAIT_CHECK:渠道已申请开通但未审核，SUCCESS，审核成功
        [NameInMap("settled_status")]
        [Validation(Required=true)]
        public string SettledStatus { get; set; }

        // 版权方联系人名字
        [NameInMap("contact_name")]
        [Validation(Required=false)]
        public string ContactName { get; set; }

        // 版权方联系人手机
        [NameInMap("contact_mobile")]
        [Validation(Required=false)]
        public string ContactMobile { get; set; }

        // 版权方联系人手机号
        [NameInMap("contact_phone")]
        [Validation(Required=true)]
        public string ContactPhone { get; set; }

        // 申请入驻时间
        [NameInMap("apply_time")]
        [Validation(Required=true)]
        public long? ApplyTime { get; set; }

    }

}
