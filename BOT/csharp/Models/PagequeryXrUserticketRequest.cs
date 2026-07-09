// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class PagequeryXrUserticketRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 所属业务
        [NameInMap("biz_scene")]
        [Validation(Required=true)]
        public string BizScene { get; set; }

        // 资源id
        [NameInMap("resource_id")]
        [Validation(Required=false)]
        public string ResourceId { get; set; }

        // 用户id
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 用户通行证状态，
        // VALID：待核销
        // WRITE_OFF：已核销
        // EXPIRED：已过期
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 当前页
        [NameInMap("current")]
        [Validation(Required=true)]
        public long? Current { get; set; }

        // 每页数量
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

    }

}
