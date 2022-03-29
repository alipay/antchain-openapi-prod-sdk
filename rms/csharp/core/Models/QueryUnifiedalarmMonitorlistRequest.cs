// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryUnifiedalarmMonitorlistRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 租户名称
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public long? TenantId { get; set; }

        // 应用名称
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 查询哪个技术栈下的告警指标。
        [NameInMap("stack_id")]
        [Validation(Required=true)]
        public long? StackId { get; set; }

    }

}
