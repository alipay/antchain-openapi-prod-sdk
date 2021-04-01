// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryConsumecardReceiptcontractResponse : TeaModel {
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

        // 签约ID= platform_tenant_id+product_code+certification_id+sales_plan(分库分表路由)
        [NameInMap("uid")]
        [Validation(Required=false)]
        public string Uid { get; set; }

        // 平台租户ID
        [NameInMap("platform_tenant_id")]
        [Validation(Required=false)]
        public string PlatformTenantId { get; set; }

        // 场景码(需要申请)
        [NameInMap("product_code")]
        [Validation(Required=false)]
        public string ProductCode { get; set; }

        // 认证平台ID，本期支付宝用户ID（分库分表路由字段）
        [NameInMap("certification_id")]
        [Validation(Required=false)]
        public string CertificationId { get; set; }

        // 合同编号
        [NameInMap("contract_number")]
        [Validation(Required=false)]
        public string ContractNumber { get; set; }

        // 证件编号
        [NameInMap("id_number")]
        [Validation(Required=false)]
        public string IdNumber { get; set; }

        // 证件类型
        [NameInMap("id_type")]
        [Validation(Required=false)]
        public long? IdType { get; set; }

        // 用户姓名/企业名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 客户编号（链上账号）
        // 
        // 已经创建成功的链上账户
        [NameInMap("account_id")]
        [Validation(Required=false)]
        public string AccountId { get; set; }

        // 客户编号（业务系统）
        // 
        // 平台业务系统IP
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 签约状态
        // 
        // 0：未签约 1：已签约 2：已解约（主动解约、过期解约）
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // 签约日期
        // 
        [NameInMap("sign_date")]
        [Validation(Required=false)]
        public string SignDate { get; set; }

        // 解约日期
        // 
        // 
        [NameInMap("cancel_date")]
        [Validation(Required=false)]
        public string CancelDate { get; set; }

    }

}
