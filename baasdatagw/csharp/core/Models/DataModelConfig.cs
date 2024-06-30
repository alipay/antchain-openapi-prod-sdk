// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 业务模型配置
    public class DataModelConfig : TeaModel {
        // 对应的方法参数
        [NameInMap("arg_name")]
        [Validation(Required=true)]
        public string ArgName { get; set; }

        // 方法参数位置，input / output
        [NameInMap("arg_location")]
        [Validation(Required=true)]
        public string ArgLocation { get; set; }

        // 业务名称
        [NameInMap("comment")]
        [Validation(Required=false)]
        public string Comment { get; set; }

        // 业务名称在交易时间轴是否可见
        [NameInMap("visible")]
        [Validation(Required=false)]
        public bool? Visible { get; set; }

    }

}
