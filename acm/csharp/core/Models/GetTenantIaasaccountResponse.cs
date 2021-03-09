// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    public class GetTenantIaasaccountResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 账户关联的AccessKey
        [NameInMap("access_key")]
        [Validation(Required=false)]
        public string AccessKey { get; set; }

        // 账户关联的AccessSecret
        [NameInMap("access_secret")]
        [Validation(Required=false)]
        public string AccessSecret { get; set; }

        // IaaS账户名
        [NameInMap("account")]
        [Validation(Required=false)]
        public string Account { get; set; }

        // 创建时间，ISO8601格式
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        // IaaS账户id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

    }

}
