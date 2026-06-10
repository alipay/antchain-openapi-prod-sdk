// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BENCHTWOCREATE.Models
{
    // 返回结果测试类
    public class ResultTest : TeaModel {
        // 姓名
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // test
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("list")]
        [Validation(Required=true)]
        public DemoClass List { get; set; }

    }

}
