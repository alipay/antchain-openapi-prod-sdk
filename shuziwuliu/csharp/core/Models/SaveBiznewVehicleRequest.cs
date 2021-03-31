// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class SaveBiznewVehicleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 托运订单号
        // 
        // 
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 拖车单号
        // 
        // 
        [NameInMap("vehicle_code")]
        [Validation(Required=true)]
        public string VehicleCode { get; set; }

        // 货代did
        [NameInMap("forwarder_did")]
        [Validation(Required=true)]
        public string ForwarderDid { get; set; }

        // 拖车总金额 [业务必填]
        [NameInMap("vehicle_total_amount")]
        [Validation(Required=false)]
        public string VehicleTotalAmount { get; set; }

        // 拖车运费金额 [业务必填]
        [NameInMap("vehicle_amount")]
        [Validation(Required=false)]
        public string VehicleAmount { get; set; }

        // 拖车杂费金额 [业务必填]
        [NameInMap("vehicle_charges")]
        [Validation(Required=false)]
        public string VehicleCharges { get; set; }

        // 币种 [业务必填]
        [NameInMap("currency")]
        [Validation(Required=false)]
        public string Currency { get; set; }

        // 箱号箱ID
        // 
        // 
        [NameInMap("container_id_info_list")]
        [Validation(Required=false)]
        public List<ContainerIdInfo> ContainerIdInfoList { get; set; }

    }

}
