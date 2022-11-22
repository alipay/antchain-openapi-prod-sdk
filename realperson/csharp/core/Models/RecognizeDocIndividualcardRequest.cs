// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class RecognizeDocIndividualcardRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 长度不超过32位的0-9A-Za-z字符串。
        // 外部请求ID，由调用方自行生成并自行保证唯一，以便问题定位。
        [NameInMap("out_order_no")]
        [Validation(Required=true)]
        public string OutOrderNo { get; set; }

        // 待识别的卡类型。取值约束：ID_CARD（身份证）;EEP_TO_ML_CARD（港澳来往大陆通行证）;BANK_CARD（银行卡）
        [NameInMap("card_type")]
        [Validation(Required=true)]
        public string CardType { get; set; }

        // 传入的图片是base64编码的图片还是图片的URL。取值约束：BASE64（类型为base64）；URL（类型为URL）
        [NameInMap("data_type")]
        [Validation(Required=true)]
        public string DataType { get; set; }

        // 传入的图片的具体内容，需要与data_type的选择保持一致。
        [NameInMap("data_content")]
        [Validation(Required=true)]
        public string DataContent { get; set; }

        // 入参data_content是否经公钥RSA加密。不填默认不加密。取值约束：0（不加密）；1（加密）
        [NameInMap("req_enc_type")]
        [Validation(Required=false)]
        public string ReqEncType { get; set; }

        // 出参ocr_info是否经AES加密。不填默认不加密。取值约束：0（不加密）；1（加密）
        [NameInMap("resp_enc_type")]
        [Validation(Required=false)]
        public string RespEncType { get; set; }

        // 经过公钥RSA加密的AES密钥，用于对出参ocr_info加密。当resp_enc_type =1时必填。
        [NameInMap("resp_enc_token")]
        [Validation(Required=false)]
        public string RespEncToken { get; set; }

        // 扩展信息JSON串。
        [NameInMap("extern_param")]
        [Validation(Required=false)]
        public string ExternParam { get; set; }

    }

}
