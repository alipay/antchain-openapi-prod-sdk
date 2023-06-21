// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    // 协议扩展
    public class RiskEvaluationAgreementExtRequest : TeaModel {
        // URL：文件地址
        // CONTENT:Base64的文件流
        // 
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 文件类型
        // PDF
        [NameInMap("file_type")]
        [Validation(Required=false)]
        public string FileType { get; set; }

        // type为url是传入文件地址
        // type为CONTENT时传入Base64文件内容编码
        // 
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

    }

}
