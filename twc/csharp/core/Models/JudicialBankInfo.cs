// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 司法纠纷平台银行信息结构体
    public class JudicialBankInfo : TeaModel {
        // 开户行
        [NameInMap("account_bank")]
        [Validation(Required=true)]
        public string AccountBank { get; set; }

        // 开户账号
        [NameInMap("account_number")]
        [Validation(Required=true)]
        public string AccountNumber { get; set; }

        // 开户名称
        [NameInMap("account_name")]
        [Validation(Required=true)]
        public string AccountName { get; set; }

        // 开户联系电话
        [NameInMap("account_contact_phone")]
        [Validation(Required=true)]
        public string AccountContactPhone { get; set; }

    }

}
