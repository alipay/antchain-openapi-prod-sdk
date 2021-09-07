// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 排放范围排放数据统计
    public class EmissionsScopeStatistics : TeaModel {
        // 盘查范围编码
        [NameInMap("inventory_scope_no")]
        [Validation(Required=true)]
        public string InventoryScopeNo { get; set; }

        // 盘查范围名称
        [NameInMap("inventory_scope_name")]
        [Validation(Required=true)]
        public string InventoryScopeName { get; set; }

        // 碳排放量
        [NameInMap("emissions")]
        [Validation(Required=true)]
        public long? Emissions { get; set; }

        // 排放占比
        [NameInMap("percentage")]
        [Validation(Required=true)]
        public long? Percentage { get; set; }

        // 范围下各分类排放数据
        [NameInMap("category_emissions_list")]
        [Validation(Required=true)]
        public List<EmissionsCategoryStatistics> CategoryEmissionsList { get; set; }

    }

}
