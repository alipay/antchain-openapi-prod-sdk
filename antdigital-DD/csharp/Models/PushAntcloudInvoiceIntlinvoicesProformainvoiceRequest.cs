// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    public class PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 合同号或订单号
        [NameInMap("ar_no")]
        [Validation(Required=true)]
        public string ArNo { get; set; }

        // 业务动作
        [NameInMap("biz_action")]
        [Validation(Required=true)]
        public string BizAction { get; set; }

        // 业务场景
        [NameInMap("biz_scene")]
        [Validation(Required=true)]
        public string BizScene { get; set; }

        // 币种
        [NameInMap("currency_code")]
        [Validation(Required=true)]
        public string CurrencyCode { get; set; }

        // 税率
        [NameInMap("tax_rate")]
        [Validation(Required=true)]
        public string TaxRate { get; set; }

        // 开票申请项列表
        [NameInMap("invoice_apply_item_list")]
        [Validation(Required=true)]
        public List<InvoiceApplyItem> InvoiceApplyItemList { get; set; }

        // 开票日期
        [NameInMap("invoice_date")]
        [Validation(Required=true)]
        public string InvoiceDate { get; set; }

        // 发票邮寄信息
        [NameInMap("invoice_email_info")]
        [Validation(Required=true)]
        public InvoiceMailInfo InvoiceEmailInfo { get; set; }

        // 发票类型
        [NameInMap("invoice_type")]
        [Validation(Required=true)]
        public string InvoiceType { get; set; }

        // 操作人姓名
        [NameInMap("operator_name")]
        [Validation(Required=true)]
        public string OperatorName { get; set; }

        // 操作人ID
        [NameInMap("operator_no")]
        [Validation(Required=true)]
        public string OperatorNo { get; set; }

        // OU
        [NameInMap("ou")]
        [Validation(Required=true)]
        public string Ou { get; set; }

        // OU币种
        [NameInMap("ou_currency_code")]
        [Validation(Required=true)]
        public string OuCurrencyCode { get; set; }

        // 来源
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 用户开票信息
        [NameInMap("user_invoice_info")]
        [Validation(Required=true)]
        public UserInvoiceInfo UserInvoiceInfo { get; set; }

        // 申请原因
        [NameInMap("apply_reason")]
        [Validation(Required=false)]
        public string ApplyReason { get; set; }

        // 费用期间开始日期
        [NameInMap("expenseperiod_startdate")]
        [Validation(Required=false)]
        public string ExpenseperiodStartdate { get; set; }

        // 费用期间结束日期
        [NameInMap("expenseperiod_enddate")]
        [Validation(Required=false)]
        public string ExpenseperiodEnddate { get; set; }

    }

}
