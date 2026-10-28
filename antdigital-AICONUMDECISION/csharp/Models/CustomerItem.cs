// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AICONUMDECISION.Models
{
    // 客户号码列表
    public class CustomerItem : TeaModel {
        // 客户业务键
        /// <summary>
        /// <b>Example:</b>
        /// <para>客户业务键</para>
        /// </summary>
        [NameInMap("biz_id")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        // 手机号
        /// <summary>
        /// <b>Example:</b>
        /// <para>12233332222</para>
        /// </summary>
        [NameInMap("phone_number")]
        [Validation(Required=true)]
        public string PhoneNumber { get; set; }

        // 业务属性
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;姓名&quot;:&quot;张&quot;,&quot;customerId&quot;:&quot;Z3gnNptlEf7FyNGsD3o1mg&quot;,&quot;性别&quot;:&quot;1&quot;,&quot;issue&quot;:&quot;1&quot;,&quot;effectTime&quot;:&quot;1&quot;,&quot;price&quot;:&quot;1&quot;}</para>
        /// </summary>
        [NameInMap("biz_properties")]
        [Validation(Required=false)]
        public string BizProperties { get; set; }

    }

}
