// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class CreateContractTemplateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 模板文件md5值，再做base64编码
        // 
        [NameInMap("content_md5")]
        [Validation(Required=true)]
        public string ContentMd5 { get; set; }

        // 目标文件的MIME类型
        // 
        [NameInMap("content_type")]
        [Validation(Required=true)]
        public string ContentType { get; set; }

        // 是否需要转成pdf，如果模板文件为.doc/.docx 传true，为pdf传false
        // 
        [NameInMap("convert2_pdf")]
        [Validation(Required=true)]
        public bool? Convert2Pdf { get; set; }

        // 文件名称，必须带扩展名如:.pdf,.doc,.docx
        // 
        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

    }

}
