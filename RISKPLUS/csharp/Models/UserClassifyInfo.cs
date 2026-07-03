// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 用户分层信息
    public class UserClassifyInfo : TeaModel {
        // 版本号
        /// <summary>
        /// <b>Example:</b>
        /// <para>V1</para>
        /// </summary>
        [NameInMap("version")]
        [Validation(Required=true)]
        public string Version { get; set; }

        // 流量分层
        /// <summary>
        /// <b>Example:</b>
        /// <para>A: &lt;6% B: 6%<del>12% C:12%</del>18% D:18%<del>24% E:24%</del>36% F:&gt;36% R:不分发（黑名单类）</para>
        /// </summary>
        [NameInMap("rate_classify")]
        [Validation(Required=true)]
        public string RateClassify { get; set; }

        // 流量扩展分层1
        /// <summary>
        /// <b>Example:</b>
        /// <para>123123</para>
        /// </summary>
        [NameInMap("classify_ext1")]
        [Validation(Required=false)]
        public string ClassifyExt1 { get; set; }

        // 流量扩展分层2
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("classify_ext2")]
        [Validation(Required=false)]
        public string ClassifyExt2 { get; set; }

    }

}
