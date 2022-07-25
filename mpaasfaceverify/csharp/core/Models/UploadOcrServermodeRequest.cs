// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MPAASFACEVERIFY.Models
{
    public class UploadOcrServermodeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 操作类型
        [NameInMap("operation_type")]
        [Validation(Required=false)]
        public string OperationType { get; set; }

        // 计费规则码
        [NameInMap("charge_code")]
        [Validation(Required=true)]
        public string ChargeCode { get; set; }

        // 预留扩展业务参数
        [NameInMap("extern_param")]
        [Validation(Required=false)]
        public string ExternParam { get; set; }

        // 对称密钥加密的ocr内容
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 非对称密钥加密后的对称密钥
        [NameInMap("content_sig")]
        [Validation(Required=true)]
        public string ContentSig { get; set; }

    }

}
