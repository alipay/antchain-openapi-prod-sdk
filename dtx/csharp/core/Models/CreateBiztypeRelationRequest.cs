// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    public class CreateBiztypeRelationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 参与者名称数组
        [NameInMap("action_array")]
        [Validation(Required=true)]
        public List<string> ActionArray { get; set; }

        // app
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // biztype
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 一句话描述
        [NameInMap("desc")]
        [Validation(Required=true)]
        public string Desc { get; set; }

        // 00001
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // add  /  modify
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

    }

}
