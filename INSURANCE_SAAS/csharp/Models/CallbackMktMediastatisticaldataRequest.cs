// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class CallbackMktMediastatisticaldataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 请求id
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 项目id
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 数据渠道来源，广点通(gdt) / 巨量引擎(oceanengine) / 快手(kuaishou) / 百度(baidu)
        [NameInMap("media_source")]
        [Validation(Required=true)]
        public string MediaSource { get; set; }

        // 统计维度，区分账号（ACCOUNT） 、广告计划(ADVERTISEMENT) 、 素材（MATERIAL）
        [NameInMap("dimension")]
        [Validation(Required=true)]
        public string Dimension { get; set; }

        // 统计数据
        [NameInMap("statistical_data_list")]
        [Validation(Required=true)]
        public List<StatisticalDataDTO> StatisticalDataList { get; set; }

    }

}
