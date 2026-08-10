// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    // 银行卡代扣一键绑卡账户信息
    public class AccInfo : TeaModel {
        // 身份证号
        /// <summary>
        /// <b>Example:</b>
        /// <para>111222190002309999</para>
        /// </summary>
        [NameInMap("cert_no")]
        [Validation(Required=false)]
        public string CertNo { get; set; }

        // 持卡人姓名
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("cert_name")]
        [Validation(Required=false)]
        public string CertName { get; set; }

        // 银行卡号
        /// <summary>
        /// <b>Example:</b>
        /// <para>7881620854713</para>
        /// </summary>
        [NameInMap("bank_card")]
        [Validation(Required=false)]
        public string BankCard { get; set; }

        // 手机号
        /// <summary>
        /// <b>Example:</b>
        /// <para>13900001234</para>
        /// </summary>
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

        // 银行卡类型，
        // 0：借记卡
        // 1：信用卡
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("card_type")]
        [Validation(Required=false)]
        public string CardType { get; set; }

    }

}
