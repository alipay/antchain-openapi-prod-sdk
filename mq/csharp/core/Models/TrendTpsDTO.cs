// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 采集数据集合
    public class TrendTpsDTO : TeaModel {
        // 数据集合
        [NameInMap("records")]
        [Validation(Required=true)]
        public List<StatsDataDTO> Records { get; set; }

        // Table 的名称
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // 时间戳，单位毫秒
        [NameInMap("x_unit")]
        [Validation(Required=true)]
        public string XUnit { get; set; }

        // 纵轴单位
        // 
        [NameInMap("y_unit")]
        [Validation(Required=true)]
        public string YUnit { get; set; }

    }

}
