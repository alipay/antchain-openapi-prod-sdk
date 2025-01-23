// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class CreateEvidenceLiveRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 幂等字段
        [NameInMap("client_token")]
        [Validation(Required=true)]
        public string ClientToken { get; set; }

        // 取证用户id
        [NameInMap("evidence_user_id")]
        [Validation(Required=true)]
        public string EvidenceUserId { get; set; }

        // 取证公证处
        [NameInMap("notary_office")]
        [Validation(Required=true)]
        public string NotaryOffice { get; set; }

        // 取证平台：2：陌陌4：比心，5：小红书，6：lespark
        [NameInMap("obtain_platform")]
        [Validation(Required=false)]
        public long? ObtainPlatform { get; set; }

        // 1：PC、2：移动设备
        [NameInMap("obtain_device_type")]
        [Validation(Required=false)]
        public string ObtainDeviceType { get; set; }

        // 直播取证标题（自定义）
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        // 预定时间：分钟，建议传值范围5-20分钟
        [NameInMap("expected_duration")]
        [Validation(Required=false)]
        public long? ExpectedDuration { get; set; }

        // json字符串，取证平台动态参数，其参数取决于type，具体参数见
        // 附录
        [NameInMap("platform_dynamic_params")]
        [Validation(Required=false)]
        public string PlatformDynamicParams { get; set; }

        // 取证类型（通用直播取证：DEFAULT）（过期，后续版本逐步删除）
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 取证网址信息（过期，后续版本逐步删除）
        [NameInMap("web_url")]
        [Validation(Required=false)]
        public EvidenceWebUrlInfo WebUrl { get; set; }

        // 主播 ID（过期，后续版本逐步删除）
        [NameInMap("profile_id")]
        [Validation(Required=false)]
        public string ProfileId { get; set; }

        // 1：视频点播，2：视频直播，3：背景音乐（过期，后续版本逐步删除）
        [NameInMap("obtain_type")]
        [Validation(Required=false)]
        public string ObtainType { get; set; }

        // 主播名称（过期，后续版本逐步删除）
        [NameInMap("anchor_name")]
        [Validation(Required=false)]
        public string AnchorName { get; set; }

    }

}
