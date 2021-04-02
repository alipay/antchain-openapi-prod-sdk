<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class StartEvidenceQueryRequest extends Model
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

    // 信物链单条存证查询请求结构体
    /**
     * @var EvidenceQueryInfoReq
     */
    public $evidenceQueryInfoReq;

    // 输入交易唯一ID，短时内唯一
    /**
     * @var string
     */
    public $nonce;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'evidenceQueryInfoReq' => 'evidence_query_info_req',
        'nonce'                => 'nonce',
    ];

    public function validate()
    {
        Model::validateRequired('evidenceQueryInfoReq', $this->evidenceQueryInfoReq, true);
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
        if (null !== $this->evidenceQueryInfoReq) {
            $res['evidence_query_info_req'] = null !== $this->evidenceQueryInfoReq ? $this->evidenceQueryInfoReq->toMap() : null;
        }
        if (null !== $this->nonce) {
            $res['nonce'] = $this->nonce;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartEvidenceQueryRequest
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
        if (isset($map['evidence_query_info_req'])) {
            $model->evidenceQueryInfoReq = EvidenceQueryInfoReq::fromMap($map['evidence_query_info_req']);
        }
        if (isset($map['nonce'])) {
            $model->nonce = $map['nonce'];
        }

        return $model;
    }
}
