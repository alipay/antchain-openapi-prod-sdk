// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 三方平台客户摘要信息
    public class PlatformCustomerSummary : TeaModel {
        // 三方平台的客户ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>2322323</para>
        /// </summary>
        [NameInMap("customer_id")]
        [Validation(Required=true)]
        public string CustomerId { get; set; }

        // 三方平台客户名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>****有限公司</para>
        /// </summary>
        [NameInMap("customer_name")]
        [Validation(Required=true)]
        public string CustomerName { get; set; }

        // 联系人
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("contact_person")]
        [Validation(Required=true)]
        public string ContactPerson { get; set; }

        // 联系电话
        /// <summary>
        /// <b>Example:</b>
        /// <para>13655665566</para>
        /// </summary>
        [NameInMap("contact_telephone")]
        [Validation(Required=true)]
        public string ContactTelephone { get; set; }

        // 联系邮箱
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="mailto:ss@163.com">ss@163.com</a></para>
        /// </summary>
        [NameInMap("contact_email")]
        [Validation(Required=false)]
        public string ContactEmail { get; set; }

        // 统一社会信用代码
        /// <summary>
        /// <b>Example:</b>
        /// <para>23123121</para>
        /// </summary>
        [NameInMap("social_credit_code")]
        [Validation(Required=true)]
        public string SocialCreditCode { get; set; }

    }

}
