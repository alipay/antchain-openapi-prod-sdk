// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GATEWAYX.Models
{
    public class GetFileDownloadResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 创建文件使用的apiCode
        [NameInMap("api_code")]
        [Validation(Required=false)]
        public string ApiCode { get; set; }

        // 文件下载地址
        [NameInMap("download_url")]
        [Validation(Required=false)]
        public string DownloadUrl { get; set; }

        // 下载超时时间
        [NameInMap("expired_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ExpiredTime { get; set; }

        // 文件标签
        [NameInMap("file_label")]
        [Validation(Required=false)]
        public string FileLabel { get; set; }

        // 请求上传时的自定义元数据
        [NameInMap("file_metadata")]
        [Validation(Required=false)]
        public string FileMetadata { get; set; }

        // 文件名
        [NameInMap("file_name")]
        [Validation(Required=false)]
        public string FileName { get; set; }

        // 文件路径
        [NameInMap("file_path")]
        [Validation(Required=false)]
        public string FilePath { get; set; }

        // 文件大小
        [NameInMap("file_size")]
        [Validation(Required=false)]
        public long? FileSize { get; set; }

        // 上传的调用者信息
        [NameInMap("upload_invoker")]
        [Validation(Required=false)]
        public XInvokerInfo UploadInvoker { get; set; }

    }

}
