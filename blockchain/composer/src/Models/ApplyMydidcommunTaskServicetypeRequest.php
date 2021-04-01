<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ApplyMydidcommunTaskServicetypeRequest extends Model
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

    // 需要被授权人的DID
    /**
     * @var string
     */
    public $targetDid;

    // 申请发起人的DID
    /**
     * @var string
     */
    public $did;

    // 需要被授权使用的服务类型
    /**
     * @var string
     */
    public $serviceType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'targetDid'         => 'target_did',
        'did'               => 'did',
        'serviceType'       => 'service_type',
    ];

    public function validate()
    {
        Model::validateRequired('targetDid', $this->targetDid, true);
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('serviceType', $this->serviceType, true);
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
        if (null !== $this->targetDid) {
            $res['target_did'] = $this->targetDid;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->serviceType) {
            $res['service_type'] = $this->serviceType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyMydidcommunTaskServicetypeRequest
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
        if (isset($map['target_did'])) {
            $model->targetDid = $map['target_did'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['service_type'])) {
            $model->serviceType = $map['service_type'];
        }

        return $model;
    }
}
