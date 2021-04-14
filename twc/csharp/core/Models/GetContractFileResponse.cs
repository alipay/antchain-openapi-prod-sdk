// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class GetContractFileResponse : TeaModel {
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

        // 业务码，0表示成功
        [NameInMap("code")]
        [Validation(Required=false)]
        public long? Code { get; set; }

        // 业务码信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 文件id
        [NameInMap("file_id")]
        [Validation(Required=false)]
        public string FileId { get; set; }

        // 文件名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 下载地址
        [NameInMap("download_url")]
        [Validation(Required=false)]
        public string DownloadUrl { get; set; }

        // 文件大小，单位byte
        [NameInMap("size")]
        [Validation(Required=false)]
        public long? Size { get; set; }

        // 文件状态, 0:文件未上传；1:文件上传中 ；2：文件上传已完成,；3：文件上传失败 ；4：文件等待转pdf ；5：文件已转换pdf 。
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // pdf文件总页数,仅当文件类型为pdf时有值
        [NameInMap("pdf_total_pages")]
        [Validation(Required=false)]
        public long? PdfTotalPages { get; set; }

    }

}
