// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 分类碳排放量
    public class EmissionsCategoryStatistics : TeaModel {
        // 排放类型编码
        [NameInMap("emission_dategory_no")]
        [Validation(Required=true)]
        public string EmissionDategoryNo { get; set; }

        // 排放类型名称
        [NameInMap("emission_category_name")]
        [Validation(Required=true)]
        public string EmissionCategoryName { get; set; }

        // 排放量
        [NameInMap("emissions")]
        [Validation(Required=true)]
        public long? Emissions { get; set; }

    }

}
