// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class PushPfPledgeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 项目标识，可联系对接同学提供
        [NameInMap("project_id")]
        [Validation(Required=true, MaxLength=64)]
        public string ProjectId { get; set; }

        // 账单标识
        [NameInMap("bill_id")]
        [Validation(Required=true, MaxLength=128)]
        public string BillId { get; set; }

        // 融资主体did
        [NameInMap("financing_subject_did")]
        [Validation(Required=true, MaxLength=128)]
        public string FinancingSubjectDid { get; set; }

        // 请求号；以yyyyMMdd 时间串开头的32位字符串；该字符串需要保持请求系统内唯一，系统会以该请求号作为幂等处理
        [NameInMap("request_no")]
        [Validation(Required=true, MaxLength=32)]
        public string RequestNo { get; set; }

        // 质押发票号码列表
        [NameInMap("invoice_nos")]
        [Validation(Required=false)]
        public List<string> InvoiceNos { get; set; }

        // 托盘账单金额
        [NameInMap("pallet_bill_amount")]
        [Validation(Required=false, MaxLength=64)]
        public string PalletBillAmount { get; set; }

        // 托盘账单关联发票号列表
        [NameInMap("pallet_invoice_nos")]
        [Validation(Required=false)]
        public List<string> PalletInvoiceNos { get; set; }

    }

}
