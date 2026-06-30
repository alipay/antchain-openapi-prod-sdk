// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class ShareDigitalkeyRentalRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备TUID
    @NameInMap("tuid")
    @Validation(required = true)
    public String tuid;

    // 租车人手机号
    @NameInMap("renter_mobile")
    @Validation(required = true)
    public String renterMobile;

    // 钥匙生效时间（格式：yyyy-MM-dd HH:mm:ss）
    @NameInMap("start_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    // 钥匙失效时间（格式：yyyy-MM-dd HH:mm:ss）
    @NameInMap("end_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    public static ShareDigitalkeyRentalRequest build(java.util.Map<String, ?> map) throws Exception {
        ShareDigitalkeyRentalRequest self = new ShareDigitalkeyRentalRequest();
        return TeaModel.build(map, self);
    }

    public ShareDigitalkeyRentalRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ShareDigitalkeyRentalRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ShareDigitalkeyRentalRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public ShareDigitalkeyRentalRequest setRenterMobile(String renterMobile) {
        this.renterMobile = renterMobile;
        return this;
    }
    public String getRenterMobile() {
        return this.renterMobile;
    }

    public ShareDigitalkeyRentalRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ShareDigitalkeyRentalRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
