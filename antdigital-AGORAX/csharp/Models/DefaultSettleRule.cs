// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 默认结算规则
    public class DefaultSettleRule : TeaModel {
        // 默认结算类型，结算到银行卡: bankCard，结算到支付宝账号: alipayAccount
        /// <summary>
        /// <b>Example:</b>
        /// <para>alipayAccount</para>
        /// </summary>
        [NameInMap("default_settle_type")]
        [Validation(Required=true)]
        public string DefaultSettleType { get; set; }

        // 默认结算目标	bankCard 时填银行卡号，alipayAccount 时填支付宝登录号
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="mailto:myalipay@alipay.com">myalipay@alipay.com</a></para>
        /// </summary>
        [NameInMap("default_settle_target")]
        [Validation(Required=true)]
        public string DefaultSettleTarget { get; set; }

    }

}
