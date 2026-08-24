// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 高德潜客uv指数
    public class GdCustomerUv : TeaModel {
        // uv指数数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>36</para>
        /// </summary>
        [NameInMap("total")]
        [Validation(Required=true)]
        public long? Total { get; set; }

        // uv指数数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>10</para>
        /// </summary>
        [NameInMap("count")]
        [Validation(Required=true)]
        public long? Count { get; set; }

        // uv指数排序
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("sort")]
        [Validation(Required=true)]
        public long? Sort { get; set; }

    }

}
