// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class QueryAicoguardAdbsinkRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 区域id
        [NameInMap("region_id")]
        [Validation(Required=true)]
        public string RegionId { get; set; }

        // DB实例id
        [NameInMap("db_instance_id")]
        [Validation(Required=true)]
        public string DbInstanceId { get; set; }

        // 数据库空间名称
        [NameInMap("name_space")]
        [Validation(Required=true)]
        public string NameSpace { get; set; }

        // 数据库空间密码
        [NameInMap("name_space_password")]
        [Validation(Required=true)]
        public string NameSpacePassword { get; set; }

        // 数据库表名
        [NameInMap("collection_name")]
        [Validation(Required=true)]
        public string CollectionName { get; set; }

        // 要查询的内容
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

    }

}
