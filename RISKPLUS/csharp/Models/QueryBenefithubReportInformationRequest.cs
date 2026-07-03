// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryBenefithubReportInformationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 业务分配的平台code，8位纯大写字母code
        [NameInMap("platform_code")]
        [Validation(Required=true)]
        public string PlatformCode { get; set; }

        // 产品码
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 平台code、用户唯一ID 组合出全局唯一id
        [NameInMap("user_unique_id")]
        [Validation(Required=true)]
        public string UserUniqueId { get; set; }

    }

}
