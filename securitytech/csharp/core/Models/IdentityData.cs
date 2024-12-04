// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 光鉴智能凭证结构体
    public class IdentityData : TeaModel {
        // 风险等级，枚举值： 0：低风险（打扰率＞10%） 1：中风险（5%＜打扰率≤10%） 2：高风险（打扰率≤5%）
        [NameInMap("is_risk")]
        [Validation(Required=true)]
        public string IsRisk { get; set; }

        // 风险类型，枚举值及对应含义： ● PS：图片被PS篡改 ● SCREEN_PHOTO：屏幕翻拍 ● SCREENSHOT：截屏图片 ● COLOR_PRINT：彩打复印 ● WATERMARK：水印 ● FACE_SIMILAR：人脸相似 ● BACKGROUND_SIMILAR：背景相似 ● SIGNATURE_SIMILAR：证件手写签名相似 格式：以英文逗号分隔，如样例
        [NameInMap("risk_type")]
        [Validation(Required=true)]
        public string RiskType { get; set; }

        // 附加字段,json格式字符串
        [NameInMap("ext_info")]
        [Validation(Required=true)]
        public string ExtInfo { get; set; }

    }

}
