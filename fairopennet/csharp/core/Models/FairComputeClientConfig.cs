// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FAIROPENNET.Models
{
    // 初始化客户端配置，提供到FAIR节点的连接配置
    public class FairComputeClientConfig : TeaModel {
        // 服务host
        [NameInMap("host")]
        [Validation(Required=true)]
        public string Host { get; set; }

        // 服务端口
        [NameInMap("port")]
        [Validation(Required=true)]
        public long? Port { get; set; }

        // TLS连接配置【暂不支持】
        [NameInMap("ssl_cert_chain")]
        [Validation(Required=false)]
        public string SslCertChain { get; set; }

        // TLS连接配置【暂不支持】
        [NameInMap("ssl_private_key")]
        [Validation(Required=false)]
        public string SslPrivateKey { get; set; }

        // TLS连接配置【暂不支持】
        [NameInMap("ssl_trust_cert_collection")]
        [Validation(Required=false)]
        public string SslTrustCertCollection { get; set; }

        // TLS连接配置【暂不支持】
        [NameInMap("ssl_authority")]
        [Validation(Required=false)]
        public string SslAuthority { get; set; }

    }

}
