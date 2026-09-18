// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // usci+industry 组合列表
    public class MaoUsciIndustryPair : TeaModel {
        // 统一社会信用代码
        /// <summary>
        /// <b>Example:</b>
        /// <para>统一社会信用代码</para>
        /// </summary>
        [NameInMap("usci")]
        [Validation(Required=false)]
        public string Usci { get; set; }

        // 行业类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>行业类型</para>
        /// </summary>
        [NameInMap("industry")]
        [Validation(Required=false)]
        public string Industry { get; set; }

    }

}
