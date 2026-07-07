// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RESOLVESERVICE.Models
{
    public class PushCustomerInternalmsgRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 客户号
        [NameInMap("cust_no")]
        [Validation(Required=true)]
        public string CustNo { get; set; }

        // 模版信息
        [NameInMap("template_info")]
        [Validation(Required=true)]
        public string TemplateInfo { get; set; }

    }

}
