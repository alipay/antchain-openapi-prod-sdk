// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 溯源防伪码生成请求的响应数据
    public class BaiQrcodeGenerateRespData : TeaModel {
        // 二维码的base64字符串
        [NameInMap("generate_result")]
        [Validation(Required=true)]
        public string GenerateResult { get; set; }

        // 生成结果码
        [NameInMap("generate_code")]
        [Validation(Required=true)]
        public string GenerateCode { get; set; }

        // 用于异常场景下细化错误信息
        [NameInMap("generate_message")]
        [Validation(Required=true)]
        public string GenerateMessage { get; set; }

        // 生成失败时的解决方案，用于异常场景下细化错误信息
        [NameInMap("unable_generate_solution")]
        [Validation(Required=true)]
        public string UnableGenerateSolution { get; set; }

    }

}
