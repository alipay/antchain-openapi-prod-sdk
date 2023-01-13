// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 数据洞察折线图
    public class ChainInsightHistogram : TeaModel {
        // 横坐标名称
        [NameInMap("x_label")]
        [Validation(Required=false)]
        public string XLabel { get; set; }

        // 纵坐标名称
        [NameInMap("y_label")]
        [Validation(Required=false)]
        public string YLabel { get; set; }

        // 坐标集，按x增序
        [NameInMap("points")]
        [Validation(Required=true)]
        public List<ChainInsightPoint> Points { get; set; }

        // 表格的名称或维度名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

    }

}
