// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    public class CloseRcpMgvtwoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
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

        // 房产链抵押单
        [NameInMap("mg_order_no")]
        [Validation(Required=true)]
        public string MgOrderNo { get; set; }

        // 终止抵押原因码
        [NameInMap("fail_code")]
        [Validation(Required=false)]
        public string FailCode { get; set; }

        // 终止抵押原因描述
        [NameInMap("fail_desc")]
        [Validation(Required=false)]
        public string FailDesc { get; set; }

    }

}
