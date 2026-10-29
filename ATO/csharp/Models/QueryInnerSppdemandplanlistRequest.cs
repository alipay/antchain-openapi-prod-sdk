// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryInnerSppdemandplanlistRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务日期 yyyy-MM-dd；不传不过滤日期
        [NameInMap("biz_date")]
        [Validation(Required=false)]
        public string BizDate { get; set; }

        // 产品链路APP / WECHAT
        [NameInMap("product_form")]
        [Validation(Required=false)]
        public string ProductForm { get; set; }

        // 审核状态DRAFT / PENDING / APPROVED / REJECTED
        [NameInMap("audit_status")]
        [Validation(Required=false)]
        public string AuditStatus { get; set; }

        // 运营状态PENDING / RUNNING / PAUSED / FINISHED
        [NameInMap("run_status")]
        [Validation(Required=false)]
        public string RunStatus { get; set; }

        // 页码，默认1，正整数
        [NameInMap("page_no")]
        [Validation(Required=false)]
        public long? PageNo { get; set; }

        // 每页大小，默认20，1～100；超范围报参数错误
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // traceid
        [NameInMap("trace_id")]
        [Validation(Required=true)]
        public string TraceId { get; set; }

    }

}
