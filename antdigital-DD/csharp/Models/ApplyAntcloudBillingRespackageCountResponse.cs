// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    public class ApplyAntcloudBillingRespackageCountResponse : TeaModel {
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

        // 外部唯一单据号 不超过64位
        [NameInMap("out_biz_id")]
        [Validation(Required=false)]
        public string OutBizId { get; set; }

        // 本次抵扣总量
        [NameInMap("deduct_amount")]
        [Validation(Required=false)]
        public long? DeductAmount { get; set; }

        // 抵扣的oms component key 
        [NameInMap("oms_component_key")]
        [Validation(Required=false)]
        public string OmsComponentKey { get; set; }

        // 抵扣后剩余计量值
        [NameInMap("left_amount")]
        [Validation(Required=false)]
        public long? LeftAmount { get; set; }

        // 资源包抵扣详细信息
        [NameInMap("oms_data_component_deduct_detail_resultvos")]
        [Validation(Required=false)]
        public List<OmsDataComponentDeductDetailResultVO> OmsDataComponentDeductDetailResultvos { get; set; }

        // 高精度本次抵扣总量，支持小数
        [NameInMap("deduct_amount_str")]
        [Validation(Required=false)]
        public string DeductAmountStr { get; set; }

        // 高精度抵扣剩余量值，支持小数
        [NameInMap("left_amount_str")]
        [Validation(Required=false)]
        public string LeftAmountStr { get; set; }

    }

}
