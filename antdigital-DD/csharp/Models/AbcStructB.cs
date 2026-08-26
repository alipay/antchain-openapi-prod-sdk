// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // ABC结构体B
    public class AbcStructB : TeaModel {
        // string_b
        /// <summary>
        /// <b>Example:</b>
        /// <para>string_b</para>
        /// </summary>
        [NameInMap("string_param_b")]
        [Validation(Required=false)]
        public string StringParamB { get; set; }

        // number_b
        /// <summary>
        /// <b>Example:</b>
        /// <para>200</para>
        /// </summary>
        [NameInMap("number_param_b")]
        [Validation(Required=false)]
        public long? NumberParamB { get; set; }

        // boolean_b
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("boolean_param_b")]
        [Validation(Required=false)]
        public bool? BooleanParamB { get; set; }

        // date_b
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("date_param_b")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DateParamB { get; set; }

        // array_b
        /// <summary>
        /// <b>Example:</b>
        /// <para>array_param</para>
        /// </summary>
        [NameInMap("array_param_b")]
        [Validation(Required=false)]
        public List<AbcStructC> ArrayParamB { get; set; }

        // struct_b
        /// <summary>
        /// <b>Example:</b>
        /// <para>struct_param</para>
        /// </summary>
        [NameInMap("struct_param_b")]
        [Validation(Required=false)]
        public AbcStructC StructParamB { get; set; }

    }

}
