// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class QueryEcarLcaorderResponse : TeaModel {
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

        // LCA订单单号
        [NameInMap("order_no")]
        [Validation(Required=false)]
        public string OrderNo { get; set; }

        // 来源于三方平台的订单编号
        [NameInMap("source_order_no")]
        [Validation(Required=false)]
        public string SourceOrderNo { get; set; }

        // 三方平台客户ID，在三方平台唯一
        [NameInMap("customer_id")]
        [Validation(Required=false)]
        public string CustomerId { get; set; }

        // 碳账户编号，碳矩阵为客户分配的碳账户编号
        [NameInMap("carbon_account_no")]
        [Validation(Required=false)]
        public string CarbonAccountNo { get; set; }

        // Pending——待分配，Closed——已关闭，Allocated——已分配，Finished——已完成
        [NameInMap("order_status")]
        [Validation(Required=false)]
        public string OrderStatus { get; set; }

        // 产品概要信息
        [NameInMap("product")]
        [Validation(Required=false)]
        public EnterpriseProductOutline Product { get; set; }

        // 足迹计算信息
        [NameInMap("lca_carbon_datum")]
        [Validation(Required=false)]
        public LcaCarbonDatum LcaCarbonDatum { get; set; }

    }

}
