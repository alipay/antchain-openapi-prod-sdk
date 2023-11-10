// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class BatchqueryUmktRobotcallDetailRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 上传外呼任务返回的callId
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 手机号
        [NameInMap("phone_numbers")]
        [Validation(Required=true)]
        public List<string> PhoneNumbers { get; set; }

        // 手机号类型
        [NameInMap("template_type")]
        [Validation(Required=true)]
        public string TemplateType { get; set; }

        // 场景策略id
        [NameInMap("scene_strategy_id")]
        [Validation(Required=true)]
        public long? SceneStrategyId { get; set; }

        // 意向标签
        [NameInMap("intent_tags")]
        [Validation(Required=false)]
        public List<string> IntentTags { get; set; }

        // 开始外呼时间
        [NameInMap("call_date")]
        [Validation(Required=false)]
        public string CallDate { get; set; }

        // 结束外呼时间
        [NameInMap("end_call_date")]
        [Validation(Required=false)]
        public string EndCallDate { get; set; }

        // 页码
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public long? PageNum { get; set; }

        // 页数
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

    }

}
