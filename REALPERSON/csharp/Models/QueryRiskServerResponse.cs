// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class QueryRiskServerResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 攻击结论
        [NameInMap("face_attack")]
        [Validation(Required=false)]
        public string FaceAttack { get; set; }

        // 综合风险检测结果
        [NameInMap("risk_result")]
        [Validation(Required=false)]
        public RiskResult RiskResult { get; set; }

        // Aigc风险检测结论
        [NameInMap("aigc_risk_result")]
        [Validation(Required=false)]
        public AigcRiskResult AigcRiskResult { get; set; }

        // 是否面部遮挡
        [NameInMap("face_occlusion")]
        [Validation(Required=false)]
        public bool? FaceOcclusion { get; set; }

        // 人脸性别年龄预估
        [NameInMap("attributes")]
        [Validation(Required=false)]
        public string Attributes { get; set; }

        // 人脸质量分和小分
        [NameInMap("quality_result")]
        [Validation(Required=false)]
        public string QualityResult { get; set; }

        // 风险咨询唯一标识
        [NameInMap("certify_id")]
        [Validation(Required=false)]
        public string CertifyId { get; set; }

    }

}
