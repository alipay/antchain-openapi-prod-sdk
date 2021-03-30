<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class UpdateWaybillActionRequest extends Model
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

    // 操作类型，以下二选一填写：运单起运、运输完成
    /**
     * @var string
     */
    public $operateAction;

    // 运单起运或运输完成的时间，要求为13位毫秒级时间戳
    /**
     * @var int
     */
    public $operateActionTime;

    // 客户系统内运单编号
    /**
     * @var string
     */
    public $taxWaybillId;

    // 3plDid，一般为合同乙方的链上数字身份
    /**
     * @var string
     */
    public $thirdPartyLogisticsDid;
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'operateAction'          => 'operate_action',
        'operateActionTime'      => 'operate_action_time',
        'taxWaybillId'           => 'tax_waybill_id',
        'thirdPartyLogisticsDid' => 'third_party_logistics_did',
    ];

    public function validate()
    {
        Model::validateRequired('operateAction', $this->operateAction, true);
        Model::validateRequired('operateActionTime', $this->operateActionTime, true);
        Model::validateRequired('taxWaybillId', $this->taxWaybillId, true);
        Model::validateRequired('thirdPartyLogisticsDid', $this->thirdPartyLogisticsDid, true);
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
        if (null !== $this->operateAction) {
            $res['operate_action'] = $this->operateAction;
        }
        if (null !== $this->operateActionTime) {
            $res['operate_action_time'] = $this->operateActionTime;
        }
        if (null !== $this->taxWaybillId) {
            $res['tax_waybill_id'] = $this->taxWaybillId;
        }
        if (null !== $this->thirdPartyLogisticsDid) {
            $res['third_party_logistics_did'] = $this->thirdPartyLogisticsDid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateWaybillActionRequest
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
        if (isset($map['operate_action'])) {
            $model->operateAction = $map['operate_action'];
        }
        if (isset($map['operate_action_time'])) {
            $model->operateActionTime = $map['operate_action_time'];
        }
        if (isset($map['tax_waybill_id'])) {
            $model->taxWaybillId = $map['tax_waybill_id'];
        }
        if (isset($map['third_party_logistics_did'])) {
            $model->thirdPartyLogisticsDid = $map['third_party_logistics_did'];
        }

        return $model;
    }
}
