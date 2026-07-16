// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class GetInnerCustomerservicetemplateRequest : TeaModel {
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

        // 进件类型 
        // DIRECT("DIRECT", "直连进件模式")
        // AGENT("AGENT", "代理商进件模式")
        [NameInMap("expand_mode")]
        [Validation(Required=true)]
        public string ExpandMode { get; set; }

        // 处理类型:
        // MERCHANT_PROCESS("MERCHANT_PROCESS", "商家处理"),
        // PROXY_PROCESS("PROXY_PROCESS", "服务商代处理"),
        [NameInMap("process_type")]
        [Validation(Required=true)]
        public string ProcessType { get; set; }

    }

}
