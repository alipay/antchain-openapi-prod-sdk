// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUQING.Models
{
    // 预警消息体
    public class Alarm : TeaModel {
        // 人工打的标签
        [NameInMap("tags")]
        [Validation(Required=false)]
        public List<string> Tags { get; set; }

        // 预警内容摘要
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 预警时间戳
        [NameInMap("alarm_timestamp")]
        [Validation(Required=false)]
        public long? AlarmTimestamp { get; set; }

        // 舆情项目id
        [NameInMap("project_id")]
        [Validation(Required=false)]
        public long? ProjectId { get; set; }

        // 修改人
        [NameInMap("modifier_name")]
        [Validation(Required=false)]
        public string ModifierName { get; set; }

        // 消息标题
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        // 消息id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 作者名称
        [NameInMap("author_name")]
        [Validation(Required=false)]
        public string AuthorName { get; set; }

        // 预警规则id
        [NameInMap("alarm_rule_id")]
        [Validation(Required=false)]
        public long? AlarmRuleId { get; set; }

        // 预警规则类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 修改时间戳
        [NameInMap("gmt_modified_timestamp")]
        [Validation(Required=false)]
        public long? GmtModifiedTimestamp { get; set; }

        // 完整消息
        [NameInMap("message")]
        [Validation(Required=false)]
        public YuqingMessage Message { get; set; }

        // project
        [NameInMap("project_name")]
        [Validation(Required=false)]
        public string ProjectName { get; set; }

        // alarm_rule_name
        [NameInMap("alarm_rule_name")]
        [Validation(Required=false)]
        public string AlarmRuleName { get; set; }

        // alarm_level
        [NameInMap("alarm_level")]
        [Validation(Required=false)]
        public string AlarmLevel { get; set; }

        // doc_media_type
        [NameInMap("doc_media_type")]
        [Validation(Required=false)]
        public string DocMediaType { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
