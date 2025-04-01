// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_ed7107878c564eda98e507d7451aae75.Models
{
    public class PreviewUniversalsaasDigitalhumanVoiceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户编码
        [NameInMap("tenant_code")]
        [Validation(Required=true)]
        public string TenantCode { get; set; }

        // 2d---2d音色
        // 3d---3d音色
        [NameInMap("classification")]
        [Validation(Required=true)]
        public string Classification { get; set; }

        // 音色编码
        [NameInMap("voice_code")]
        [Validation(Required=true)]
        public string VoiceCode { get; set; }

        // 试听文案
        [NameInMap("text")]
        [Validation(Required=true)]
        public string Text { get; set; }

        // 语速
        [NameInMap("speed")]
        [Validation(Required=false)]
        public long? Speed { get; set; }

        // 音调
        [NameInMap("pitch")]
        [Validation(Required=false)]
        public long? Pitch { get; set; }

        // 音量
        [NameInMap("volume")]
        [Validation(Required=false)]
        public long? Volume { get; set; }

        // 数字人角色id
        [NameInMap("human_id")]
        [Validation(Required=false)]
        public long? HumanId { get; set; }

        // 数字人形象id
        [NameInMap("model_id")]
        [Validation(Required=false)]
        public long? ModelId { get; set; }

    }

}
