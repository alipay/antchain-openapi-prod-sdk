// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 输出参数
    public class VariableDetail : TeaModel {
        // 产品码
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 变量名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("variable_name")]
        [Validation(Required=true)]
        public string VariableName { get; set; }

        // 变量值
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("variable_value")]
        [Validation(Required=true)]
        public string VariableValue { get; set; }

        // 变量类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>hello</para>
        /// </summary>
        [NameInMap("variable_type")]
        [Validation(Required=true)]
        public string VariableType { get; set; }

    }

}
