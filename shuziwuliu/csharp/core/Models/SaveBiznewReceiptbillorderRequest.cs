// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class SaveBiznewReceiptbillorderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 应收账单号
        // 
        // 
        [NameInMap("receipt_bill_order_code")]
        [Validation(Required=true)]
        public string ReceiptBillOrderCode { get; set; }

        // 货代did
        [NameInMap("forwarder_did")]
        [Validation(Required=true)]
        public string ForwarderDid { get; set; }

        // 应付方did [业务必填]
        // 
        // 
        [NameInMap("settle_company_did")]
        [Validation(Required=false)]
        public string SettleCompanyDid { get; set; }

        // 收款方did [业务必填]
        // 
        // 
        [NameInMap("receipt_client_did")]
        [Validation(Required=false)]
        public string ReceiptClientDid { get; set; }

        // 收款金额 [业务必填]
        // 
        // 
        [NameInMap("receipt_amount")]
        [Validation(Required=false)]
        public string ReceiptAmount { get; set; }

        // 申请时间 (秒时间戳) [业务必填]
        [NameInMap("apply_date")]
        [Validation(Required=false)]
        public long? ApplyDate { get; set; }

        // 账单到期日 (秒时间戳) [业务必填]
        // 
        // 
        [NameInMap("expire_date")]
        [Validation(Required=false)]
        public long? ExpireDate { get; set; }

        // 账单状态  SETTLED 已结算 UNSETTLE 未结算  [业务必填]
        [NameInMap("settle_status")]
        [Validation(Required=false)]
        public string SettleStatus { get; set; }

        // 应收资费项 [业务必填]
        // 
        // 
        [NameInMap("receipt_tariff_list")]
        [Validation(Required=false)]
        public List<ReceiptTariffInfo> ReceiptTariffList { get; set; }

        // 币种 [业务必填]
        [NameInMap("currency")]
        [Validation(Required=false)]
        public string Currency { get; set; }

    }

}
