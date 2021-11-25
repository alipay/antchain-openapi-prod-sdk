// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryAuthCertClaimResponse : TeaModel {
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

        // 可验证声明id
        [NameInMap("vc_id")]
        [Validation(Required=false)]
        public string VcId { get; set; }

        // 交易hash（仅上链成功后会有值）
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // vc详情
        [NameInMap("vc_content")]
        [Validation(Required=false)]
        public string VcContent { get; set; }

        // vc状态 0:未授权 1:已授权 2: 拒绝授权 3: 授权已撤销
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // 业务类型
        [NameInMap("biz_type")]
        [Validation(Required=false)]
        public string BizType { get; set; }

        // 过期时间
        [NameInMap("expire")]
        [Validation(Required=false)]
        public long? Expire { get; set; }

        // 授权是否可撤销
        [NameInMap("revocable")]
        [Validation(Required=false)]
        public bool? Revocable { get; set; }

        // 存证请求创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 存证上链时间（仅上链成功后会有值）
        [NameInMap("gmt_transmit")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtTransmit { get; set; }

    }

}
