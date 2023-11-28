// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_34265723f40d4064802e0e2ffb558d46.Models
{
    public class ListUniversalsaasDigitalhumanLiveVideoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // bUC_Weh3
        [NameInMap("tenant_code")]
        [Validation(Required=true)]
        public string TenantCode { get; set; }

        // 蚂蚁数字人平台直播id
        [NameInMap("live_id")]
        [Validation(Required=true)]
        public string LiveId { get; set; }

        // all全部、normal常规、temporary临时插播
        [NameInMap("video_type")]
        [Validation(Required=true)]
        public string VideoType { get; set; }

        // 业务标识
        [NameInMap("biz_name")]
        [Validation(Required=false)]
        public string BizName { get; set; }

    }

}
