// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class PushRiskplusUmktCommonbackflowRequest : TeaModel {
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
        public long? TenantId { get; set; }

        // 回流模版ID
        [NameInMap("back_flow_template_id")]
        [Validation(Required=true)]
        public long? BackFlowTemplateId { get; set; }

        // 回流信息描述
        [NameInMap("back_flow_desc")]
        [Validation(Required=true)]
        public string BackFlowDesc { get; set; }

        // 回流属性
        [NameInMap("properties")]
        [Validation(Required=true)]
        public string Properties { get; set; }

    }

}
