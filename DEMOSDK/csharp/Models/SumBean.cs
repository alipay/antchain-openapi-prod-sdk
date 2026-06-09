// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMOSDK.Models
{
    // 测试实体
    public class SumBean : TeaModel {
        // 元素名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("e_name")]
        [Validation(Required=false)]
        public string EName { get; set; }

        // 数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>23</para>
        /// </summary>
        [NameInMap("num")]
        [Validation(Required=false)]
        public long? Num { get; set; }

        // test
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("info")]
        [Validation(Required=true)]
        public ResultTests Info { get; set; }

    }

}
