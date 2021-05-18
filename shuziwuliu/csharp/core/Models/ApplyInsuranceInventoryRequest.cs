// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class ApplyInsuranceInventoryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 库存申报交易号，调用方生成的唯一编码
        [NameInMap("trade_no")]
        [Validation(Required=true)]
        public string TradeNo { get; set; }

        // 库存申报编号
        [NameInMap("inventory_no")]
        [Validation(Required=true)]
        public string InventoryNo { get; set; }

        // 库存查询时间，yyyy-mm-dd，精确到（天）
        [NameInMap("inventory_query_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string InventoryQueryDate { get; set; }

        // 仓库代码
        // 
        // 
        [NameInMap("repository_code")]
        [Validation(Required=true)]
        public string RepositoryCode { get; set; }

        // 库存货物列表
        [NameInMap("inventory_cargos")]
        [Validation(Required=true)]
        public List<InventoryCargo> InventoryCargos { get; set; }

    }

}
