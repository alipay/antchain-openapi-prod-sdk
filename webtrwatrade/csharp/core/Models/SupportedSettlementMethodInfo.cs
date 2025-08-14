// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    // 支持结算方式信息
    public class SupportedSettlementMethodInfo : TeaModel {
        // 结算方式枚举：TD或TT
        [NameInMap("settlement_method_enum")]
        [Validation(Required=false)]
        public string SettlementMethodEnum { get; set; }

        // 结算银行账户id
        [NameInMap("related_settlement_account_id")]
        [Validation(Required=false)]
        public string RelatedSettlementAccountId { get; set; }

    }

}
