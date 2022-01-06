// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class GetSafeCommunicationruleResponse : TeaModel {
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

        // {"id":1,"instance_id":"000001","name":"rule1","direction":1,"mode":1,"strategy":"1","enabled":0,"scope":1,"operator":"aaa","operate_time":"2020-10-22 11:33:22","labels":[{"key":"aa","value":"bb","type":1}],"label_code":"123123aac"}
        [NameInMap("model")]
        [Validation(Required=false)]
        public CommunicationRuleModel Model { get; set; }

    }

}
