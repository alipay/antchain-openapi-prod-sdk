// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // host
    public class Host : TeaModel {
        // test_2e1ae924805f
        /// <summary>
        /// <b>Example:</b>
        /// <para>test_2e1ae924805f</para>
        /// </summary>
        [NameInMap("system_name")]
        [Validation(Required=true)]
        public string SystemName { get; set; }

        // 地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>test_941f18a4013b</para>
        /// </summary>
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

    }

}
