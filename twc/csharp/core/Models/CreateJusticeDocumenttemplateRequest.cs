// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateJusticeDocumenttemplateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 文书模板id，如果不为空是修改
        [NameInMap("document_template_id")]
        [Validation(Required=false)]
        public string DocumentTemplateId { get; set; }

        // 维权要素模板id
        [NameInMap("right_protect_template_id")]
        [Validation(Required=true)]
        public string RightProtectTemplateId { get; set; }

        // 文书模板类型名称，如“仲裁申请书”、“调解协议书”、“起诉状”等
        [NameInMap("template_name")]
        [Validation(Required=true)]
        public string TemplateName { get; set; }

        // 文书生成格式类型，枚举
        // NORMAL：普通文本，
        // RICHTEXT：富文本，
        // PDF：pdf格式文件
        [NameInMap("output_type")]
        [Validation(Required=true)]
        public string OutputType { get; set; }

        // 传入的模板样式文件格式（目前只支持txt、doc）
        // TXT：txt格式
        // DOC：doc格式
        [NameInMap("input_type")]
        [Validation(Required=true)]
        public string InputType { get; set; }

        // 原始模板文件下载地址，如果inputType为DOC则必填
        [NameInMap("download_url")]
        [Validation(Required=false)]
        public string DownloadUrl { get; set; }

        // 模板数据内容，如果inputType为TXT则必填
        [NameInMap("text_content")]
        [Validation(Required=false)]
        public string TextContent { get; set; }

    }

}
