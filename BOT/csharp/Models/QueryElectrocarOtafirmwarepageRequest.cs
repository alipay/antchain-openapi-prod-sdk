// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryElectrocarOtafirmwarepageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 当前页码
        [NameInMap("current")]
        [Validation(Required=true)]
        public long? Current { get; set; }

        // 每页显示条数
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 可信物联唯一产品标识
        [NameInMap("trust_product_key")]
        [Validation(Required=true)]
        public string TrustProductKey { get; set; }

        // OTA升级包版本号
        [NameInMap("dest_version")]
        [Validation(Required=false)]
        public string DestVersion { get; set; }

        // 模块名称
        [NameInMap("module_name")]
        [Validation(Required=true)]
        public string ModuleName { get; set; }

    }

}
