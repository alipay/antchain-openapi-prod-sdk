// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.osp.models;

import com.aliyun.tea.*;

public class MeterDataModel extends TeaModel {
    // 时间
    @NameInMap("meter_date")
    @Validation(required = true)
    public String meterDate;

    // 计量数据项
    @NameInMap("meter_data_item_list")
    @Validation(required = true)
    public java.util.List<MeterDataItemModel> meterDataItemList;

    public static MeterDataModel build(java.util.Map<String, ?> map) throws Exception {
        MeterDataModel self = new MeterDataModel();
        return TeaModel.build(map, self);
    }

    public MeterDataModel setMeterDate(String meterDate) {
        this.meterDate = meterDate;
        return this;
    }
    public String getMeterDate() {
        return this.meterDate;
    }

    public MeterDataModel setMeterDataItemList(java.util.List<MeterDataItemModel> meterDataItemList) {
        this.meterDataItemList = meterDataItemList;
        return this;
    }
    public java.util.List<MeterDataItemModel> getMeterDataItemList() {
        return this.meterDataItemList;
    }

}
