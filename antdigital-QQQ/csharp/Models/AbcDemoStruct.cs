// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.QQQ.Models
{
    // ABC示例结构体
    public class AbcDemoStruct : TeaModel {
        // 字符串属性
        /// <summary>
        /// <b>Example:</b>
        /// <para>str</para>
        /// </summary>
        [NameInMap("some_string")]
        [Validation(Required=false, MaxLength=100)]
        public string SomeString { get; set; }

        // Long型属性
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("some_number")]
        [Validation(Required=true)]
        public long? SomeNumber { get; set; }

        // 布尔型
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("some_boolean")]
        [Validation(Required=true)]
        public bool? SomeBoolean { get; set; }

        // ISO8601格式字符串：yyyy-MM-dd_T_HH:mm:ss_Z_
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("some_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string SomeDate { get; set; }

        // 字符串数组
        /// <summary>
        /// <b>Example:</b>
        /// <para>somestring</para>
        /// </summary>
        [NameInMap("some_string_list")]
        [Validation(Required=false)]
        public List<string> SomeStringList { get; set; }

        // 子结构体
        /// <summary>
        /// <b>Example:</b>
        /// <para>{ &quot;name&quot;: &quot;value&quot; }</para>
        /// </summary>
        [NameInMap("some_struct")]
        [Validation(Required=true)]
        public SubDemoStruct SomeStruct { get; set; }

        // 结构体数组
        /// <summary>
        /// <b>Example:</b>
        /// <para>[{&quot;name&quot;: &quot;value&quot;}]</para>
        /// </summary>
        [NameInMap("some_struct_list")]
        [Validation(Required=true)]
        public List<SubDemoStruct> SomeStructList { get; set; }

    }

}
