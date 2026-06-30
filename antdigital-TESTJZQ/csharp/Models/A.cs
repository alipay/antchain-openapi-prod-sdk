// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TESTJZQ.Models
{
    // 1
    public class A : TeaModel {
        // a
        /// <summary>
        /// <b>Example:</b>
        /// <para>a</para>
        /// </summary>
        [NameInMap("a")]
        [Validation(Required=true)]
        public string A_ { get; set; }

        // b
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("b")]
        [Validation(Required=true)]
        public List<B> B { get; set; }

    }

}
