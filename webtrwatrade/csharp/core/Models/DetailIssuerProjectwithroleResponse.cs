// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    public class DetailIssuerProjectwithroleResponse : TeaModel {
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

        // 项目id
        [NameInMap("project_id")]
        [Validation(Required=false)]
        public string ProjectId { get; set; }

        // 项目名称
        [NameInMap("projcet_name")]
        [Validation(Required=false)]
        public string ProjcetName { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // token名称
        [NameInMap("token_name")]
        [Validation(Required=false)]
        public string TokenName { get; set; }

        // 最大供应量
        [NameInMap("capacity")]
        [Validation(Required=false)]
        public string Capacity { get; set; }

        // 净值
        [NameInMap("net_value")]
        [Validation(Required=false)]
        public string NetValue { get; set; }

        // 价格类型
        [NameInMap("price_type")]
        [Validation(Required=false)]
        public string PriceType { get; set; }

        // 项目净值
        [NameInMap("project_net_value")]
        [Validation(Required=false)]
        public string ProjectNetValue { get; set; }

        // 购买最大限额
        [NameInMap("max_subscription_amount")]
        [Validation(Required=false)]
        public string MaxSubscriptionAmount { get; set; }

        // 部署类型  DIRECT_PUBLIC_CHAIN 直发公链，NORMAL 普通模式
        [NameInMap("deployment_type")]
        [Validation(Required=false)]
        public string DeploymentType { get; set; }

        // 项目所在链
        [NameInMap("chain_type")]
        [Validation(Required=false)]
        public string ChainType { get; set; }

        // 操作员list
        [NameInMap("user_operator_list")]
        [Validation(Required=false)]
        public UserOperatorInfoBO UserOperatorList { get; set; }

        // 代销者机构代销者机构
        [NameInMap("participant_infos")]
        [Validation(Required=false)]
        public ParticipantInfo ParticipantInfos { get; set; }

    }

}
