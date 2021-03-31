// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class SaveBiznewBookingRequest : TeaModel {
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

        // 订舱单唯一标识
        [NameInMap("booking_no")]
        [Validation(Required=true)]
        public string BookingNo { get; set; }

        // 订舱号 [业务必填]
        [NameInMap("bkg_no")]
        [Validation(Required=false)]
        public string BkgNo { get; set; }

        // 货代did
        [NameInMap("forwarder_did")]
        [Validation(Required=true)]
        public string ForwarderDid { get; set; }

        // 收货人
        [NameInMap("consignee")]
        [Validation(Required=false)]
        public string Consignee { get; set; }

        // 船公司 [业务必填]
        [NameInMap("carrier")]
        [Validation(Required=false)]
        public string Carrier { get; set; }

        // 船名 [业务必填]
        [NameInMap("vessel")]
        [Validation(Required=false)]
        public string Vessel { get; set; }

        // 航次 [业务必填]
        [NameInMap("voyage")]
        [Validation(Required=false)]
        public string Voyage { get; set; }

        // 起运港 [业务必填]
        [NameInMap("loading_port")]
        [Validation(Required=false)]
        public string LoadingPort { get; set; }

        // 卸货港 [业务必填]
        [NameInMap("discharge_port")]
        [Validation(Required=false)]
        public string DischargePort { get; set; }

        // 箱型箱量 [业务必填]
        [NameInMap("container_type_info_list")]
        [Validation(Required=false)]
        public List<ContainerTypeInfo> ContainerTypeInfoList { get; set; }

        // 截关时间（秒时间戳）
        [NameInMap("customs_clearance")]
        [Validation(Required=false)]
        public long? CustomsClearance { get; set; }

        // 截港时间（秒时间戳）
        [NameInMap("cy_closing")]
        [Validation(Required=false)]
        public long? CyClosing { get; set; }

        // 截单时间 (秒时间戳)
        [NameInMap("si_closing")]
        [Validation(Required=false)]
        public long? SiClosing { get; set; }

        // 预计船期（秒时间戳）
        [NameInMap("etd")]
        [Validation(Required=false)]
        public long? Etd { get; set; }

        // 订舱费总金额 [业务必填]
        [NameInMap("bkg_total_amount")]
        [Validation(Required=false)]
        public string BkgTotalAmount { get; set; }

        // 订舱费金额 [业务必填]
        [NameInMap("bkg_amount")]
        [Validation(Required=false)]
        public string BkgAmount { get; set; }

        // 港杂费金额 [业务必填]
        [NameInMap("port_charges")]
        [Validation(Required=false)]
        public string PortCharges { get; set; }

        // 币种 CNY/USD [业务必填]
        // 
        // 
        [NameInMap("currency")]
        [Validation(Required=false)]
        public string Currency { get; set; }

        // 订单确认 CREATE/FINISH (创建/确认) [业务必填]
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
