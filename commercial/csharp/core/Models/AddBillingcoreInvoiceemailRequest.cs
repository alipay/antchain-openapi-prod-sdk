// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    public class AddBillingcoreInvoiceemailRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 请求唯一id，可以是时间戳
        [NameInMap("request_unique_id")]
        [Validation(Required=false)]
        public string RequestUniqueId { get; set; }

        // 发票电子邮箱
        [NameInMap("invoice_email")]
        [Validation(Required=true)]
        public InvoiceEmail InvoiceEmail { get; set; }

    }

}
