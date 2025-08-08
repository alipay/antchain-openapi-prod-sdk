// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class InsureBaseInfo extends TeaModel {
    // 投保人姓名
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("tbr_name")
    @Validation(required = true)
    public String tbrName;

    // 投保人证件号
    /**
     * <strong>example:</strong>
     * <p>371023443423131</p>
     */
    @NameInMap("tbr_id_no")
    @Validation(required = true)
    public String tbrIdNo;

    // 投保人证件类型
    /**
     * <strong>example:</strong>
     * <p>身份证</p>
     */
    @NameInMap("tbr_id_type")
    @Validation(required = true)
    public String tbrIdType;

    // 投保人联系电话
    /**
     * <strong>example:</strong>
     * <p>15000000000</p>
     */
    @NameInMap("tbr_tel")
    @Validation(required = true)
    public String tbrTel;

    // 投保人地址
    /**
     * <strong>example:</strong>
     * <p>北京市某某区</p>
     */
    @NameInMap("tbr_addr")
    public String tbrAddr;

    // 投保人邮箱
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:xxx@email.com">xxx@email.com</a></p>
     */
    @NameInMap("tbr_email")
    @Validation(required = true)
    public String tbrEmail;

    // 被保险人姓名
    /**
     * <strong>example:</strong>
     * <p>李四</p>
     */
    @NameInMap("bbr_name")
    @Validation(required = true)
    public String bbrName;

    // 被保险人证件类型
    /**
     * <strong>example:</strong>
     * <p>身份证</p>
     */
    @NameInMap("bbr_id_type")
    @Validation(required = true)
    public String bbrIdType;

    // 被保险人证件号码
    /**
     * <strong>example:</strong>
     * <p>3710221223232322</p>
     */
    @NameInMap("bbr_id_no")
    @Validation(required = true)
    public String bbrIdNo;

    // 被保险人联系电话
    /**
     * <strong>example:</strong>
     * <p>150002323231</p>
     */
    @NameInMap("bbr_tel")
    @Validation(required = true)
    public String bbrTel;

    // 被保险人地址
    /**
     * <strong>example:</strong>
     * <p>北京市新校区</p>
     */
    @NameInMap("bbr_addr")
    public String bbrAddr;

    // 含税保费(元)，小数点两位
    /**
     * <strong>example:</strong>
     * <p>12.01</p>
     */
    @NameInMap("pre_mium")
    @Validation(required = true)
    public String preMium;

    // 保险起期
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("eff_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String effDate;

    // 保险止期
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("term_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String termDate;

    // 投保人证件类型有效起期
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("idenrify_period_start")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String idenrifyPeriodStart;

    // 投保人证件类型有效止期
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("identify_period_end")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String identifyPeriodEnd;

    public static InsureBaseInfo build(java.util.Map<String, ?> map) throws Exception {
        InsureBaseInfo self = new InsureBaseInfo();
        return TeaModel.build(map, self);
    }

    public InsureBaseInfo setTbrName(String tbrName) {
        this.tbrName = tbrName;
        return this;
    }
    public String getTbrName() {
        return this.tbrName;
    }

    public InsureBaseInfo setTbrIdNo(String tbrIdNo) {
        this.tbrIdNo = tbrIdNo;
        return this;
    }
    public String getTbrIdNo() {
        return this.tbrIdNo;
    }

    public InsureBaseInfo setTbrIdType(String tbrIdType) {
        this.tbrIdType = tbrIdType;
        return this;
    }
    public String getTbrIdType() {
        return this.tbrIdType;
    }

    public InsureBaseInfo setTbrTel(String tbrTel) {
        this.tbrTel = tbrTel;
        return this;
    }
    public String getTbrTel() {
        return this.tbrTel;
    }

    public InsureBaseInfo setTbrAddr(String tbrAddr) {
        this.tbrAddr = tbrAddr;
        return this;
    }
    public String getTbrAddr() {
        return this.tbrAddr;
    }

    public InsureBaseInfo setTbrEmail(String tbrEmail) {
        this.tbrEmail = tbrEmail;
        return this;
    }
    public String getTbrEmail() {
        return this.tbrEmail;
    }

    public InsureBaseInfo setBbrName(String bbrName) {
        this.bbrName = bbrName;
        return this;
    }
    public String getBbrName() {
        return this.bbrName;
    }

    public InsureBaseInfo setBbrIdType(String bbrIdType) {
        this.bbrIdType = bbrIdType;
        return this;
    }
    public String getBbrIdType() {
        return this.bbrIdType;
    }

    public InsureBaseInfo setBbrIdNo(String bbrIdNo) {
        this.bbrIdNo = bbrIdNo;
        return this;
    }
    public String getBbrIdNo() {
        return this.bbrIdNo;
    }

    public InsureBaseInfo setBbrTel(String bbrTel) {
        this.bbrTel = bbrTel;
        return this;
    }
    public String getBbrTel() {
        return this.bbrTel;
    }

    public InsureBaseInfo setBbrAddr(String bbrAddr) {
        this.bbrAddr = bbrAddr;
        return this;
    }
    public String getBbrAddr() {
        return this.bbrAddr;
    }

    public InsureBaseInfo setPreMium(String preMium) {
        this.preMium = preMium;
        return this;
    }
    public String getPreMium() {
        return this.preMium;
    }

    public InsureBaseInfo setEffDate(String effDate) {
        this.effDate = effDate;
        return this;
    }
    public String getEffDate() {
        return this.effDate;
    }

    public InsureBaseInfo setTermDate(String termDate) {
        this.termDate = termDate;
        return this;
    }
    public String getTermDate() {
        return this.termDate;
    }

    public InsureBaseInfo setIdenrifyPeriodStart(String idenrifyPeriodStart) {
        this.idenrifyPeriodStart = idenrifyPeriodStart;
        return this;
    }
    public String getIdenrifyPeriodStart() {
        return this.idenrifyPeriodStart;
    }

    public InsureBaseInfo setIdentifyPeriodEnd(String identifyPeriodEnd) {
        this.identifyPeriodEnd = identifyPeriodEnd;
        return this;
    }
    public String getIdentifyPeriodEnd() {
        return this.identifyPeriodEnd;
    }

}
