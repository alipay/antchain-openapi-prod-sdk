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

        // 请求id，每一次请求保持唯一；若重复，则更新原数据；
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 项目ID，待蚂蚁分配
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 营销模式，AI_HANGUP_SMS("AI挂短")， AI_OFFICIAL_ACCOUNT("AI公众号"), BPO_WECHAT("BPO企微"), AI_BPO("AI_BPO")
        [NameInMap("marketing_mode")]
        [Validation(Required=false)]
        public string MarketingMode { get; set; }

        // 投保特征短链
        [NameInMap("insure_short_url")]
        [Validation(Required=true)]
        public string InsureShortUrl { get; set; }

        // 加密类型：MD5，32位[小]
        [NameInMap("encryption_type")]
        [Validation(Required=true)]
        public string EncryptionType { get; set; }

        // 加密用户标识
        [NameInMap("encrypted_user_id")]
        [Validation(Required=true)]
        public string EncryptedUserId { get; set; }

        // 应以识别当前用户点击投保页面的唯一标识
        [NameInMap("landing_visit_id")]
        [Validation(Required=true)]
        public string LandingVisitId { get; set; }

        // 节点类型
        [NameInMap("node_type")]
        [Validation(Required=true)]
        public string NodeType { get; set; }

        // 节点状态（0-未完成；1-已完成）
        [NameInMap("node_status")]
        [Validation(Required=true)]
        public string NodeStatus { get; set; }

        // 事件完成时间（yyyy-MM-dd HH:mm:ss）
        [NameInMap("event_time")]
        [Validation(Required=true)]
        public string EventTime { get; set; }

    }

}
