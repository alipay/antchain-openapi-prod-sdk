<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

use AntChain\SECURITYTECH\Models\MaoMerchantInfo;

class UpdateMerchantApplyRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'merchantId' => 'merchant_id',
        'usci' => 'usci',
        'industry' => 'industry',
        'scene' => 'scene',
        'modifyFields' => 'modify_fields',
    ];
    public function validate() {
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('modifyFields', $this->modifyFields, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->usci) {
            $res['usci'] = $this->usci;
        }
        if (null !== $this->industry) {
            $res['industry'] = $this->industry;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->modifyFields) {
            $res['modify_fields'] = null !== $this->modifyFields ? $this->modifyFields->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateMerchantApplyRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['merchant_id'])){
            $model->merchantId = $map['merchant_id'];
        }
        if(isset($map['usci'])){
            $model->usci = $map['usci'];
        }
        if(isset($map['industry'])){
            $model->industry = $map['industry'];
        }
        if(isset($map['scene'])){
            $model->scene = $map['scene'];
        }
        if(isset($map['modify_fields'])){
            $model->modifyFields = MaoMerchantInfo::fromMap($map['modify_fields']);
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

    // 商户号
    /**
     * @var string
     */
    public $merchantId;

    // 社会统代
    /**
     * @var string
     */
    public $usci;

    // 行业类型
    /**
     * @var string
     */
    public $industry;

    // 入驻场景
    /**
     * @var string
     */
    public $scene;

    // 商户信息
    /**
     * @var MaoMerchantInfo
     */
    public $modifyFields;

}
