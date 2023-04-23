// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PARTNER.Models
{
    // 支出配置单对象
    public class ExpenditureQuotationItem : TeaModel {
        // 外部唯一id，sku-id
        [NameInMap("out_unique_id")]
        [Validation(Required=true)]
        public string OutUniqueId { get; set; }

        // 配置单商品名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 支出配置单对象描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 预估交易金额（分）
        [NameInMap("predict_transaction_amount")]
        [Validation(Required=true)]
        public long? PredictTransactionAmount { get; set; }

    }

}
