// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 存证元数据
    public class NotaryMetaParam : TeaModel {
        // 描述本条存证在存证事务中的阶段，用户可自行维护
        /// <summary>
        /// <b>Example:</b>
        /// <para>合同内容</para>
        /// </summary>
        [NameInMap("phase")]
        [Validation(Required=true)]
        public string Phase { get; set; }

        // 扩展字段
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;key&quot;:&quot;value&quot;}</para>
        /// </summary>
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

        // 全局唯一的存证事务ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>877c4383-9c83-477b-b7ec-03828a946e54</para>
        /// </summary>
        [NameInMap("token")]
        [Validation(Required=true)]
        public string Token { get; set; }

    }

}
