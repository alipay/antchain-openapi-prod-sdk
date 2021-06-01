// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateLeaseProductinfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 合约id
        [NameInMap("application_id")]
        [Validation(Required=false)]
        public string ApplicationId { get; set; }

        // 保证金  精确到毫厘，即123400表示12.34元
        [NameInMap("deposit_price")]
        [Validation(Required=true)]
        public long? DepositPrice { get; set; }

        // 安装拆卸费 精确到毫厘，即123400表示12.34元
        [NameInMap("install_price")]
        [Validation(Required=true)]
        public long? InstallPrice { get; set; }

        // 租赁服务平台id
        [NameInMap("lease_id")]
        [Validation(Required=true)]
        public string LeaseId { get; set; }

        // 一级分类
        [NameInMap("main_class")]
        [Validation(Required=true)]
        public string MainClass { get; set; }

        // 商品编码 长度不可超过50
        [NameInMap("product_id")]
        [Validation(Required=true)]
        public string ProductId { get; set; }

        // 商品名称
        [NameInMap("product_name")]
        [Validation(Required=true)]
        public string ProductName { get; set; }

        // 采购价  精确到毫厘，即123400表示12.34元
        [NameInMap("product_price")]
        [Validation(Required=true)]
        public long? ProductPrice { get; set; }

        // 出租详细信息
        [NameInMap("rentinfos")]
        [Validation(Required=true)]
        public List<RentInfo> Rentinfos { get; set; }

        // 二级分类
        [NameInMap("sub_class")]
        [Validation(Required=true)]
        public string SubClass { get; set; }

        // 供应商id
        [NameInMap("supplier_id")]
        [Validation(Required=false)]
        public string SupplierId { get; set; }

        // 供应商
        [NameInMap("supplier_name")]
        [Validation(Required=true)]
        public string SupplierName { get; set; }

        // 供应商对该产品版本
        [NameInMap("supplier_version")]
        [Validation(Required=false)]
        public string SupplierVersion { get; set; }

        // 商品目录额外信息
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // 商品规格
        [NameInMap("product_model")]
        [Validation(Required=false)]
        public string ProductModel { get; set; }

    }

}
