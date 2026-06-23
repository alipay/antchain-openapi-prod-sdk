// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class ClueInformationReq extends TeaModel {
    // 线索标题
    /**
     * <strong>example:</strong>
     * <p>标题</p>
     */
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 线索跟进状态   INIT:待确认 CONTACTED:跟进中 CLOSED:线索终止 TRANSFER:已转交 BUSINESS:转商机
    /**
     * <strong>example:</strong>
     * <p> INIT </p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 线索跟进人  工号
    /**
     * <strong>example:</strong>
     * <p>123132</p>
     */
    @NameInMap("created_user_nick")
    @Validation(required = true)
    public String createdUserNick;

    // 线索描述
    /**
     * <strong>example:</strong>
     * <p>线索描述</p>
     */
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 客户名称
    /**
     * <strong>example:</strong>
     * <p>XXX公司</p>
     */
    @NameInMap("customer_name")
    @Validation(required = true)
    public String customerName;

    // 业务线
    /**
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("biz_line")
    @Validation(required = true)
    public String bizLine;

    // 客户地址
    /**
     * <strong>example:</strong>
     * <p>XX省XX市XX区XXX</p>
     */
    @NameInMap("customer_location")
    @Validation(required = true)
    public String customerLocation;

    // 公司联系人
    /**
     * <strong>example:</strong>
     * <p>{           &quot;jobTitle&quot;: &quot;经理&quot;,           &quot;realName&quot;: &quot;张三&quot;,           &quot;mobilePhone&quot;: &quot;15888888888&quot;,           &quot;email&quot;: &quot;<a href="mailto:lisi@lisi.com">lisi@lisi.com</a>&quot;         }</p>
     */
    @NameInMap("corporate_contacts")
    public java.util.List<CorporateContacts> corporateContacts;

    // 客户所在行业
    /**
     * <strong>example:</strong>
     * <p>金融</p>
     */
    @NameInMap("customer_industry")
    @Validation(required = true)
    public String customerIndustry;

    // 客户营收规模
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("revenue_scale")
    public String revenueScale;

    // 社会信用代码
    /**
     * <strong>example:</strong>
     * <p>914XXXXXXXXXXXXXXX</p>
     */
    @NameInMap("social_credit_code")
    public String socialCreditCode;

    // 线索来源
    /**
     * <strong>example:</strong>
     * <p>LAOJIAO</p>
     */
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 客户ID
    /**
     * <strong>example:</strong>
     * <p>203434343</p>
     */
    @NameInMap("customer_id")
    public String customerId;

    // 多租户模型。线索服务化的租户模型。请联系线索服务管理员提供。固定值。
    /**
     * <strong>example:</strong>
     * <p>BCC</p>
     */
    @NameInMap("tenant")
    @Validation(required = true)
    public String tenant;

    public static ClueInformationReq build(java.util.Map<String, ?> map) throws Exception {
        ClueInformationReq self = new ClueInformationReq();
        return TeaModel.build(map, self);
    }

    public ClueInformationReq setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public ClueInformationReq setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ClueInformationReq setCreatedUserNick(String createdUserNick) {
        this.createdUserNick = createdUserNick;
        return this;
    }
    public String getCreatedUserNick() {
        return this.createdUserNick;
    }

    public ClueInformationReq setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ClueInformationReq setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public ClueInformationReq setBizLine(String bizLine) {
        this.bizLine = bizLine;
        return this;
    }
    public String getBizLine() {
        return this.bizLine;
    }

    public ClueInformationReq setCustomerLocation(String customerLocation) {
        this.customerLocation = customerLocation;
        return this;
    }
    public String getCustomerLocation() {
        return this.customerLocation;
    }

    public ClueInformationReq setCorporateContacts(java.util.List<CorporateContacts> corporateContacts) {
        this.corporateContacts = corporateContacts;
        return this;
    }
    public java.util.List<CorporateContacts> getCorporateContacts() {
        return this.corporateContacts;
    }

    public ClueInformationReq setCustomerIndustry(String customerIndustry) {
        this.customerIndustry = customerIndustry;
        return this;
    }
    public String getCustomerIndustry() {
        return this.customerIndustry;
    }

    public ClueInformationReq setRevenueScale(String revenueScale) {
        this.revenueScale = revenueScale;
        return this;
    }
    public String getRevenueScale() {
        return this.revenueScale;
    }

    public ClueInformationReq setSocialCreditCode(String socialCreditCode) {
        this.socialCreditCode = socialCreditCode;
        return this;
    }
    public String getSocialCreditCode() {
        return this.socialCreditCode;
    }

    public ClueInformationReq setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ClueInformationReq setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public ClueInformationReq setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

}
