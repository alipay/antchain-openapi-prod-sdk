// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    public class ListTransactionDebugsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 当前分页
        [NameInMap("current_page")]
        [Validation(Required=true)]
        public long? CurrentPage { get; set; }

        // 环境唯一标识
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // id  desc
        [NameInMap("order_by")]
        [Validation(Required=false)]
        public List<OrderByParams> OrderBy { get; set; }

        // 分页大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // appname
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 1.进行中 4.成功
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

        // 1.发起方 2.参与者
        [NameInMap("debug_type")]
        [Validation(Required=false)]
        public string DebugType { get; set; }

    }

}
