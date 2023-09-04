// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 物模型事件VO
    public class ThingModelEventVO : TeaModel {
        // 名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 物模型功能Id
        [NameInMap("feature_id")]
        [Validation(Required=true)]
        public string FeatureId { get; set; }

        // 业务标识
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 事件属性列表
        [NameInMap("event_properties")]
        [Validation(Required=true)]
        public string EventProperties { get; set; }

    }

}
