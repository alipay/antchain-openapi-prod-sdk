// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 融资租赁里的产品详细信息
    public class ProductInfo : TeaModel {
        // 是否需要创建did
        [NameInMap("need_did")]
        [Validation(Required=false)]
        public bool? NeedDid { get; set; }

        // 产品品牌，长度不超过50
        [NameInMap("product_brand")]
        [Validation(Required=false)]
        public string ProductBrand { get; set; }

        // 产品Id，长度不超过50
        [NameInMap("product_id")]
        [Validation(Required=true)]
        public string ProductId { get; set; }

        // 唯一标识码，imeiID，长度不超过50
        [NameInMap("product_imei_id")]
        [Validation(Required=false)]
        public string ProductImeiId { get; set; }

        // 产品规格型号，长度不超过255
        [NameInMap("product_model")]
        [Validation(Required=false)]
        public string ProductModel { get; set; }

        // 产品名称，长度不超过50
        [NameInMap("product_name")]
        [Validation(Required=true)]
        public string ProductName { get; set; }

        // 产品数量
        [NameInMap("product_number")]
        [Validation(Required=true)]
        public long? ProductNumber { get; set; }

        // 产品采购含税价 精确到毫厘，即123400表示12.34元
        [NameInMap("product_price")]
        [Validation(Required=true)]
        public long? ProductPrice { get; set; }

        // 供应商id
        [NameInMap("supplier_id")]
        [Validation(Required=false)]
        public string SupplierId { get; set; }

        // 供应商对应的产品版本，每个版本可以对应一个价格
        [NameInMap("supplier_version")]
        [Validation(Required=false)]
        public string SupplierVersion { get; set; }

        // 额外字段
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

    }

}
