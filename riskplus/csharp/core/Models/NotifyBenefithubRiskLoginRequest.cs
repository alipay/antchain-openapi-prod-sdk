// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class NotifyBenefithubRiskLoginRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 平台码
        // 注：不同平台的平台码都是固定好的，如果传入的平台码有误会抛出平台码错误的信息
        [NameInMap("platform_code")]
        [Validation(Required=true)]
        public string PlatformCode { get; set; }

        // 用户id
        [NameInMap("user_unique_id")]
        [Validation(Required=true)]
        public string UserUniqueId { get; set; }

        // 渠道、平台方推送的手机号
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 产品code必填，后续多产品时可以区分
        [NameInMap("product_code")]
        [Validation(Required=false)]
        public string ProductCode { get; set; }

        // 场景配置信息字符串，用于透传
        [NameInMap("scene_config")]
        [Validation(Required=false)]
        public string SceneConfig { get; set; }

        // 区分流量来源
        [NameInMap("traffic_source")]
        [Validation(Required=false)]
        public string TrafficSource { get; set; }

        // json字符串包含姓名md5、手机号md5、身份证md5，（非必传，针对可当-萨摩耶 必传）
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

    }

}
