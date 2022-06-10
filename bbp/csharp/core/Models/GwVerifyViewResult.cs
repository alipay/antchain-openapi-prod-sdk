// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BBP.Models
{
    // 核身渲染结果
    public class GwVerifyViewResult : TeaModel {
        // 核身上下文id
        [NameInMap("verify_id")]
        [Validation(Required=true)]
        public string VerifyId { get; set; }

        // 核审产品码，支持多种核身产品。 ZK_FACE_VERIFY：人脸识别
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 核身分组
        [NameInMap("group")]
        [Validation(Required=true)]
        public string Group { get; set; }

        // 返回结果
        [NameInMap("response_params")]
        [Validation(Required=true)]
        public List<NameValuePair> ResponseParams { get; set; }

        // 核身渲染是否调用成功
        [NameInMap("success")]
        [Validation(Required=true)]
        public bool? Success { get; set; }

        // 返回码
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 返回信息
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

    }

}
