<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRiskDataScoreRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'businessCode' => 'business_code',
        'productCodes' => 'product_codes',
        'params' => 'params',
        'subTenant' => 'sub_tenant',
        'bizUniqueId' => 'biz_unique_id',
        'hashType' => 'hash_type',
        'eventDataType' => 'event_data_type',
    ];
    public function validate() {
        Model::validateRequired('businessCode', $this->businessCode, true);
        Model::validateRequired('productCodes', $this->productCodes, true);
        Model::validateRequired('params', $this->params, true);
        Model::validateRequired('subTenant', $this->subTenant, true);
        Model::validateRequired('hashType', $this->hashType, true);
        Model::validateRequired('eventDataType', $this->eventDataType, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->businessCode) {
            $res['business_code'] = $this->businessCode;
        }
        if (null !== $this->productCodes) {
            $res['product_codes'] = $this->productCodes;
        }
        if (null !== $this->params) {
            $res['params'] = $this->params;
        }
        if (null !== $this->subTenant) {
            $res['sub_tenant'] = $this->subTenant;
        }
        if (null !== $this->bizUniqueId) {
            $res['biz_unique_id'] = $this->bizUniqueId;
        }
        if (null !== $this->hashType) {
            $res['hash_type'] = $this->hashType;
        }
        if (null !== $this->eventDataType) {
            $res['event_data_type'] = $this->eventDataType;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryRiskDataScoreRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['business_code'])){
            $model->businessCode = $map['business_code'];
        }
        if(isset($map['product_codes'])){
            if(!empty($map['product_codes'])){
                $model->productCodes = $map['product_codes'];
            }
        }
        if(isset($map['params'])){
            $model->params = $map['params'];
        }
        if(isset($map['sub_tenant'])){
            $model->subTenant = $map['sub_tenant'];
        }
        if(isset($map['biz_unique_id'])){
            $model->bizUniqueId = $map['biz_unique_id'];
        }
        if(isset($map['hash_type'])){
            $model->hashType = $map['hash_type'];
        }
        if(isset($map['event_data_type'])){
            $model->eventDataType = $map['event_data_type'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 授权码
    /**
     * @var string
     */
    public $businessCode;

    // 产品码
    /**
     * @var string[]
     */
    public $productCodes;

    // 必要入参
    /**
     * @var string
     */
    public $params;

    // 二级租户
    /**
     * @var string
     */
    public $subTenant;

    // 业务唯一标准
    /**
     * @var string
     */
    public $bizUniqueId;

    // 加密方式
    /**
     * @var string
     */
    public $hashType;

    // 测试标识
    /**
     * @var string
     */
    public $eventDataType;

}
