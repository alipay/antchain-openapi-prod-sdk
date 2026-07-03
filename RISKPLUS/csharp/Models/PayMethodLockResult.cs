// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 支付方式锁定结果
    public class PayMethodLockResult : TeaModel {
        // 签约结果
        /// <summary>
        /// <b>Example:</b>
        /// <para>0、1</para>
        /// </summary>
        [NameInMap("sign_status")]
        [Validation(Required=true)]
        public string SignStatus { get; set; }

        // 账号
        /// <summary>
        /// <b>Example:</b>
        /// <para>userId</para>
        /// </summary>
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 登录号
        /// <summary>
        /// <b>Example:</b>
        /// <para>userIdA</para>
        /// </summary>
        [NameInMap("login_id")]
        [Validation(Required=true)]
        public string LoginId { get; set; }

        // 支付公司
        /// <summary>
        /// <b>Example:</b>
        /// <para>AliPay</para>
        /// </summary>
        [NameInMap("pay_channel")]
        [Validation(Required=true)]
        public string PayChannel { get; set; }

        // 绑定账号名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>someName</para>
        /// </summary>
        [NameInMap("account_name")]
        [Validation(Required=true)]
        public string AccountName { get; set; }

    }

}
