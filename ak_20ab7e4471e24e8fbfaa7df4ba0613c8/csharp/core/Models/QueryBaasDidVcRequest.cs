// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_20ab7e4471e24e8fbfaa7df4ba0613c8.Models
{
    public class QueryBaasDidVcRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // vc id，可通过该字符串来查询vc具体内容
        [NameInMap("vc_id")]
        [Validation(Required=true)]
        public string VcId { get; set; }

        // 验证者id
        [NameInMap("verifier_did")]
        [Validation(Required=false)]
        public string VerifierDid { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

        // 可验证声明的完整声明 {"content":{"verion":"0.7.0","issuer":"xxxx","subject":"xxxx","expire":1530735444,"issucanceDate":1530735000,"id":"XXXX","claim":{//用户自定义},"status":{"type":"XXXX","id":"XXXXX"}},"proof":{"type":"ecdsa","created":"2018-06-18T21:19:10Z","verificationMethod":"XXXX","signatureValue":"XXXXX"}}
        [NameInMap("vc_content")]
        [Validation(Required=false)]
        public string VcContent { get; set; }

    }

}
