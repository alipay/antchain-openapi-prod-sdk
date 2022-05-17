// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Osp.Models
{
    public class QueryEndpointsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 网络类型, classic, vpc
        [NameInMap("network")]
        [Validation(Required=true)]
        public string Network { get; set; }

        // 当前页数
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 分页大小, 考虑到数据量并不多, 建议设置分页足够大(就10几个), 比如100, 一次性拿走所有数据
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 租户名
        [NameInMap("tenant")]
        [Validation(Required=true)]
        public string Tenant { get; set; }

        // 工作区名称, 如果不填, 则返回全部workspace的信息
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
