// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class TrackCheckResult extends TeaModel {
    // 轨迹核验状态code
    /**
     * <strong>example:</strong>
     * <p>AD</p>
     */
    @NameInMap("track_check_status")
    public String trackCheckStatus;

    // 轨迹核验结果描述
    /**
     * <strong>example:</strong>
     * <p>运单验证正常</p>
     */
    @NameInMap("track_check_status_msg")
    public String trackCheckStatusMsg;

    public static TrackCheckResult build(java.util.Map<String, ?> map) throws Exception {
        TrackCheckResult self = new TrackCheckResult();
        return TeaModel.build(map, self);
    }

    public TrackCheckResult setTrackCheckStatus(String trackCheckStatus) {
        this.trackCheckStatus = trackCheckStatus;
        return this;
    }
    public String getTrackCheckStatus() {
        return this.trackCheckStatus;
    }

    public TrackCheckResult setTrackCheckStatusMsg(String trackCheckStatusMsg) {
        this.trackCheckStatusMsg = trackCheckStatusMsg;
        return this;
    }
    public String getTrackCheckStatusMsg() {
        return this.trackCheckStatusMsg;
    }

}
