// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class CreateProjectBaseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 唯一业务id
    @NameInMap("project_id")
    @Validation(required = true)
    public Long projectId;

    // 项目编号
    @NameInMap("project_code")
    @Validation(required = true)
    public String projectCode;

    // 项目名称
    @NameInMap("project_name")
    @Validation(required = true)
    public String projectName;

    // 项目建立时间
    @NameInMap("project_create_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String projectCreateTime;

    // 建设单位统一社会信用代码
    @NameInMap("party_a_bidder_code")
    @Validation(required = true)
    public String partyABidderCode;

    // 施工单位统一社会信用代码
    @NameInMap("party_b_bidder_code")
    @Validation(required = true)
    public String partyBBidderCode;

    // 项目所在行政区域代码
    @NameInMap("region_code")
    @Validation(required = true)
    public String regionCode;

    // 项目类型
    @NameInMap("project_type")
    @Validation(required = true)
    public String projectType;

    // 拟开工时间
    @NameInMap("start_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    // 拟建成时间
    @NameInMap("end_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    // 工程造价（单位：元，精确小数点后6位）
    @NameInMap("project_price")
    @Validation(required = true)
    public String projectPrice;

    // 资金来源
    @NameInMap("fund_source")
    @Validation(required = true)
    public String fundSource;

    // 行业分类
    @NameInMap("indus_category")
    @Validation(required = true)
    public String indusCategory;

    // 项目地址
    @NameInMap("project_address")
    @Validation(required = true)
    public String projectAddress;

    // 争议解决方式
    @NameInMap("disputeresolution_type")
    public String disputeresolutionType;

    // 资金落实比例
    @NameInMap("contribution_ratio")
    public String contributionRatio;

    // 资金落实情况
    @NameInMap("fund_impl")
    public String fundImpl;

    // 项目规模
    @NameInMap("project_scale")
    public String projectScale;

    // 总投资额(单位：元，小数点后六位)
    @NameInMap("bid_bond")
    public String bidBond;

    // 建设单位的项目联系人
    @NameInMap("contactor")
    public String contactor;

    // 建设单位的项目联系人联系方式
    @NameInMap("contact_information")
    public String contactInformation;

    // 是否国有投资
    @NameInMap("is_g_contruction")
    public String isGContruction;

    // 担保方式
    @NameInMap("guarantee_type")
    public String guaranteeType;

    // 反担保协议编号
    @NameInMap("conter_guar_agree_no")
    public String conterGuarAgreeNo;

    // 创建人did
    @NameInMap("created_did")
    public String createdDid;

    // 数据时间戳
    @NameInMap("data_timestamp")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String dataTimestamp;

    public static CreateProjectBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectBaseRequest self = new CreateProjectBaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectBaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateProjectBaseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateProjectBaseRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateProjectBaseRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public CreateProjectBaseRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateProjectBaseRequest setProjectCreateTime(String projectCreateTime) {
        this.projectCreateTime = projectCreateTime;
        return this;
    }
    public String getProjectCreateTime() {
        return this.projectCreateTime;
    }

    public CreateProjectBaseRequest setPartyABidderCode(String partyABidderCode) {
        this.partyABidderCode = partyABidderCode;
        return this;
    }
    public String getPartyABidderCode() {
        return this.partyABidderCode;
    }

    public CreateProjectBaseRequest setPartyBBidderCode(String partyBBidderCode) {
        this.partyBBidderCode = partyBBidderCode;
        return this;
    }
    public String getPartyBBidderCode() {
        return this.partyBBidderCode;
    }

    public CreateProjectBaseRequest setRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }
    public String getRegionCode() {
        return this.regionCode;
    }

    public CreateProjectBaseRequest setProjectType(String projectType) {
        this.projectType = projectType;
        return this;
    }
    public String getProjectType() {
        return this.projectType;
    }

    public CreateProjectBaseRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateProjectBaseRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateProjectBaseRequest setProjectPrice(String projectPrice) {
        this.projectPrice = projectPrice;
        return this;
    }
    public String getProjectPrice() {
        return this.projectPrice;
    }

    public CreateProjectBaseRequest setFundSource(String fundSource) {
        this.fundSource = fundSource;
        return this;
    }
    public String getFundSource() {
        return this.fundSource;
    }

    public CreateProjectBaseRequest setIndusCategory(String indusCategory) {
        this.indusCategory = indusCategory;
        return this;
    }
    public String getIndusCategory() {
        return this.indusCategory;
    }

    public CreateProjectBaseRequest setProjectAddress(String projectAddress) {
        this.projectAddress = projectAddress;
        return this;
    }
    public String getProjectAddress() {
        return this.projectAddress;
    }

    public CreateProjectBaseRequest setDisputeresolutionType(String disputeresolutionType) {
        this.disputeresolutionType = disputeresolutionType;
        return this;
    }
    public String getDisputeresolutionType() {
        return this.disputeresolutionType;
    }

    public CreateProjectBaseRequest setContributionRatio(String contributionRatio) {
        this.contributionRatio = contributionRatio;
        return this;
    }
    public String getContributionRatio() {
        return this.contributionRatio;
    }

    public CreateProjectBaseRequest setFundImpl(String fundImpl) {
        this.fundImpl = fundImpl;
        return this;
    }
    public String getFundImpl() {
        return this.fundImpl;
    }

    public CreateProjectBaseRequest setProjectScale(String projectScale) {
        this.projectScale = projectScale;
        return this;
    }
    public String getProjectScale() {
        return this.projectScale;
    }

    public CreateProjectBaseRequest setBidBond(String bidBond) {
        this.bidBond = bidBond;
        return this;
    }
    public String getBidBond() {
        return this.bidBond;
    }

    public CreateProjectBaseRequest setContactor(String contactor) {
        this.contactor = contactor;
        return this;
    }
    public String getContactor() {
        return this.contactor;
    }

    public CreateProjectBaseRequest setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
        return this;
    }
    public String getContactInformation() {
        return this.contactInformation;
    }

    public CreateProjectBaseRequest setIsGContruction(String isGContruction) {
        this.isGContruction = isGContruction;
        return this;
    }
    public String getIsGContruction() {
        return this.isGContruction;
    }

    public CreateProjectBaseRequest setGuaranteeType(String guaranteeType) {
        this.guaranteeType = guaranteeType;
        return this;
    }
    public String getGuaranteeType() {
        return this.guaranteeType;
    }

    public CreateProjectBaseRequest setConterGuarAgreeNo(String conterGuarAgreeNo) {
        this.conterGuarAgreeNo = conterGuarAgreeNo;
        return this;
    }
    public String getConterGuarAgreeNo() {
        return this.conterGuarAgreeNo;
    }

    public CreateProjectBaseRequest setCreatedDid(String createdDid) {
        this.createdDid = createdDid;
        return this;
    }
    public String getCreatedDid() {
        return this.createdDid;
    }

    public CreateProjectBaseRequest setDataTimestamp(String dataTimestamp) {
        this.dataTimestamp = dataTimestamp;
        return this;
    }
    public String getDataTimestamp() {
        return this.dataTimestamp;
    }

}
