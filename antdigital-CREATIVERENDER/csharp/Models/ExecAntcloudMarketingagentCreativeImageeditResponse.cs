// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVERENDER.Models
{
    public class ExecAntcloudMarketingagentCreativeImageeditResponse : TeaModel {
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

        // 本次子图编辑任务的独立消息 ID，用于调用子图编辑查询接口获取进度和结果。
        [NameInMap("message_id")]
        [Validation(Required=false)]
        public string MessageId { get; set; }

        // 本次编辑新建的版本 ID。任务提交成功不代表图片生成成功；查询确认成功后可作为下一轮修改来源。
        [NameInMap("segment_version_id")]
        [Validation(Required=false)]
        public string SegmentVersionId { get; set; }

    }

}
