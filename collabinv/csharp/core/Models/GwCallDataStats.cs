// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COLLABINV.Models
{
    // 调用统计
    public class GwCallDataStats : TeaModel {
        // 租户
        [NameInMap("invoke_tenant")]
        [Validation(Required=false)]
        public string InvokeTenant { get; set; }

        // 租户ID
        [NameInMap("invoke_tenant_id")]
        [Validation(Required=false)]
        public string InvokeTenantId { get; set; }

        // 公key
        [NameInMap("access_key")]
        [Validation(Required=false)]
        public string AccessKey { get; set; }

        // 调用数量
        [NameInMap("invoke_count")]
        [Validation(Required=false)]
        public string InvokeCount { get; set; }

        // 调用查得统计
        [NameInMap("success_count")]
        [Validation(Required=false)]
        public string SuccessCount { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

    }

}
