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

        // 商品价格,单位为分。如：856400，表示8564元
        [NameInMap("product_price")]
        [Validation(Required=false)]
        public long? ProductPrice { get; set; }

        // 一级行业代码。 具体参考如下定义 格式如：【一级行业 -> 一级行业代码】： 【3C办公 -> 3C 】； 【IOT -> IOT 】； 【新能源 -> NE 】； 【泛行业 -> GENERAL 】
        [NameInMap("main_class")]
        [Validation(Required=false)]
        public string MainClass { get; set; }

        // 二级行业代码。 具体参考如下： 【二级行业 -> 二级行业代码】； 【手机 -> 3c_mobile】； 电脑 -> 3c_pc】； 【摄影 -> 3c_camera】； 办公设备 -> 3c_office】； 【3C-其他 -> 3c_other】； 【售卖柜 -> iot_auto_container】； 【驿站 -> iot_stage】； 【IOT-其他 -> iot_other】； 【电池 -> ne_battery】； 【电动车 -> ne_electric_car】； 【新能源-其他 -> ne_other】； 【家具 -> general_furniture】； 【家电 -> general_tv】； 【泛其他 -> general_other】；
        [NameInMap("sub_class")]
        [Validation(Required=false)]
        public string SubClass { get; set; }

        // 供应商名称,(采购模式)供应商模式则为供应商名称，否则平台自己名称
        [NameInMap("supplier_name")]
        [Validation(Required=false)]
        public string SupplierName { get; set; }

        // 金融科技租户id; 采购模式)提供商品方的金融科技租户id
        [NameInMap("supplier_id")]
        [Validation(Required=false)]
        public string SupplierId { get; set; }

        // 安装服务费，单位为分，150000则表示1500元；
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

        // 产品规格是用来识别物品的编号
        [NameInMap("product_model")]
        [Validation(Required=false)]
        public string ProductModel { get; set; }

        // 免押金额，单位分。如：15600表示免押金额为156元。
        [NameInMap("deposit_price")]
        [Validation(Required=false)]
        public long? DepositPrice { get; set; }

    }

}
