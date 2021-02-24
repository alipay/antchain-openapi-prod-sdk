<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class CheckSecurityRdsRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'rdsContent' => 'rds_content',
    ];
    public function validate() {
        Model::validateRequired('rdsContent', $this->rdsContent, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->rdsContent) {
            $res['rds_content'] = $this->rdsContent;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CheckSecurityRdsRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['rds_content'])){
            $model->rdsContent = $map['rds_content'];
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

    // 输入大字段，具体见接入文档
    /**
     * @var string
     */
    public $rdsContent;

}
