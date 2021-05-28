// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class PushIcmInvoiceinfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 上票ISV app_id即secret_id
        [NameInMap("app_id")]
        [Validation(Required=true)]
        public string AppId { get; set; }

        // 发票号码	
        [NameInMap("invoice")]
        [Validation(Required=true)]
        public Invoice Invoice { get; set; }

    }

}
