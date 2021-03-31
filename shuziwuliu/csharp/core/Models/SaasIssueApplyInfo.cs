// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // saas模式发行信息
    public class SaasIssueApplyInfo : TeaModel {
        // 货源订单
        [NameInMap("cargo_order")]
        [Validation(Required=false)]
        public string CargoOrder { get; set; }

        // 合同号
        [NameInMap("contract_id")]
        [Validation(Required=false)]
        public string ContractId { get; set; }

        // 全局唯一业务单号
        [NameInMap("out_biz_no")]
        [Validation(Required=true)]
        public string OutBizNo { get; set; }

        // 支付单号
        [NameInMap("pay_order")]
        [Validation(Required=true)]
        public string PayOrder { get; set; }

        // 运单号
        [NameInMap("waybill_id")]
        [Validation(Required=true)]
        public string WaybillId { get; set; }

        // 司机did
        [NameInMap("driver_did")]
        [Validation(Required=true)]
        public string DriverDid { get; set; }

        // 发行费
        [NameInMap("freight")]
        [Validation(Required=true)]
        public string Freight { get; set; }

        // 到期时间戳
        [NameInMap("expire_date")]
        [Validation(Required=true)]
        public string ExpireDate { get; set; }

    }

}
