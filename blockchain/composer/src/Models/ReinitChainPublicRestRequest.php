<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ReinitChainPublicRestRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // access_id
    /**
     * @var string
     */
    public $accessId;

    // bizid
    /**
     * @var string
     */
    public $bizid;

    // region_id
    /**
     * @var string
     */
    public $regionId;

    // vcode
    /**
     * @var string
     */
    public $vcode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'accessId'          => 'access_id',
        'bizid'             => 'bizid',
        'regionId'          => 'region_id',
        'vcode'             => 'vcode',
    ];

    public function validate()
    {
        Model::validateRequired('accessId', $this->accessId, true);
        Model::validateRequired('bizid', $this->bizid, true);
        Model::validateRequired('vcode', $this->vcode, true);
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
        if (null !== $this->accessId) {
            $res['access_id'] = $this->accessId;
        }
        if (null !== $this->bizid) {
            $res['bizid'] = $this->bizid;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->vcode) {
            $res['vcode'] = $this->vcode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReinitChainPublicRestRequest
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
        if (isset($map['access_id'])) {
            $model->accessId = $map['access_id'];
        }
        if (isset($map['bizid'])) {
            $model->bizid = $map['bizid'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['vcode'])) {
            $model->vcode = $map['vcode'];
        }

        return $model;
    }
}
