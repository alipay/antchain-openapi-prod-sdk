// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ASSET.Models
{
    // 过程转化指标结果
    public class ProcessConversionMetricData : TeaModel {
        // 发放数
        [NameInMap("send")]
        [Validation(Required=true)]
        public long? Send { get; set; }

        // 核销数
        [NameInMap("used")]
        [Validation(Required=true)]
        public long? Used { get; set; }

        // 核销转化率
        [NameInMap("rate")]
        [Validation(Required=true)]
        public string Rate { get; set; }

    }

}
