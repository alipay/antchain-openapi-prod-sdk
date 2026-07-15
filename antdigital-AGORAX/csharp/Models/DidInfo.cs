// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 分布式数字身份信息
    public class DidInfo : TeaModel {
        // 分布式数字身份id
        /// <summary>
        /// <b>Example:</b>
        /// <para>123123</para>
        /// </summary>
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 分布式数字身份对应的用户名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>蚂蚁金服</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

    }

}
