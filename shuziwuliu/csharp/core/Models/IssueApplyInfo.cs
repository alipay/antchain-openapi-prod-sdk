// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 凭证开立申请信息
    public class IssueApplyInfo : TeaModel {
        // 货源订单
        [NameInMap("cargo_order")]
        [Validation(Required=false)]
        public string CargoOrder { get; set; }

        // 合同号（预留）
        [NameInMap("contract_id")]
        [Validation(Required=false)]
        public string ContractId { get; set; }

        // 凭证到期时间
        [NameInMap("expire_date")]
        [Validation(Required=true)]
        public string ExpireDate { get; set; }

        // 支付单运费，运费最多精确到小数点后2位
        [NameInMap("freight")]
        [Validation(Required=true)]
        public string Freight { get; set; }

        // 全局唯一业务号
        [NameInMap("out_biz_no")]
        [Validation(Required=true)]
        public string OutBizNo { get; set; }

        // 支付订单
        [NameInMap("pay_order")]
        [Validation(Required=true)]
        public string PayOrder { get; set; }

        // 运单id
        [NameInMap("waybill_id")]
        [Validation(Required=true)]
        public string WaybillId { get; set; }

        // 司机did
        [NameInMap("driver_did")]
        [Validation(Required=false)]
        public string DriverDid { get; set; }

    }

}
