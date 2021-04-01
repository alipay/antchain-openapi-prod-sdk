// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartVcVcrepositoryWriteRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 指定情况跟随 auth_did_list，如果auth_did_list不指定，则此字段无需指定，否则是与auth_did_list长度相同，并且对应auth_did_list的did的公钥加密AES密钥的结果
        [NameInMap("auth_access_key_list")]
        [Validation(Required=false)]
        public List<string> AuthAccessKeyList { get; set; }

        // 配置此列表，则说明需要并且控制访问权限，此列表为初始配置的did名单，拥有对此颁发证书的读取权限。 如果不配置此列表，则默认将明文存储此证书，任何did都可以访问此证书声明内容。
        [NameInMap("auth_did_list")]
        [Validation(Required=false)]
        public List<string> AuthDidList { get; set; }

        // 写入VC数据的did，通常为证书VC的颁发者issuer的did。
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 对当前VC Repository操作的描述，signature字段需要包含此操作的描述，最终会记录在VC Repository连接的链上，可追溯此operation操作记录。
        [NameInMap("operation")]
        [Validation(Required=true)]
        public string Operation { get; set; }

        // 写数据的did对应使用公钥做的数据签名，确保数据准确性。
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

        // 可验证声明的完整声明，其中claim字段可以已被加密保护 {"content":{"verion":"0.7.0","issuer":"xxxx","subject":"xxxx","expire":1530735444,"issucanceDate":1530735000,"id":"XXXX","claim":{//用户自定义，可加密处理},"status":{"type":"XXXX","id":"XXXXX"}},"proof":{"type":"ecdsa","created":"2018-06-18T21:19:10Z","verificationMethod":"XXXX","signatureValue":"XXXXX"}}
        [NameInMap("vc_content")]
        [Validation(Required=true)]
        public string VcContent { get; set; }

    }

}
