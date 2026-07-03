// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeInstallmentCreditamtResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 1：现金贷、2：分期付
        [NameInMap("prod_type")]
        [Validation(Required=false)]
        public string ProdType { get; set; }

        // CREDIT_APPROVING : 授信中，用户还有没有完结的授信单，需等待天枢授信终态
        // CAN_APPLY : 可申请授信，用户已有授信单的额度不满足期望分期金额/或无额度，使用mobile初步预筛有资方承接，触发去授信链路
        // LOAN_AVAILABLE : 可支用，用户已有额度满足期望分期金额，使用 fund_code 触发去支用链路
        // NO_FUNDER : 无资方，用户已有授信单的额度不满足期望分期金额/或无额度，且使用mobile初步预筛没有资方承接，可流转到其他支付方式
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 资金方编号，去支用联登时的默认资金方
        [NameInMap("fund_code")]
        [Validation(Required=false)]
        public string FundCode { get; set; }

        // 资金方简称
        [NameInMap("abbre_fund_name")]
        [Validation(Required=false)]
        public string AbbreFundName { get; set; }

        // 可用余额
        [NameInMap("rest_amount")]
        [Validation(Required=false)]
        public long? RestAmount { get; set; }

        // 授信总额度，单位：元
        [NameInMap("credit_amount")]
        [Validation(Required=false)]
        public long? CreditAmount { get; set; }

        // 授信年利率。精确到小数点后四位0.1250，表示年利率为12.5%
        [NameInMap("rate_value")]
        [Validation(Required=false)]
        public long? RateValue { get; set; }

        // 授信申请状态：
        // 0- 通过 
        // 1- 拒绝 
        // 2- 审批中
        // 3- 失败
        // 4- 未授信
        [NameInMap("apply_status")]
        [Validation(Required=false)]
        public string ApplyStatus { get; set; }

        // 额度状态：
        // 0- 正常 
        // 1- 冻结 
        // 2- 过期
        [NameInMap("credit_status")]
        [Validation(Required=false)]
        public string CreditStatus { get; set; }

        // 发放日期，yyyy-MM-dd
        [NameInMap("pay_date")]
        [Validation(Required=false)]
        public string PayDate { get; set; }

        // 到期日期，yyyy-MM-dd
        [NameInMap("expire_date")]
        [Validation(Required=false)]
        public string ExpireDate { get; set; }

    }

}
