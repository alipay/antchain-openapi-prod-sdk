// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class CreateRbbTenantRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户过期时间，不填表示永不过期
        [NameInMap("effective_end_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EffectiveEndDate { get; set; }

        // 租户编码，必须全局唯一
        [NameInMap("tenant_code")]
        [Validation(Required=true, MaxLength=64)]
        public string TenantCode { get; set; }

        // 租户名称
        [NameInMap("tenant_name")]
        [Validation(Required=true, MaxLength=64)]
        public string TenantName { get; set; }

        // 租户自定义属性，JSON格式，可以为空
        [NameInMap("tenant_property_json")]
        [Validation(Required=false)]
        public string TenantPropertyJson { get; set; }

    }

}
