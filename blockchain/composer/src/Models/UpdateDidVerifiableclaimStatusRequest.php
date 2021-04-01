<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class UpdateDidVerifiableclaimStatusRequest extends Model
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

    // 希望可验证声明的状态， 0无效，1生效
    /**
     * @var string
     */
    public $status;

    // 可验证声明id
    /**
     * @var string
     */
    public $vcId;

    // 该VC的颁发者
    /**
     * @var string
     */
    public $issuerDid;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizCode'           => 'biz_code',
        'status'            => 'status',
        'vcId'              => 'vc_id',
        'issuerDid'         => 'issuer_did',
    ];

    public function validate()
    {
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('vcId', $this->vcId, true);
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->vcId) {
            $res['vc_id'] = $this->vcId;
        }
        if (null !== $this->issuerDid) {
            $res['issuer_did'] = $this->issuerDid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDidVerifiableclaimStatusRequest
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
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['vc_id'])) {
            $model->vcId = $map['vc_id'];
        }
        if (isset($map['issuer_did'])) {
            $model->issuerDid = $map['issuer_did'];
        }

        return $model;
    }
}
