// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class CallbackAasMktLiveeffectRequest : TeaModel {
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

        // 营销模式，AI_HANGUP_SMS("AI挂短")， AI_OFFICIAL_ACCOUNT("AI公众号"), BPO_WECHAT("BPO企微"), AI_BPO("AI_BPO")， LIVE_STREAMING("直播")
        [NameInMap("marketing_mode")]
        [Validation(Required=true)]
        public string MarketingMode { get; set; }

        // 加密类型：MD5，32位[小]
        [NameInMap("encryption_type")]
        [Validation(Required=true)]
        public string EncryptionType { get; set; }

        // 加密用户标识
        [NameInMap("encrypted_user_id")]
        [Validation(Required=true)]
        public string EncryptedUserId { get; set; }

        // 事件完成时间（yyyy-MM-dd HH:mm:ss）
        [NameInMap("event_time")]
        [Validation(Required=true)]
        public string EventTime { get; set; }

        // 节点类型
        [NameInMap("node_type")]
        [Validation(Required=true)]
        public string NodeType { get; set; }

        // 节点详细信息
        [NameInMap("node_info")]
        [Validation(Required=true)]
        public string NodeInfo { get; set; }

        // 用户转化的落地页 URL，H5 类落地页
        [NameInMap("landing_page_url")]
        [Validation(Required=true)]
        public string LandingPageUrl { get; set; }

        // N	点击 ID，来自落地页 URL、小程序 path 的埋点
        [NameInMap("click_id")]
        [Validation(Required=false)]
        public string ClickId { get; set; }

        // 产品 ID-固定参数，与商品详情页的 H5 进行绑定
        // 或者通过埋点数据获取
        [NameInMap("product_id")]
        [Validation(Required=false)]
        public string ProductId { get; set; }

        // 用户 IP
        [NameInMap("ip")]
        [Validation(Required=false)]
        public string Ip { get; set; }

        // ua
        [NameInMap("ua")]
        [Validation(Required=false)]
        public string Ua { get; set; }

        // 直播间号 - 动参，每日直播时添加至 URL
        [NameInMap("live_room_id")]
        [Validation(Required=false)]
        public string LiveRoomId { get; set; }

        // 直播间开播时间 - 动参（yyyy-MM-dd HH:mm:ss）
        [NameInMap("live_start_time")]
        [Validation(Required=false)]
        public string LiveStartTime { get; set; }

        // 扩展字段
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

        // 直播间开播场次-动参，每日每场直播时添加至 URl（唯一ID 生成规则：直播间 ID 后两位+开播时间的年（后两位）月日时分
        // 举例：若直播间 ID 为 kxz123456，开播时间为 2026-06-18 17：22，此时唯一 ID 为：562606181722
        // ）
        [NameInMap("live_session_id")]
        [Validation(Required=false)]
        public string LiveSessionId { get; set; }

    }

}
