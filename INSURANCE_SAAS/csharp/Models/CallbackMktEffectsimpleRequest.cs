// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class CallbackMktEffectsimpleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 请求id，每一次请求保持唯一；若重复，则更新原数据
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 项目ID，待蚂蚁分配
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 营销模式，枚举：LIVE_STREAMING-直播投流、ADVERTISING-广告投流、AI_WECHAT-AI企微、BPO_SHORT_HANG-BPO挂短、BPO_OFFICIAL_ACCOUNT-BPO公众号、SMS-短信
        [NameInMap("marketing_mode")]
        [Validation(Required=false)]
        public string MarketingMode { get; set; }

        // 投保特征短链，挂短模式必填
        [NameInMap("insure_short_url")]
        [Validation(Required=false)]
        public string InsureShortUrl { get; set; }

        // 加密类型：MD5，32位[小]
        [NameInMap("encryption_type")]
        [Validation(Required=true)]
        public string EncryptionType { get; set; }

        // 加密用户标识
        [NameInMap("encrypted_user_id")]
        [Validation(Required=true)]
        public string EncryptedUserId { get; set; }

        // 用以识别当前用户点击投保页面的唯一标识
        [NameInMap("landing_visit_id")]
        [Validation(Required=true)]
        public string LandingVisitId { get; set; }

        // 事件类型（节点类：LIVE_STREAMING_START/LIVE_STREAMING_END/FORM_SUBMIT/POLICY_ISSUE/PREMIUM_PAYMENT/UNDERWRITING；标签类：LABEL_SMS_SEND/LABEL_ADD/LABEL_RENEWAL_M2/LABEL_RENEWAL_M3/LABEL_INTENTION）
        [NameInMap("node_type")]
        [Validation(Required=true)]
        public string NodeType { get; set; }

        // 事件状态，节点类：0-未完成 1-已完成；标签类：支持1-X格式（X为标签值）
        [NameInMap("node_status")]
        [Validation(Required=true)]
        public string NodeStatus { get; set; }

        // 事件完成时间（yyyy-MM-dd HH:mm:ss）
        [NameInMap("event_time")]
        [Validation(Required=true)]
        public string EventTime { get; set; }

        // 扩展json字段，最大2048字符，用于传递isfrommy数据源、年化保费等扩展信息
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

    }

}
