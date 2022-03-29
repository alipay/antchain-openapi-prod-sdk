// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryUnifiedalarmSubRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 通知人
        [NameInMap("subscriber")]
        [Validation(Required=false)]
        public string Subscriber { get; set; }

        // 通知人的类型
        [NameInMap("subscriber_type")]
        [Validation(Required=false)]
        public string SubscriberType { get; set; }

        // 是否包含我 
        [NameInMap("only_me")]
        [Validation(Required=false)]
        public bool? OnlyMe { get; set; }

        // 工作区名
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // 规则id 
        [NameInMap("alarm_rule_id")]
        [Validation(Required=false)]
        public long? AlarmRuleId { get; set; }

        // 模板id
        [NameInMap("alarm_tpl_id")]
        [Validation(Required=false)]
        public long? AlarmTplId { get; set; }

        // 当前页
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // 页面尺寸
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 订阅人来源
        [NameInMap("subscriber_source")]
        [Validation(Required=false)]
        public string SubscriberSource { get; set; }

    }

}
