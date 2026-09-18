// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 结算账户
    public class MaoSettleAccount : TeaModel {
        // 结算账户类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>结算账户类型</para>
        /// </summary>
        [NameInMap("settlement_account_type")]
        [Validation(Required=true)]
        public string SettlementAccountType { get; set; }

        // 收款账户户名
        /// <summary>
        /// <b>Example:</b>
        /// <para>收款账户户名</para>
        /// </summary>
        [NameInMap("settlement_account_name")]
        [Validation(Required=true)]
        public string SettlementAccountName { get; set; }

        // 银行账户号
        /// <summary>
        /// <b>Example:</b>
        /// <para>银行账户号</para>
        /// </summary>
        [NameInMap("account_no")]
        [Validation(Required=true)]
        public string AccountNo { get; set; }

        // 开户行总行名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>开户行总行名称</para>
        /// </summary>
        [NameInMap("bank_name")]
        [Validation(Required=true)]
        public string BankName { get; set; }

        // 开户行总行编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>开户行总行编码</para>
        /// </summary>
        [NameInMap("bank_code")]
        [Validation(Required=false)]
        public string BankCode { get; set; }

        // 开户行支行名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>开户行支行名称</para>
        /// </summary>
        [NameInMap("bank_branch_name")]
        [Validation(Required=false)]
        public string BankBranchName { get; set; }

        // 开户支行编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>开户支行编码</para>
        /// </summary>
        [NameInMap("bank_branch_code")]
        [Validation(Required=false)]
        public string BankBranchCode { get; set; }

        // 开户行所在省
        /// <summary>
        /// <b>Example:</b>
        /// <para>开户行所在省</para>
        /// </summary>
        [NameInMap("bank_province")]
        [Validation(Required=true)]
        public string BankProvince { get; set; }

        // 开户行所在市
        /// <summary>
        /// <b>Example:</b>
        /// <para>开户行所在市</para>
        /// </summary>
        [NameInMap("bank_city")]
        [Validation(Required=true)]
        public string BankCity { get; set; }

        // 银行卡照片 URL
        /// <summary>
        /// <b>Example:</b>
        /// <para>银行卡照片 URL</para>
        /// </summary>
        [NameInMap("bank_card_image")]
        [Validation(Required=false)]
        public string BankCardImage { get; set; }

        // 开户许可证照片 URL
        /// <summary>
        /// <b>Example:</b>
        /// <para>开户许可证照片 URL</para>
        /// </summary>
        [NameInMap("open_permit_image")]
        [Validation(Required=false)]
        public string OpenPermitImage { get; set; }

        // 银联号
        /// <summary>
        /// <b>Example:</b>
        /// <para>银联号</para>
        /// </summary>
        [NameInMap("unionpay_number")]
        [Validation(Required=false)]
        public string UnionpayNumber { get; set; }

    }

}
