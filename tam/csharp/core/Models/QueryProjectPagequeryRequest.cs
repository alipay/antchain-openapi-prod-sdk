// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAM.Models
{
    public class QueryProjectPagequeryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 兼容BD待客下单对外暴露项目Id查询
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 项目唯一编码
        [NameInMap("project_code")]
        [Validation(Required=false)]
        public string ProjectCode { get; set; }

        // 项目名称，支持模糊
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        // 客户id
        [NameInMap("customer_id")]
        [Validation(Required=false)]
        public string CustomerId { get; set; }

        // 客户名称
        [NameInMap("customer_name")]
        [Validation(Required=false)]
        public string CustomerName { get; set; }

        // 项目阶段，支持多个过滤
        [NameInMap("status")]
        [Validation(Required=false)]
        public List<string> Status { get; set; }

        // 项目阶段，支持多个过滤
        [NameInMap("stages")]
        [Validation(Required=false)]
        public List<string> Stages { get; set; }

        // 项目BD工号列表
        [NameInMap("bd_work_nos")]
        [Validation(Required=false)]
        public List<string> BdWorkNos { get; set; }

        // 交付项目经理工号列表
        [NameInMap("pm_work_nos")]
        [Validation(Required=false)]
        public List<string> PmWorkNos { get; set; }

        // 页面大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 当前页面
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

    }

}
