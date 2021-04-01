<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class VerifyDidZkpverifiableclaimProofRequest extends Model
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

    // 场景码，找dis工作人员进行分配
    /**
     * @var string
     */
    public $bizCode;

    // 包含ZKP Proof的可验证声明
    /**
     * @var string
     */
    public $vc;

    // ZKP验证信息
    /**
     * @var DidZKPInfo[]
     */
    public $verifyZkpProof;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizCode'           => 'biz_code',
        'vc'                => 'vc',
        'verifyZkpProof'    => 'verify_zkp_proof',
    ];

    public function validate()
    {
        Model::validateRequired('vc', $this->vc, true);
        Model::validateRequired('verifyZkpProof', $this->verifyZkpProof, true);
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
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }
        if (null !== $this->vc) {
            $res['vc'] = $this->vc;
        }
        if (null !== $this->verifyZkpProof) {
            $res['verify_zkp_proof'] = [];
            if (null !== $this->verifyZkpProof && \is_array($this->verifyZkpProof)) {
                $n = 0;
                foreach ($this->verifyZkpProof as $item) {
                    $res['verify_zkp_proof'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyDidZkpverifiableclaimProofRequest
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
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }
        if (isset($map['vc'])) {
            $model->vc = $map['vc'];
        }
        if (isset($map['verify_zkp_proof'])) {
            if (!empty($map['verify_zkp_proof'])) {
                $model->verifyZkpProof = [];
                $n                     = 0;
                foreach ($map['verify_zkp_proof'] as $item) {
                    $model->verifyZkpProof[$n++] = null !== $item ? DidZKPInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
