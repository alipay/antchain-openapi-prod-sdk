// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class InitDidAddvcHashRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 可验证声明hash
        [NameInMap("content_hash")]
        [Validation(Required=true)]
        public string ContentHash { get; set; }

        // 发起该交易的did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // issuer did对应的hash
        [NameInMap("issuer_hash")]
        [Validation(Required=true)]
        public string IssuerHash { get; set; }

        // 使用私钥对消息中其他字段进行签名
        [NameInMap("request_signature")]
        [Validation(Required=true)]
        public string RequestSignature { get; set; }

        // valid or invalid
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // subject的did计算的hash
        [NameInMap("subject_hash")]
        [Validation(Required=true)]
        public string SubjectHash { get; set; }

        // 可验证声明id
        [NameInMap("vcid")]
        [Validation(Required=true)]
        public string Vcid { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}
