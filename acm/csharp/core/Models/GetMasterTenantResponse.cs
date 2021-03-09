// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    public class GetMasterTenantResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 蚂蚁通行证签约账户
        [NameInMap("login_name")]
        [Validation(Required=false)]
        public string LoginName { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 租户创建时间，ISO8601格式	
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        // 客户id
        [NameInMap("customer_id")]
        [Validation(Required=false)]
        public string CustomerId { get; set; }

        // 租户描述信息	
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 租户名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 租户最近一次修改时间，ISO8601格式	
        [NameInMap("update_time")]
        [Validation(Required=false)]
        public string UpdateTime { get; set; }

        // 用户类型
        [NameInMap("user_type")]
        [Validation(Required=false)]
        public string UserType { get; set; }

    }

}
