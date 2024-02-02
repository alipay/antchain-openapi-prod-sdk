// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SAAS.Models
{
    public class UpdateMeteringItemRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商业产品码
        [NameInMap("business_code")]
        [Validation(Required=true)]
        public string BusinessCode { get; set; }

        // 计量域
        [NameInMap("metering_domain_code")]
        [Validation(Required=true)]
        public string MeteringDomainCode { get; set; }

        // 计量项列表
        [NameInMap("item_rules")]
        [Validation(Required=true)]
        public List<ItemRule> ItemRules { get; set; }

    }

}
