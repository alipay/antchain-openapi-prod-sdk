// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    public class QueryAntcloudTradeComboOptionsResponse : TeaModel {
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

        // 套餐基本信息
        [NameInMap("combo_dto")]
        [Validation(Required=false)]
        public ComboDTO ComboDto { get; set; }

        // 套餐内商品信息列表（仅包含当前 OU 下上架的商品）
        [NameInMap("combo_item_dtos")]
        [Validation(Required=false)]
        public List<ComboItemDTO> ComboItemDtos { get; set; }

        // 售卖规则校验是否通过
        [NameInMap("rule_check_success")]
        [Validation(Required=false)]
        public bool? RuleCheckSuccess { get; set; }

        // 售卖规则校验失败时的错误码
        [NameInMap("rule_check_error_code")]
        [Validation(Required=false)]
        public string RuleCheckErrorCode { get; set; }

        // 该商品当前不可购买：未完成实名认证
        [NameInMap("rule_check_error_message")]
        [Validation(Required=false)]
        public string RuleCheckErrorMessage { get; set; }

    }

}
