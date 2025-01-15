// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MARKETING.Models
{
    public class QueryDocResponse : TeaModel {
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

        // 内部id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 文档id
        [NameInMap("doc_id")]
        [Validation(Required=false)]
        public string DocId { get; set; }

        // 文档标题
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        // 站点
        [NameInMap("site")]
        [Validation(Required=false)]
        public string Site { get; set; }

        // 语言code
        [NameInMap("language")]
        [Validation(Required=false)]
        public string Language { get; set; }

        // 内容
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 类型
        [NameInMap("source_type")]
        [Validation(Required=false)]
        public long? SourceType { get; set; }

        // 最后修改时间
        [NameInMap("ext_modified_time")]
        [Validation(Required=false)]
        public long? ExtModifiedTime { get; set; }

        // 关键字
        [NameInMap("key_words")]
        [Validation(Required=false)]
        public string KeyWords { get; set; }

        // 显示类型
        [NameInMap("show_type")]
        [Validation(Required=false)]
        public long? ShowType { get; set; }

        // 页面上下文
        [NameInMap("page_context")]
        [Validation(Required=false)]
        public List<PageContext> PageContext { get; set; }

        // 内容对象
        // 
        // 
        [NameInMap("content_obj")]
        [Validation(Required=false)]
        public List<ContentObjVO> ContentObj { get; set; }

    }

}
