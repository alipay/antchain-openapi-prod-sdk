// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    // 租户
    public class Tenant : TeaModel {
        // 蚂蚁通行证签约账户
        [NameInMap("ant_account")]
        [Validation(Required=false)]
        public string AntAccount { get; set; }

        // 蚂蚁通行证uid
        [NameInMap("ant_uid")]
        [Validation(Required=false)]
        public string AntUid { get; set; }

        // 金融云官网:ANTCLOUD,蚂蚁开放平台：ANTOPEN
        [NameInMap("business_owner_id")]
        [Validation(Required=false)]
        public string BusinessOwnerId { get; set; }

        // 租户创建时间，ISO8601格式
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        // 租户所在的企业的唯一标识
        [NameInMap("customer")]
        [Validation(Required=false)]
        public string Customer { get; set; }

        // 租户描述信息
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 租户唯一标识
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 租户内部id
        [NameInMap("internal_id")]
        [Validation(Required=false)]
        public string InternalId { get; set; }

        // 租户显示名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 租户最近一次修改时间，ISO8601格式
        [NameInMap("update_time")]
        [Validation(Required=false)]
        public string UpdateTime { get; set; }

    }

}
