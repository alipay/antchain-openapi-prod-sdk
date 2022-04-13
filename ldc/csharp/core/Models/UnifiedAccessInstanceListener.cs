// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 统一接入实例监听配置（http/https）
    public class UnifiedAccessInstanceListener : TeaModel {
        // CA证书ID。 若既上传CA证书又上传服务器证书，即采用双向认证。 若用户只上传服务器证书，即为单向认证。
        [NameInMap("ca_certificate_id")]
        [Validation(Required=false)]
        public string CaCertificateId { get; set; }

        // 统一接入实例监听端口。 取值：1-65535。
        [NameInMap("listener_port")]
        [Validation(Required=true)]
        public long? ListenerPort { get; set; }

        // 协议类型，目前支持http和https两种
        [NameInMap("protocol")]
        [Validation(Required=true)]
        public string Protocol { get; set; }

        // 是否使用websocket连接方式
        [NameInMap("websocket_connect")]
        [Validation(Required=true)]
        public bool? WebsocketConnect { get; set; }

    }

}
