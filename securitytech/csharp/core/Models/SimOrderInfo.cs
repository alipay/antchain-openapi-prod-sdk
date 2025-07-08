// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 两轮车一体机订单信息
    public class SimOrderInfo : TeaModel {
        // 订单ID
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 必填	销售id
        [NameInMap("sales_id")]
        [Validation(Required=true)]
        public string SalesId { get; set; }

        // 车辆SN号
        [NameInMap("sn")]
        [Validation(Required=false)]
        public string Sn { get; set; }

        // 用户手机号
        [NameInMap("mobile_no")]
        [Validation(Required=false)]
        public string MobileNo { get; set; }

        // 订单时间，格式yyyy-MM-dd HH:mm:ss
        [NameInMap("order_time")]
        [Validation(Required=true)]
        public string OrderTime { get; set; }

        // 支付类型，枚举值FULL（全额付款）, INSTALLMENT（分期付款）
        [NameInMap("payment_type")]
        [Validation(Required=false)]
        public string PaymentType { get; set; }

        // 支付时间，格式yyyy-MM-dd HH:mm:ss
        [NameInMap("payment_time")]
        [Validation(Required=false)]
        public string PaymentTime { get; set; }

        // 总金额，单位元
        [NameInMap("total_amount")]
        [Validation(Required=false)]
        public string TotalAmount { get; set; }

        // 订单状态，枚举值
        // UNPAID（未支付），
        // PAID（已支付），
        // CANCEL（订单取消），
        // PENDING（支付中），
        // FAILED（支付失败）
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 车辆SKU名字
        [NameInMap("sku_name")]
        [Validation(Required=false)]
        public string SkuName { get; set; }

        // 车型
        [NameInMap("vehicle_model")]
        [Validation(Required=false)]
        public string VehicleModel { get; set; }

        // 颜色
        [NameInMap("color")]
        [Validation(Required=false)]
        public string Color { get; set; }

        // 配件信息，逗号分隔
        [NameInMap("accessories")]
        [Validation(Required=false)]
        public string Accessories { get; set; }

        // 图片json
        [NameInMap("images")]
        [Validation(Required=false)]
        public string Images { get; set; }

        // 拓展字段，json格式
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

    }

}
