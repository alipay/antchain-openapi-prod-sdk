// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 标签对象
    public class InstanceLabel : TeaModel {
        // 标签名。
        // 传递isvId
        /// <summary>
        /// <b>Example:</b>
        /// <para>isvId</para>
        /// </summary>
        [NameInMap("instance_key")]
        [Validation(Required=true)]
        public string InstanceKey { get; set; }

        // 标签值
        /// <summary>
        /// <b>Example:</b>
        /// <para>邀请码</para>
        /// </summary>
        [NameInMap("instance_value")]
        [Validation(Required=true)]
        public string InstanceValue { get; set; }

    }

}
