// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class ExecContractCourtdeductRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 付款银行卡类型，例如：icbc（工行）
        [NameInMap("bank_type")]
        [Validation(Required=true)]
        public string BankType { get; set; }

        // 自定义交易id
        [NameInMap("biz_trade_id")]
        [Validation(Required=true)]
        public string BizTradeId { get; set; }

    }

}
