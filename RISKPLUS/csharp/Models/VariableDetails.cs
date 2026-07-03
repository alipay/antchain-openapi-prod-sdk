// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 输出变量列表
    public class VariableDetails : TeaModel {
        // 输出变量名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>yidun_aft_v3</para>
        /// </summary>
        [NameInMap("variable_name")]
        [Validation(Required=true)]
        public string VariableName { get; set; }

        // 输出变量值
        /// <summary>
        /// <b>Example:</b>
        /// <para>66.6</para>
        /// </summary>
        [NameInMap("variable_value")]
        [Validation(Required=true)]
        public string VariableValue { get; set; }

        // 输出变量值类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>Double</para>
        /// </summary>
        [NameInMap("variable_type")]
        [Validation(Required=true)]
        public string VariableType { get; set; }

    }

}
