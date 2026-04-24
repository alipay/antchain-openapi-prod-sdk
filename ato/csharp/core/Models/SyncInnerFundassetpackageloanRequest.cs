// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class SyncInnerFundassetpackageloanRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 资方租户id
        [NameInMap("fund_tenant_id")]
        [Validation(Required=true)]
        public string FundTenantId { get; set; }

        // 资方id
        [NameInMap("fund_id")]
        [Validation(Required=true)]
        public string FundId { get; set; }

        // 商户租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 商户id
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // traceid
        [NameInMap("trace_id")]
        [Validation(Required=true)]
        public string TraceId { get; set; }

        // 资产包id
        [NameInMap("asset_package_id")]
        [Validation(Required=true)]
        public string AssetPackageId { get; set; }

        // AGREE_LOAN（同意放款） 
        // REJECT_LOAN（拒绝放款）
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 放款时间
        [NameInMap("loan_time")]
        [Validation(Required=false)]
        public string LoanTime { get; set; }

        // 放款总金额
        [NameInMap("loan_total_money")]
        [Validation(Required=false)]
        public long? LoanTotalMoney { get; set; }

        //   放款凭证
        [NameInMap("loan_credit")]
        [Validation(Required=false)]
        public FileInfo LoanCredit { get; set; }

        // 放款其他凭证
        [NameInMap("loan_other_credit")]
        [Validation(Required=false)]
        public List<FileInfo> LoanOtherCredit { get; set; }

    }

}
