<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartAuthVcShareRequest extends Model
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

    // 非托管的情况下必选，业务方持有的did身份。
    /**
     * @var string
     */
    public $did;

    // 在支持声明的claim字段级别分享能力时使用，可以指定哪些字段隐藏，哪些字段分享。示例中标记为”1“的是隐藏，”0“的是分享明文。
    /**
     * @var string
     */
    public $index;

    // 非托管的情况下必选。 使用did字段的密钥进行整体传送内容（不包括此signature字段）签名的结果，具体签名规则： 1. Map<String,String> params 的key按照字典序排序 2. 拼接为 key1=value1&key2=value2&key3=value3 ... 3. 计算sha256(第2步结果)得到hash 4. 使用hash 和 签名的did请求DIS的签名。
    /**
     * @var string
     */
    public $signature;

    // 分享声明的目标方DID
    /**
     * @var string
     */
    public $targetDid;

    // 分享权限的目标可验证声明(VC)的ID
    /**
     * @var string
     */
    public $vcId;

    // vc_id的owner，将持有的vc_id分享给目标target_did
    /**
     * @var string
     */
    public $ownerDid;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'did'               => 'did',
        'index'             => 'index',
        'signature'         => 'signature',
        'targetDid'         => 'target_did',
        'vcId'              => 'vc_id',
        'ownerDid'          => 'owner_did',
    ];

    public function validate()
    {
        Model::validateRequired('targetDid', $this->targetDid, true);
        Model::validateRequired('vcId', $this->vcId, true);
        Model::validateRequired('ownerDid', $this->ownerDid, true);
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
        if (null !== $this->index) {
            $res['index'] = $this->index;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }
        if (null !== $this->targetDid) {
            $res['target_did'] = $this->targetDid;
        }
        if (null !== $this->vcId) {
            $res['vc_id'] = $this->vcId;
        }
        if (null !== $this->ownerDid) {
            $res['owner_did'] = $this->ownerDid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartAuthVcShareRequest
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
        if (isset($map['index'])) {
            $model->index = $map['index'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }
        if (isset($map['target_did'])) {
            $model->targetDid = $map['target_did'];
        }
        if (isset($map['vc_id'])) {
            $model->vcId = $map['vc_id'];
        }
        if (isset($map['owner_did'])) {
            $model->ownerDid = $map['owner_did'];
        }

        return $model;
    }
}
