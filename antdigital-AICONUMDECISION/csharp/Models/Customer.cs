// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AICONUMDECISION.Models
{
    // 触达用户
    public class Customer : TeaModel {
        // 用户手机号
        /// <summary>
        /// <b>Example:</b>
        /// <para>0571****5678</para>
        /// </summary>
        [NameInMap("phone_number")]
        [Validation(Required=true)]
        public string PhoneNumber { get; set; }

        // 用户业务 ID，回执中透出，需保证唯一
        /// <summary>
        /// <b>Example:</b>
        /// <para>12313156789654</para>
        /// </summary>
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 扩展业务字段，可用于变量参数和回执透出 json格式字符串
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;name&quot;:&quot;张三&quot;}</para>
        /// </summary>
        [NameInMap("biz_properties")]
        [Validation(Required=false)]
        public string BizProperties { get; set; }

    }

}
