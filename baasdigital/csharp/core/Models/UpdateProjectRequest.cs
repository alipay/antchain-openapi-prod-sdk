// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDIGITAL.Models
{
    public class UpdateProjectRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 链ID
        [NameInMap("bizid")]
        [Validation(Required=true)]
        public string Bizid { get; set; }

        // 数字权证项目ID
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 项目发行权证的总数上限。如果设置为可增发，则可以使用增发接口提高总数量上限
        [NameInMap("amount")]
        [Validation(Required=false)]
        public long? Amount { get; set; }

        // 项目发行后权证数量是否可增发。
        // true:可增发
        // false:不可增发
        [NameInMap("limited_amount")]
        [Validation(Required=false)]
        public bool? LimitedAmount { get; set; }

        // 项目权证是否可核销。false:不可核销；true:可核销
        [NameInMap("write_offable")]
        [Validation(Required=false)]
        public bool? WriteOffable { get; set; }

        // 项目权证是否可销毁。false:不可销毁；true:可销毁
        [NameInMap("burnable")]
        [Validation(Required=false)]
        public bool? Burnable { get; set; }

        // 托管账户信息(推荐)，托管和非拖管必选一种
        [NameInMap("account_info")]
        [Validation(Required=true)]
        public AccountInfo AccountInfo { get; set; }

    }

}
