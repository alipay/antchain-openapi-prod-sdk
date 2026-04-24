// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class BatchqueryQmpTaskDetailRequest : TeaModel {
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

        // 手机号列表
        [NameInMap("customer_keys")]
        [Validation(Required=true)]
        public List<string> CustomerKeys { get; set; }

        // 手机号类型
        [NameInMap("key_template")]
        [Validation(Required=true)]
        public string KeyTemplate { get; set; }

        // 场景策略id
        [NameInMap("scene_strategy_id")]
        [Validation(Required=true)]
        public long? SceneStrategyId { get; set; }

        // 开始外呼时间，只可查询最近30天的日期
        [NameInMap("call_date")]
        [Validation(Required=false)]
        public string CallDate { get; set; }

        // 结束外呼时间
        [NameInMap("end_call_date")]
        [Validation(Required=false)]
        public string EndCallDate { get; set; }

        // 分流字段，行业标签区分哈啰流量归属于umkt或qmp
        [NameInMap("industry_tag")]
        [Validation(Required=false)]
        public string IndustryTag { get; set; }

    }

}
