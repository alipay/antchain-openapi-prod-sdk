// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class CreateContractBaseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 项目编号 
        [NameInMap("project_code")]
        [Validation(Required=true)]
        public string ProjectCode { get; set; }

        // 合同信息id
        [NameInMap("contract_info_id")]
        [Validation(Required=true)]
        public long? ContractInfoId { get; set; }

        // 合同编号
        [NameInMap("contract_info_code")]
        [Validation(Required=true)]
        public string ContractInfoCode { get; set; }

        // 合同名称
        [NameInMap("contract_name")]
        [Validation(Required=true)]
        public string ContractName { get; set; }

        // 合同版本,从1起
        [NameInMap("contract_version")]
        [Validation(Required=true)]
        public long? ContractVersion { get; set; }

        // 变更原因（第一版不传值）
        [NameInMap("change_reason")]
        [Validation(Required=false)]
        public string ChangeReason { get; set; }

        // 合同类型
        [NameInMap("contract_type")]
        [Validation(Required=true)]
        public string ContractType { get; set; }

        // 甲方统一社会信用代码
        [NameInMap("party_a_bidder_code")]
        [Validation(Required=true)]
        public string PartyABidderCode { get; set; }

        // 甲方名称
        [NameInMap("party_a_name")]
        [Validation(Required=true)]
        public string PartyAName { get; set; }

        // 甲方授权代表Did
        [NameInMap("party_a_audit_did")]
        [Validation(Required=true)]
        public string PartyAAuditDid { get; set; }

        // 乙方集合
        [NameInMap("party_b_firm_dto_list")]
        [Validation(Required=true)]
        public List<PartyBFirmDto> PartyBFirmDtoList { get; set; }

        // 合同金额
        [NameInMap("contract_money")]
        [Validation(Required=true)]
        public string ContractMoney { get; set; }

        // 金额币种代码
        [NameInMap("price_currency")]
        [Validation(Required=true)]
        public string PriceCurrency { get; set; }

        // 金额单位
        [NameInMap("price_unit")]
        [Validation(Required=true)]
        public string PriceUnit { get; set; }

        // 拟开工时间
        [NameInMap("start_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartDate { get; set; }

        // 拟建成时间
        [NameInMap("end_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndDate { get; set; }

        // 合同签署时间
        [NameInMap("contract_sign_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ContractSignTime { get; set; }

        // 创建人Did
        [NameInMap("created_did")]
        [Validation(Required=true)]
        public string CreatedDid { get; set; }

        // 合同文件
        [NameInMap("contract_file")]
        [Validation(Required=true)]
        public string ContractFile { get; set; }

        // 文件存证
        [NameInMap("evidence")]
        [Validation(Required=true)]
        public string Evidence { get; set; }

        // 存证txHash
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 数据时间戳
        [NameInMap("data_timestamp")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DataTimestamp { get; set; }

        // 保证金对象集合
        [NameInMap("security_fund_dto_list")]
        [Validation(Required=false)]
        public List<SecurityFundDto> SecurityFundDtoList { get; set; }

    }

}
