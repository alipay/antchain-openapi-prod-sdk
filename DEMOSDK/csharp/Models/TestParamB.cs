// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMOSDK.Models
{
    // test for edit
    public class TestParamB : TeaModel {
        // string_param
        /// <summary>
        /// <b>Example:</b>
        /// <para>string_param</para>
        /// </summary>
        [NameInMap("string_param")]
        [Validation(Required=false)]
        public string StringParam { get; set; }

        // number_param
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("number_param")]
        [Validation(Required=false)]
        public long? NumberParam { get; set; }

        // boolean_param
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("boolean_param")]
        [Validation(Required=false)]
        public bool? BooleanParam { get; set; }

        // date_param
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("date_param")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DateParam { get; set; }

        // struct_param
        [NameInMap("struct_param")]
        [Validation(Required=true)]
        public TestParamC StructParam { get; set; }

        // aa
        /// <summary>
        /// <b>Example:</b>
        /// <para>3000</para>
        /// </summary>
        [NameInMap("struct_list_b")]
        [Validation(Required=false)]
        public TestParamC StructListB { get; set; }

    }

}
