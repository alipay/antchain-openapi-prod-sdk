// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateLeaseSupplierdynamicinfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 合约id
        [NameInMap("application_id")]
        [Validation(Required=true)]
        public string ApplicationId { get; set; }

        // 签收记录哈希，已签收需要必填
        [NameInMap("arrive_confirm_hash")]
        [Validation(Required=false)]
        public string ArriveConfirmHash { get; set; }

        // 用户签收时间，格式为2019-8-31 12:00:00，已签收需要必填
        [NameInMap("arrive_confirm_time")]
        [Validation(Required=false)]
        public string ArriveConfirmTime { get; set; }

        // 签收记录存证哈希，已签收需要必填
        [NameInMap("arrive_confirm_tx_hash")]
        [Validation(Required=false)]
        public string ArriveConfirmTxHash { get; set; }

        // 签收记录对应的url，已签收需要必填
        [NameInMap("arrive_confirm_url")]
        [Validation(Required=false)]
        public string ArriveConfirmUrl { get; set; }

        // 物流状态额外信息
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // 物流状态，1.已发货 2运输中 3已签收 0其他
        [NameInMap("logistic_status")]
        [Validation(Required=true)]
        public string LogisticStatus { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 阶段名称
        [NameInMap("phase")]
        [Validation(Required=true)]
        public string Phase { get; set; }

    }

}
