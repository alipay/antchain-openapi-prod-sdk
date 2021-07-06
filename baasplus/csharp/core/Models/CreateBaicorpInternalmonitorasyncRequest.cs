// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    public class CreateBaicorpInternalmonitorasyncRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景id
        [NameInMap("biz_id")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        // 用于内部业务统计的信息
        [NameInMap("biz_info")]
        [Validation(Required=true)]
        public BizInfo BizInfo { get; set; }

        // 监测传播时间，单位暂定天
        [NameInMap("broadcast_time")]
        [Validation(Required=false)]
        public long? BroadcastTime { get; set; }

        // 基于安全考虑，填充NonceId
        [NameInMap("custom_id")]
        [Validation(Required=false)]
        public string CustomId { get; set; }

        // 待检测内容RAW数据
        [NameInMap("entity_data")]
        [Validation(Required=false)]
        public string EntityData { get; set; }

        // 待监测内容类型
        [NameInMap("entity_type")]
        [Validation(Required=true)]
        public string EntityType { get; set; }

        // 待检测内容url，支持HTTP和OSS，OSS从默认源拉取,input_url和input_data不可同时存在
        [NameInMap("entity_url")]
        [Validation(Required=false)]
        public string EntityUrl { get; set; }

        // 监测输入的多个关键词
        [NameInMap("key_words")]
        [Validation(Required=true)]
        public List<string> KeyWords { get; set; }

        // 匹配时长，单位秒
        [NameInMap("matched_duration")]
        [Validation(Required=false)]
        public long? MatchedDuration { get; set; }

        // 监测时长，单位为天
        [NameInMap("monitor_duration")]
        [Validation(Required=false)]
        public long? MonitorDuration { get; set; }

        // 监测频次，单位暂定天
        [NameInMap("monitor_frequency")]
        [Validation(Required=true)]
        public long? MonitorFrequency { get; set; }

        // 监测范围
        [NameInMap("monitor_scope")]
        [Validation(Required=false)]
        public List<string> MonitorScope { get; set; }

        // 监测事件发送时的回调通知URL，若为空则不发送通知，24小时内最少发送成功一次
        [NameInMap("notify_url")]
        [Validation(Required=false)]
        public string NotifyUrl { get; set; }

        // provider id
        [NameInMap("provider_id")]
        [Validation(Required=false)]
        public string ProviderId { get; set; }

        // 监测启动日期，若为空，则立刻开始，从1970开始的毫秒数。
        [NameInMap("start_date")]
        [Validation(Required=false)]
        public long? StartDate { get; set; }

        // 业务方任务id，业务方保证唯一
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

    }

}
