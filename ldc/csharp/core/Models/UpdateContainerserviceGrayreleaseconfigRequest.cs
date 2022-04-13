// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class UpdateContainerserviceGrayreleaseconfigRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 发布单的time series id
        [NameInMap("time_series_id")]
        [Validation(Required=false)]
        public string TimeSeriesId { get; set; }

        // lks service id，与plan_id同时传时前者生效。
        [NameInMap("lks_service_id")]
        [Validation(Required=false)]
        public string LksServiceId { get; set; }

        // 灰度规则
        [NameInMap("gray_release_config")]
        [Validation(Required=true)]
        public GrayReleaseConfig GrayReleaseConfig { get; set; }

    }

}
