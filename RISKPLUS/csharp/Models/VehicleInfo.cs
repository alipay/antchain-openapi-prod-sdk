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
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("biz_order_no")]
        [Validation(Required=true)]
        public string BizOrderNo { get; set; }

        // 订单[分期]金额，单位：元
        /// <summary>
        /// <b>Example:</b>
        /// <para>199.88</para>
        /// </summary>
        [NameInMap("trade_amount")]
        [Validation(Required=true)]
        public string TradeAmount { get; set; }

        // 订单分期金额，单位：元
        /// <summary>
        /// <b>Example:</b>
        /// <para>188.88</para>
        /// </summary>
        [NameInMap("installment_amount")]
        [Validation(Required=false)]
        public string InstallmentAmount { get; set; }

        // 首付金额，单位：元
        /// <summary>
        /// <b>Example:</b>
        /// <para>199.00</para>
        /// </summary>
        [NameInMap("down_payment")]
        [Validation(Required=false)]
        public string DownPayment { get; set; }

        // pad设备提供
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("wifi_mac")]
        [Validation(Required=false)]
        public string WifiMac { get; set; }

        // pad-经度
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("longitude")]
        [Validation(Required=false)]
        public string Longitude { get; set; }

        // pad-纬度
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("latitude")]
        [Validation(Required=false)]
        public string Latitude { get; set; }

        // 车辆类型（摩托车）：1-新车、0-二手车
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("vehicle_type")]
        [Validation(Required=false)]
        public string VehicleType { get; set; }

        // SN码/中控号(授信后放款前)
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("sn")]
        [Validation(Required=false)]
        public string Sn { get; set; }

        // 车驾号(授信后放款前)
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("frame_no")]
        [Validation(Required=false)]
        public string FrameNo { get; set; }

        // SKU ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("sku")]
        [Validation(Required=true)]
        public string Sku { get; set; }

        // 颜色
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("color")]
        [Validation(Required=false)]
        public string Color { get; set; }

        // 车型关键词
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("model_keyword")]
        [Validation(Required=false)]
        public string ModelKeyword { get; set; }

        // 续航里程
        /// <summary>
        /// <b>Example:</b>
        /// <para>1024</para>
        /// </summary>
        [NameInMap("range")]
        [Validation(Required=false)]
        public string Range { get; set; }

        // 新车指导价，单位：元
        /// <summary>
        /// <b>Example:</b>
        /// <para>199.88</para>
        /// </summary>
        [NameInMap("guide_price")]
        [Validation(Required=true)]
        public string GuidePrice { get; set; }

        // 售价，单位：元
        /// <summary>
        /// <b>Example:</b>
        /// <para>1999.98</para>
        /// </summary>
        [NameInMap("selling_price")]
        [Validation(Required=true)]
        public string SellingPrice { get; set; }

        // 品牌
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("brand")]
        [Validation(Required=false)]
        public string Brand { get; set; }

        // 车型
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("model")]
        [Validation(Required=false)]
        public string Model { get; set; }

        // 年款，yyyy
        /// <summary>
        /// <b>Example:</b>
        /// <para>yyyy</para>
        /// </summary>
        [NameInMap("model_year")]
        [Validation(Required=false)]
        public string ModelYear { get; set; }

        // 公里数，Odometer
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("odo")]
        [Validation(Required=false)]
        public string Odo { get; set; }

        // 首次上牌时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("first_reg_date")]
        [Validation(Required=false)]
        public string FirstRegDate { get; set; }

        // 过户次数，Ownership Transfer Records
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("otr")]
        [Validation(Required=false)]
        public string Otr { get; set; }

        // 配件信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("parts")]
        [Validation(Required=false)]
        public string Parts { get; set; }

    }

}
