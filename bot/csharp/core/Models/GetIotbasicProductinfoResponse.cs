// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class GetIotbasicProductinfoResponse : TeaModel {
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

        // 接口调用结果
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        // 产品信息，json字符串
        // productName:产品名称
        // productCode:产品code
        // createTime:产品创建时间
        // productKey:产品key，用于设备的接入认证信息
        // deviceTotalCount:产品下的设备总数
        // mqttHost:设备的接入域名
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

    }

}
