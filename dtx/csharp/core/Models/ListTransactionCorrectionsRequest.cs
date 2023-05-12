// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    public class ListTransactionCorrectionsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // aaa
        [NameInMap("action_type")]
        [Validation(Required=false)]
        public string ActionType { get; set; }

        // current_page
        [NameInMap("current_page")]
        [Validation(Required=true)]
        public long? CurrentPage { get; set; }

        // instanceId
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // id desc
        [NameInMap("order_by")]
        [Validation(Required=false)]
        public List<OrderByParams> OrderBy { get; set; }

        // page_size
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 0 已提交 4 成功
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

        // app_name
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

    }

}
