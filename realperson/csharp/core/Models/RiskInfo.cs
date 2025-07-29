// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    // 卡证OCR风险结果
    public class RiskInfo : TeaModel {
        // 是否为复印件（仅身份证、银行卡含该字段）。0：否，1：是
        [NameInMap("copy")]
        [Validation(Required=false)]
        public string Copy { get; set; }

        // 是否翻拍（仅身份证含该字段）。0：否，1：是
        [NameInMap("reshoot")]
        [Validation(Required=false)]
        public string Reshoot { get; set; }

        // normal-识别正常
        // non_idcard-上传的图片中不包含身份证
        // blurred-身份证模糊
        // other_type_card-其他类型证照
        // over_exposure-身份证关键字段反光或过曝
        // over_dark-身份证欠曝（亮度过低）
        // unknown-未知状态
        [NameInMap("image_status")]
        [Validation(Required=false)]
        public List<string> ImageStatus { get; set; }

        // 输入参数 risk_info_type=true 时，则返回该字段，判断身份证是否存在风险，返回值：
        // normal-正常身份证；
        // copy-复印件；
        // temporary-临时身份证；
        // screen-翻拍；
        // PS-被PS修改；
        // unknown-其他未知情况
        [NameInMap("risk_type")]
        [Validation(Required=false)]
        public List<string> RiskType { get; set; }

        // 图片质量
        [NameInMap("card_quality")]
        [Validation(Required=false)]
        public CardQuality CardQuality { get; set; }

        // 证件一致性
        [NameInMap("idcard_number_type")]
        [Validation(Required=false)]
        public string IdcardNumberType { get; set; }

    }

}
