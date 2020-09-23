<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class CreateBaasEbcOrganizationRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'orgCode' => 'org_code',
        'orgName' => 'org_name',
    ];
    public function validate() {
        Model::validateMaxLength('orgCode', $this->orgCode, 64);
        Model::validateMaxLength('orgName', $this->orgName, 128);
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
        if (null !== $this->orgCode) {
            $res['org_code'] = $this->orgCode;
        }
        if (null !== $this->orgName) {
            $res['org_name'] = $this->orgName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateBaasEbcOrganizationRequest
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
        if(isset($map['org_code'])){
            $model->orgCode = $map['org_code'];
        }
        if(isset($map['org_name'])){
            $model->orgName = $map['org_name'];
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

    // 企业码
    /**
     * @var string
     */
    public $orgCode;

    // 企业名称
    /**
     * @var string
     */
    public $orgName;

}
