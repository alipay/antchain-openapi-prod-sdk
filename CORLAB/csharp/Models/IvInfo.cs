// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CORLAB.Models
{
    // IV信息列表
    public class IvInfo : TeaModel {
        // 轮次
        /// <summary>
        /// <b>Example:</b>
        /// <para>基线</para>
        /// </summary>
        [NameInMap("round")]
        [Validation(Required=false)]
        public string Round { get; set; }

        // oss下载链接
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://antchain-joint-modeling-poc-sh.oss-cn-shanghai.aliyuncs.com/poc">https://antchain-joint-modeling-poc-sh.oss-cn-shanghai.aliyuncs.com/poc</a></para>
        /// </summary>
        [NameInMap("feature_report")]
        [Validation(Required=false)]
        public string FeatureReport { get; set; }

    }

}
