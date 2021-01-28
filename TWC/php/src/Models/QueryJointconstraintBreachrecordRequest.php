<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryJointconstraintBreachrecordRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'entityType' => 'entity_type',
        'certType' => 'cert_type',
        'certNumber' => 'cert_number',
    ];
    public function validate() {
        Model::validateRequired('entityType', $this->entityType, true);
        Model::validateRequired('certType', $this->certType, true);
        Model::validateRequired('certNumber', $this->certNumber, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->entityType) {
            $res['entity_type'] = $this->entityType;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->certNumber) {
            $res['cert_number'] = $this->certNumber;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryJointconstraintBreachrecordRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['entity_type'])){
            $model->entityType = $map['entity_type'];
        }
        if(isset($map['cert_type'])){
            $model->certType = $map['cert_type'];
        }
        if(isset($map['cert_number'])){
            $model->certNumber = $map['cert_number'];
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

    // 查询对象实体类型
    // 
    // 0：企业
    // 
    // 1：个人
    /**
     * @var int
     */
    public $entityType;

    // 对象实体证件类型
    // 
    // 0：统一社会信用代码
    // 
    // 1：身份证号码
    /**
     * @var int
     */
    public $certType;

    // 对象实体证件号码
    // 
    // 
    /**
     * @var string
     */
    public $certNumber;

}
