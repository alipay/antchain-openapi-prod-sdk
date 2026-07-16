// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 客诉处理人员信息
    public class CustomerPersonInfo : TeaModel {
        // 客诉处理员支付宝账号
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="mailto:123123122134@163.com">123123122134@163.com</a></para>
        /// </summary>
        [NameInMap("alipay_logon_id")]
        [Validation(Required=true)]
        public string AlipayLogonId { get; set; }

        // 客诉处理员支付宝绑定手机号
        /// <summary>
        /// <b>Example:</b>
        /// <para>123123122134</para>
        /// </summary>
        [NameInMap("alipay_bind_mobile")]
        [Validation(Required=true)]
        public string AlipayBindMobile { get; set; }

        // 客服人员名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>客服人员名称</para>
        /// </summary>
        [NameInMap("customer_service_name")]
        [Validation(Required=true)]
        public string CustomerServiceName { get; set; }

    }

}
