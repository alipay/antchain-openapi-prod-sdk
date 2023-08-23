// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class QueryDeepsecTsbmrqRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 应用来源
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // 环境id
        [NameInMap("env_id")]
        [Validation(Required=false)]
        public string EnvId { get; set; }

        // request id
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

        // 租户
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 商户id
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 应用来源名称, 也被用作渠道名称
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 是否测试流量, 测试流量会在处理过程中有特殊处理
        [NameInMap("test_flow")]
        [Validation(Required=false)]
        public bool? TestFlow { get; set; }

        // apdidToken
        [NameInMap("apdid_token")]
        [Validation(Required=true)]
        public string ApdidToken { get; set; }

    }

}
