// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Osp.Models
{
    public class GetInstancesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 共享中间件实例id
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 租户name
        [NameInMap("middleware_tenant")]
        [Validation(Required=false)]
        public string MiddlewareTenant { get; set; }

        // workspace name
        [NameInMap("middleware_workspace")]
        [Validation(Required=false)]
        public string MiddlewareWorkspace { get; set; }

    }

}
