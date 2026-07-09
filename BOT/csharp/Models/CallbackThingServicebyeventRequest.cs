// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class CallbackThingServicebyeventRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景码
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 业务类型，同一个scene下可以有不同的业务类型，此字段用于区分业务类型
        [NameInMap("biz_type")]
        [Validation(Required=false)]
        public string BizType { get; set; }

        // 回复日期
        [NameInMap("submit_date")]
        [Validation(Required=false)]
        public string SubmitDate { get; set; }

        // 物模型服务回复数据的模型ID
        [NameInMap("data_model_id")]
        [Validation(Required=true)]
        public string DataModelId { get; set; }

        // 物模型服务回复数据的内容，格式遵循dataModelId约定的格式
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

    }

}
