// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 门店账户信息
    public class StoreAccountInfo : TeaModel {
        // 结算银行卡号
        /// <summary>
        /// <b>Example:</b>
        /// <para>2023343380112</para>
        /// </summary>
        [NameInMap("bank_card_no")]
        [Validation(Required=true)]
        public string BankCardNo { get; set; }

        // 结算银行账户名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>交通银行</para>
        /// </summary>
        [NameInMap("bank_account_name")]
        [Validation(Required=true)]
        public string BankAccountName { get; set; }

        // 结算银行code
        /// <summary>
        /// <b>Example:</b>
        /// <para>ICBC</para>
        /// </summary>
        [NameInMap("bank_code")]
        [Validation(Required=true)]
        public string BankCode { get; set; }

        // 商户号(支付通道给的商户编号)
        /// <summary>
        /// <b>Example:</b>
        /// <para>202334332380</para>
        /// </summary>
        [NameInMap("merchant_no")]
        [Validation(Required=true)]
        public string MerchantNo { get; set; }

        // 银行虚拟户卡号(监管户的账户信息)
        /// <summary>
        /// <b>Example:</b>
        /// <para>3242352345234</para>
        /// </summary>
        [NameInMap("e_virtual_bank_card_no")]
        [Validation(Required=true)]
        public string EVirtualBankCardNo { get; set; }

        // 银行虚拟户账户名称(监管户的账户信息)
        /// <summary>
        /// <b>Example:</b>
        /// <para>账户1</para>
        /// </summary>
        [NameInMap("e_virtual_bank_account_name")]
        [Validation(Required=true)]
        public string EVirtualBankAccountName { get; set; }

        // 银行虚拟户银行code(监管户的账户信息)
        /// <summary>
        /// <b>Example:</b>
        /// <para>SEFG</para>
        /// </summary>
        [NameInMap("e_virtual_bank_code")]
        [Validation(Required=true)]
        public string EVirtualBankCode { get; set; }

    }

}
