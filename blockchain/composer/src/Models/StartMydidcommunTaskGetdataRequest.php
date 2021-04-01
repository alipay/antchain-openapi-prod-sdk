<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartMydidcommunTaskGetdataRequest extends Model
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

    // 要获取的数据ID
    /**
     * @var string
     */
    public $dataDid;

    // 申请获得的数据的用户DID，将用该DID公钥加密原始数据
    /**
     * @var string
     */
    public $targetDid;

    // 授权数据申请方读取该数据的VC
    /**
     * @var string
     */
    public $vc;

    // 请求发起人的did
    /**
     * @var string
     */
    public $did;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'dataDid'           => 'data_did',
        'targetDid'         => 'target_did',
        'vc'                => 'vc',
        'did'               => 'did',
    ];

    public function validate()
    {
        Model::validateRequired('dataDid', $this->dataDid, true);
        Model::validateRequired('targetDid', $this->targetDid, true);
        Model::validateRequired('vc', $this->vc, true);
        Model::validateRequired('did', $this->did, true);
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
        if (null !== $this->dataDid) {
            $res['data_did'] = $this->dataDid;
        }
        if (null !== $this->targetDid) {
            $res['target_did'] = $this->targetDid;
        }
        if (null !== $this->vc) {
            $res['vc'] = $this->vc;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartMydidcommunTaskGetdataRequest
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
        if (isset($map['data_did'])) {
            $model->dataDid = $map['data_did'];
        }
        if (isset($map['target_did'])) {
            $model->targetDid = $map['target_did'];
        }
        if (isset($map['vc'])) {
            $model->vc = $map['vc'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }

        return $model;
    }
}
