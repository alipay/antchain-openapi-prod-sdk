// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 协议模板信息
    public class Agreement : TeaModel {
        // 协议名称
        [NameInMap("agreement_name")]
        [Validation(Required=true)]
        public string AgreementName { get; set; }

        // 协议类型
        [NameInMap("agreement_type")]
        [Validation(Required=true)]
        public string AgreementType { get; set; }

        // 第三方原始协议链接
        [NameInMap("agreement_url")]
        [Validation(Required=true)]
        public string AgreementUrl { get; set; }

        // 协议文件上传目录
        [NameInMap("agreement_file_oss_key")]
        [Validation(Required=true)]
        public string AgreementFileOssKey { get; set; }

        // 上传时的协议原始文件名
        [NameInMap("agreement_file_original_name")]
        [Validation(Required=true)]
        public string AgreementFileOriginalName { get; set; }

    }

}
