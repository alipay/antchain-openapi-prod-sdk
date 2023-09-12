// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_55afdde95cc7448bad87a98d904c1f44.Models
{
    public class QueryUniversalsaasDigitalhumanRobotRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // targetMethod；数字人目标方法调用
        [NameInMap("target_method")]
        [Validation(Required=true)]
        public string TargetMethod { get; set; }

        // 	
        // 租户code&租户id，对于子部门客户需要上传子部门id
        [NameInMap("tenant_code")]
        [Validation(Required=false)]
        public string TenantCode { get; set; }

        // method_params:对应target_method请求方法的具体传参值k-v map
        [NameInMap("method_params")]
        [Validation(Required=false)]
        public string MethodParams { get; set; }

    }

}
