// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // ldc信息
    public class LdcInfoVO : TeaModel {
        // 是否开启
        [NameInMap("enable")]
        [Validation(Required=false)]
        public bool? Enable { get; set; }

        // 参数位置
        [NameInMap("param_location")]
        [Validation(Required=false)]
        public string ParamLocation { get; set; }

        // 参数名
        [NameInMap("param_key")]
        [Validation(Required=false)]
        public string ParamKey { get; set; }

        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

    }

}
