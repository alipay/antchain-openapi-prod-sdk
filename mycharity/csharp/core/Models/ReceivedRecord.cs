// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYCHARITY.Models
{
    // 执行记录
    public class ReceivedRecord : TeaModel {
        // 执行记录id
        [NameInMap("id")]
        [Validation(Required=true, MaxLength=50)]
        public string Id { get; set; }

        // 支付宝用户标识
        [NameInMap("receiver_alipay_user_id")]
        [Validation(Required=true, MaxLength=16)]
        public string ReceiverAlipayUserId { get; set; }

        // 领取人姓名
        [NameInMap("receiver_name")]
        [Validation(Required=true, MaxLength=50)]
        public string ReceiverName { get; set; }

        // 领取人身份证号码
        [NameInMap("receiver_card_no")]
        [Validation(Required=true)]
        public string ReceiverCardNo { get; set; }

        // 联系号码 
        [NameInMap("receiver_phone_no")]
        [Validation(Required=false, MaxLength=20)]
        public string ReceiverPhoneNo { get; set; }

        // 是否是受益人本人 0本人，1代领
        [NameInMap("agent_flag")]
        [Validation(Required=true)]
        public long? AgentFlag { get; set; }

        // 领取人和受益人关系
        [NameInMap("relationship")]
        [Validation(Required=false, MaxLength=100)]
        public string Relationship { get; set; }

        // 受益人信息
        [NameInMap("beneficiary_message")]
        [Validation(Required=false, MaxLength=200)]
        public string BeneficiaryMessage { get; set; }

        // 领取人所属机构
        [NameInMap("receiver_org")]
        [Validation(Required=false, MaxLength=100)]
        public string ReceiverOrg { get; set; }

        // 领取说明
        [NameInMap("receive_note")]
        [Validation(Required=false, MaxLength=100)]
        public string ReceiveNote { get; set; }

        // 受益人数
        [NameInMap("benefit_number")]
        [Validation(Required=false)]
        public long? BenefitNumber { get; set; }

        // 快递地址
        [NameInMap("express_address")]
        [Validation(Required=false, MaxLength=100)]
        public string ExpressAddress { get; set; }

        // 发放数量
        [NameInMap("issue_amount")]
        [Validation(Required=false)]
        public long? IssueAmount { get; set; }

    }

}
