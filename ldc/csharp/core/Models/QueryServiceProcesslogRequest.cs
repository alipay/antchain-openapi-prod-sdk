// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class QueryServiceProcesslogRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 观测对象类型，RPV2，RP_STAGE，POD
        [NameInMap("object_kind")]
        [Validation(Required=true)]
        public string ObjectKind { get; set; }

        // 观测对象名称
        [NameInMap("object_name")]
        [Validation(Required=true)]
        public string ObjectName { get; set; }

        // 发布单对应的service_id
        [NameInMap("service_id")]
        [Validation(Required=true)]
        public string ServiceId { get; set; }

        // 发布单id
        [NameInMap("plan_id")]
        [Validation(Required=true)]
        public string PlanId { get; set; }

    }

}
