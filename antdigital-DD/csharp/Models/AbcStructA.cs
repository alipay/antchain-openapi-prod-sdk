// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // ABC结构体A
    public class AbcStructA : TeaModel {
        // string_a
        /// <summary>
        /// <b>Example:</b>
        /// <para>string</para>
        /// </summary>
        [NameInMap("string_param_a")]
        [Validation(Required=false)]
        public string StringParamA { get; set; }

        // number_a
        /// <summary>
        /// <b>Example:</b>
        /// <para>800</para>
        /// </summary>
        [NameInMap("number_param_a")]
        [Validation(Required=false)]
        public long? NumberParamA { get; set; }

        // boolean_a
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("boolean_param_a")]
        [Validation(Required=false)]
        public bool? BooleanParamA { get; set; }

        // date_a
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("date_param_a")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DateParamA { get; set; }

        // struct_a
        /// <summary>
        /// <b>Example:</b>
        /// <para>struct_param</para>
        /// </summary>
        [NameInMap("struct_param_a")]
        [Validation(Required=false)]
        public AbcStructB StructParamA { get; set; }

    }

}
