// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    public class QueryBillingcoreInvoicelocResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 发票信息
        [NameInMap("invoice")]
        [Validation(Required=false)]
        public Invoice Invoice { get; set; }

        // 发票寄送地址
        [NameInMap("invoice_address")]
        [Validation(Required=false)]
        public InvoiceAddress InvoiceAddress { get; set; }

        // 发票电子邮箱
        [NameInMap("invoice_email")]
        [Validation(Required=false)]
        public InvoiceEmail InvoiceEmail { get; set; }

    }

}
