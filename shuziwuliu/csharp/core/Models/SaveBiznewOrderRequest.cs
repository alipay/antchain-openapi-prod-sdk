// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class SaveBiznewOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 托运订单号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 托运人did [业务必填]
        [NameInMap("consignor_did")]
        [Validation(Required=false)]
        public string ConsignorDid { get; set; }

        // 承运人did [业务必填]
        [NameInMap("carrier_did")]
        [Validation(Required=false)]
        public string CarrierDid { get; set; }

        // 订舱单号列表
        [NameInMap("booking_info_list")]
        [Validation(Required=false)]
        public List<BookingNoInfo> BookingInfoList { get; set; }

        // 拖车单号
        [NameInMap("vehicle_code_list")]
        [Validation(Required=false)]
        public List<string> VehicleCodeList { get; set; }

        // 报关单号
        [NameInMap("customs_code_list")]
        [Validation(Required=false)]
        public List<string> CustomsCodeList { get; set; }

        // 订单确认 CREATE/FINISH (创建/确认)  [业务必填]
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
