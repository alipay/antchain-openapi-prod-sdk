// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 订单车辆信息
    public class VehicleInfo : TeaModel {
        // 流量方购物订单号
        [NameInMap("biz_order_no")]
        [Validation(Required=false)]
        public string BizOrderNo { get; set; }

        // 订单[分期]金额，单位：元
        [NameInMap("trade_amount")]
        [Validation(Required=false)]
        public string TradeAmount { get; set; }

        // 首付金额，单位：元
        [NameInMap("down_payment")]
        [Validation(Required=false)]
        public string DownPayment { get; set; }

        // 新车指导价，单位：元
        [NameInMap("guide_price")]
        [Validation(Required=false)]
        public string GuidePrice { get; set; }

        // 售价，单位：元
        [NameInMap("selling_price")]
        [Validation(Required=false)]
        public string SellingPrice { get; set; }

        // 车驾号/SN码，车辆唯一标识
        [NameInMap("sn")]
        [Validation(Required=false)]
        public string Sn { get; set; }

        // SKU ID
        [NameInMap("sku")]
        [Validation(Required=false)]
        public string Sku { get; set; }

        // 品牌
        [NameInMap("brand")]
        [Validation(Required=false)]
        public string Brand { get; set; }

        // 车型
        [NameInMap("model")]
        [Validation(Required=false)]
        public string Model { get; set; }

        // 年款，yyyy
        [NameInMap("model_year")]
        [Validation(Required=false)]
        public string ModelYear { get; set; }

        // 颜色
        [NameInMap("color")]
        [Validation(Required=false)]
        public string Color { get; set; }

        // 续航里程
        [NameInMap("range")]
        [Validation(Required=false)]
        public string Range { get; set; }

        // 配件信息
        [NameInMap("parts")]
        [Validation(Required=false)]
        public string Parts { get; set; }

        // 公里数，Odometer
        [NameInMap("odo")]
        [Validation(Required=false)]
        public string Odo { get; set; }

        // 首次上牌时间
        [NameInMap("first_reg_date")]
        [Validation(Required=false)]
        public string FirstRegDate { get; set; }

        // 过户次数，Ownership Transfer Records
        [NameInMap("otr")]
        [Validation(Required=false)]
        public string Otr { get; set; }

    }

}
