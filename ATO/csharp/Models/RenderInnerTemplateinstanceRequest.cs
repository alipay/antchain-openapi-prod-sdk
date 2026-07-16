// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class RenderInnerTemplateinstanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商户对应租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 模板编码集，数组
        [NameInMap("template_codes")]
        [Validation(Required=true)]
        public List<string> TemplateCodes { get; set; }

        // 幂等值
        [NameInMap("idempotent")]
        [Validation(Required=true)]
        public string Idempotent { get; set; }

        // 业务方id，唯一
        [NameInMap("biz_business_id")]
        [Validation(Required=true)]
        public string BizBusinessId { get; set; }

        // 组件（文本域）的实际值
        [NameInMap("component_inst_dtos")]
        [Validation(Required=true)]
        public List<TemplateComponent> ComponentInstDtos { get; set; }

    }

}
