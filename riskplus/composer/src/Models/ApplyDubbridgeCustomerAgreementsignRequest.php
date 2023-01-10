<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ApplyDubbridgeCustomerAgreementsignRequest extends Model
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

    // 订单号
    /**
     * @var string
     */
    public $orderNo;

    // 客户编号
    /**
     * @var string
     */
    public $customNo;

    // 张三
    /**
     * @var string
     */
    public $customName;

    // 110101xxxxxxxx
    /**
     * @var string
     */
    public $cardNo;

    // 证件类型
    /**
     * @var string
     */
    public $idType;

    // 资金方编号
    /**
     * @var string
     */
    public $fundCode;

    // 渠道号
    /**
     * @var string
     */
    public $channelCode;

    // 项目编号
    /**
     * @var string
     */
    public $projectCode;

    // 渠道号
    /**
     * @var string
     */
    public $orgCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderNo'           => 'order_no',
        'customNo'          => 'custom_no',
        'customName'        => 'custom_name',
        'cardNo'            => 'card_no',
        'idType'            => 'id_type',
        'fundCode'          => 'fund_code',
        'channelCode'       => 'channel_code',
        'projectCode'       => 'project_code',
        'orgCode'           => 'org_code',
    ];

    public function validate()
    {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('customNo', $this->customNo, true);
        Model::validateRequired('customName', $this->customName, true);
        Model::validateRequired('cardNo', $this->cardNo, true);
        Model::validateRequired('channelCode', $this->channelCode, true);
        Model::validateRequired('projectCode', $this->projectCode, true);
        Model::validateRequired('orgCode', $this->orgCode, true);
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
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->customNo) {
            $res['custom_no'] = $this->customNo;
        }
        if (null !== $this->customName) {
            $res['custom_name'] = $this->customName;
        }
        if (null !== $this->cardNo) {
            $res['card_no'] = $this->cardNo;
        }
        if (null !== $this->idType) {
            $res['id_type'] = $this->idType;
        }
        if (null !== $this->fundCode) {
            $res['fund_code'] = $this->fundCode;
        }
        if (null !== $this->channelCode) {
            $res['channel_code'] = $this->channelCode;
        }
        if (null !== $this->projectCode) {
            $res['project_code'] = $this->projectCode;
        }
        if (null !== $this->orgCode) {
            $res['org_code'] = $this->orgCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyDubbridgeCustomerAgreementsignRequest
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
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['custom_no'])) {
            $model->customNo = $map['custom_no'];
        }
        if (isset($map['custom_name'])) {
            $model->customName = $map['custom_name'];
        }
        if (isset($map['card_no'])) {
            $model->cardNo = $map['card_no'];
        }
        if (isset($map['id_type'])) {
            $model->idType = $map['id_type'];
        }
        if (isset($map['fund_code'])) {
            $model->fundCode = $map['fund_code'];
        }
        if (isset($map['channel_code'])) {
            $model->channelCode = $map['channel_code'];
        }
        if (isset($map['project_code'])) {
            $model->projectCode = $map['project_code'];
        }
        if (isset($map['org_code'])) {
            $model->orgCode = $map['org_code'];
        }

        return $model;
    }
}
