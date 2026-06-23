// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 另一个Demo类
    public class AnotherClass : TeaModel {
        // 测试字段
        /// <summary>
        /// <b>Example:</b>
        /// <para>some string</para>
        /// </summary>
        [NameInMap("bar")]
        [Validation(Required=true)]
        public string Bar { get; set; }

        // 引用字段
        [NameInMap("ref")]
        [Validation(Required=true)]
        public QueryMap Ref { get; set; }

        // 新增结构体
        /// <summary>
        /// <b>Example:</b>
        /// <para>new structs</para>
        /// </summary>
        [NameInMap("new_struct")]
        [Validation(Required=false)]
        public string NewStruct { get; set; }

    }

}
