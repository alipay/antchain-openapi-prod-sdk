// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOTHK.Models
{
    // 事件数据领域参数
    public class EventSpecs : TeaModel {
        // 物模型事件ID
        [NameInMap("event_model_id")]
        [Validation(Required=true)]
        public string EventModelId { get; set; }

        // 业务数据标识
        [NameInMap("biz_type")]
        [Validation(Required=false)]
        public string BizType { get; set; }

        // 
        // submit_date	STRING	否	2024-08-15		
        // 
        [NameInMap("submit_date")]
        [Validation(Required=false)]
        public string SubmitDate { get; set; }

        // 冗余字段，请忽略
        [NameInMap("return_hash")]
        [Validation(Required=false)]
        public bool? ReturnHash { get; set; }

    }

}
