// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 用户绑定银行卡列表
    public class CustomerBankCardInfo : TeaModel {
        // 银行名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>工商银行</para>
        /// </summary>
        [NameInMap("bank_name")]
        [Validation(Required=true)]
        public string BankName { get; set; }

        // 银行编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>ICBC</para>
        /// </summary>
        [NameInMap("bank_code")]
        [Validation(Required=true)]
        public string BankCode { get; set; }

        // 银行卡号
        /// <summary>
        /// <b>Example:</b>
        /// <para>6226211215645646</para>
        /// </summary>
        [NameInMap("bank_card_no")]
        [Validation(Required=true)]
        public string BankCardNo { get; set; }

        // 是否已签约
        /// <summary>
        /// <b>Example:</b>
        /// <para>Y/N</para>
        /// </summary>
        [NameInMap("signed")]
        [Validation(Required=false)]
        public string Signed { get; set; }

        // 是否为账户代扣银行卡
        /// <summary>
        /// <b>Example:</b>
        /// <para>Y/N</para>
        /// </summary>
        [NameInMap("acct_bank_card")]
        [Validation(Required=false)]
        public string AcctBankCard { get; set; }

        // 协议号
        /// <summary>
        /// <b>Example:</b>
        /// <para>202515300000000000000158463</para>
        /// </summary>
        [NameInMap("protocol_no")]
        [Validation(Required=false)]
        public string ProtocolNo { get; set; }

    }

}
