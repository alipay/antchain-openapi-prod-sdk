// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    public class ExecClusterDnsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 环境id
        [NameInMap("env_id")]
        [Validation(Required=true)]
        public string EnvId { get; set; }

        // 产品码
        [NameInMap("prod_code")]
        [Validation(Required=true)]
        public string ProdCode { get; set; }

        // 应用名列表
        [NameInMap("app_names")]
        [Validation(Required=true)]
        public List<string> AppNames { get; set; }

        // dns域名的绑定/解绑
        [NameInMap("ops_action")]
        [Validation(Required=true)]
        public string OpsAction { get; set; }

        // 需要调用的adns所对应环境。
        // 例如A、B环境，A环境宕机了，此时需要调用B机房的adns进行A机房的环境域名解绑操作。
        // 如果不填，默认与env_id一致。
        [NameInMap("operation_env_id")]
        [Validation(Required=false)]
        public string OperationEnvId { get; set; }

    }

}
