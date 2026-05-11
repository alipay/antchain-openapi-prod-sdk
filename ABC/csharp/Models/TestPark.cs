// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ABC.Models
{
    // 测试使用
    public class TestPark : TeaModel {
        // 请求时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2022-11-07 14:48</para>
        /// </summary>
        [NameInMap("time")]
        [Validation(Required=true)]
        public string Time { get; set; }

        // 请求人
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
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
