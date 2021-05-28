// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class QueryChargeAuthRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户
        [NameInMap("biz_tenant")]
        [Validation(Required=true)]
        public string BizTenant { get; set; }

        // 授权类型,业务类型
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

    }

}
