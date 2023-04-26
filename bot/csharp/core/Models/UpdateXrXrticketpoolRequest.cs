// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class UpdateXrXrticketpoolRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 券池名称
        [NameInMap("xr_ticket_pool_name")]
        [Validation(Required=true)]
        public string XrTicketPoolName { get; set; }

        // 资源id
        [NameInMap("resource_id")]
        [Validation(Required=false)]
        public string ResourceId { get; set; }

        // 通行证有效期
        [NameInMap("valid_time")]
        [Validation(Required=false)]
        public string ValidTime { get; set; }

        // 体验时长
        [NameInMap("test_time")]
        [Validation(Required=false)]
        public long? TestTime { get; set; }

        // vr设备集合
        [NameInMap("xr_apps")]
        [Validation(Required=false)]
        public string XrApps { get; set; }

        // 券池数量，能发多少张券
        [NameInMap("max_pool_count")]
        [Validation(Required=false)]
        public long? MaxPoolCount { get; set; }

        // 核销类型，资源id改变时必须有值
        [NameInMap("xr_verification_type")]
        [Validation(Required=false)]
        public string XrVerificationType { get; set; }

        // 业务类型
        [NameInMap("biz_scene")]
        [Validation(Required=true)]
        public string BizScene { get; set; }

    }

}
