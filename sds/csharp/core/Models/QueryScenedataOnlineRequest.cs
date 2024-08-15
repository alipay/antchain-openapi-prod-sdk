// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SDS.Models
{
    public class QueryScenedataOnlineRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务号，根据biz_no_type修改类型
        [NameInMap("biz_no")]
        [Validation(Required=true, MaxLength=256)]
        public string BizNo { get; set; }

        // 业务号类型
        [NameInMap("biz_no_type")]
        [Validation(Required=true, MaxLength=64)]
        public string BizNoType { get; set; }

        // 场景，根据此参数路由适配到不同数据源
        [NameInMap("scene")]
        [Validation(Required=true, MaxLength=32)]
        public string Scene { get; set; }

        // 来源标识
        [NameInMap("source_mark")]
        [Validation(Required=false, MaxLength=32)]
        public string SourceMark { get; set; }

        // 条件，目前只支持IN的逻辑
        [NameInMap("condition")]
        [Validation(Required=false)]
        public BizNoCondition Condition { get; set; }

    }

}
