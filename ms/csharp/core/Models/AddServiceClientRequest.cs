// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class AddServiceClientRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // middleware instance id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 服务器 IP 列表，多个 IP 间以英文逗号分隔
        [NameInMap("server_ips")]
        [Validation(Required=true)]
        public string ServerIps { get; set; }

        // Client operation type: (logout)
        [NameInMap("operation_type")]
        [Validation(Required=false)]
        public string OperationType { get; set; }

    }

}
