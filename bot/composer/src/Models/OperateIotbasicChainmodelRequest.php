<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class OperateIotbasicChainmodelRequest extends Model
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

    // 操作类型
    /**
     * @var string
     */
    public $action;

    // 操作人id
    /**
     * @var string
     */
    public $operatorId;

    // 参数签名校验
    /**
     * @var string
     */
    public $paramSign;

    // 所属业务
    /**
     * @var string
     */
    public $business;

    // 资产数据类型
    /**
     * @var string
     */
    public $dataType;

    // 资产ID-key
    /**
     * @var string
     */
    public $assetsIdKey;

    // 资产ID-类型
    /**
     * @var string
     */
    public $assetsIdType;

    // 签名验证方式
    /**
     * @var string
     */
    public $signatureCheckType;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'action'             => 'action',
        'operatorId'         => 'operator_id',
        'paramSign'          => 'param_sign',
        'business'           => 'business',
        'dataType'           => 'data_type',
        'assetsIdKey'        => 'assets_id_key',
        'assetsIdType'       => 'assets_id_type',
        'signatureCheckType' => 'signature_check_type',
    ];

    public function validate()
    {
        Model::validateRequired('action', $this->action, true);
        Model::validateRequired('operatorId', $this->operatorId, true);
        Model::validateRequired('paramSign', $this->paramSign, true);
        Model::validateRequired('business', $this->business, true);
        Model::validateRequired('dataType', $this->dataType, true);
        Model::validateRequired('assetsIdKey', $this->assetsIdKey, true);
        Model::validateRequired('assetsIdType', $this->assetsIdType, true);
        Model::validateRequired('signatureCheckType', $this->signatureCheckType, true);
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
        if (null !== $this->action) {
            $res['action'] = $this->action;
        }
        if (null !== $this->operatorId) {
            $res['operator_id'] = $this->operatorId;
        }
        if (null !== $this->paramSign) {
            $res['param_sign'] = $this->paramSign;
        }
        if (null !== $this->business) {
            $res['business'] = $this->business;
        }
        if (null !== $this->dataType) {
            $res['data_type'] = $this->dataType;
        }
        if (null !== $this->assetsIdKey) {
            $res['assets_id_key'] = $this->assetsIdKey;
        }
        if (null !== $this->assetsIdType) {
            $res['assets_id_type'] = $this->assetsIdType;
        }
        if (null !== $this->signatureCheckType) {
            $res['signature_check_type'] = $this->signatureCheckType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateIotbasicChainmodelRequest
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
        if (isset($map['action'])) {
            $model->action = $map['action'];
        }
        if (isset($map['operator_id'])) {
            $model->operatorId = $map['operator_id'];
        }
        if (isset($map['param_sign'])) {
            $model->paramSign = $map['param_sign'];
        }
        if (isset($map['business'])) {
            $model->business = $map['business'];
        }
        if (isset($map['data_type'])) {
            $model->dataType = $map['data_type'];
        }
        if (isset($map['assets_id_key'])) {
            $model->assetsIdKey = $map['assets_id_key'];
        }
        if (isset($map['assets_id_type'])) {
            $model->assetsIdType = $map['assets_id_type'];
        }
        if (isset($map['signature_check_type'])) {
            $model->signatureCheckType = $map['signature_check_type'];
        }

        return $model;
    }
}
