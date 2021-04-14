// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateContractPlatformtemplateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 是否包含代扣规则，如果设置为true，则在创建手动签署流程时，必须传入代扣规则。默认为false
        [NameInMap("auto_deduction")]
        [Validation(Required=false)]
        public bool? AutoDeduction { get; set; }

        // Base64编码的模板文件的MD5值
        [NameInMap("content_md5")]
        [Validation(Required=true)]
        public string ContentMd5 { get; set; }

        // 目标文件的MIME类型
        [NameInMap("content_type")]
        [Validation(Required=true)]
        public string ContentType { get; set; }

        // 是否需要转成pdf，如果模板文件为.doc/.docx 传true，为pdf传false
        [NameInMap("convert2_pdf")]
        [Validation(Required=true)]
        public bool? Convert2Pdf { get; set; }

        // 文件名称，必须带扩展名如:.pdf,.doc,.docx
        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

        // 平台方的签署信息列表
        [NameInMap("sign_fields")]
        [Validation(Required=true)]
        public List<ContractPlatformSignField> SignFields { get; set; }

        // 用户需要签章的页面列表（默认为最后一页）
        [NameInMap("user_sign_pages")]
        [Validation(Required=false)]
        public List<long?> UserSignPages { get; set; }

        // 是否强制用户选择代扣
        [NameInMap("auto_deduction_force")]
        [Validation(Required=false)]
        public bool? AutoDeductionForce { get; set; }

    }

}
