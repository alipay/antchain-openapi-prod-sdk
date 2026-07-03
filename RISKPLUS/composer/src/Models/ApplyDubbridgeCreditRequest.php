<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ApplyDubbridgeCreditRequest extends Model
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

    // 基础信息
    /**
     * @var PersonalInfo
     */
    public $personalInfo;

    // 资产方用户唯一标识
    /**
     * @var string
     */
    public $openId;

    // 订单号
    /**
     * @var string
     */
    public $orderNo;

    // 居住信息
    /**
     * @var LiveInfo
     */
    public $borrowerLiveInfo;

    // 工作信息
    /**
     * @var JobInfo
     */
    public $borrowerEmpInfo;

    // 产品编号
    /**
     * @var string
     */
    public $prodNo;

    // 风险数据对象json字符串
    /**
     * @var string
     */
    public $riskData;

    // 借款用途
    /**
     * @var string
     */
    public $loanReason;

    // 资料文件
    /**
     * @var Material[]
     */
    public $materials;

    // 导流平台
    /**
     * @var string
     */
    public $trafficPlatform;

    // 流量名称
    /**
     * @var string
     */
    public $trafficSourceName;

    // 广告位标志
    /**
     * @var string
     */
    public $trafficAdId;

    // 预留
    /**
     * @var string
     */
    public $trafficMktId;

    // 预留
    /**
     * @var string
     */
    public $clickId;

    // 渠道类型
    /**
     * @var string
     */
    public $channelType;

    // 客户类型
    /**
     * @var string
     */
    public $customType;

    // 资金方代码
    /**
     * @var string
     */
    public $fundCode;

    // 业务方订单号
    /**
     * @var string
     */
    public $bizOrderNo;

    // 业务类型
    /**
     * @var string
     */
    public $prodType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'personalInfo'      => 'personal_info',
        'openId'            => 'open_id',
        'orderNo'           => 'order_no',
        'borrowerLiveInfo'  => 'borrower_live_info',
        'borrowerEmpInfo'   => 'borrower_emp_info',
        'prodNo'            => 'prod_no',
        'riskData'          => 'risk_data',
        'loanReason'        => 'loan_reason',
        'materials'         => 'materials',
        'trafficPlatform'   => 'traffic_platform',
        'trafficSourceName' => 'traffic_source_name',
        'trafficAdId'       => 'traffic_ad_id',
        'trafficMktId'      => 'traffic_mkt_id',
        'clickId'           => 'click_id',
        'channelType'       => 'channel_type',
        'customType'        => 'custom_type',
        'fundCode'          => 'fund_code',
        'bizOrderNo'        => 'biz_order_no',
        'prodType'          => 'prod_type',
    ];

    public function validate()
    {
        Model::validateRequired('personalInfo', $this->personalInfo, true);
        Model::validateRequired('openId', $this->openId, true);
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('riskData', $this->riskData, true);
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
        if (null !== $this->personalInfo) {
            $res['personal_info'] = null !== $this->personalInfo ? $this->personalInfo->toMap() : null;
        }
        if (null !== $this->openId) {
            $res['open_id'] = $this->openId;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->borrowerLiveInfo) {
            $res['borrower_live_info'] = null !== $this->borrowerLiveInfo ? $this->borrowerLiveInfo->toMap() : null;
        }
        if (null !== $this->borrowerEmpInfo) {
            $res['borrower_emp_info'] = null !== $this->borrowerEmpInfo ? $this->borrowerEmpInfo->toMap() : null;
        }
        if (null !== $this->prodNo) {
            $res['prod_no'] = $this->prodNo;
        }
        if (null !== $this->riskData) {
            $res['risk_data'] = $this->riskData;
        }
        if (null !== $this->loanReason) {
            $res['loan_reason'] = $this->loanReason;
        }
        if (null !== $this->materials) {
            $res['materials'] = [];
            if (null !== $this->materials && \is_array($this->materials)) {
                $n = 0;
                foreach ($this->materials as $item) {
                    $res['materials'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->trafficPlatform) {
            $res['traffic_platform'] = $this->trafficPlatform;
        }
        if (null !== $this->trafficSourceName) {
            $res['traffic_source_name'] = $this->trafficSourceName;
        }
        if (null !== $this->trafficAdId) {
            $res['traffic_ad_id'] = $this->trafficAdId;
        }
        if (null !== $this->trafficMktId) {
            $res['traffic_mkt_id'] = $this->trafficMktId;
        }
        if (null !== $this->clickId) {
            $res['click_id'] = $this->clickId;
        }
        if (null !== $this->channelType) {
            $res['channel_type'] = $this->channelType;
        }
        if (null !== $this->customType) {
            $res['custom_type'] = $this->customType;
        }
        if (null !== $this->fundCode) {
            $res['fund_code'] = $this->fundCode;
        }
        if (null !== $this->bizOrderNo) {
            $res['biz_order_no'] = $this->bizOrderNo;
        }
        if (null !== $this->prodType) {
            $res['prod_type'] = $this->prodType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyDubbridgeCreditRequest
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
        if (isset($map['personal_info'])) {
            $model->personalInfo = PersonalInfo::fromMap($map['personal_info']);
        }
        if (isset($map['open_id'])) {
            $model->openId = $map['open_id'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['borrower_live_info'])) {
            $model->borrowerLiveInfo = LiveInfo::fromMap($map['borrower_live_info']);
        }
        if (isset($map['borrower_emp_info'])) {
            $model->borrowerEmpInfo = JobInfo::fromMap($map['borrower_emp_info']);
        }
        if (isset($map['prod_no'])) {
            $model->prodNo = $map['prod_no'];
        }
        if (isset($map['risk_data'])) {
            $model->riskData = $map['risk_data'];
        }
        if (isset($map['loan_reason'])) {
            $model->loanReason = $map['loan_reason'];
        }
        if (isset($map['materials'])) {
            if (!empty($map['materials'])) {
                $model->materials = [];
                $n                = 0;
                foreach ($map['materials'] as $item) {
                    $model->materials[$n++] = null !== $item ? Material::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['traffic_platform'])) {
            $model->trafficPlatform = $map['traffic_platform'];
        }
        if (isset($map['traffic_source_name'])) {
            $model->trafficSourceName = $map['traffic_source_name'];
        }
        if (isset($map['traffic_ad_id'])) {
            $model->trafficAdId = $map['traffic_ad_id'];
        }
        if (isset($map['traffic_mkt_id'])) {
            $model->trafficMktId = $map['traffic_mkt_id'];
        }
        if (isset($map['click_id'])) {
            $model->clickId = $map['click_id'];
        }
        if (isset($map['channel_type'])) {
            $model->channelType = $map['channel_type'];
        }
        if (isset($map['custom_type'])) {
            $model->customType = $map['custom_type'];
        }
        if (isset($map['fund_code'])) {
            $model->fundCode = $map['fund_code'];
        }
        if (isset($map['biz_order_no'])) {
            $model->bizOrderNo = $map['biz_order_no'];
        }
        if (isset($map['prod_type'])) {
            $model->prodType = $map['prod_type'];
        }

        return $model;
    }
}
