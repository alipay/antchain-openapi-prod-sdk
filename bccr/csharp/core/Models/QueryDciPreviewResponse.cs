// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class QueryDciPreviewResponse : TeaModel {
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

        // 作品预览处理状态
        [NameInMap("file_preview_status")]
        [Validation(Required=false)]
        public string FilePreviewStatus { get; set; }

        // 作品片段预览状态
        [NameInMap("file_part_preview_status")]
        [Validation(Required=false)]
        public string FilePartPreviewStatus { get; set; }

        // 作品预览处理结果
        [NameInMap("file_preview_url")]
        [Validation(Required=false)]
        public string FilePreviewUrl { get; set; }

        // 作品预览截取片段结果
        [NameInMap("file_part_preview_url")]
        [Validation(Required=false)]
        public string FilePartPreviewUrl { get; set; }

        // 作品名称
        [NameInMap("work_name")]
        [Validation(Required=false)]
        public string WorkName { get; set; }

        // dci码
        [NameInMap("dci_code")]
        [Validation(Required=false)]
        public string DciCode { get; set; }

        // 文件类型
        [NameInMap("file_type")]
        [Validation(Required=false)]
        public string FileType { get; set; }

        // 当前查询时间
        [NameInMap("query_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string QueryTime { get; set; }

        // 数登登记号
        [NameInMap("reg_number")]
        [Validation(Required=false)]
        public string RegNumber { get; set; }

    }

}
