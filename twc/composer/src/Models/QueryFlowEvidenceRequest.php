<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryFlowEvidenceRequest extends Model
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

    // 流程id
    /**
     * @var string
     */
    public $flowId;

    // 证据包类型，默认为ChainEvidencePack(链上证据包)，其他包括LocalEvidencePack(链下证据包)，链下证据包前置依赖链上证据包，因此链下证据包会返回链上证据包，但如果查询链下证据包，则只有等链下证据包完整生成才会返回，否则返回都是生成中。
    /**
     * @var string
     */
    public $evidencePackType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'flowId'            => 'flow_id',
        'evidencePackType'  => 'evidence_pack_type',
    ];

    public function validate()
    {
        Model::validateRequired('flowId', $this->flowId, true);
        Model::validateRequired('evidencePackType', $this->evidencePackType, true);
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
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->evidencePackType) {
            $res['evidence_pack_type'] = $this->evidencePackType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryFlowEvidenceRequest
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
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['evidence_pack_type'])) {
            $model->evidencePackType = $map['evidence_pack_type'];
        }

        return $model;
    }
}
