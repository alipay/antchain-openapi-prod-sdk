// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAASPLATFORM.Models
{
    public class CreateMultistepDepositRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 操作主体信息
        [NameInMap("subject")]
        [Validation(Required=true)]
        public OperateSubject Subject { get; set; }

        // 业务类型，如：CONTRACT、ORDER...
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 业务流水ID（如：合同编号）
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 环节编号，需要按照字母表/数字顺序，能够进行排序处理
        [NameInMap("step_no")]
        [Validation(Required=true)]
        public string StepNo { get; set; }

        // 环节名称
        [NameInMap("step_name")]
        [Validation(Required=true)]
        public string StepName { get; set; }

        // 交易时间，yyyyMMddh24miss格式
        [NameInMap("tx_time")]
        [Validation(Required=true)]
        public string TxTime { get; set; }

        // 业务详细信息，json格式，具体内容由调用方自行确定
        [NameInMap("biz_info")]
        [Validation(Required=true)]
        public string BizInfo { get; set; }

    }

}
