// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class GetInterestUrlRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 权益申请编号，重新提交需要不一样
        [NameInMap("right_apply_no")]
        [Validation(Required=true)]
        public string RightApplyNo { get; set; }

        // 	
        // 申请额度，最多保留小数点后两位，单位元
        [NameInMap("apply_limit_amount")]
        [Validation(Required=true)]
        public string ApplyLimitAmount { get; set; }

        // 	
        // 数据授权方名称
        [NameInMap("data_licensor")]
        [Validation(Required=true)]
        public string DataLicensor { get; set; }

        // 回调场景方地址
        [NameInMap("callback_url")]
        [Validation(Required=false)]
        public string CallbackUrl { get; set; }

        // 权益产品编码，暂时固定
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 用户姓名 明文
        [NameInMap("tbr_name")]
        [Validation(Required=true)]
        public string TbrName { get; set; }

        // 用户手机号，明文
        [NameInMap("tbr_phone")]
        [Validation(Required=true)]
        public string TbrPhone { get; set; }

        // 用户身份证，明文
        [NameInMap("tbr_id_card")]
        [Validation(Required=true)]
        public string TbrIdCard { get; set; }

        // 场景方信息,JSON字符串
        [NameInMap("scene_info")]
        [Validation(Required=false)]
        public string SceneInfo { get; set; }

        // 权益版本
        [NameInMap("interest_version")]
        [Validation(Required=false)]
        public string InterestVersion { get; set; }

        // 产品信息
        [NameInMap("product_info")]
        [Validation(Required=false)]
        public string ProductInfo { get; set; }

    }

}
