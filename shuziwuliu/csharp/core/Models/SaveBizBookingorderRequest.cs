// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class SaveBizBookingorderRequest : TeaModel {
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

        // 订舱单号
        [NameInMap("booking_no")]
        [Validation(Required=true)]
        public string BookingNo { get; set; }

        // 船公司 业务必填
        [NameInMap("carrier")]
        [Validation(Required=false)]
        public string Carrier { get; set; }

        // 截关时间
        [NameInMap("customs_clearance")]
        [Validation(Required=false)]
        public long? CustomsClearance { get; set; }

        // 场站 业务必填
        [NameInMap("cy")]
        [Validation(Required=false)]
        public string Cy { get; set; }

        // 截港时间 毫秒值单位
        [NameInMap("cy_closing")]
        [Validation(Required=false)]
        public long? CyClosing { get; set; }

        // 目的地
        [NameInMap("delivery_place")]
        [Validation(Required=false)]
        public string DeliveryPlace { get; set; }

        // 卸货港
        [NameInMap("discharge_port")]
        [Validation(Required=false)]
        public string DischargePort { get; set; }

        // 预计船期 毫秒值单位
        [NameInMap("etd")]
        [Validation(Required=false)]
        public long? Etd { get; set; }

        // 货代did
        [NameInMap("forwarder_did")]
        [Validation(Required=true)]
        public string ForwarderDid { get; set; }

        // 起运港
        [NameInMap("loading_port")]
        [Validation(Required=false)]
        public string LoadingPort { get; set; }

        // 订单号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 截单时间  毫秒值单位
        [NameInMap("si_closing")]
        [Validation(Required=false)]
        public long? SiClosing { get; set; }

        // 特殊字段无要求非必填
        [NameInMap("source")]
        [Validation(Required=false)]
        public string Source { get; set; }

        // 船名 业务必填
        [NameInMap("vessel")]
        [Validation(Required=false)]
        public string Vessel { get; set; }

        // 航次 业务必填
        [NameInMap("voyage")]
        [Validation(Required=false)]
        public string Voyage { get; set; }

        // 订舱号
        [NameInMap("bkg_no")]
        [Validation(Required=true)]
        public string BkgNo { get; set; }

        // 确认时间
        [NameInMap("confirm_time")]
        [Validation(Required=false)]
        public long? ConfirmTime { get; set; }

    }

}
