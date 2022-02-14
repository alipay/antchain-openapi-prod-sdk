// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 订单商品
    public class LeaseOrderProductInfo : TeaModel {
        // 商品编码 长度不可超过50
        [NameInMap("product_id")]
        [Validation(Required=true)]
        public string ProductId { get; set; }

        // 产品版本，每个版本可以对应一个价格 长度不可超过50，版本号未正整数，示例"123"
        [NameInMap("product_version")]
        [Validation(Required=true)]
        public string ProductVersion { get; set; }

        // 商品名称 长度不可超过50
        [NameInMap("product_name")]
        [Validation(Required=true)]
        public string ProductName { get; set; }

        // 采购价  精确到毫厘，即123400表示12.34元
        [NameInMap("product_price")]
        [Validation(Required=true)]
        public long? ProductPrice { get; set; }

        // 供应商Id，用以做索引 长度不可超过50
        [NameInMap("supplier_isv_account")]
        [Validation(Required=true)]
        public string SupplierIsvAccount { get; set; }

    }

}
