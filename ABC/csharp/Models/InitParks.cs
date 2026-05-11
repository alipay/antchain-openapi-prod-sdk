// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ABC.Models
{
    // 初始参数
    public class InitParks : TeaModel {
        // 返回接收到请求的当前时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2024-11-03 14:00</para>
        /// </summary>
        [NameInMap("time")]
        [Validation(Required=true)]
        public string Time { get; set; }

        // 操作人
        /// <summary>
        /// <b>Example:</b>
        /// <para>姜泽琦</para>
        /// </summary>
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 请求编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("count")]
        [Validation(Required=true)]
        public long? Count { get; set; }

    }

}
