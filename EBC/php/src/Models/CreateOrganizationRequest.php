<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class CreateOrganizationRequest extends Model {
    protected $_name = [
        'orgCode' => 'org_code',
        'orgName' => 'org_name',
    ];
    public function validate() {
        Model::validateMaxLength('orgCode', $this->orgCode, 64);
        Model::validateMaxLength('orgName', $this->orgName, 64);
    }
    public function toMap() {
        $res = [];
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
     * @return CreateOrganizationRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['org_code'])){
            $model->orgCode = $map['org_code'];
        }
        if(isset($map['org_name'])){
            $model->orgName = $map['org_name'];
        }
        return $model;
    }
    /**
     * @description 企业码
     * @example ANT
     * @var string
     */
    public $orgCode;

    /**
     * @description 企业名称
     * @example 蚂蚁金服
     * @var string
     */
    public $orgName;

}
