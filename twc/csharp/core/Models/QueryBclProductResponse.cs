// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryBclProductResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 商品编码
        [NameInMap("product_outer_id")]
        [Validation(Required=false)]
        public string ProductOuterId { get; set; }

        // 商品版本; 每个商品的编码+版本 唯一确认一个产品信息，必须为自然数，如"0","1","10"等
        [NameInMap("product_version")]
        [Validation(Required=false)]
        public string ProductVersion { get; set; }

        // 商品名称
        [NameInMap("product_name")]
        [Validation(Required=false)]
        public string ProductName { get; set; }

        // 商品官网价格，单位：分
        // 示例：856400，表示8564元，必须大于0
        [NameInMap("product_price")]
        [Validation(Required=false)]
        public long? ProductPrice { get; set; }

        // 一级行业代码
        [NameInMap("main_class")]
        [Validation(Required=false)]
        public string MainClass { get; set; }

        // 二级行业代码
        [NameInMap("sub_class")]
        [Validation(Required=false)]
        public string SubClass { get; set; }

        // 供应商名称
        // 商品从供应商采购为供应商名称，否则为平台自己名称，最大长度不能超过64
        [NameInMap("supplier_name")]
        [Validation(Required=false)]
        public string SupplierName { get; set; }

        // 供应商数字科技租户ID
        // 商品从供应商采购为供应商租户ID，否则为平台自己租户ID
        [NameInMap("supplier_id")]
        [Validation(Required=false)]
        public string SupplierId { get; set; }

        // 安装服务费，单位：分
        // 示例：150000则表示1500元，不能为负数
        [NameInMap("install_price")]
        [Validation(Required=false)]
        public long? InstallPrice { get; set; }

        // 商品来源，如 传 SUPPLIER 则表示来源为供应商。 取值范围如下： 【SUPPLIER： 供应商】 【LEASING_COMPANY ：租赁机构】
        [NameInMap("product_origin")]
        [Validation(Required=false)]
        public string ProductOrigin { get; set; }

        // 实际库存量
        [NameInMap("real_stock")]
        [Validation(Required=false)]
        public long? RealStock { get; set; }

        // 预估出货量
        [NameInMap("estimated_shipment")]
        [Validation(Required=false)]
        public long? EstimatedShipment { get; set; }

        // 商品详情
        [NameInMap("product_detail_info")]
        [Validation(Required=false)]
        public string ProductDetailInfo { get; set; }

        // 商品链接
        [NameInMap("product_url")]
        [Validation(Required=false)]
        public string ProductUrl { get; set; }

        // 商品品牌
        [NameInMap("product_brand")]
        [Validation(Required=false)]
        public string ProductBrand { get; set; }

        // 产品规格
        // 识别物品的编号，最大长度不能超过256
        [NameInMap("product_model")]
        [Validation(Required=false)]
        public string ProductModel { get; set; }

        // 免押金额，单位：分
        // 示例：15600表示免押金额为156元，不能为负数
        [NameInMap("deposit_price")]
        [Validation(Required=false)]
        public long? DepositPrice { get; set; }

    }

}
