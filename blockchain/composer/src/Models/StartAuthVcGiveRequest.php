<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartAuthVcGiveRequest extends Model
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

    // 长度不超过64字符的业务唯一ID，用于对一个业务流的追踪，查询等。
    /**
     * @var string
     */
    public $bizId;

    // 业务类型，通常需要与授权宝服务沟通确定，业务类型可能影响此接口内部实现逻辑，长度不超过32字符。
    /**
     * @var string
     */
    public $bizType;

    // 一个json的string。内容包含具体需要的声明，不同业务场景不同。
    /**
     * @var string
     */
    public $claimContent;

    // 如果在相同的biz_type下，还需要针对声明claim进行细化划分，可以使用此字段。
    /**
     * @var string
     */
    public $claimType;

    // 非托管的情况下必选，业务方持有的did身份。
    /**
     * @var string
     */
    public $did;

    // 业务方可以传递的附加信息
    /**
     * @var string
     */
    public $extension;

    // 发起转增的发起方did，其实为发起请求之前的vc_id持有人
    /**
     * @var string
     */
    public $ownerDid;

    // 非托管的情况下必选。 使用did字段的密钥进行整体传送内容（不包括此signature字段）签名的结果，具体签名规则： 1. Map<String,String> params 的key按照字典序排序 2. 拼接为 key1=value1&key2=value2&key3=value3 ... 3. 计算sha256(第2步结果)得到hash 4. 使用hash 和 签名的did请求DIS的签名。
    /**
     * @var string
     */
    public $signature;

    // 转增目标的did内容
    /**
     * @var string
     */
    public $targetDid;

    // 目标票据所在的可验证证明的id
    /**
     * @var string
     */
    public $vcId;

    // 申请声明颁发后的有效期，可选参数，如果不指定则默认申请永久有效。
    /**
     * @var int
     */
    public $expire;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'bizType'           => 'biz_type',
        'claimContent'      => 'claim_content',
        'claimType'         => 'claim_type',
        'did'               => 'did',
        'extension'         => 'extension',
        'ownerDid'          => 'owner_did',
        'signature'         => 'signature',
        'targetDid'         => 'target_did',
        'vcId'              => 'vc_id',
        'expire'            => 'expire',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('ownerDid', $this->ownerDid, true);
        Model::validateRequired('targetDid', $this->targetDid, true);
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->claimContent) {
            $res['claim_content'] = $this->claimContent;
        }
        if (null !== $this->claimType) {
            $res['claim_type'] = $this->claimType;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->extension) {
            $res['extension'] = $this->extension;
        }
        if (null !== $this->ownerDid) {
            $res['owner_did'] = $this->ownerDid;
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
        if (null !== $this->expire) {
            $res['expire'] = $this->expire;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartAuthVcGiveRequest
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
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['claim_content'])) {
            $model->claimContent = $map['claim_content'];
        }
        if (isset($map['claim_type'])) {
            $model->claimType = $map['claim_type'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['extension'])) {
            $model->extension = $map['extension'];
        }
        if (isset($map['owner_did'])) {
            $model->ownerDid = $map['owner_did'];
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
        if (isset($map['expire'])) {
            $model->expire = $map['expire'];
        }

        return $model;
    }
}
