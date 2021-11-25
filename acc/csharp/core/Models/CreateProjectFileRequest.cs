// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class CreateProjectFileRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 项目编号 
        [NameInMap("project_code")]
        [Validation(Required=true)]
        public string ProjectCode { get; set; }

        // 文件id
        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // 文件业务id
        [NameInMap("file_biz_id")]
        [Validation(Required=false)]
        public string FileBizId { get; set; }

        // 文件编号
        [NameInMap("file_code")]
        [Validation(Required=false)]
        public string FileCode { get; set; }

        // 文件名称
        [NameInMap("file_name")]
        [Validation(Required=false)]
        public string FileName { get; set; }

        // 文件类型
        [NameInMap("file_type")]
        [Validation(Required=true)]
        public string FileType { get; set; }

        // 扩展字段
        [NameInMap("extra_data")]
        [Validation(Required=false)]
        public string ExtraData { get; set; }

        // 数据时间戳
        [NameInMap("data_timestamp")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DataTimestamp { get; set; }

    }

}
