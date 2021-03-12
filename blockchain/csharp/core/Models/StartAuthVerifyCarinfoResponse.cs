// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartAuthVerifyCarinfoResponse : TeaModel {
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

        // 业务流水号，输入参数的bizId返回。
        [NameInMap("biz_id")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        // 来自入参，具体看业务场景。
        [NameInMap("biz_type")]
        [Validation(Required=false)]
        public string BizType { get; set; }

        // 目标用户创建的did结果，如果为空则表明未创建。
        [NameInMap("did")]
        [Validation(Required=false)]
        public string Did { get; set; }

        // 查询结果
        // 1 一致(收费)
        // 2 姓名不一致(收费)
        // 3 身份证未命中(收费)
        // 4 车牌号不一致(收费)
        // 0 无意义(responsecode 不为 100 时 出现)
        [NameInMap("result_status")]
        [Validation(Required=false)]
        public long? ResultStatus { get; set; }

        // 查询结果数据，result_status 不等于 1 时为null，结果是一个JSON字符串，具体结果内容解释，需要参考文档说明。
        [NameInMap("result_data")]
        [Validation(Required=false)]
        public string ResultData { get; set; }

    }

}
