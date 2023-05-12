// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // TransactionChartInfo
    public class TransactionChartInfo : TeaModel {
        // a
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // biz_type
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // cost
        [NameInMap("cost")]
        [Validation(Required=true)]
        public long? Cost { get; set; }

        // edges
        [NameInMap("edges")]
        [Validation(Required=true)]
        public List<TransactionEdge> Edges { get; set; }

        // end_time
        [NameInMap("end_time")]
        [Validation(Required=false)]
        public string EndTime { get; set; }

        // last_handle_time
        [NameInMap("last_handle_time")]
        [Validation(Required=false)]
        public string LastHandleTime { get; set; }

        // lowerLineCount
        [NameInMap("lower_line_count")]
        [Validation(Required=true)]
        public long? LowerLineCount { get; set; }

        // nodes
        [NameInMap("nodes")]
        [Validation(Required=true)]
        public List<TransactionNode> Nodes { get; set; }

        // participatorNum
        [NameInMap("participator_num")]
        [Validation(Required=true)]
        public long? ParticipatorNum { get; set; }

        // starter_ip
        [NameInMap("starter_ip")]
        [Validation(Required=true)]
        public string StarterIp { get; set; }

        // starterName
        [NameInMap("starter_name")]
        [Validation(Required=true)]
        public string StarterName { get; set; }

        // start_time
        [NameInMap("start_time")]
        [Validation(Required=true)]
        public string StartTime { get; set; }

        // state
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // txid
        [NameInMap("tx_id")]
        [Validation(Required=true)]
        public string TxId { get; set; }

        // upper_line_count
        [NameInMap("upper_line_count")]
        [Validation(Required=true)]
        public long? UpperLineCount { get; set; }

        // action_mode
        [NameInMap("action_mode")]
        [Validation(Required=false)]
        public long? ActionMode { get; set; }

    }

}
