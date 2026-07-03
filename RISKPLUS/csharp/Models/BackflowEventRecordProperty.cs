// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 回流事件记录属性项
    public class BackflowEventRecordProperty : TeaModel {
        // 属性code
        /// <summary>
        /// <b>Example:</b>
        /// <para>mobile</para>
        /// </summary>
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 属性value，统一为字符串
        /// <summary>
        /// <b>Example:</b>
        /// <para>18941147005</para>
        /// </summary>
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
