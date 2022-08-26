<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_6f72e7df0c87441c84120631f5b37b12\Models;

use AlibabaCloud\Tea\Model;

class CreateBaasChainCertAntRequest extends Model
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

    // ant_chain_id
    /**
     * @var string
     */
    public $antChainId;

    // region_id
    /**
     * @var string
     */
    public $regionId;

    // upload_req
    /**
     * @var string
     */
    public $uploadReq;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'antChainId'        => 'ant_chain_id',
        'regionId'          => 'region_id',
        'uploadReq'         => 'upload_req',
    ];

    public function validate()
    {
        Model::validateRequired('antChainId', $this->antChainId, true);
        Model::validateRequired('uploadReq', $this->uploadReq, true);
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
        if (null !== $this->antChainId) {
            $res['ant_chain_id'] = $this->antChainId;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->uploadReq) {
            $res['upload_req'] = $this->uploadReq;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateBaasChainCertAntRequest
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
        if (isset($map['ant_chain_id'])) {
            $model->antChainId = $map['ant_chain_id'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['upload_req'])) {
            $model->uploadReq = $map['upload_req'];
        }

        return $model;
    }
}
