// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.OP.Models
{
    // api结果码
    public class ResultCodeRequest : TeaModel {
        // api版本
        [NameInMap("api_version")]
        [Validation(Required=true)]
        public string ApiVersion { get; set; }

        // api名称
        [NameInMap("api_name")]
        [Validation(Required=true)]
        public string ApiName { get; set; }

        // 外部返回结果码
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 内部返回结果码
        [NameInMap("internal_code")]
        [Validation(Required=true)]
        public string InternalCode { get; set; }

        // 结果码描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 错误解决方法
        [NameInMap("resolution")]
        [Validation(Required=false)]
        public string Resolution { get; set; }

    }

}
