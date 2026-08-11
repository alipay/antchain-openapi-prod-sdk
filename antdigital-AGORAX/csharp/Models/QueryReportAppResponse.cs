// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    public class QueryReportAppResponse : TeaModel {
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

        // 报表类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // dataList使用的 JSON 结构版本
        [NameInMap("schema_version")]
        [Validation(Required=false)]
        public string SchemaVersion { get; set; }

        // 总条数
        [NameInMap("total_count")]
        [Validation(Required=false)]
        public long? TotalCount { get; set; }

        // 页码
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public long? PageNum { get; set; }

        // 每页条数
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 是否存在下一页
        [NameInMap("has_next")]
        [Validation(Required=false)]
        public bool? HasNext { get; set; }

        // JSON 数据列表；每一项为一个合法 JSON 对象的序列化字符串；无数据时返回空列表
        [NameInMap("data_list")]
        [Validation(Required=false)]
        public string DataList { get; set; }

    }

}
