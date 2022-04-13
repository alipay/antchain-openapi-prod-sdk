// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class QueryContainerserivceGrayreleaseconfigRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 发布单的time_series_id
        [NameInMap("time_series_id")]
        [Validation(Required=false)]
        public string TimeSeriesId { get; set; }

        // lks service的id，如果time_series_id与lks_service_id同时指定，后者生效
        [NameInMap("lks_service_id")]
        [Validation(Required=false)]
        public string LksServiceId { get; set; }

    }

}
