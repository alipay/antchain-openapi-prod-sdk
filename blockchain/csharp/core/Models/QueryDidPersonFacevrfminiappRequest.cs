// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryDidPersonFacevrfminiappRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 可能由于租户ID被多个调用方公用时候，使用bizCode作为隔离区分。
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

        // 请求的唯一标识，通常为32字符宽度的字符串内容，也可以只用UUID，此参数通常用来支持幂等，或者排查问题，调用方可以使用业务流水号。 与创建申请认证的接口的bizId目前不强校验一致性。
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 可信实人认证的唯一标识，用于核心查询认证结果的唯一标识。
        [NameInMap("certify_id")]
        [Validation(Required=true)]
        public string CertifyId { get; set; }

    }

}
