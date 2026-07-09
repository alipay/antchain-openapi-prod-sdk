// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryAnalysisRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 发行设备Id集合
        // 
        // 
        [NameInMap("dis_id_list")]
        [Validation(Required=false)]
        public List<string> DisIdList { get; set; }

        // 时间，格式YYYYMMDD
        // 
        // 
        [NameInMap("time")]
        [Validation(Required=true)]
        public string Time { get; set; }

        // 场景码
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // SCENE : 场景设备资产分析   DEVICE：设备分析 BIZ：订单分析   ， 默认为DEVICE
        [NameInMap("scope")]
        [Validation(Required=false)]
        public string Scope { get; set; }

    }

}
