// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // iotx时间
    public class TripDuration : TeaModel {
        // 时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;1.2&quot;</para>
        /// </summary>
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

        // 时间单位
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;h&quot;</para>
        /// </summary>
        [NameInMap("unit")]
        [Validation(Required=true)]
        public string Unit { get; set; }

    }

}
