// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateBclProductRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商品编码
        // 最大长度不能超过32
        [NameInMap("product_outer_id")]
        [Validation(Required=true, MaxLength=32)]
        public string ProductOuterId { get; set; }

        // 商品版本;
        // 每个商品的编码+版本 唯一确认一个产品信息，必须为自然数，如"0","1","10"等
        [NameInMap("product_version")]
        [Validation(Required=true, MaxLength=8)]
        public string ProductVersion { get; set; }

        // 商品名称，
        // 长度不超过64位
        [NameInMap("product_name")]
        [Validation(Required=true, MaxLength=64)]
        public string ProductName { get; set; }

        // 商品官网价格,单位为分。如：856400，表示8564元，大于0
        [NameInMap("product_price")]
        [Validation(Required=true)]
        public long? ProductPrice { get; set; }

        // 一级行业代码，
        // 本期暂时只支持 3C，后续扩充  
        [NameInMap("main_class")]
        [Validation(Required=true, MaxLength=32)]
        public string MainClass { get; set; }

        // 二级行业代码
        // 1.手机：3c_mobile
        // 2.电脑：3c_pc
        // 3.摄影：3c_camera
        // 4.办公设备：3c_office
        // 5.3C其他：3c_other
        [NameInMap("sub_class")]
        [Validation(Required=true, MaxLength=32)]
        public string SubClass { get; set; }

        // 供应商名称
        // 商品从供应商采购为供应商名称，否则为平台自己名称，最大长度不能超过64
        [NameInMap("supplier_name")]
        [Validation(Required=true, MaxLength=64)]
        public string SupplierName { get; set; }

        // 供应商数字科技租户ID
        // 商品从供应商采购为供应商租户ID，否则为平台自己租户ID
        [NameInMap("supplier_id")]
        [Validation(Required=true, MaxLength=8)]
        public string SupplierId { get; set; }

        // 安装服务费，单位为分，150000则表示1500元；
        // 不能为负数；
        [NameInMap("install_price")]
        [Validation(Required=false)]
        public long? InstallPrice { get; set; }

        // 商品来源
        // 长度不超过32位
        // 1.供应商：SUPPLIER
        // 2.租赁机构：LEASING_COMPANY
        [NameInMap("product_origin")]
        [Validation(Required=true, MaxLength=32)]
        public string ProductOrigin { get; set; }

        // 实际库存量，不能为负数
        [NameInMap("real_stock")]
        [Validation(Required=true)]
        public long? RealStock { get; set; }

        // 预估出货量,不能为负数
        [NameInMap("estimated_shipment")]
        [Validation(Required=true)]
        public long? EstimatedShipment { get; set; }

        // 商品详情
        // 最大长度不能超过256
        [NameInMap("product_detail_info")]
        [Validation(Required=true, MaxLength=256)]
        public string ProductDetailInfo { get; set; }

        // 商品链接
        // 最大长度不能超过256
        [NameInMap("product_url")]
        [Validation(Required=true, MaxLength=256)]
        public string ProductUrl { get; set; }

        // 商品品牌
        // 最大长度不能超过64
        [NameInMap("product_brand")]
        [Validation(Required=true, MaxLength=64)]
        public string ProductBrand { get; set; }

        // 产品规格
        // 识别物品的编号，最大长度不能超过256
        [NameInMap("product_model")]
        [Validation(Required=true, MaxLength=256)]
        public string ProductModel { get; set; }

        // 免押金额，单位：分
        // 示例：15600表示免押金额为156元，最小值需大于0
        [NameInMap("deposit_price")]
        [Validation(Required=false)]
        public long? DepositPrice { get; set; }

    }

}
