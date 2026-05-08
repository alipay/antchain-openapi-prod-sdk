// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.QQQ.Models
{
    // 返回结果测试类
    public class ResultTests : TeaModel {
        // 姓名
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 年龄
        /// <summary>
        /// <b>Example:</b>
        /// <para>18</para>
        /// </summary>
        [NameInMap("age")]
        [Validation(Required=true)]
        public string Age { get; set; }

    }

}
