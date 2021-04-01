<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartDidVcrepositoryReadwithvcidRequest extends Model
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

    // 请求读取数据的did。
    /**
     * @var string
     */
    public $did;

    // 保留字段，请求读的did身份对应公钥对所有数据参数的签名（目前托管模式可缺省此字段，未来非托管时需请求端签名，需填此字段）
    /**
     * @var string
     */
    public $signature;

    // 要查询的这个vc属于哪个did，如果未指定，did会尝试从默认vc仓库获取
    /**
     * @var string
     */
    public $subjectDid;

    // 通过指定目标证书VC的唯一verifiable_claim_id来读取内容。
    /**
     * @var string
     */
    public $verifiableClaimId;

    // 场景码，找dis工作人员进行分配
    /**
     * @var string
     */
    public $bizCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'did'               => 'did',
        'signature'         => 'signature',
        'subjectDid'        => 'subject_did',
        'verifiableClaimId' => 'verifiable_claim_id',
        'bizCode'           => 'biz_code',
    ];

    public function validate()
    {
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('verifiableClaimId', $this->verifiableClaimId, true);
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
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }
        if (null !== $this->subjectDid) {
            $res['subject_did'] = $this->subjectDid;
        }
        if (null !== $this->verifiableClaimId) {
            $res['verifiable_claim_id'] = $this->verifiableClaimId;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartDidVcrepositoryReadwithvcidRequest
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
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }
        if (isset($map['subject_did'])) {
            $model->subjectDid = $map['subject_did'];
        }
        if (isset($map['verifiable_claim_id'])) {
            $model->verifiableClaimId = $map['verifiable_claim_id'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }

        return $model;
    }
}
