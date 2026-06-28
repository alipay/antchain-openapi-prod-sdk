// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMOSDK.Models
{
    // test for edit
    public class TestParamA : TeaModel {
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

        // struct_parama
        [NameInMap("struct_parama")]
        [Validation(Required=true)]
        public TestParamB StructParama { get; set; }

        // 结构体列表a
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("struct_list_a")]
        [Validation(Required=false)]
        public List<TestParamB> StructListA { get; set; }

    }

}
