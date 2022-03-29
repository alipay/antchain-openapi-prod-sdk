// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 该集群当前在线客户端信息
    public class ConnectionDTO : TeaModel {
        // 该消费实例的地址和端口
        [NameInMap("client_addr")]
        [Validation(Required=true)]
        public string ClientAddr { get; set; }

        // 消费实例的 ID
        [NameInMap("client_id")]
        [Validation(Required=true)]
        public string ClientId { get; set; }

        // 消费端语言
        [NameInMap("language")]
        [Validation(Required=true)]
        public string Language { get; set; }

        // 宿主机 IP 或公网 IP
        [NameInMap("remote_ip")]
        [Validation(Required=true)]
        public string RemoteIp { get; set; }

        // 消费端版本
        [NameInMap("version")]
        [Validation(Required=true)]
        public string Version { get; set; }

    }

}
