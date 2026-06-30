// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TESTJZQ.Models
{
    // ceshi
    public class DemoClass : TeaModel {
        // some_string
        /// <summary>
        /// <b>Example:</b>
        /// <para>some_string</para>
        /// </summary>
        [NameInMap("some_string")]
        [Validation(Required=true)]
        public string SomeString { get; set; }

        // some_date
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("some_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string SomeDate { get; set; }

        // some_boolean
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("some_boolean")]
        [Validation(Required=true)]
        public bool? SomeBoolean { get; set; }

        // some_int
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("some_int")]
        [Validation(Required=true)]
        public long? SomeInt { get; set; }

        // some_list
        /// <summary>
        /// <b>Example:</b>
        /// <para>some_list</para>
        /// </summary>
        [NameInMap("some_list")]
        [Validation(Required=true)]
        public List<string> SomeList { get; set; }

    }

}
