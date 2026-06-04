// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SAAS_SECURITY.Models
{
    // 内容检测接口返回值
    public class SecurityRiskContentAnalyzeResponse : TeaModel {
        // 场景id
        [NameInMap("app_scene_data_id")]
        [Validation(Required=false)]
        public string AppSceneDataId { get; set; }

        // 返回事件码，用于异步查询
        [NameInMap("event_id")]
        [Validation(Required=false)]
        public string EventId { get; set; }

        // 是否需要异步查询
        [NameInMap("need_query")]
        [Validation(Required=false)]
        public string NeedQuery { get; set; }

        // 返回结果
        [NameInMap("result_action")]
        [Validation(Required=false)]
        public string ResultAction { get; set; }

        // 命中场景
        [NameInMap("hit_detect_items")]
        [Validation(Required=false)]
        public List<InfoSecHitDetectItem> HitDetectItems { get; set; }

        // 描述被命中的风险标签
        [NameInMap("risk_labels")]
        [Validation(Required=true)]
        public string RiskLabels { get; set; }

    }

}
