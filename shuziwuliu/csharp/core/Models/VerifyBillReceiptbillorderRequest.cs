// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class VerifyBillReceiptbillorderRequest : TeaModel {
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

        // 货代did
        [NameInMap("forwarder_did")]
        [Validation(Required=true)]
        public string ForwarderDid { get; set; }

        // 应收资费项编号
        [NameInMap("receipt_tariff_code")]
        [Validation(Required=true)]
        public string ReceiptTariffCode { get; set; }

        // 核销金额 业务必填
        [NameInMap("verify_amount")]
        [Validation(Required=false)]
        public string VerifyAmount { get; set; }

        // 核销应收资费项编号
        [NameInMap("verify_receipt_tariff_code")]
        [Validation(Required=true)]
        public string VerifyReceiptTariffCode { get; set; }

        // 核销状态 WAIT_VERIFY-待核销，PART_VERIFY-部分核销，COMPLETE_VERIFY-完成核销 业务必填
        [NameInMap("verify_status")]
        [Validation(Required=false)]
        public string VerifyStatus { get; set; }

    }

}
