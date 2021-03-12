<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class VcTransmitPayload extends Model
{
    // 目标did相关信息列表
    /**
     * @example
     *
     * @var VcTransmitTargetStruct[]
     */
    public $targetVerifier;

    // 要传输的vc_id
    /**
     * @example vc:mychain:xxxxx
     *
     * @var string
     */
    public $vcId;

    // vc原文，如果vc原文出现在传输接口，那么VC仓库不会从本地查找，而是直接将传输的VC上链
    /**
     * @example json string
     *
     * @var string
     */
    public $vcContent;
    protected $_name = [
        'targetVerifier' => 'target_verifier',
        'vcId'           => 'vc_id',
        'vcContent'      => 'vc_content',
    ];

    public function validate()
    {
        Model::validateRequired('targetVerifier', $this->targetVerifier, true);
        Model::validateRequired('vcId', $this->vcId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->targetVerifier) {
            $res['target_verifier'] = [];
            if (null !== $this->targetVerifier && \is_array($this->targetVerifier)) {
                $n = 0;
                foreach ($this->targetVerifier as $item) {
                    $res['target_verifier'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->vcId) {
            $res['vc_id'] = $this->vcId;
        }
        if (null !== $this->vcContent) {
            $res['vc_content'] = $this->vcContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VcTransmitPayload
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['target_verifier'])) {
            if (!empty($map['target_verifier'])) {
                $model->targetVerifier = [];
                $n                     = 0;
                foreach ($map['target_verifier'] as $item) {
                    $model->targetVerifier[$n++] = null !== $item ? VcTransmitTargetStruct::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['vc_id'])) {
            $model->vcId = $map['vc_id'];
        }
        if (isset($map['vc_content'])) {
            $model->vcContent = $map['vc_content'];
        }

        return $model;
    }
}
