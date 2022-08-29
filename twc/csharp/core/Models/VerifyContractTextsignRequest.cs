// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class VerifyContractTextsignRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 注册的平台方用户id
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 签名原文本
        [NameInMap("origin_text")]
        [Validation(Required=true)]
        public string OriginText { get; set; }

        // 文本签名值
        [NameInMap("sign_result")]
        [Validation(Required=true)]
        public string SignResult { get; set; }

    }

}
