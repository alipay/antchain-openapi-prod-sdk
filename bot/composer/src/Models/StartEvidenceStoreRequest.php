<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class StartEvidenceStoreRequest extends Model
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

    // 信物链存证结构体参数
    /**
     * @var EvidenceStorageReq
     */
    public $evidenceStorageReq;

    // 输入唯一交易ID序号，客户端管理短时内唯一
    /**
     * @var string
     */
    public $nonce;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'evidenceStorageReq' => 'evidence_storage_req',
        'nonce'              => 'nonce',
    ];

    public function validate()
    {
        Model::validateRequired('evidenceStorageReq', $this->evidenceStorageReq, true);
        Model::validateRequired('nonce', $this->nonce, true);
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
        if (null !== $this->evidenceStorageReq) {
            $res['evidence_storage_req'] = null !== $this->evidenceStorageReq ? $this->evidenceStorageReq->toMap() : null;
        }
        if (null !== $this->nonce) {
            $res['nonce'] = $this->nonce;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartEvidenceStoreRequest
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
        if (isset($map['evidence_storage_req'])) {
            $model->evidenceStorageReq = EvidenceStorageReq::fromMap($map['evidence_storage_req']);
        }
        if (isset($map['nonce'])) {
            $model->nonce = $map['nonce'];
        }

        return $model;
    }
}
