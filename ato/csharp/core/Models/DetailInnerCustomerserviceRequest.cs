// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class DetailInnerCustomerserviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 公司社会统一信息代码，间联模式必传
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

        // 进件类型 
        // DIRECT("DIRECT", "直连进件模式"),
        // AGENT("AGENT", "代理商进件模式"),
        [NameInMap("expand_mode")]
        [Validation(Required=true)]
        public string ExpandMode { get; set; }

    }

}
