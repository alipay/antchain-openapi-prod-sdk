// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 天枢预览协议信息
    public class GetAgreementUrlResponseData : TeaModel {
        // 协议标题
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // 协议地址
        [NameInMap("agreement_url")]
        [Validation(Required=false)]
        public string AgreementUrl { get; set; }

        // 协议文件Base64
        [NameInMap("file_base64")]
        [Validation(Required=false)]
        public string FileBase64 { get; set; }

        // 协议图片文件base64集合
        [NameInMap("pic_file_base64_list")]
        [Validation(Required=false)]
        public List<string> PicFileBase64List { get; set; }

        // 图片文件oss集合
        [NameInMap("pic_oss_path_list")]
        [Validation(Required=false)]
        public List<string> PicOssPathList { get; set; }

        // 机构名称
        [NameInMap("organization_name")]
        [Validation(Required=true)]
        public string OrganizationName { get; set; }

        // 协议类型-code
        [NameInMap("file_type")]
        [Validation(Required=true)]
        public string FileType { get; set; }

        // 协议类型-名称
        [NameInMap("file_type_name")]
        [Validation(Required=true)]
        public string FileTypeName { get; set; }

    }

}
