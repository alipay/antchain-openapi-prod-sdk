// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    public class QueryAppmarketCommondataResponse : TeaModel {
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

        // 实际返回的实体编码
        [NameInMap("entity_code")]
        [Validation(Required=false)]
        public string EntityCode { get; set; }

        // 实际返回的结构版本
        [NameInMap("schema_version")]
        [Validation(Required=false)]
        public string SchemaVersion { get; set; }

        // JSON 数组字符串；即使无数据也返回 []，不要配置成 ARRAY / OBJECT
        [NameInMap("data_json")]
        [Validation(Required=false)]
        public string DataJson { get; set; }

        // JSON 对象字符串，放数据范围、口径、溯源等元信息
        [NameInMap("meta_json")]
        [Validation(Required=false)]
        public string MetaJson { get; set; }

        // 满足条件的总记录数
        [NameInMap("total_count")]
        [Validation(Required=false)]
        public long? TotalCount { get; set; }

        // 实际页码
        [NameInMap("page_no")]
        [Validation(Required=false)]
        public long? PageNo { get; set; }

        // 实际每页条数
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

    }

}
