// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_245215eadadd4dc9bba177d6ba6d593d.Models
{
    public class SubmitUniversalsaasDigitalhumanOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 渠道类型
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 操作类型
        [NameInMap("action_type")]
        [Validation(Required=true)]
        public string ActionType { get; set; }

        // 业务类型
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 业务id
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 业务自定义信息
        [NameInMap("biz_data")]
        [Validation(Required=true)]
        public string BizData { get; set; }

    }

}
