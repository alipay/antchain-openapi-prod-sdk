// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class PagequeryInnerFundmngpendingeventRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 资方租户id
        [NameInMap("fund_tenant_id")]
        [Validation(Required=true)]
        public string FundTenantId { get; set; }

        // ("PENDING","待办中"), 
        //  ("CONFIRMED","确认"),  
        // 
        [NameInMap("status_list")]
        [Validation(Required=true)]
        public List<string> StatusList { get; set; }

        // 事件code 
        // 用户履约离线数据下载完成
        // DATAPHIN_FUND_MNG_DOWNLOAD_USER_PROMISE_FINISH
        [NameInMap("pending_code")]
        [Validation(Required=true)]
        public string PendingCode { get; set; }

        // 分页参数
        [NameInMap("page_info")]
        [Validation(Required=true)]
        public PageQuery PageInfo { get; set; }

    }

}
