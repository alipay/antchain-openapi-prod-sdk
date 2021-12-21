// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 账号信息
    public class AccountData : TeaModel {
        // 账号id
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 账号名称
        [NameInMap("account_name")]
        [Validation(Required=true)]
        public string AccountName { get; set; }

        // 账号平台（支付宝，淘宝，微信，抖音等）
        [NameInMap("account_platform")]
        [Validation(Required=true)]
        public string AccountPlatform { get; set; }

    }

}
