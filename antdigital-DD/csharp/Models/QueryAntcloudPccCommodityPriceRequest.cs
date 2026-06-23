// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    public class QueryAntcloudPccCommodityPriceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 模型名称，精确匹配
        [NameInMap("model")]
        [Validation(Required=false)]
        public string Model { get; set; }

        // 供应商
        [NameInMap("provider")]
        [Validation(Required=false)]
        public string Provider { get; set; }

        // 收费项（定价对象）
        [NameInMap("charge_item")]
        [Validation(Required=false)]
        public string ChargeItem { get; set; }

        // 定价状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 页码
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 每页数据量
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 商品code
        [NameInMap("commodity_code")]
        [Validation(Required=true)]
        public string CommodityCode { get; set; }

    }

}
