// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_2fdfc04b2afb4da9ac403531af8942a9.Models
{
    // 大安全内容检测接口返回参数
    public class ResultModel : TeaModel {
        // 返回结果
        [NameInMap("code")]
        [Validation(Required=false)]
        public long? Code { get; set; }

        // 返回错误信息
        [NameInMap("err_msg")]
        [Validation(Required=false)]
        public string ErrMsg { get; set; }

        // 返回具体结果
        [NameInMap("model")]
        [Validation(Required=false)]
        public string Model { get; set; }

    }

}
