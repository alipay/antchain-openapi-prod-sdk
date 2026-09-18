// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMOSDK.Models
{
    // mcp验证使用结构体
    public class McpTestStruct : TeaModel {
        // string入参
        /// <summary>
        /// <b>Example:</b>
        /// <para>string入参</para>
        /// </summary>
        [NameInMap("struct_string")]
        [Validation(Required=true)]
        public string StructString { get; set; }

        // number入参
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("struct_number")]
        [Validation(Required=true)]
        public long? StructNumber { get; set; }

        // boolean入参
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("struct_boolean")]
        [Validation(Required=true)]
        public bool? StructBoolean { get; set; }

        // date入参
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-09-16 10:00:00</para>
        /// </summary>
        [NameInMap("struct_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StructDate { get; set; }

        // list_string入参
        /// <summary>
        /// <b>Example:</b>
        /// <para>[&quot;VIP&quot;,&quot;新用户&quot;]</para>
        /// </summary>
        [NameInMap("struct_list")]
        [Validation(Required=true)]
        public List<string> StructList { get; set; }

        // struct入参
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("struct_struct")]
        [Validation(Required=true)]
        public ResultTest StructStruct { get; set; }

    }

}
