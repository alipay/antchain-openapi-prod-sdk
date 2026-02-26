// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class CallbackMktEffectRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 请求id，每一次请求保持唯一；若重复，则更新原数据；
        [NameInMap("request_id")]
        [Validation(Required=true, MaxLength=128)]
        public string RequestId { get; set; }

        // 项目ID，待蚂蚁分配
        [NameInMap("project_id")]
        [Validation(Required=true, MaxLength=64)]
        public string ProjectId { get; set; }

        // 营销模式
        // ADVERTISING_TRAFFIC("广告投流"),   
        // LIVE_STREAMING("直播"),    
        // INFLUENCER("达人"),    
        // AI_HANGUP_SMS("AI挂短"), 
        // AI_OFFICIAL_ACCOUNT("AI公众号"),    
        // BPO_WECHAT("BPO企微")
        [NameInMap("marketing_mode")]
        [Validation(Required=true, MaxLength=64)]
        public string MarketingMode { get; set; }

        // 投保特征短链
        [NameInMap("insure_short_url")]
        [Validation(Required=true, MaxLength=256)]
        public string InsureShortUrl { get; set; }

        // 加密类型：MD5，32位[小]
        [NameInMap("encryption_type")]
        [Validation(Required=true, MaxLength=32)]
        public string EncryptionType { get; set; }

        // 加密用户标识
        [NameInMap("encrypted_user_id")]
        [Validation(Required=true, MaxLength=64)]
        public string EncryptedUserId { get; set; }

        // 用户点击投保页唯一标识
        [NameInMap("click_id")]
        [Validation(Required=true, MaxLength=128)]
        public string ClickId { get; set; }

        // 事件完成时间（yyyy-MM-dd HH:mm:ss）
        [NameInMap("click_time")]
        [Validation(Required=true, MaxLength=32)]
        public string ClickTime { get; set; }

        // 节点类型
        [NameInMap("node_type")]
        [Validation(Required=true, MaxLength=64)]
        public string NodeType { get; set; }

        // 节点详细信息
        [NameInMap("node_info")]
        [Validation(Required=true, MaxLength=1024)]
        public string NodeInfo { get; set; }

    }

}
