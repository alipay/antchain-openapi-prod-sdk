// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class GetDciPayurlRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // dci用户id
        [NameInMap("dci_user_id")]
        [Validation(Required=true)]
        public string DciUserId { get; set; }

        // dci内容id
        [NameInMap("dci_content_id")]
        [Validation(Required=true)]
        public string DciContentId { get; set; }

        // 支付方式 0：支付宝
        [NameInMap("pay_ment")]
        [Validation(Required=false)]
        public string PayMent { get; set; }

        // 发票信息-当前支持普票
        [NameInMap("invoice_info")]
        [Validation(Required=false)]
        public InvoiceInfo InvoiceInfo { get; set; }

    }

}
