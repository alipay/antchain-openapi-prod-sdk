// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class OperateInnerAgreementterminatezfbdirectResponse : TeaModel {
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

        // 支付宝是否直接解约
        // true: 直接解约
        // false: 不直接解约
        [NameInMap("zfb_direct_terminate")]
        [Validation(Required=false)]
        public bool? ZfbDirectTerminate { get; set; }

        // 判断是否ato处理解约
        // true:是
        // false:否
        [NameInMap("ato_handle")]
        [Validation(Required=false)]
        public bool? AtoHandle { get; set; }

        // 解约弹窗文案
        [NameInMap("toast_text")]
        [Validation(Required=false)]
        public string ToastText { get; set; }

        // 不直接解约场景的跳转地址
        // 1、ato无法解约跳转地址
        // 2、客服小程序解约跳转地址
        [NameInMap("jump_url")]
        [Validation(Required=false)]
        public string JumpUrl { get; set; }

        // 解约跳转地址右按钮文案
        [NameInMap("jump_url_text")]
        [Validation(Required=false)]
        public string JumpUrlText { get; set; }

    }

}
