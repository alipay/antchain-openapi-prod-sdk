// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 供应商商品信息
    public class SupplierProductItem : TeaModel {
        // 供应商名称
        [NameInMap("supplier_name")]
        [Validation(Required=false)]
        public string SupplierName { get; set; }

        // 商品型号
        [NameInMap("product_model")]
        [Validation(Required=true)]
        public string ProductModel { get; set; }

        // 供应商id
        [NameInMap("supplier_id")]
        [Validation(Required=false)]
        public string SupplierId { get; set; }

        // 商品唯一id
        [NameInMap("product_id")]
        [Validation(Required=true)]
        public string ProductId { get; set; }

        // 3C
        [NameInMap("main_class")]
        [Validation(Required=true)]
        public string MainClass { get; set; }

        // 预计发货量
        [NameInMap("estimated_shipment")]
        [Validation(Required=false)]
        public long? EstimatedShipment { get; set; }

        // 二级类目
        [NameInMap("sub_class")]
        [Validation(Required=true)]
        public string SubClass { get; set; }

        // 商品详情
        [NameInMap("product_detail_info")]
        [Validation(Required=true)]
        public string ProductDetailInfo { get; set; }

        // 商品品牌
        [NameInMap("product_brand")]
        [Validation(Required=true)]
        public string ProductBrand { get; set; }

        // 商品来源
        [NameInMap("product_origin")]
        [Validation(Required=true)]
        public long? ProductOrigin { get; set; }

        // 商品名称
        [NameInMap("product_name")]
        [Validation(Required=true)]
        public string ProductName { get; set; }

        // 商品版本
        [NameInMap("product_version")]
        [Validation(Required=true)]
        public long? ProductVersion { get; set; }

        // 商品安装费用
        [NameInMap("install_price")]
        [Validation(Required=false)]
        public long? InstallPrice { get; set; }

        // 实际库存
        [NameInMap("real_stock")]
        [Validation(Required=false)]
        public long? RealStock { get; set; }

        // 保证金
        [NameInMap("deposit_price")]
        [Validation(Required=false)]
        public long? DepositPrice { get; set; }

        // 商品url
        [NameInMap("product_url")]
        [Validation(Required=false)]
        public string ProductUrl { get; set; }

        // 官网价
        [NameInMap("product_price")]
        [Validation(Required=true)]
        public long? ProductPrice { get; set; }

        // 商品预留字段
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

    }

}
