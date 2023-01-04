// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateEncryptTextRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户本地加密后的存证内容
        [NameInMap("notary_content")]
        [Validation(Required=true)]
        public string NotaryContent { get; set; }

        // 存证阶段
        [NameInMap("phase")]
        [Validation(Required=true)]
        public string Phase { get; set; }

        // 存证事务id
        [NameInMap("transaction_id")]
        [Validation(Required=true)]
        public string TransactionId { get; set; }

        // 存证拓展信息
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

        // 存证类型，支持
        // ● TEXT_HASH：文本哈希
        // ● TEXT_RAW：源文本（默认）
        [NameInMap("text_notary_type")]
        [Validation(Required=false)]
        public string TextNotaryType { get; set; }

        // 哈希算法，当存证类型为TEXT_HASH时必填，目前支持两种
        // ● SHA256
        // ● SM3
        [NameInMap("hash_algorithm")]
        [Validation(Required=false)]
        public string HashAlgorithm { get; set; }

    }

}
