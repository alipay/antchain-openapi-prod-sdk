// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_6efc6591476e4813ac8f7c9b6359c0b7.Models
{
    // 大安全人机识别相应
    public class RdslibAntcaptchaservice : TeaModel {
        // 是否请求成功
        [NameInMap("success")]
        [Validation(Required=true)]
        public bool? Success { get; set; }

        // 相应信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 返回数据
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

    }

}
