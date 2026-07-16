// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 订单融资信息
    public class OrderFinanceInfo : TeaModel {
        // 放款金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>30000</para>
        /// </summary>
        [NameInMap("total_money")]
        [Validation(Required=false)]
        public long? TotalMoney { get; set; }

        // 放款状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>AGREED_LOAN</para>
        /// </summary>
        [NameInMap("apply_status")]
        [Validation(Required=false)]
        public string ApplyStatus { get; set; }

        // 融资申请时间(yyyy-MM-dd HH:mm:ss)
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10 10:10:00</para>
        /// </summary>
        [NameInMap("loan_apply_date")]
        [Validation(Required=false)]
        public string LoanApplyDate { get; set; }

        // 放款时间(yyyy-MM-dd HH:mm:ss)
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10 10:10:00</para>
        /// </summary>
        [NameInMap("loan_time")]
        [Validation(Required=false)]
        public string LoanTime { get; set; }

        // 放款交易流水号
        /// <summary>
        /// <b>Example:</b>
        /// <para>202403102912984772213</para>
        /// </summary>
        [NameInMap("loan_serial_number")]
        [Validation(Required=false)]
        public string LoanSerialNumber { get; set; }

        // 资方分账户登录号
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="mailto:xxx@qq.com">xxx@qq.com</a></para>
        /// </summary>
        [NameInMap("fund_divide_alipay_logon_id")]
        [Validation(Required=false)]
        public string FundDivideAlipayLogonId { get; set; }

        // 资方分账户uid
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088xxxx</para>
        /// </summary>
        [NameInMap("fund_divide_alipay_uid")]
        [Validation(Required=false)]
        public string FundDivideAlipayUid { get; set; }

        // 资方代扣户登录号
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="mailto:xxx@qq.com">xxx@qq.com</a></para>
        /// </summary>
        [NameInMap("fund_withhold_alipay_logon_id")]
        [Validation(Required=false)]
        public string FundWithholdAlipayLogonId { get; set; }

        // 资方代扣户uid
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088xxxx</para>
        /// </summary>
        [NameInMap("fund_withhold_alipay_uid")]
        [Validation(Required=false)]
        public string FundWithholdAlipayUid { get; set; }

        // 手续费支付方
        /// <summary>
        /// <b>Example:</b>
        /// <para>MERCHANT</para>
        /// </summary>
        [NameInMap("fee_paid_role")]
        [Validation(Required=false)]
        public string FeePaidRole { get; set; }

        // 放款渠道
        /// <summary>
        /// <b>Example:</b>
        /// <para>BANK</para>
        /// </summary>
        [NameInMap("loan_channel")]
        [Validation(Required=false)]
        public string LoanChannel { get; set; }

        // 放款账户
        /// <summary>
        /// <b>Example:</b>
        /// <para>6217xxxxx</para>
        /// </summary>
        [NameInMap("loan_payee_account")]
        [Validation(Required=false)]
        public string LoanPayeeAccount { get; set; }

        // 付款公司统一社会信用代码
        /// <summary>
        /// <b>Example:</b>
        /// <para>9210XM12385</para>
        /// </summary>
        [NameInMap("paid_company_id")]
        [Validation(Required=false)]
        public string PaidCompanyId { get; set; }

        // 银行名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>x xx银行</para>
        /// </summary>
        [NameInMap("bank_name")]
        [Validation(Required=false)]
        public string BankName { get; set; }

        // 融资状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>APPLY</para>
        /// </summary>
        [NameInMap("finance_status")]
        [Validation(Required=false)]
        public string FinanceStatus { get; set; }

        // 收款项目列表
        [NameInMap("payment_item_list")]
        [Validation(Required=false)]
        public List<string> PaymentItemList { get; set; }

        // 转账代偿收款类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>支付宝</para>
        /// </summary>
        [NameInMap("transfer_compensate_in_account_type")]
        [Validation(Required=false)]
        public string TransferCompensateInAccountType { get; set; }

    }

}
