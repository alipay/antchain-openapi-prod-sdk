// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class QueryZolozmetaThreemetamobilereuseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 外部请求ID，由调用方自行生成并自行保证唯一，以便问题定位。
        [NameInMap("outer_order_no")]
        [Validation(Required=true)]
        public string OuterOrderNo { get; set; }

        // 手机号
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 日期
        [NameInMap("date")]
        [Validation(Required=true)]
        public string Date { get; set; }

        // 运营商类型
        [NameInMap("carrier")]
        [Validation(Required=true)]
        public string Carrier { get; set; }

        // 扩展参数
        [NameInMap("extern_param")]
        [Validation(Required=true)]
        public string ExternParam { get; set; }

    }

}
