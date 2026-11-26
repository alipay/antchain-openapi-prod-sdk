// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCESAAS.Models
{
    public class ReceiveAntcloudInsuranceLeadOpportunitiesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // string
        /// <summary>
        /// <para>待上传文件</para>
        /// </summary>
        [NameInMap("fileObject")]
        [Validation(Required=false)]
        public Stream FileObject { get; set; }

        /// <summary>
        /// <para>待上传文件名</para>
        /// </summary>
        [NameInMap("fileObjectName")]
        [Validation(Required=false)]
        public string FileObjectName { get; set; }

        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // 请求id，每一次请求保持唯一，若重复，则报错；
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 产品编码，蚂蚁分配
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 业务入参json格式字符串
        [NameInMap("biz_content")]
        [Validation(Required=false)]
        public string BizContent { get; set; }

        // 固定值：PAST_MED（既往症人群评分）业务场景
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 场景类型:FULL_PUSH-首次下发，携带底包文件,TRIGGER_PUSH-圈客周期变更触发，不携带文件；不传按 FULL_PUSH 处理
        [NameInMap("action_type")]
        [Validation(Required=true)]
        public string ActionType { get; set; }

        // TRIGGER_PUSH 须传,首次 FULL_PUSH 受理回执返回的受理号，蚂蚁校验存在对应首次下发记录（查无记录受理失败）；FULL_PUSH 由蚂蚁生成并随受理回执返回
        [NameInMap("accept_no")]
        [Validation(Required=false)]
        public string AcceptNo { get; set; }

        // 圈客周期,每周示例：{"cycleType":"WEEKLY","cycleValue":3,"time":"10:00"}，每月示例：每月10号	{"cycleType":"MONTHLY","cycleValue":10,"time":"10:00"}
        [NameInMap("update_cycle")]
        [Validation(Required=true)]
        public string UpdateCycle { get; set; }

    }

}
