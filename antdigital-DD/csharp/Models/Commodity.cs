// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 商品结构
    public class Commodity : TeaModel {
        // 商品编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>KKAASP00000001</para>
        /// </summary>
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 商品名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>测试商品</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 商品状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>ONLINE</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
