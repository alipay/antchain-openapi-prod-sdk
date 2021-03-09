// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    public class GetCurrentidResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

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
