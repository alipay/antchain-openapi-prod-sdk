// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class ApplyInsuranceInventoryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 库存申报交易号，调用方生成的唯一编码；
        // 格式为 yyyyMMdd_身份标识_其他编码，yyyyMMdd请传递当前时间。
        // 系统会根据该流水号做防重、幂等判断逻辑。
        // 当极端场景中（接口超时），客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
        [NameInMap("trade_no")]
        [Validation(Required=true, MaxLength=50)]
        public string TradeNo { get; set; }

        // 库存申报编号
        [NameInMap("inventory_no")]
        [Validation(Required=true, MaxLength=50)]
        public string InventoryNo { get; set; }

        // 库存查询时间，yyyy-mm-dd，精确到（天）
        [NameInMap("inventory_query_date")]
        [Validation(Required=true)]
        public string InventoryQueryDate { get; set; }

        // 仓库代码
        // 
        // 
        [NameInMap("repository_code")]
        [Validation(Required=true, MaxLength=50)]
        public string RepositoryCode { get; set; }

        // 库存货物列表
        [NameInMap("inventory_cargos")]
        [Validation(Required=true)]
        public List<InventoryCargo> InventoryCargos { get; set; }

    }

}
