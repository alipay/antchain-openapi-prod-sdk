// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // GrayscaleConfigVO
    public class GrayscaleConfigVO : TeaModel {
        // gmt_create
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // gmt_modified
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // router_type
        [NameInMap("router_type")]
        [Validation(Required=false)]
        public string RouterType { get; set; }

        // service
        [NameInMap("service")]
        [Validation(Required=false)]
        public string Service { get; set; }

        // matchable_service
        [NameInMap("matchable_service")]
        [Validation(Required=false)]
        public string MatchableService { get; set; }

        // instance_id
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // router_id
        [NameInMap("router_id")]
        [Validation(Required=false)]
        public string RouterId { get; set; }

        // app_name
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // valid
        [NameInMap("valid")]
        [Validation(Required=false)]
        public string Valid { get; set; }

        // gray_rule_config_list
        [NameInMap("gray_rule_config_list")]
        [Validation(Required=false)]
        public List<GrayRuleConfigVO> GrayRuleConfigList { get; set; }

    }

}
