// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ZOLOZFACEVERIFY.Models
{
    public class RecognizeFaceauthOcrResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // Map的json格式,预留
        [NameInMap("extern_info")]
        [Validation(Required=false)]
        public string ExternInfo { get; set; }

        // Map的json格式：里面存储ocr识别的结果：
        // 
        // name:姓名
        // 
        // sex：性别
        // 
        // num：身份证号码
        // 
        // birth：出生年月日
        // 
        // address：地址
        // 
        // nationality：名族
        // 
        // start_date：身份证有效期开始时间
        // 
        // end_date：身份证有效期截止时间
        // 
        // issue：备案公安局
        [NameInMap("ocr_info")]
        [Validation(Required=false)]
        public string OcrInfo { get; set; }

        // 返回码
        [NameInMap("ret_code")]
        [Validation(Required=false)]
        public string RetCode { get; set; }

        // 业务返回码
        // 
        [NameInMap("ret_code_sub")]
        [Validation(Required=false)]
        public string RetCodeSub { get; set; }

        // 业务返回码描述
        // 
        [NameInMap("ret_message_sub")]
        [Validation(Required=false)]
        public string RetMessageSub { get; set; }

        // face: 身份证正面 back: 身份证反面 缺省值是：face
        // 
        [NameInMap("side")]
        [Validation(Required=false)]
        public string Side { get; set; }

        // zimid
        [NameInMap("zim_id")]
        [Validation(Required=false)]
        public string ZimId { get; set; }

    }

}
