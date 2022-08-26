// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_4b3196fa612148cd8407b20f4e5ed132.Models
{
    public class ConfirmBlockchainArecRcpMgRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 银行编号
        [NameInMap("bank_no")]
        [Validation(Required=true)]
        public string BankNo { get; set; }

        // 抵押单号
        [NameInMap("mg_order_no")]
        [Validation(Required=true)]
        public string MgOrderNo { get; set; }

        // 确认抵押登记结果，Y:继续,N:中止抵押
        [NameInMap("result")]
        [Validation(Required=true)]
        public string Result { get; set; }

        // 银行返回的中止抵押原因code
        [NameInMap("fail_code")]
        [Validation(Required=false)]
        public string FailCode { get; set; }

        // 银行反馈的中止抵押原因描述
        [NameInMap("fail_desc")]
        [Validation(Required=false)]
        public string FailDesc { get; set; }

    }

}
