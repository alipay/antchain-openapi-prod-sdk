// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TESTJZQ.Models
{
    // ceshi
    public class InitPacks : TeaModel {
        // 返回接收到请求的当前时间
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("time")]
        [Validation(Required=true)]
        public string Time { get; set; }

        // 1
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 1
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("count")]
        [Validation(Required=true)]
        public long? Count { get; set; }

    }

}
