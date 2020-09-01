<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class CreateBaasEbcOrganizationUserRequest extends Model
{
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

    // 企业id
    /**
     * @var string
     */
    public $orgDid;

    // 个人id
    /**
     * @var string
     */
    public $personDid;

    // 机构内部用户工号
    /**
     * @var string
     */
    public $uid;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName'        => 'region_name',
        'orgDid'            => 'org_did',
        'personDid'         => 'person_did',
        'uid'               => 'uid',
    ];

    public function validate()
    {
        Model::validateMaxLength('orgDid', $this->orgDid, 128);
        Model::validateMaxLength('personDid', $this->personDid, 128);
        Model::validateMaxLength('uid', $this->uid, 64);
    }

    public function toMap()
    {
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
        if (null !== $this->orgDid) {
            $res['org_did'] = $this->orgDid;
        }
        if (null !== $this->personDid) {
            $res['person_did'] = $this->personDid;
        }
        if (null !== $this->uid) {
            $res['uid'] = $this->uid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateBaasEbcOrganizationUserRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['region_name'])) {
            $model->regionName = $map['region_name'];
        }
        if (isset($map['org_did'])) {
            $model->orgDid = $map['org_did'];
        }
        if (isset($map['person_did'])) {
            $model->personDid = $map['person_did'];
        }
        if (isset($map['uid'])) {
            $model->uid = $map['uid'];
        }

        return $model;
    }
}
