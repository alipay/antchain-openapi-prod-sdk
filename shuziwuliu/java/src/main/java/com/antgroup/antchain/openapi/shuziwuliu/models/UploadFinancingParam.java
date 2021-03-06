// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UploadFinancingParam extends TeaModel {
    // 订舱单量（票）
    @NameInMap("booking_count")
    @Validation(required = true)
    public Long bookingCount;

    // 唯一标识
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 结束日期
    @NameInMap("end_date")
    @Validation(required = true)
    public String endDate;

    // 货代did
    @NameInMap("forwarder_did")
    @Validation(required = true)
    public String forwarderDid;

    // 开始日期
    @NameInMap("start_date")
    @Validation(required = true)
    public String startDate;

    // 箱量【数量，不区分箱型，20GP是1TEU，40GP是2TEU】
    @NameInMap("teu")
    @Validation(required = true)
    public Long teu;

    // 运输总额
    @NameInMap("amounts")
    @Validation(required = true)
    public String amounts;

    public static UploadFinancingParam build(java.util.Map<String, ?> map) throws Exception {
        UploadFinancingParam self = new UploadFinancingParam();
        return TeaModel.build(map, self);
    }

    public UploadFinancingParam setBookingCount(Long bookingCount) {
        this.bookingCount = bookingCount;
        return this;
    }
    public Long getBookingCount() {
        return this.bookingCount;
    }

    public UploadFinancingParam setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UploadFinancingParam setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public UploadFinancingParam setForwarderDid(String forwarderDid) {
        this.forwarderDid = forwarderDid;
        return this;
    }
    public String getForwarderDid() {
        return this.forwarderDid;
    }

    public UploadFinancingParam setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public UploadFinancingParam setTeu(Long teu) {
        this.teu = teu;
        return this;
    }
    public Long getTeu() {
        return this.teu;
    }

    public UploadFinancingParam setAmounts(String amounts) {
        this.amounts = amounts;
        return this;
    }
    public String getAmounts() {
        return this.amounts;
    }

}
