// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class AddEcarOffsetacquisitionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 活动数据采集单号
        [NameInMap("acquisition_item_no")]
        [Validation(Required=true)]
        public string AcquisitionItemNo { get; set; }

        // 碳普惠减碳项目编号
        [NameInMap("project_no")]
        [Validation(Required=true)]
        public string ProjectNo { get; set; }

        // 参与的碳账户DID
        [NameInMap("account_did")]
        [Validation(Required=true)]
        public string AccountDid { get; set; }

        // 发生时间，格式为yyyy-MM-DD HH:MM:SS（到秒）或 yyyy-MM-DD（按日录入）
        [NameInMap("occurrent_time")]
        [Validation(Required=true)]
        public string OccurrentTime { get; set; }

        // 发生场景，需要按照约定的场景编码提交
        [NameInMap("scenario_code")]
        [Validation(Required=true)]
        public string ScenarioCode { get; set; }

        // 活动数据列表
        [NameInMap("active_data_list")]
        [Validation(Required=true)]
        public List<AnyAmountItem> ActiveDataList { get; set; }

    }

}
