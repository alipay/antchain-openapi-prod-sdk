// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class InvokeAgenticnexusAioperationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户 ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 社会统一信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 业务场景标识
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 场景特定业务字段键值
        [NameInMap("biz_request")]
        [Validation(Required=false)]
        public string BizRequest { get; set; }

        // 调用方系统名(
        [NameInMap("sys_name")]
        [Validation(Required=true)]
        public string SysName { get; set; }

        // 链路 ID
        [NameInMap("trace_id")]
        [Validation(Required=true)]
        public string TraceId { get; set; }

    }

}
