// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryContractTemplateResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 业务码，0表示成功
        [NameInMap("code")]
        [Validation(Required=false)]
        public long? Code { get; set; }

        // 创建时间
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // 模板文件下载地址
        [NameInMap("download_url")]
        [Validation(Required=false)]
        public string DownloadUrl { get; set; }

        // 模板文件大小
        [NameInMap("file_size")]
        [Validation(Required=false)]
        public long? FileSize { get; set; }

        // 业务码信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 文件模板中的输入项组件列表
        [NameInMap("struct_components")]
        [Validation(Required=false)]
        public List<ContractTemplateStructComponent> StructComponents { get; set; }

        // 模板id
        [NameInMap("template_id")]
        [Validation(Required=false)]
        public string TemplateId { get; set; }

        // 模板名称
        [NameInMap("template_name")]
        [Validation(Required=false)]
        public string TemplateName { get; set; }

        // 更新时间
        [NameInMap("update_time")]
        [Validation(Required=false)]
        public long? UpdateTime { get; set; }

    }

}
