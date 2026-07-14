// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // gcl开放接口模型
    public class GclLcaModel : TeaModel {
        // 模型名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("model_name")]
        [Validation(Required=false)]
        public string ModelName { get; set; }

        // 过程信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("process_list")]
        [Validation(Required=false)]
        public List<ProcessDetail> ProcessList { get; set; }

    }

}
