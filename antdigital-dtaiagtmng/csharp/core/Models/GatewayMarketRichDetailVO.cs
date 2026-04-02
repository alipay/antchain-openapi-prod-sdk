// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGTMNG.Models
{
    // MarketRichDetailVO 网关对象
    public class GatewayMarketRichDetailVO : TeaModel {
        // 市场条目 ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 资产类型（skill / package / agent / workflow / tool / card / mcp）
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // ref_id
        [NameInMap("ref_id")]
        [Validation(Required=false)]
        public long? RefId { get; set; }

        // tags
        [NameInMap("tags")]
        [Validation(Required=false)]
        public List<string> Tags { get; set; }

        // labels
        [NameInMap("labels")]
        [Validation(Required=false)]
        public List<string> Labels { get; set; }

        // creator
        [NameInMap("creator")]
        [Validation(Required=false)]
        public string Creator { get; set; }

        // download_count
        [NameInMap("download_count")]
        [Validation(Required=false)]
        public long? DownloadCount { get; set; }

        // view_count
        [NameInMap("view_count")]
        [Validation(Required=false)]
        public long? ViewCount { get; set; }

        // subscription_count
        [NameInMap("subscription_count")]
        [Validation(Required=false)]
        public long? SubscriptionCount { get; set; }

        // recommend_flag
        [NameInMap("recommend_flag")]
        [Validation(Required=false)]
        public bool? RecommendFlag { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // subscription_status
        [NameInMap("subscription_status")]
        [Validation(Required=false)]
        public string SubscriptionStatus { get; set; }

        // channels
        [NameInMap("channels")]
        [Validation(Required=false)]
        public string Channels { get; set; }

        // downloadable
        [NameInMap("downloadable")]
        [Validation(Required=false)]
        public bool? Downloadable { get; set; }

        // gmt_create
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // gmt_modified
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // version
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

        // source
        [NameInMap("source")]
        [Validation(Required=false)]
        public string Source { get; set; }

        // meta
        [NameInMap("meta")]
        [Validation(Required=false)]
        public string Meta { get; set; }

        // ext
        [NameInMap("ext")]
        [Validation(Required=false)]
        public string Ext { get; set; }

        // modifier
        [NameInMap("modifier")]
        [Validation(Required=false)]
        public string Modifier { get; set; }

        // download_url
        [NameInMap("download_url")]
        [Validation(Required=false)]
        public string DownloadUrl { get; set; }

        // ext_parsed
        [NameInMap("ext_parsed")]
        [Validation(Required=false)]
        public string ExtParsed { get; set; }

    }

}
