// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    public class GetCurrentidResponse : TeaModel {
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

        // 创建时间，ISO8601格式
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public string CreateTime { get; set; }

        // 身份实体所属企业
        [NameInMap("customer")]
        [Validation(Required=true)]
        public string Customer { get; set; }

        // 身份实体ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 身份实体类型，OPERATOR(操作员)或SERVICE(服务账号)
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 最近一次修改时间，ISO8601格式
        [NameInMap("update_time")]
        [Validation(Required=true)]
        public string UpdateTime { get; set; }

    }

}
