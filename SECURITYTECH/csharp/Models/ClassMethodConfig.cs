// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 终端安全-Android应用加固-ClassMethodConfig
    public class ClassMethodConfig : TeaModel {
        // 加固类名
        /// <summary>
        /// <b>Example:</b>
        /// <para>class_name</para>
        /// </summary>
        [NameInMap("class_name")]
        [Validation(Required=true)]
        public string ClassName { get; set; }

        // 方法集合，使用英文逗号分隔
        /// <summary>
        /// <b>Example:</b>
        /// <para>methods</para>
        /// </summary>
        [NameInMap("methods")]
        [Validation(Required=true)]
        public string Methods { get; set; }

    }

}
