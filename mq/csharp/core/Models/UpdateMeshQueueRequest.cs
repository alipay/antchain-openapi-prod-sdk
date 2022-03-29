// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class UpdateMeshQueueRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 关联应用名
        [NameInMap("asso_app")]
        [Validation(Required=true)]
        public string AssoApp { get; set; }

        // 通道名
        [NameInMap("channel")]
        [Validation(Required=true)]
        public string Channel { get; set; }

        // 队列id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 队列管理器ip
        [NameInMap("ip")]
        [Validation(Required=true)]
        public string Ip { get; set; }

        // 队列管理器名
        [NameInMap("manager")]
        [Validation(Required=true)]
        public string Manager { get; set; }

        // 队列名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 队列管理器端口
        [NameInMap("port")]
        [Validation(Required=true)]
        public string Port { get; set; }

        // 队列类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
