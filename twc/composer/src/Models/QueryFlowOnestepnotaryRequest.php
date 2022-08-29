<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryFlowOnestepnotaryRequest extends Model
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

    // 流程id，通过twc.notary.flow.onestepnotary.create接口获取
    /**
     * @var string
     */
    public $flowId;

    // 是否需要legal标，默认为false，如果需要则填true
    /**
     * @var bool
     */
    public $needLegalLogo;

    // 证据包类型，默认为空，不需要证据包，如果需要则按需填写，目前支持ChainEvidencePack(链上证据包)，其他包括LocalEvidencePack(链下证据包)，链下证据包前置依赖链上证据包，因此填写链下证据包会先生成链上证据包。
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
        'needLegalLogo'     => 'need_legal_logo',
        'evidencePackType'  => 'evidence_pack_type',
    ];

    public function validate()
    {
        Model::validateRequired('flowId', $this->flowId, true);
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
        if (null !== $this->needLegalLogo) {
            $res['need_legal_logo'] = $this->needLegalLogo;
        }
        if (null !== $this->evidencePackType) {
            $res['evidence_pack_type'] = $this->evidencePackType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryFlowOnestepnotaryRequest
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
        if (isset($map['need_legal_logo'])) {
            $model->needLegalLogo = $map['need_legal_logo'];
        }
        if (isset($map['evidence_pack_type'])) {
            $model->evidencePackType = $map['evidence_pack_type'];
        }

        return $model;
    }
}
