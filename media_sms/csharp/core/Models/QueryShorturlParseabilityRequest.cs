// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MEDIA_SMS.Models
{
    public class QueryShorturlParseabilityRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 卡片模板id
        [NameInMap("smart_template_id")]
        [Validation(Required=true)]
        public string SmartTemplateId { get; set; }

        // 待查询手机号列表
        [NameInMap("mobiles")]
        [Validation(Required=true)]
        public List<ParseQueryParam> Mobiles { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

    }

}
