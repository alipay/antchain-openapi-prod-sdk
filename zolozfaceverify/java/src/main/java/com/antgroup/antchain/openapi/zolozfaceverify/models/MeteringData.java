// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.zolozfaceverify.models;

import com.aliyun.tea.*;

public class MeteringData extends TeaModel {
    // endTime
    /**
     * <strong>example:</strong>
     * <p>endTime</p>
     */
    @NameInMap("end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    // metering_data_detail_list
    /**
     * <strong>example:</strong>
     * <p>metering_data_detail_list</p>
     */
    @NameInMap("metering_data_detail_list")
    public java.util.List<MeteringDataDetail> meteringDataDetailList;

    // startTime
    /**
     * <strong>example:</strong>
     * <p>startTime</p>
     */
    @NameInMap("start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    public static MeteringData build(java.util.Map<String, ?> map) throws Exception {
        MeteringData self = new MeteringData();
        return TeaModel.build(map, self);
    }

    public MeteringData setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public MeteringData setMeteringDataDetailList(java.util.List<MeteringDataDetail> meteringDataDetailList) {
        this.meteringDataDetailList = meteringDataDetailList;
        return this;
    }
    public java.util.List<MeteringDataDetail> getMeteringDataDetailList() {
        return this.meteringDataDetailList;
    }

    public MeteringData setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
