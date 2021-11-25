<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class CreateProjectBaseRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 唯一业务id
    /**
     * @var int
     */
    public $projectId;

    // 项目编号
    /**
     * @var string
     */
    public $projectCode;

    // 项目名称
    /**
     * @var string
     */
    public $projectName;

    // 项目建立时间
    /**
     * @var string
     */
    public $projectCreateTime;

    // 建设单位统一社会信用代码
    /**
     * @var string
     */
    public $partyABidderCode;

    // 施工单位统一社会信用代码
    /**
     * @var string
     */
    public $partyBBidderCode;

    // 项目所在行政区域代码
    /**
     * @var string
     */
    public $regionCode;

    // 项目类型
    /**
     * @var string
     */
    public $projectType;

    // 拟开工时间
    /**
     * @var string
     */
    public $startTime;

    // 拟建成时间
    /**
     * @var string
     */
    public $endTime;

    // 工程造价（单位：元，精确小数点后6位）
    /**
     * @var string
     */
    public $projectPrice;

    // 资金来源
    /**
     * @var string
     */
    public $fundSource;

    // 行业分类
    /**
     * @var string
     */
    public $indusCategory;

    // 项目地址
    /**
     * @var string
     */
    public $projectAddress;

    // 争议解决方式
    /**
     * @var string
     */
    public $disputeresolutionType;

    // 资金落实比例
    /**
     * @var string
     */
    public $contributionRatio;

    // 资金落实情况
    /**
     * @var string
     */
    public $fundImpl;

    // 项目规模
    /**
     * @var string
     */
    public $projectScale;

    // 总投资额(单位：元，小数点后六位)
    /**
     * @var string
     */
    public $bidBond;

    // 建设单位的项目联系人
    /**
     * @var string
     */
    public $contactor;

    // 建设单位的项目联系人联系方式
    /**
     * @var string
     */
    public $contactInformation;

    // 是否国有投资
    /**
     * @var string
     */
    public $isGContruction;

    // 担保方式
    /**
     * @var string
     */
    public $guaranteeType;

    // 反担保协议编号
    /**
     * @var string
     */
    public $conterGuarAgreeNo;

    // 创建人did
    /**
     * @var string
     */
    public $createdDid;

    // 数据时间戳
    /**
     * @var string
     */
    public $dataTimestamp;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'projectId'             => 'project_id',
        'projectCode'           => 'project_code',
        'projectName'           => 'project_name',
        'projectCreateTime'     => 'project_create_time',
        'partyABidderCode'      => 'party_a_bidder_code',
        'partyBBidderCode'      => 'party_b_bidder_code',
        'regionCode'            => 'region_code',
        'projectType'           => 'project_type',
        'startTime'             => 'start_time',
        'endTime'               => 'end_time',
        'projectPrice'          => 'project_price',
        'fundSource'            => 'fund_source',
        'indusCategory'         => 'indus_category',
        'projectAddress'        => 'project_address',
        'disputeresolutionType' => 'disputeresolution_type',
        'contributionRatio'     => 'contribution_ratio',
        'fundImpl'              => 'fund_impl',
        'projectScale'          => 'project_scale',
        'bidBond'               => 'bid_bond',
        'contactor'             => 'contactor',
        'contactInformation'    => 'contact_information',
        'isGContruction'        => 'is_g_contruction',
        'guaranteeType'         => 'guarantee_type',
        'conterGuarAgreeNo'     => 'conter_guar_agree_no',
        'createdDid'            => 'created_did',
        'dataTimestamp'         => 'data_timestamp',
    ];

    public function validate()
    {
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('projectCode', $this->projectCode, true);
        Model::validateRequired('projectName', $this->projectName, true);
        Model::validateRequired('projectCreateTime', $this->projectCreateTime, true);
        Model::validateRequired('partyABidderCode', $this->partyABidderCode, true);
        Model::validateRequired('partyBBidderCode', $this->partyBBidderCode, true);
        Model::validateRequired('regionCode', $this->regionCode, true);
        Model::validateRequired('projectType', $this->projectType, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('endTime', $this->endTime, true);
        Model::validateRequired('projectPrice', $this->projectPrice, true);
        Model::validateRequired('fundSource', $this->fundSource, true);
        Model::validateRequired('indusCategory', $this->indusCategory, true);
        Model::validateRequired('projectAddress', $this->projectAddress, true);
        Model::validateRequired('dataTimestamp', $this->dataTimestamp, true);
        Model::validatePattern('projectCreateTime', $this->projectCreateTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('endTime', $this->endTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('dataTimestamp', $this->dataTimestamp, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->projectCode) {
            $res['project_code'] = $this->projectCode;
        }
        if (null !== $this->projectName) {
            $res['project_name'] = $this->projectName;
        }
        if (null !== $this->projectCreateTime) {
            $res['project_create_time'] = $this->projectCreateTime;
        }
        if (null !== $this->partyABidderCode) {
            $res['party_a_bidder_code'] = $this->partyABidderCode;
        }
        if (null !== $this->partyBBidderCode) {
            $res['party_b_bidder_code'] = $this->partyBBidderCode;
        }
        if (null !== $this->regionCode) {
            $res['region_code'] = $this->regionCode;
        }
        if (null !== $this->projectType) {
            $res['project_type'] = $this->projectType;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->projectPrice) {
            $res['project_price'] = $this->projectPrice;
        }
        if (null !== $this->fundSource) {
            $res['fund_source'] = $this->fundSource;
        }
        if (null !== $this->indusCategory) {
            $res['indus_category'] = $this->indusCategory;
        }
        if (null !== $this->projectAddress) {
            $res['project_address'] = $this->projectAddress;
        }
        if (null !== $this->disputeresolutionType) {
            $res['disputeresolution_type'] = $this->disputeresolutionType;
        }
        if (null !== $this->contributionRatio) {
            $res['contribution_ratio'] = $this->contributionRatio;
        }
        if (null !== $this->fundImpl) {
            $res['fund_impl'] = $this->fundImpl;
        }
        if (null !== $this->projectScale) {
            $res['project_scale'] = $this->projectScale;
        }
        if (null !== $this->bidBond) {
            $res['bid_bond'] = $this->bidBond;
        }
        if (null !== $this->contactor) {
            $res['contactor'] = $this->contactor;
        }
        if (null !== $this->contactInformation) {
            $res['contact_information'] = $this->contactInformation;
        }
        if (null !== $this->isGContruction) {
            $res['is_g_contruction'] = $this->isGContruction;
        }
        if (null !== $this->guaranteeType) {
            $res['guarantee_type'] = $this->guaranteeType;
        }
        if (null !== $this->conterGuarAgreeNo) {
            $res['conter_guar_agree_no'] = $this->conterGuarAgreeNo;
        }
        if (null !== $this->createdDid) {
            $res['created_did'] = $this->createdDid;
        }
        if (null !== $this->dataTimestamp) {
            $res['data_timestamp'] = $this->dataTimestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateProjectBaseRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['project_code'])) {
            $model->projectCode = $map['project_code'];
        }
        if (isset($map['project_name'])) {
            $model->projectName = $map['project_name'];
        }
        if (isset($map['project_create_time'])) {
            $model->projectCreateTime = $map['project_create_time'];
        }
        if (isset($map['party_a_bidder_code'])) {
            $model->partyABidderCode = $map['party_a_bidder_code'];
        }
        if (isset($map['party_b_bidder_code'])) {
            $model->partyBBidderCode = $map['party_b_bidder_code'];
        }
        if (isset($map['region_code'])) {
            $model->regionCode = $map['region_code'];
        }
        if (isset($map['project_type'])) {
            $model->projectType = $map['project_type'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['project_price'])) {
            $model->projectPrice = $map['project_price'];
        }
        if (isset($map['fund_source'])) {
            $model->fundSource = $map['fund_source'];
        }
        if (isset($map['indus_category'])) {
            $model->indusCategory = $map['indus_category'];
        }
        if (isset($map['project_address'])) {
            $model->projectAddress = $map['project_address'];
        }
        if (isset($map['disputeresolution_type'])) {
            $model->disputeresolutionType = $map['disputeresolution_type'];
        }
        if (isset($map['contribution_ratio'])) {
            $model->contributionRatio = $map['contribution_ratio'];
        }
        if (isset($map['fund_impl'])) {
            $model->fundImpl = $map['fund_impl'];
        }
        if (isset($map['project_scale'])) {
            $model->projectScale = $map['project_scale'];
        }
        if (isset($map['bid_bond'])) {
            $model->bidBond = $map['bid_bond'];
        }
        if (isset($map['contactor'])) {
            $model->contactor = $map['contactor'];
        }
        if (isset($map['contact_information'])) {
            $model->contactInformation = $map['contact_information'];
        }
        if (isset($map['is_g_contruction'])) {
            $model->isGContruction = $map['is_g_contruction'];
        }
        if (isset($map['guarantee_type'])) {
            $model->guaranteeType = $map['guarantee_type'];
        }
        if (isset($map['conter_guar_agree_no'])) {
            $model->conterGuarAgreeNo = $map['conter_guar_agree_no'];
        }
        if (isset($map['created_did'])) {
            $model->createdDid = $map['created_did'];
        }
        if (isset($map['data_timestamp'])) {
            $model->dataTimestamp = $map['data_timestamp'];
        }

        return $model;
    }
}
