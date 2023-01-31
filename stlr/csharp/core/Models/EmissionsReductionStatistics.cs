// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 减排情况统计
    public class EmissionsReductionStatistics : TeaModel {
        // 减排方法
        [NameInMap("reduction_method")]
        [Validation(Required=true)]
        public string ReductionMethod { get; set; }

        // 减排方法名称
        [NameInMap("reduction_method_name")]
        [Validation(Required=true)]
        public string ReductionMethodName { get; set; }

        // 减排量
        [NameInMap("reduction_amount")]
        [Validation(Required=true)]
        public string ReductionAmount { get; set; }

        // 减排量占比
        [NameInMap("reduction_ratio")]
        [Validation(Required=true)]
        public string ReductionRatio { get; set; }

        // 减排量单位
        [NameInMap("data_unit")]
        [Validation(Required=true)]
        public string DataUnit { get; set; }

    }

}
