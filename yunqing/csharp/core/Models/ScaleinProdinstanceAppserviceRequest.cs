// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    public class ScaleinProdinstanceAppserviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 应用服务实例唯一标识。
        [NameInMap("app_service_id")]
        [Validation(Required=true)]
        public string AppServiceId { get; set; }

        // 执行运维操作的目标容器列表。
        [NameInMap("container_ids")]
        [Validation(Required=true)]
        public List<string> ContainerIds { get; set; }

        // 操作人id
        [NameInMap("submitter_id")]
        [Validation(Required=false)]
        public string SubmitterId { get; set; }

    }

}
