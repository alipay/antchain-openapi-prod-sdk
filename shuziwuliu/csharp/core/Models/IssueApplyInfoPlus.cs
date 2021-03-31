// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // A+模式发行信息
    public class IssueApplyInfoPlus : TeaModel {
        // 订单中的BookingNo，以英文逗号分割
        [NameInMap("booking_no")]
        [Validation(Required=true)]
        public string BookingNo { get; set; }

        // 船公司did
        [NameInMap("carrier_did")]
        [Validation(Required=true)]
        public string CarrierDid { get; set; }

        // BookingNo中的箱号，以英文逗号分割
        [NameInMap("container_no")]
        [Validation(Required=true)]
        public string ContainerNo { get; set; }

        // 到期时间戳
        [NameInMap("expire_date")]
        [Validation(Required=true)]
        public string ExpireDate { get; set; }

        // 发行金额，精确到小数点后2位
        [NameInMap("issue_amt")]
        [Validation(Required=true)]
        public string IssueAmt { get; set; }

        // 全局唯一业务号
        [NameInMap("out_biz_no")]
        [Validation(Required=true)]
        public string OutBizNo { get; set; }

        // 支付单号
        [NameInMap("out_order_no")]
        [Validation(Required=true)]
        public string OutOrderNo { get; set; }

        // 运单订单id
        [NameInMap("waybill_id")]
        [Validation(Required=true)]
        public string WaybillId { get; set; }

    }

}
