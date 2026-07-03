// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class PushDubbridgeContractsignRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 合同签署事件id，《蚂蚁侧主导签署》时必填
        [NameInMap("sign_event_id")]
        [Validation(Required=false)]
        public string SignEventId { get; set; }

        // 合同签署状态：
        // DRAFT-草稿（合同已创建但未发起签署，待签署状态）；
        // SIGNING-签署中（签署流程已发起，等待各方完成签署）；
        // COMPLETED-已完成（所有签署方均已完成签署，合同生效）；
        // EXPIRED-已过期（超过签署截止时间仍未完成签署）；
        // REJECTED-已拒签（签署方明确拒绝签署该合同）；
        // REVOKED-已撤销（发起方在签署完成前主动撤回/取消了签署流程）；
        // TERMINATED-已终止（签署过程中被强制中止/作废）；
        // DELETED-已删除（合同/签署流程被从系统中删除）
        [NameInMap("sign_status")]
        [Validation(Required=true)]
        public string SignStatus { get; set; }

        // 合同下载地址（公网）
        [NameInMap("contract_down_url")]
        [Validation(Required=false)]
        public string ContractDownUrl { get; set; }

        // 签署合同的业务订单号
        [NameInMap("biz_order_no")]
        [Validation(Required=true)]
        public string BizOrderNo { get; set; }

        // 支付宝小程序用户唯一ID，《isv侧主导签署》时必填
        [NameInMap("open_id")]
        [Validation(Required=false)]
        public string OpenId { get; set; }

    }

}
