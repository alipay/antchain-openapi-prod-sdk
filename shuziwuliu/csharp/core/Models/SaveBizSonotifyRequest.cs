// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class SaveBizSonotifyRequest : TeaModel {
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

        // so通知关联的订舱单 (业务必填)
        [NameInMap("booking_params")]
        [Validation(Required=false)]
        public List<SoNotifyBookingParam> BookingParams { get; set; }

        // 联系人
        [NameInMap("contact_name")]
        [Validation(Required=false)]
        public string ContactName { get; set; }

        // 联系方式
        [NameInMap("contact_type")]
        [Validation(Required=false)]
        public string ContactType { get; set; }

        // 卸货港 业务必填	
        // 
        [NameInMap("discharge_port")]
        [Validation(Required=false)]
        public string DischargePort { get; set; }

        // 货代did
        [NameInMap("forwarder_did")]
        [Validation(Required=true)]
        public string ForwarderDid { get; set; }

        // 起运港 业务必填	
        // 
        [NameInMap("loading_port")]
        [Validation(Required=false)]
        public string LoadingPort { get; set; }

        // 	
        // 订单号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // soNotify 唯一标识code
        [NameInMap("so_notify_code")]
        [Validation(Required=true)]
        public string SoNotifyCode { get; set; }

    }

}
