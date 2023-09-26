// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    public class RegisterChainsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 链唯一标识符
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 链配置的最后更新时间（用于标识版本）
        [NameInMap("ver")]
        [Validation(Required=true)]
        public long? Ver { get; set; }

        // 链类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 节点RPC接口地址
        [NameInMap("mychain_nodes")]
        [Validation(Required=false)]
        public List<string> MychainNodes { get; set; }

        // MyChain版本
        [NameInMap("mychain_type")]
        [Validation(Required=false)]
        public string MychainType { get; set; }

        // base64编码的JDS
        [NameInMap("mychain_truststore")]
        [Validation(Required=false)]
        public string MychainTruststore { get; set; }

        // -
        [NameInMap("mychain_truststore_password")]
        [Validation(Required=false)]
        public string MychainTruststorePassword { get; set; }

        // -
        [NameInMap("mychain_client_crt")]
        [Validation(Required=false)]
        public string MychainClientCrt { get; set; }

        // -
        [NameInMap("mychain_client_key")]
        [Validation(Required=false)]
        public string MychainClientKey { get; set; }

        // -
        [NameInMap("mychain_client_key_pwd")]
        [Validation(Required=false)]
        public string MychainClientKeyPwd { get; set; }

        // -
        [NameInMap("mychain_tls_algo")]
        [Validation(Required=false)]
        public string MychainTlsAlgo { get; set; }

        // -
        [NameInMap("mychain_identity_algo")]
        [Validation(Required=false)]
        public string MychainIdentityAlgo { get; set; }

        // 子链 groupID
        [NameInMap("mychain_groupid")]
        [Validation(Required=false)]
        public string MychainGroupid { get; set; }

        // 子链的父链ID
        [NameInMap("mychain_parent_bizid")]
        [Validation(Required=false)]
        public string MychainParentBizid { get; set; }

        // Aldaba 链节点地址
        [NameInMap("aldaba_nodes")]
        [Validation(Required=false)]
        public List<string> AldabaNodes { get; set; }

        // Aldaba 链使用的协议，支持 WebSocket / Tcp; 默认 WebSocket
        [NameInMap("aldaba_network_protocol")]
        [Validation(Required=false)]
        public string AldabaNetworkProtocol { get; set; }

        // Aldaba 链base64编码的JDS
        [NameInMap("aldaba_tls_root_truststore")]
        [Validation(Required=false)]
        public string AldabaTlsRootTruststore { get; set; }

        // Aldaba 链 JDS 密码
        [NameInMap("aldaba_tls_root_truststore_password")]
        [Validation(Required=false)]
        public string AldabaTlsRootTruststorePassword { get; set; }

        // Aldaba 链 base64编码的证书
        [NameInMap("aldaba_tls_client_certificate")]
        [Validation(Required=false)]
        public string AldabaTlsClientCertificate { get; set; }

        // Aldaba 链 base64编码的密钥
        [NameInMap("aldaba_tls_client_key")]
        [Validation(Required=false)]
        public string AldabaTlsClientKey { get; set; }

        // Aldaba 链密钥密码
        [NameInMap("aldaba_tls_client_key_password")]
        [Validation(Required=false)]
        public string AldabaTlsClientKeyPassword { get; set; }

        // Aldaba 链 base64 编码的 sender 密钥
        [NameInMap("aldaba_sender_key")]
        [Validation(Required=false)]
        public string AldabaSenderKey { get; set; }

        // Aldaba 链 sender 密钥的密码
        [NameInMap("aldaba_sender_key_password")]
        [Validation(Required=false)]
        public string AldabaSenderKeyPassword { get; set; }

    }

}
