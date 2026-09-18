<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

use AntChain\SECURITYTECH\Models\MaoMerchantInfo;

class CreateMerchantApplyRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'usci' => 'usci',
        'industry' => 'industry',
        'subCategory' => 'sub_category',
        'scene' => 'scene',
        'merchantInfo' => 'merchant_info',
    ];
    public function validate() {
        Model::validateRequired('usci', $this->usci, true);
        Model::validateRequired('industry', $this->industry, true);
        Model::validateRequired('subCategory', $this->subCategory, true);
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('merchantInfo', $this->merchantInfo, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->usci) {
            $res['usci'] = $this->usci;
        }
        if (null !== $this->industry) {
            $res['industry'] = $this->industry;
        }
        if (null !== $this->subCategory) {
            $res['sub_category'] = $this->subCategory;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->merchantInfo) {
            $res['merchant_info'] = null !== $this->merchantInfo ? $this->merchantInfo->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateMerchantApplyRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['usci'])){
            $model->usci = $map['usci'];
        }
        if(isset($map['industry'])){
            $model->industry = $map['industry'];
        }
        if(isset($map['sub_category'])){
            $model->subCategory = $map['sub_category'];
        }
        if(isset($map['scene'])){
            $model->scene = $map['scene'];
        }
        if(isset($map['merchant_info'])){
            $model->merchantInfo = MaoMerchantInfo::fromMap($map['merchant_info']);
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

    // 统一社会信用代码
    /**
     * @var string
     */
    public $usci;

    // 行业类型
    /**
     * @var string
     */
    public $industry;

    // 二级类目
    /**
     * @var string
     */
    public $subCategory;

    // 入驻场景
    /**
     * @var string
     */
    public $scene;

    // 商户信息
    /**
     * @var MaoMerchantInfo
     */
    public $merchantInfo;

}
