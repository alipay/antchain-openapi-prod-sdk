// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class AuthWitnessFlowRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 发起请求的实例应用ID
        [NameInMap("app_id")]
        [Validation(Required=true)]
        public string AppId { get; set; }

        // 证书id
        [NameInMap("cert_id")]
        [Validation(Required=false)]
        public string CertId { get; set; }

        // 签署页码，单个签时必传
        [NameInMap("page")]
        [Validation(Required=false)]
        public string Page { get; set; }

        // 签署x坐标，单个签时必传
        [NameInMap("pos_x")]
        [Validation(Required=false)]
        public string PosX { get; set; }

        // 签署y坐标，单个签时必传
        [NameInMap("pos_y")]
        [Validation(Required=false)]
        public string PosY { get; set; }

        // 印章图片key
        [NameInMap("seal_file_key")]
        [Validation(Required=false)]
        public string SealFileKey { get; set; }

        // 印章id
        [NameInMap("seal_id")]
        [Validation(Required=false)]
        public string SealId { get; set; }

        // 印章类型，1-模板，2-手绘
        [NameInMap("seal_type")]
        [Validation(Required=true)]
        public long? SealType { get; set; }

        // 签署类型，单个签时必传
        [NameInMap("signature_type")]
        [Validation(Required=false)]
        public string SignatureType { get; set; }

        // 批量签署信息，批量签时必传
        [NameInMap("sign_datas")]
        [Validation(Required=false)]
        public string SignDatas { get; set; }

        // 待签署文档摘要值，单个签时必传
        [NameInMap("sign_hash")]
        [Validation(Required=false)]
        public string SignHash { get; set; }

        // 签署票证
        [NameInMap("sign_ticket")]
        [Validation(Required=true)]
        public string SignTicket { get; set; }

        // 签署主体账号id
        [NameInMap("subject_account_id")]
        [Validation(Required=false)]
        public string SubjectAccountId { get; set; }

        // 第三方文档id，单个签时必传
        [NameInMap("third_doc_id")]
        [Validation(Required=false)]
        public string ThirdDocId { get; set; }

        // 发起请求的鉴权token
        [NameInMap("token")]
        [Validation(Required=true)]
        public string Token { get; set; }

        // 见证流程id
        [NameInMap("witness_flow_id")]
        [Validation(Required=true)]
        public string WitnessFlowId { get; set; }

    }

}
