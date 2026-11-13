// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVE.Models
{
    public class ExecMaasPriceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 模型名称
        [NameInMap("model_name")]
        [Validation(Required=true)]
        public string ModelName { get; set; }

        // 请求级定价维度
        [NameInMap("request_dimensions")]
        [Validation(Required=false)]
        public string RequestDimensions { get; set; }

        // 请求级计量指标
        [NameInMap("request_metrics")]
        [Validation(Required=false)]
        public string RequestMetrics { get; set; }

        // 输出单元列表
        [NameInMap("units")]
        [Validation(Required=false)]
        public List<PriceUnits> Units { get; set; }

    }

}
