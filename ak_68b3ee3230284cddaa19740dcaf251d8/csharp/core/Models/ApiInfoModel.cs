// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_68b3ee3230284cddaa19740dcaf251d8.Models
{
    // api信息结构体
    public class ApiInfoModel : TeaModel {
        // api名称
        [NameInMap("api_name")]
        [Validation(Required=true)]
        public string ApiName { get; set; }

        // 产品码
        [NameInMap("prod_code")]
        [Validation(Required=true)]
        public string ProdCode { get; set; }

        // 是否是内部接口 0对外 1对内
        [NameInMap("internal")]
        [Validation(Required=true)]
        public long? Internal { get; set; }

        // api版本号
        [NameInMap("api_version")]
        [Validation(Required=true)]
        public string ApiVersion { get; set; }

        // api描述
        [NameInMap("api_desc")]
        [Validation(Required=true)]
        public string ApiDesc { get; set; }

        // api所属网关产品id
        [NameInMap("provider_id")]
        [Validation(Required=true)]
        public string ProviderId { get; set; }

    }

}
