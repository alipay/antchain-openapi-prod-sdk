// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CORLAB.Models
{
    // 最好结果
    public class BestModelReport : TeaModel {
        // ks信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.52</para>
        /// </summary>
        [NameInMap("ks")]
        [Validation(Required=false)]
        public string Ks { get; set; }

        // auc指标
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.8</para>
        /// </summary>
        [NameInMap("auc")]
        [Validation(Required=false)]
        public string Auc { get; set; }

        // lift指标
        /// <summary>
        /// <b>Example:</b>
        /// <para>3.2</para>
        /// </summary>
        [NameInMap("lift")]
        [Validation(Required=false)]
        public string Lift { get; set; }

    }

}
