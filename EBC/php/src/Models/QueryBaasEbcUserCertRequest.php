<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class QueryBaasEbcUserCertRequest extends Model
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

    // 企业did
    /**
     * @var string
     */
    public $orgDid;

    // 企业用户id
    /**
     * @var string
     */
    public $orgUserId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName'        => 'region_name',
        'orgDid'            => 'org_did',
        'orgUserId'         => 'org_user_id',
    ];

    public function validate()
    {
        Model::validateMaxLength('orgDid', $this->orgDid, 128);
        Model::validateMaxLength('orgUserId', $this->orgUserId, 128);
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
        if (null !== $this->orgUserId) {
            $res['org_user_id'] = $this->orgUserId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBaasEbcUserCertRequest
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
        if (isset($map['org_user_id'])) {
            $model->orgUserId = $map['org_user_id'];
        }

        return $model;
    }
}
