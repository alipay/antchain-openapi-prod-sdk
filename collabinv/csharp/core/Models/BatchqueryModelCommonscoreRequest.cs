// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COLLABINV.Models
{
    public class BatchqueryModelCommonscoreRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户ID
        [NameInMap("user_ids")]
        [Validation(Required=true)]
        public List<string> UserIds { get; set; }

        // 用户授权编码
        [NameInMap("auth_nos")]
        [Validation(Required=true)]
        public List<string> AuthNos { get; set; }

        // 模型编码
        [NameInMap("model_code")]
        [Validation(Required=true)]
        public string ModelCode { get; set; }

        // 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
        [NameInMap("user_id_type")]
        [Validation(Required=true)]
        public string UserIdType { get; set; }

        // user_id 散列类型: "MD5"：MD5（小写）, "SHA256" ： SHA256（小写）， "SM3"： SM3（小写）
        [NameInMap("hash_type")]
        [Validation(Required=true)]
        public string HashType { get; set; }

        // 客户编码
        [NameInMap("customer_code")]
        [Validation(Required=true)]
        public string CustomerCode { get; set; }

        // 流水号，串联链路用，非必填
        [NameInMap("trans_no")]
        [Validation(Required=false)]
        public string TransNo { get; set; }

        // hash_type类型的散列后的操作，默认为空不加密。 如启用，需要对散列后的user_id 加密，可选用如下算法，类型1、AES/ECB/PKCS5PADDING 在加密后的二进制需要以字符集UTF-8，编码base64 方式赋值给user_id传输。 示例：AES秘钥：base64_aes_key = "CZqWzQ5JL8s5Zx2XVpGZGw=="，报文：plaintext = "Hello, 蚂蚁。" ，使用算法： AES/ECB/PKCS5PADDING ；密文：SI1wU1ePSFoMy5YzuxclFkbZ/FIXUHPRDbKBW85WolY=，配置了此项user_id应该传输此密文。
        [NameInMap("user_id_encrypt_type")]
        [Validation(Required=false)]
        public string UserIdEncryptType { get; set; }

    }

}
