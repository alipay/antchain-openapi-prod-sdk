// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_4b3196fa612148cd8407b20f4e5ed132.Models
{
    public class ConfirmBlockchainArecRcpMgrRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 助贷平台
        [NameInMap("loan_assist_platform")]
        [Validation(Required=true)]
        public string LoanAssistPlatform { get; set; }

        // 房产链内部银行编号
        [NameInMap("bank_no")]
        [Validation(Required=true)]
        public string BankNo { get; set; }

        // 解抵押单号
        [NameInMap("mg_release_order_no")]
        [Validation(Required=true)]
        public string MgReleaseOrderNo { get; set; }

        // Y=继续解抵押,N=终止解抵押
        [NameInMap("result")]
        [Validation(Required=true)]
        public string Result { get; set; }

        // 终止解抵押原因码
        [NameInMap("fail_code")]
        [Validation(Required=false)]
        public string FailCode { get; set; }

        // 终止解抵押原因描述
        [NameInMap("fail_desc")]
        [Validation(Required=false)]
        public string FailDesc { get; set; }

        // 银行签署完成的解抵押合同列表
        [NameInMap("agreements")]
        [Validation(Required=true)]
        public List<Agreement> Agreements { get; set; }

    }

}
