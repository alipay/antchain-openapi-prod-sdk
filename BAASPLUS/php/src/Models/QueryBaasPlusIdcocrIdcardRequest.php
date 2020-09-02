<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryBaasPlusIdcocrIdcardRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'imageContent' => 'image_content',
        'side' => 'side',
    ];
    public function validate() {}
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
        if (null !== $this->imageContent) {
            $res['image_content'] = $this->imageContent;
        }
        if (null !== $this->side) {
            $res['side'] = $this->side;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBaasPlusIdcocrIdcardRequest
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
        if(isset($map['image_content'])){
            $model->imageContent = $map['image_content'];
        }
        if(isset($map['side'])){
            $model->side = $map['side'];
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

    // 身份证图片base64编码内容
    /**
     * @var string
     */
    public $imageContent;

    // face: 身份证正面
    // back: 身份证反面
    /**
     * @var string
     */
    public $side;

}
