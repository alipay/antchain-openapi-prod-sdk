// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // ABC结构体C
    public class AbcStructC : TeaModel {
        // string_c
        /// <summary>
        /// <b>Example:</b>
        /// <para>string_c</para>
        /// </summary>
        [NameInMap("string_param_c")]
        [Validation(Required=false)]
        public string StringParamC { get; set; }

        // number_c
        /// <summary>
        /// <b>Example:</b>
        /// <para>200</para>
        /// </summary>
        [NameInMap("number_param_c")]
        [Validation(Required=false)]
        public long? NumberParamC { get; set; }

        // boolean_c
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("boolean_param_c")]
        [Validation(Required=false)]
        public bool? BooleanParamC { get; set; }

        // date_c
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("date_param_c")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DateParamC { get; set; }

        // string_c
        /// <summary>
        /// <b>Example:</b>
        /// <para>string_c</para>
        /// </summary>
        [NameInMap("array_param_c")]
        [Validation(Required=false)]
        public List<string> ArrayParamC { get; set; }

    }

}
