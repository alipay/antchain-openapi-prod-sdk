// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class CreateDirectmonitorTaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 提交类型，FILE/URL
        // 
        [NameInMap("submit_type")]
        [Validation(Required=true)]
        public string SubmitType { get; set; }

        // submitType 是FILE就传 oss fileId，是URL就传url地址
        [NameInMap("submit_content")]
        [Validation(Required=true)]
        public string SubmitContent { get; set; }

        // 文件名称
        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

        // 文件类别 IMAGE/TEXT/VIDEO/AUDIO
        // 
        [NameInMap("file_type")]
        [Validation(Required=true)]
        public string FileType { get; set; }

        // 详细文件类型，在fileType为IMAGE时，当前仅支持MARKETING_IMAGE营销图片
        [NameInMap("detail_file_type")]
        [Validation(Required=true)]
        public string DetailFileType { get; set; }

        // 定向监测任务名称
        [NameInMap("task_name")]
        [Validation(Required=false)]
        public string TaskName { get; set; }

        // 幂等号，用于保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
        [NameInMap("client_token")]
        [Validation(Required=false)]
        public string ClientToken { get; set; }

    }

}
