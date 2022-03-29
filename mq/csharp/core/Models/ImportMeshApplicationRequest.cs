// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class ImportMeshApplicationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 应用id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 应用名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 服务端get队列
        [NameInMap("pub_get_queue")]
        [Validation(Required=false)]
        public string PubGetQueue { get; set; }

        // 服务端put队列
        [NameInMap("pub_put_queue")]
        [Validation(Required=false)]
        public string PubPutQueue { get; set; }

        // 服务端rpc开关
        [NameInMap("pub_rpc_status")]
        [Validation(Required=false)]
        public long? PubRpcStatus { get; set; }

        // 客户端get队列
        [NameInMap("sub_get_queue")]
        [Validation(Required=false)]
        public string SubGetQueue { get; set; }

        // 客户端put队列
        [NameInMap("sub_put_queue")]
        [Validation(Required=false)]
        public string SubPutQueue { get; set; }

        // 客户端rpc分流比例
        [NameInMap("sub_rpc_scale")]
        [Validation(Required=false)]
        public long? SubRpcScale { get; set; }

        // 服务类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 服务id列表
        [NameInMap("list")]
        [Validation(Required=true)]
        public List<ApplicationServiceDTO> List { get; set; }

    }

}
