// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // testAAAA
    public class TestClass : TeaModel {
        // 1
        /// <summary>
        /// <b>Example:</b>
        /// <para>testclass</para>
        /// </summary>
        [NameInMap("test")]
        [Validation(Required=true)]
        public string Test { get; set; }

        // 2
        /// <summary>
        /// <b>Example:</b>
        /// <para>testclass</para>
        /// </summary>
        [NameInMap("demo")]
        [Validation(Required=true)]
        public string Demo { get; set; }

        // 3
        /// <summary>
        /// <b>Example:</b>
        /// <para>id2</para>
        /// </summary>
        [NameInMap("demo1")]
        [Validation(Required=true)]
        public string Demo1 { get; set; }

        // 22
        /// <summary>
        /// <b>Example:</b>
        /// <para>12</para>
        /// </summary>
        [NameInMap("demo2")]
        [Validation(Required=true)]
        public string Demo2 { get; set; }

        // test
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("info")]
        [Validation(Required=true)]
        public DemoClass Info { get; set; }

    }

}
