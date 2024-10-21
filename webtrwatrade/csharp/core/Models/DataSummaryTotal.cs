// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    // 总览统计数据
    public class DataSummaryTotal : TeaModel {
        // 原始币种资产价值列表
        [NameInMap("total_value_list")]
        [Validation(Required=true)]
        public List<MultiCurrencyMoney> TotalValueList { get; set; }

        // 总项目数
        [NameInMap("total_projects")]
        [Validation(Required=true)]
        public long? TotalProjects { get; set; }

        // 总用户数
        [NameInMap("total_holders")]
        [Validation(Required=true)]
        public long? TotalHolders { get; set; }

        // 最后更新时间戳
        [NameInMap("last_updated_time")]
        [Validation(Required=true)]
        public long? LastUpdatedTime { get; set; }

    }

}
