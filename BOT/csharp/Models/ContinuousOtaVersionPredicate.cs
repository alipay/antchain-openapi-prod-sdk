// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 结构化版本谓词
    public class ContinuousOtaVersionPredicate : TeaModel {
        // 匹配类型：ANY、EXACT 或 RANGE；非 eKYT 模块仅支持 ANY 和 EXACT。
        /// <summary>
        /// <b>Example:</b>
        /// <para>ANY</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 精确匹配的版本号，仅在 type 为 EXACT 时使用。
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.0.0</para>
        /// </summary>
        [NameInMap("exact_version_no")]
        [Validation(Required=false)]
        public string ExactVersionNo { get; set; }

        // 版本范围下界，仅在 type 为 RANGE 时使用。
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("lower")]
        [Validation(Required=false)]
        public Bound Lower { get; set; }

        // 版本范围上界，仅在 type 为 RANGE 时使用。
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("upper")]
        [Validation(Required=false)]
        public Bound Upper { get; set; }

    }

}
