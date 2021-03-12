<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartMydidcommunAgencyDataapplicationRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 申请的数据ID，该字段由两部分组成ownerdid#service-id(did doc中表示对应数据资产的serviceid)
    /**
     * @var string
     */
    public $dataId;

    // 主动发起申请数据流程的请求者did
    /**
     * @var string
     */
    public $did;

    // 申请数据时增加的说明，比如说明本次申请数据的原因，等描述
    /**
     * @var string
     */
    public $message;

    // 申请者在申请数据的时候，申明自己将使用那种方式处理申请到的数据。如果该字段为0表示要得到原始数据。
    // 该字段形式与dataId类似
    /**
     * @var string
     */
    public $processDataId;

    // 发起申请的申请id，系统将基于该id保持幂等
    /**
     * @var string
     */
    public $processId;

    // 数据申请到之后最终发送给谁的did
    /**
     * @var string
     */
    public $targetDid;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'dataId'            => 'data_id',
        'did'               => 'did',
        'message'           => 'message',
        'processDataId'     => 'process_data_id',
        'processId'         => 'process_id',
        'targetDid'         => 'target_did',
    ];

    public function validate()
    {
        Model::validateRequired('dataId', $this->dataId, true);
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('processId', $this->processId, true);
        Model::validateRequired('targetDid', $this->targetDid, true);
        Model::validateMaxLength('processId', $this->processId, 128);
        Model::validateMinLength('processId', $this->processId, 1);
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
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->processDataId) {
            $res['process_data_id'] = $this->processDataId;
        }
        if (null !== $this->processId) {
            $res['process_id'] = $this->processId;
        }
        if (null !== $this->targetDid) {
            $res['target_did'] = $this->targetDid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartMydidcommunAgencyDataapplicationRequest
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
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['process_data_id'])) {
            $model->processDataId = $map['process_data_id'];
        }
        if (isset($map['process_id'])) {
            $model->processId = $map['process_id'];
        }
        if (isset($map['target_did'])) {
            $model->targetDid = $map['target_did'];
        }

        return $model;
    }
}
