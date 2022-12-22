// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYTC.Models
{
    public class AddCodeDepositRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务类型，客户自定义标签
        [NameInMap("biz_type")]
        [Validation(Required=true, MaxLength=32)]
        public string BizType { get; set; }

        // 存证内容
        // 
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
        [NameInMap("biz_labels")]
        [Validation(Required=false)]
        public List<string> BizLabels { get; set; }

    }

}
