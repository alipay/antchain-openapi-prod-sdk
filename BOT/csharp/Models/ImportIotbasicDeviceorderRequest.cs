// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ImportIotbasicDeviceorderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 所属业务
        [NameInMap("biz_scene")]
        [Validation(Required=true)]
        public string BizScene { get; set; }

        // 订单ID
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 订单状态: 已支付
        [NameInMap("order_status")]
        [Validation(Required=true)]
        public string OrderStatus { get; set; }

        // 订单采购设备清单
        [NameInMap("order_device_list")]
        [Validation(Required=true)]
        public List<IotBasicDeviceOrderItem> OrderDeviceList { get; set; }

        // 商家ID，唯一编号
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

        // 订单总金额，精确到小数后两位
        [NameInMap("total_amount")]
        [Validation(Required=true)]
        public string TotalAmount { get; set; }

    }

}
