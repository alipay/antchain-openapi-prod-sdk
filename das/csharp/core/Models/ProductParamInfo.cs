// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 产品参数信息
    public class ProductParamInfo : TeaModel {
        // 参数业务类型
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 参数key
        [NameInMap("param_key")]
        [Validation(Required=true)]
        public string ParamKey { get; set; }

        // 参数类型
        [NameInMap("param_type")]
        [Validation(Required=true)]
        public string ParamType { get; set; }

        // 参数描述
        [NameInMap("param_desc")]
        [Validation(Required=true)]
        public string ParamDesc { get; set; }

    }

}
