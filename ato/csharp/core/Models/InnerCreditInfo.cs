// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 内部使用接口资产凭证信息
    public class InnerCreditInfo : TeaModel {
        // 凭证内容id
        [NameInMap("content_id")]
        [Validation(Required=false)]
        public string ContentId { get; set; }

        // 资产凭证的类型，可支持：FILE(文件)、TEXT(文本)、JSON_TEXT(JSON文本)
        [NameInMap("content_type")]
        [Validation(Required=false)]
        public string ContentType { get; set; }

        // 资产凭证名称
        [NameInMap("credit_name")]
        [Validation(Required=false)]
        public string CreditName { get; set; }

        // 凭证文件下载链接
        [NameInMap("credit_file_url")]
        [Validation(Required=false)]
        public string CreditFileUrl { get; set; }

        // 上传的文本内容
        [NameInMap("credit_content")]
        [Validation(Required=false)]
        public string CreditContent { get; set; }

        // 凭证创建时间(yyyy-MM-dd HH:mm:ss)
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

    }

}
