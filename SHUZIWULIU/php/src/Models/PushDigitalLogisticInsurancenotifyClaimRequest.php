<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class PushDigitalLogisticInsurancenotifyClaimRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'category' => 'category',
        'content' => 'content',
    ];
    public function validate() {
        Model::validateMaxLength('category', $this->category, 16);
        Model::validateMaxLength('content', $this->content, 3000);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->category) {
            $res['category'] = $this->category;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PushDigitalLogisticInsurancenotifyClaimRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['category'])){
            $model->category = $map['category'];
        }
        if(isset($map['content'])){
            $model->content = $map['content'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 通知类型：
    // claims_pay:理赔支付信息
    // claims_info: 理赔信息
    /**
     * @var string
     */
    public $category;

    // 通知内容
    /**
     * @var string
     */
    public $content;

}
