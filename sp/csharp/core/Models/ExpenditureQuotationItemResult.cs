// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SP.Models
{
    // 支出配置单对象结果详情
    public class ExpenditureQuotationItemResult : TeaModel {
        // 支出配置单商品维度的外部唯一id
        [NameInMap("out_unique_id")]
        [Validation(Required=true)]
        public string OutUniqueId { get; set; }

        // 支出配置单商品合约号
        [NameInMap("arrangement_no")]
        [Validation(Required=true)]
        public string ArrangementNo { get; set; }

    }

}
