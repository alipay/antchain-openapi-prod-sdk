// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 召回测试命中片段（I-0133）
    public class OpenApiRecallItem : TeaModel {
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("text")]
        [Validation(Required=true)]
        public string Text { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("source_file")]
        [Validation(Required=true)]
        public string SourceFile { get; set; }

        // 现有召回引擎原始相关性分数，不假定0到1
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("score")]
        [Validation(Required=true)]
        public long? Score { get; set; }

    }

}
