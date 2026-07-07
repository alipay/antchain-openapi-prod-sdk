// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class QueryContentStatusResponse : TeaModel {
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

        // 视频内容id
        [NameInMap("content_id")]
        [Validation(Required=false)]
        public string ContentId { get; set; }

        // 视频状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 内容标题
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        // 内容类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 标签列表
        [NameInMap("keywords")]
        [Validation(Required=false)]
        public List<string> Keywords { get; set; }

        // 内容描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 内容封面文件地址
        [NameInMap("cover_url")]
        [Validation(Required=false)]
        public string CoverUrl { get; set; }

        // 存证id
        [NameInMap("register_id")]
        [Validation(Required=false)]
        public string RegisterId { get; set; }

        // 内容授权合同文件地址
        [NameInMap("auth_pdf_url")]
        [Validation(Required=false)]
        public string AuthPdfUrl { get; set; }

        // 播放列表名称
        [NameInMap("play_list_name")]
        [Validation(Required=false)]
        public string PlayListName { get; set; }

    }

}
