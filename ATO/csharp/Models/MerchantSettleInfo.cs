// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 京东进件商家结算信息
    public class MerchantSettleInfo : TeaModel {
        // 结算银行卡账号
        /// <summary>
        /// <b>Example:</b>
        /// <para>123123122134</para>
        /// </summary>
        [NameInMap("bank_num")]
        [Validation(Required=true)]
        public string BankNum { get; set; }

        // 联行号 
        /// <summary>
        /// <b>Example:</b>
        /// <para>123123122134</para>
        /// </summary>
        [NameInMap("bank_cnap")]
        [Validation(Required=true)]
        public string BankCnap { get; set; }

        // 结算账户类型 
        // merchant_type=01企业时：ENTERPRISE
        // 03:民办非企业：ENTERPRISE
        // 07个体工商户时：PERSON或 ENTERPRISE
        /// <summary>
        /// <b>Example:</b>
        /// <para>ENTERPRISE</para>
        /// </summary>
        [NameInMap("bank_account_type")]
        [Validation(Required=true)]
        public string BankAccountType { get; set; }

        // 支行名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>招商银行上海支行</para>
        /// </summary>
        [NameInMap("bank_branch_name")]
        [Validation(Required=false)]
        public string BankBranchName { get; set; }

        // 银行名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>招商银行</para>
        /// </summary>
        [NameInMap("bank_name")]
        [Validation(Required=false)]
        public string BankName { get; set; }

    }

}
