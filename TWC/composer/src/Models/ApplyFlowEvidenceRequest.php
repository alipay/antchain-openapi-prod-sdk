<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ApplyFlowEvidenceRequest extends Model
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

    // 证据包类型，默认为ChainEvidencePack(链上证据包)，按需填写，目前支持ChainEvidencePack(链上证据包)，其他包括LocalEvidencePack(链下证据包)，链下证据包前置依赖链上证据包，因此填写链下证据包会先生成链上证据包。
    // 链上证据包，即全流程所有阶段存证关系链上固化，生成全流程链上证据统一txHash；
    // 链下证据包，即全流程所有内容生成链下压缩包文件。
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
     * @return ApplyFlowEvidenceRequest
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
