// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    // 抵押担保信息
    public class MortGuaranteeInfo : TeaModel {
        // 争议处理方式,比如：COUNT_PROCEEDING=有管辖权的人民法院提起诉讼
        [NameInMap("conflict_handle_method")]
        [Validation(Required=false)]
        public string ConflictHandleMethod { get; set; }

        // 评估价值，人民币默认单位为元，小数点保留2位
        [NameInMap("evaluation_amt")]
        [Validation(Required=false)]
        public string EvaluationAmt { get; set; }

        // 评估价值货币类型,比如：CNY=人民币
        [NameInMap("evaluation_amt_currency")]
        [Validation(Required=false)]
        public string EvaluationAmtCurrency { get; set; }

        // 担保范围列表,比如：MAIN_CLAIM=主债权
        [NameInMap("guarantee_scope_json")]
        [Validation(Required=false)]
        public List<string> GuaranteeScopeJson { get; set; }

        // 担保范围备注
        [NameInMap("guarantee_scope_note")]
        [Validation(Required=false)]
        public string GuaranteeScopeNote { get; set; }

        // 抵押方式，比如：MAX_AMOUNT_MORT=最高额抵押权
        [NameInMap("mortgage_type")]
        [Validation(Required=false)]
        public string MortgageType { get; set; }

        // 被担保主债权数额,人民币默认单位元，保留两位小数点
        [NameInMap("debt_amt")]
        [Validation(Required=false)]
        public string DebtAmt { get; set; }

        // 被担保主债权数额货币类型，比如：CNY=人民币
        [NameInMap("debt_amt_currency")]
        [Validation(Required=false)]
        public string DebtAmtCurrency { get; set; }

        // 履债结束日期
        [NameInMap("debt_end_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DebtEndDate { get; set; }

        // 履债起始日期
        [NameInMap("debt_start_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DebtStartDate { get; set; }

        // 抵押物属性,比如：REGISTED_BUILDING=已建成并登记发证建筑物
        [NameInMap("mort_realty_property")]
        [Validation(Required=false)]
        public string MortRealtyProperty { get; set; }

        // 合同债权金额币种
        [NameInMap("ar_debt_amt_currency")]
        [Validation(Required=false)]
        public string ArDebtAmtCurrency { get; set; }

        // 合同债权金额
        [NameInMap("ar_debt_amt")]
        [Validation(Required=false)]
        public string ArDebtAmt { get; set; }

        // 房产链内部抵押单号
        [NameInMap("mg_order_no")]
        [Validation(Required=false)]
        public string MgOrderNo { get; set; }

    }

}
