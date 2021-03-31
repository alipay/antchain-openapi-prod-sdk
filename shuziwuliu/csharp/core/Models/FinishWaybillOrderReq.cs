// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // FinishWaybillOrderReq
    public class FinishWaybillOrderReq : TeaModel {
        // 运费
        [NameInMap("all_freight")]
        [Validation(Required=false)]
        public string AllFreight { get; set; }

        // 回单押金
        [NameInMap("back_fee")]
        [Validation(Required=false)]
        public string BackFee { get; set; }

        // 货主支付运费金额
        [NameInMap("consignor_freight_amount")]
        [Validation(Required=false)]
        public string ConsignorFreightAmount { get; set; }

        // 运费增项
        [NameInMap("freight_incr")]
        [Validation(Required=false)]
        public string FreightIncr { get; set; }

        // 运费扣减
        [NameInMap("loss_fee")]
        [Validation(Required=false)]
        public string LossFee { get; set; }

        // 平台did
        [NameInMap("platform_did")]
        [Validation(Required=true)]
        public string PlatformDid { get; set; }

        // 运单id
        [NameInMap("tax_waybill_id")]
        [Validation(Required=true)]
        public string TaxWaybillId { get; set; }

    }

}
