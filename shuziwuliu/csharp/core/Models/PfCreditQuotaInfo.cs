// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 池融资授信额度信息
    public class PfCreditQuotaInfo : TeaModel {
        // 证件号
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 证件类型
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public string CertType { get; set; }

        // 授信到期日期
        [NameInMap("credit_end")]
        [Validation(Required=true)]
        public string CreditEnd { get; set; }

        // 授信起始日期
        [NameInMap("credit_start")]
        [Validation(Required=true)]
        public string CreditStart { get; set; }

        // 额度编号
        [NameInMap("quota_no")]
        [Validation(Required=true)]
        public string QuotaNo { get; set; }

        // 剩余额度
        [NameInMap("remaining_quota")]
        [Validation(Required=true)]
        public string RemainingQuota { get; set; }

        // SON:放款账号loanAccNo
        // 还款账号repayAcctNo
        [NameInMap("remark")]
        [Validation(Required=true)]
        public string Remark { get; set; }

        // 额度状态：
        // 0、停用 / 1、启用  /  2、冻结
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 授信额度
        [NameInMap("total_quota")]
        [Validation(Required=true)]
        public string TotalQuota { get; set; }

        // 数据更新时间
        [NameInMap("update_time")]
        [Validation(Required=true)]
        public string UpdateTime { get; set; }

        // 总质押额度
        [NameInMap("total_pledge_quota")]
        [Validation(Required=true)]
        public string TotalPledgeQuota { get; set; }

        // 剩余质押额度
        [NameInMap("remain_pledge_quota")]
        [Validation(Required=true)]
        public string RemainPledgeQuota { get; set; }

    }

}
