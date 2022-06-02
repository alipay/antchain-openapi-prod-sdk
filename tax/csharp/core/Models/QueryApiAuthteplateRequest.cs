// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class QueryApiAuthteplateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务订单号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 身份ID 身份证或者统一社会信用编码
        [NameInMap("identity_id")]
        [Validation(Required=true)]
        public string IdentityId { get; set; }

        // 名称
        [NameInMap("identity_name")]
        [Validation(Required=true)]
        public string IdentityName { get; set; }

        // 业务类型
        // 11 税
        // 12票
        // 13税+票
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public string AuthType { get; set; }

        // 法人名称
        [NameInMap("cognizant_name")]
        [Validation(Required=true)]
        public string CognizantName { get; set; }

        // 法人证件号
        [NameInMap("coidentity_number")]
        [Validation(Required=true)]
        public string CoidentityNumber { get; set; }

        // 法人手机号
        [NameInMap("cognizant_mobile")]
        [Validation(Required=true)]
        public string CognizantMobile { get; set; }

    }

}
