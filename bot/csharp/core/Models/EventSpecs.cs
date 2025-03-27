// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 事件数据领域参数 
    public class EventSpecs : TeaModel {
        // 物模型事件ID
        [NameInMap("event_model_id")]
        [Validation(Required=true)]
        public string EventModelId { get; set; }

        // 是否返回上链HASH，缺省值按false处理
        [NameInMap("return_hash")]
        [Validation(Required=false)]
        public bool? ReturnHash { get; set; }

        // 业务数据标识
        [NameInMap("biz_type")]
        [Validation(Required=false)]
        public string BizType { get; set; }

        // 提交日期
        [NameInMap("submit_date")]
        [Validation(Required=false)]
        public string SubmitDate { get; set; }

        // 是否是补数据内容
        [NameInMap("is_repaired")]
        [Validation(Required=false)]
        public bool? IsRepaired { get; set; }

    }

}
