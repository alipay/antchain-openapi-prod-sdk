// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 分页查询请求信息
    public class PageReq : TeaModel {
        // 页码
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("num")]
        [Validation(Required=true)]
        public long? Num { get; set; }

        // 页大小
        /// <summary>
        /// <b>Example:</b>
        /// <para>200</para>
        /// </summary>
        [NameInMap("size")]
        [Validation(Required=true)]
        public long? Size { get; set; }

    }

}
