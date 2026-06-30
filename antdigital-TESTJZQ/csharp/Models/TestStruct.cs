// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TESTJZQ.Models
{
    // 1
    public class TestStruct : TeaModel {
        // x
        /// <summary>
        /// <b>Example:</b>
        /// <para>x</para>
        /// </summary>
        [NameInMap("x")]
        [Validation(Required=true)]
        public string X { get; set; }

        // y
        /// <summary>
        /// <b>Example:</b>
        /// <para>y</para>
        /// </summary>
        [NameInMap("y")]
        [Validation(Required=true)]
        public string Y { get; set; }

        // z
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("z")]
        [Validation(Required=true)]
        public List<DemoClass> Z { get; set; }

    }

}
