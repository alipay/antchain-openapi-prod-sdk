// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 行业资质
    public class MaoQualification : TeaModel {
        // 资质类型码
        /// <summary>
        /// <b>Example:</b>
        /// <para>资质类型码</para>
        /// </summary>
        [NameInMap("key")]
        [Validation(Required=false)]
        public string Key { get; set; }

        // 资质图片地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>资质图片地址</para>
        /// </summary>
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

    }

}
