// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // test
    public class DemoInfo : TeaModel {
        // test
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 123
        /// <summary>
        /// <b>Example:</b>
        /// <para>1123</para>
        /// </summary>
        [NameInMap("testx")]
        [Validation(Required=false)]
        public ContentTest Testx { get; set; }

    }

}
