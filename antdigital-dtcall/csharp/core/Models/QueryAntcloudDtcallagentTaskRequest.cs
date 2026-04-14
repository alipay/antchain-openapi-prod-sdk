// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTCALL.Models
{
    public class QueryAntcloudDtcallagentTaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 实例编码
        [NameInMap("instance_code")]
        [Validation(Required=true)]
        public string InstanceCode { get; set; }

        // 任务名称，支持模糊匹配
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

    }

}
