// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class SubmitEcarLcacalcRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 目标产品编码
        [NameInMap("material_code")]
        [Validation(Required=true)]
        public string MaterialCode { get; set; }

        // 授权过程编码
        [NameInMap("process_no")]
        [Validation(Required=true)]
        public string ProcessNo { get; set; }

        // 生命周期边界
        [NameInMap("life_cycle_boundary")]
        [Validation(Required=true)]
        public string LifeCycleBoundary { get; set; }

        // 产品功能单位
        [NameInMap("functional_unit")]
        [Validation(Required=true)]
        public string FunctionalUnit { get; set; }

        // 功能单位数量
        [NameInMap("functional_amount")]
        [Validation(Required=true)]
        public string FunctionalAmount { get; set; }

        // 各阶段活动数据
        [NameInMap("stage_active_data_list")]
        [Validation(Required=true)]
        public List<LcaStageActiveData> StageActiveDataList { get; set; }

        // 自定义业务标识
        [NameInMap("custom_context")]
        [Validation(Required=false)]
        public string CustomContext { get; set; }

    }

}
