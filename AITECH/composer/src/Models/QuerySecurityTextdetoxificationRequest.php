<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class QuerySecurityTextdetoxificationRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'question' => 'question',
        'businessId' => 'business_id',
        'appCode' => 'app_code',
    ];
    public function validate() {
        Model::validateRequired('question', $this->question, true);
        Model::validateRequired('appCode', $this->appCode, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->question) {
            $res['question'] = $this->question;
        }
        if (null !== $this->businessId) {
            $res['business_id'] = $this->businessId;
        }
        if (null !== $this->appCode) {
            $res['app_code'] = $this->appCode;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QuerySecurityTextdetoxificationRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['question'])){
            $model->question = $map['question'];
        }
        if(isset($map['business_id'])){
            $model->businessId = $map['business_id'];
        }
        if(isset($map['app_code'])){
            $model->appCode = $map['app_code'];
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

    // 待祛毒语料文本
    /**
     * @var string
     */
    public $question;

    // 租户标识
    /**
     * @var string
     */
    public $businessId;

    // 应用码
    /**
     * @var string
     */
    public $appCode;

}
