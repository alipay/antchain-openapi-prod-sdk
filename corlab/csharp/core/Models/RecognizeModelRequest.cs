// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CORLAB.Models
{
    public class RecognizeModelRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 外部业务唯一标识id
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 业务域
        [NameInMap("domain_code")]
        [Validation(Required=true)]
        public string DomainCode { get; set; }

        // 模型状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 待计算的模型uuid
        [NameInMap("model_uuid")]
        [Validation(Required=true)]
        public string ModelUuid { get; set; }

        // map的映射的json字符串
        [NameInMap("input_context")]
        [Validation(Required=true)]
        public string InputContext { get; set; }

    }

}
