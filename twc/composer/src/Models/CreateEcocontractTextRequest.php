<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateEcocontractTextRequest extends Model
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

    // 签署结束信息，phase为FINISH时必选
    /**
     * @var ContractNotaryFinishInfo
     */
    public $finishInfo;

    // 签署流程ID
    /**
     * @var string
     */
    public $flowId;

    // 签署发起信息，phase为INIT时必选
    /**
     * @var ContractNotaryInitInfo
     */
    public $initInfo;

    // 存证阶段，分为INIT(发起)，SIGN(签署)，FINISH(结束)
    /**
     * @var string
     */
    public $phase;

    // 签署过程信息，phase为SIGN时必选
    /**
     * @var ContractNotarySignInfo
     */
    public $signInfo;

    // 存证事务ID
    /**
     * @var string
     */
    public $transactionId;

    // 签署文件存档阶段存证核验信息
    /**
     * @var ContractNotaryDocumentInfo
     */
    public $documentInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'finishInfo'        => 'finish_info',
        'flowId'            => 'flow_id',
        'initInfo'          => 'init_info',
        'phase'             => 'phase',
        'signInfo'          => 'sign_info',
        'transactionId'     => 'transaction_id',
        'documentInfo'      => 'document_info',
    ];

    public function validate()
    {
        Model::validateRequired('flowId', $this->flowId, true);
        Model::validateRequired('phase', $this->phase, true);
        Model::validateRequired('transactionId', $this->transactionId, true);
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
        if (null !== $this->finishInfo) {
            $res['finish_info'] = null !== $this->finishInfo ? $this->finishInfo->toMap() : null;
        }
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->initInfo) {
            $res['init_info'] = null !== $this->initInfo ? $this->initInfo->toMap() : null;
        }
        if (null !== $this->phase) {
            $res['phase'] = $this->phase;
        }
        if (null !== $this->signInfo) {
            $res['sign_info'] = null !== $this->signInfo ? $this->signInfo->toMap() : null;
        }
        if (null !== $this->transactionId) {
            $res['transaction_id'] = $this->transactionId;
        }
        if (null !== $this->documentInfo) {
            $res['document_info'] = null !== $this->documentInfo ? $this->documentInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateEcocontractTextRequest
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
        if (isset($map['finish_info'])) {
            $model->finishInfo = ContractNotaryFinishInfo::fromMap($map['finish_info']);
        }
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['init_info'])) {
            $model->initInfo = ContractNotaryInitInfo::fromMap($map['init_info']);
        }
        if (isset($map['phase'])) {
            $model->phase = $map['phase'];
        }
        if (isset($map['sign_info'])) {
            $model->signInfo = ContractNotarySignInfo::fromMap($map['sign_info']);
        }
        if (isset($map['transaction_id'])) {
            $model->transactionId = $map['transaction_id'];
        }
        if (isset($map['document_info'])) {
            $model->documentInfo = ContractNotaryDocumentInfo::fromMap($map['document_info']);
        }

        return $model;
    }
}
