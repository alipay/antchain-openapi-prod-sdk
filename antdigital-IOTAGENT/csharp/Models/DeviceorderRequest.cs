// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 订单批量同步单个请求体
    public class DeviceorderRequest : TeaModel {
        // 订单id
        /// <summary>
        /// <b>Example:</b>
        /// <para>20034932</para>
        /// </summary>
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 支付状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>PAID,UNPAID,PAYMENT_FAILED</para>
        /// </summary>
        [NameInMap("order_status")]
        [Validation(Required=true)]
        public string OrderStatus { get; set; }

        // 商家唯一id
        /// <summary>
        /// <b>Example:</b>
        /// <para>30099234</para>
        /// </summary>
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 设备订单元素集合
        [NameInMap("order_device_list")]
        [Validation(Required=true)]
        public List<IotBasicDeviceOrderItem> OrderDeviceList { get; set; }

        // 订单总金额，精确到小数点后两位
        /// <summary>
        /// <b>Example:</b>
        /// <para>22220.98</para>
        /// </summary>
        [NameInMap("total_amount")]
        [Validation(Required=true)]
        public string TotalAmount { get; set; }

    }

}
