<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartMydidcommunAgencyDatatransmitstartRequest extends Model
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

    // 发送者的did
    /**
     * @var string
     */
    public $did;

    // 数字资产的owner did
    /**
     * @var string
     */
    public $ownerDid;

    // 具体调用Tapp的参数数组，json格式
    /**
     * @var string
     */
    public $params;

    // 数据处理tapp id
    /**
     * @var string
     */
    public $processTappId;

    // 处理tapp的function
    /**
     * @var string
     */
    public $processTappMethod;

    // 读取数据的tapp id
    /**
     * @var string
     */
    public $readTappId;

    // 读取数据的Tapp中对应的Method
    /**
     * @var string
     */
    public $readTappMethod;

    // 数据资产传输目标did
    /**
     * @var string
     */
    public $targetDid;

    // 发起流程的唯一号，系统将更加这个唯一号保持幂等
    /**
     * @var string
     */
    public $processId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'did'               => 'did',
        'ownerDid'          => 'owner_did',
        'params'            => 'params',
        'processTappId'     => 'process_tapp_id',
        'processTappMethod' => 'process_tapp_method',
        'readTappId'        => 'read_tapp_id',
        'readTappMethod'    => 'read_tapp_method',
        'targetDid'         => 'target_did',
        'processId'         => 'process_id',
    ];

    public function validate()
    {
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('params', $this->params, true);
        Model::validateRequired('readTappId', $this->readTappId, true);
        Model::validateRequired('readTappMethod', $this->readTappMethod, true);
        Model::validateRequired('targetDid', $this->targetDid, true);
        Model::validateRequired('processId', $this->processId, true);
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
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->ownerDid) {
            $res['owner_did'] = $this->ownerDid;
        }
        if (null !== $this->params) {
            $res['params'] = $this->params;
        }
        if (null !== $this->processTappId) {
            $res['process_tapp_id'] = $this->processTappId;
        }
        if (null !== $this->processTappMethod) {
            $res['process_tapp_method'] = $this->processTappMethod;
        }
        if (null !== $this->readTappId) {
            $res['read_tapp_id'] = $this->readTappId;
        }
        if (null !== $this->readTappMethod) {
            $res['read_tapp_method'] = $this->readTappMethod;
        }
        if (null !== $this->targetDid) {
            $res['target_did'] = $this->targetDid;
        }
        if (null !== $this->processId) {
            $res['process_id'] = $this->processId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartMydidcommunAgencyDatatransmitstartRequest
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
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['owner_did'])) {
            $model->ownerDid = $map['owner_did'];
        }
        if (isset($map['params'])) {
            $model->params = $map['params'];
        }
        if (isset($map['process_tapp_id'])) {
            $model->processTappId = $map['process_tapp_id'];
        }
        if (isset($map['process_tapp_method'])) {
            $model->processTappMethod = $map['process_tapp_method'];
        }
        if (isset($map['read_tapp_id'])) {
            $model->readTappId = $map['read_tapp_id'];
        }
        if (isset($map['read_tapp_method'])) {
            $model->readTappMethod = $map['read_tapp_method'];
        }
        if (isset($map['target_did'])) {
            $model->targetDid = $map['target_did'];
        }
        if (isset($map['process_id'])) {
            $model->processId = $map['process_id'];
        }

        return $model;
    }
}
