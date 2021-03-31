// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class SaveBizVehicleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        [NameInMap("action")]
        [Validation(Required=false)]
        public string Action { get; set; }

        // 箱子信息 业务必填
        [NameInMap("container_params")]
        [Validation(Required=false)]
        public List<VehicleContainerParam> ContainerParams { get; set; }

        // 货代did
        [NameInMap("forwarder_did")]
        [Validation(Required=true)]
        public string ForwarderDid { get; set; }

        // 订单号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 拖车单号
        [NameInMap("vehicle_code")]
        [Validation(Required=true)]
        public string VehicleCode { get; set; }

        // 车牌号 
        [NameInMap("vehicle_no")]
        [Validation(Required=false)]
        public string VehicleNo { get; set; }

    }

}
