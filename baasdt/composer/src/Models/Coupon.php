<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class Coupon extends Model
{
    // 绑定时间戳（毫秒）
    /**
     * @example 0
     *
     * @var int
     */
    public $bindTime;

    // 绑定电子券的哈希
    /**
     * @example d6349493c0e50eedba4cb40e893edfdc9deeccd81523e280f27b992d02ffb735
     *
     * @var string
     */
    public $bindTxHash;

    // 电子券理论上应处于的状态（比如电子券已过期）
    /**
     * @example 4
     *
     * @var int
     */
    public $calStatus;

    // 激活时间戳（毫秒）
    /**
     * @example 0
     *
     * @var int
     */
    public $chargeTime;

    // 激活码
    /**
     * @example 1234567890asdfghjkl
     *
     * @var string
     */
    public $couponCode;

    // 激活码附加信息
    /**
     * @example 激活码附加信息
     *
     * @var string
     */
    public $couponExtCode;

    // 电子券ID
    /**
     * @example S20200707123456
     *
     * @var string
     */
    public $couponId;

    // 电子券名称
    /**
     * @example 区块链电子券
     *
     * @var string
     */
    public $couponName;

    // 创建时间戳（毫秒）
    /**
     * @example 1604889876156
     *
     * @var int
     */
    public $createTime;

    // 创建电子券的哈希
    /**
     * @example d6349493c0e50eedba4cb40e893edfdc9deeccd81523e280f27b992d02ffb734
     *
     * @var string
     */
    public $createTxHash;

    // 脱敏用户ID
    /**
     * @example user***1
     *
     * @var string
     */
    public $desensitizedUid;

    // 扩展信息
    /**
     * @example 电子券说明
     *
     * @var string
     */
    public $extInfo;

    // 最后一次操作时间戳（毫秒）
    /**
     * @example 1604905008121
     *
     * @var int
     */
    public $lastTime;

    // 最后一次操作的交易哈希
    /**
     * @example d6349493c0e50eedba4cb40e893edfdc9deeccd81523e280f27b992d02ffb736
     *
     * @var string
     */
    public $lastTxHash;

    // 电子券公钥。椭圆曲线密码学 Secp256k1曲线的公钥，长度64字节，十六进制128位。
    /**
     * @example 387bcb4db010c177742ab5bd257c9827f...b8b46223505148309a31fe009fcd694
     *
     * @var string
     */
    public $publicKey;

    // 调子券信息查询次数
    /**
     * @example 10000001
     *
     * @var int
     */
    public $queryCount;

    // 最后一次查询时间戳（毫秒）
    /**
     * @example 1604905008121
     *
     * @var int
     */
    public $queryTime;

    // 最近一次查询的交易哈希
    /**
     * @example d6349493c0e50eedba4cb40e893edfdc9deeccd81523e280f27b992d02ffb738
     *
     * @var string
     */
    public $queryTxHash;

    // 风控状态：0 启用，1 禁用
    /**
     * @example 1
     *
     * @var int
     */
    public $riskStatus;

    // 电子券状态：
    /**
     * @example 0
     *
     * @var int
     */
    public $status;

    // 用户公钥
    /**
     * @example 387bcb4db010c177742ab5bd257c9827f90...
     *
     * @var string
     */
    public $uidPublicKey;

    // 有效开始时间（毫秒时间戳）
    /**
     * @example 1600000000000
     *
     * @var int
     */
    public $validAfter;

    // 有效结束时间（毫秒时间戳）
    /**
     * @example 1604889934081
     *
     * @var int
     */
    public $validBefore;

    // 价值
    /**
     * @example 100.01
     *
     * @var string
     */
    public $value;

    // 电子券版本
    /**
     * @example 0
     *
     * @var int
     */
    public $version;

    // 电子券激活交易哈希
    /**
     * @example c37bbc026414712669d907134920f8862d58de7e2714d0f0faacf92f147d4646
     *
     * @var string
     */
    public $chargeTxHash;

    // 记名电子券持有者账户
    /**
     * @example user001
     *
     * @var string
     */
    public $holderUserAccount;
    protected $_name = [
        'bindTime'          => 'bind_time',
        'bindTxHash'        => 'bind_tx_hash',
        'calStatus'         => 'cal_status',
        'chargeTime'        => 'charge_time',
        'couponCode'        => 'coupon_code',
        'couponExtCode'     => 'coupon_ext_code',
        'couponId'          => 'coupon_id',
        'couponName'        => 'coupon_name',
        'createTime'        => 'create_time',
        'createTxHash'      => 'create_tx_hash',
        'desensitizedUid'   => 'desensitized_uid',
        'extInfo'           => 'ext_info',
        'lastTime'          => 'last_time',
        'lastTxHash'        => 'last_tx_hash',
        'publicKey'         => 'public_key',
        'queryCount'        => 'query_count',
        'queryTime'         => 'query_time',
        'queryTxHash'       => 'query_tx_hash',
        'riskStatus'        => 'risk_status',
        'status'            => 'status',
        'uidPublicKey'      => 'uid_public_key',
        'validAfter'        => 'valid_after',
        'validBefore'       => 'valid_before',
        'value'             => 'value',
        'version'           => 'version',
        'chargeTxHash'      => 'charge_tx_hash',
        'holderUserAccount' => 'holder_user_account',
    ];

    public function validate()
    {
        Model::validateRequired('bindTime', $this->bindTime, true);
        Model::validateRequired('bindTxHash', $this->bindTxHash, true);
        Model::validateRequired('calStatus', $this->calStatus, true);
        Model::validateRequired('chargeTime', $this->chargeTime, true);
        Model::validateRequired('couponCode', $this->couponCode, true);
        Model::validateRequired('couponExtCode', $this->couponExtCode, true);
        Model::validateRequired('couponId', $this->couponId, true);
        Model::validateRequired('couponName', $this->couponName, true);
        Model::validateRequired('createTime', $this->createTime, true);
        Model::validateRequired('createTxHash', $this->createTxHash, true);
        Model::validateRequired('desensitizedUid', $this->desensitizedUid, true);
        Model::validateRequired('extInfo', $this->extInfo, true);
        Model::validateRequired('lastTime', $this->lastTime, true);
        Model::validateRequired('lastTxHash', $this->lastTxHash, true);
        Model::validateRequired('publicKey', $this->publicKey, true);
        Model::validateRequired('queryCount', $this->queryCount, true);
        Model::validateRequired('queryTime', $this->queryTime, true);
        Model::validateRequired('queryTxHash', $this->queryTxHash, true);
        Model::validateRequired('riskStatus', $this->riskStatus, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('uidPublicKey', $this->uidPublicKey, true);
        Model::validateRequired('validAfter', $this->validAfter, true);
        Model::validateRequired('validBefore', $this->validBefore, true);
        Model::validateRequired('value', $this->value, true);
        Model::validateRequired('version', $this->version, true);
        Model::validateRequired('chargeTxHash', $this->chargeTxHash, true);
        Model::validateRequired('holderUserAccount', $this->holderUserAccount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bindTime) {
            $res['bind_time'] = $this->bindTime;
        }
        if (null !== $this->bindTxHash) {
            $res['bind_tx_hash'] = $this->bindTxHash;
        }
        if (null !== $this->calStatus) {
            $res['cal_status'] = $this->calStatus;
        }
        if (null !== $this->chargeTime) {
            $res['charge_time'] = $this->chargeTime;
        }
        if (null !== $this->couponCode) {
            $res['coupon_code'] = $this->couponCode;
        }
        if (null !== $this->couponExtCode) {
            $res['coupon_ext_code'] = $this->couponExtCode;
        }
        if (null !== $this->couponId) {
            $res['coupon_id'] = $this->couponId;
        }
        if (null !== $this->couponName) {
            $res['coupon_name'] = $this->couponName;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->createTxHash) {
            $res['create_tx_hash'] = $this->createTxHash;
        }
        if (null !== $this->desensitizedUid) {
            $res['desensitized_uid'] = $this->desensitizedUid;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        if (null !== $this->lastTime) {
            $res['last_time'] = $this->lastTime;
        }
        if (null !== $this->lastTxHash) {
            $res['last_tx_hash'] = $this->lastTxHash;
        }
        if (null !== $this->publicKey) {
            $res['public_key'] = $this->publicKey;
        }
        if (null !== $this->queryCount) {
            $res['query_count'] = $this->queryCount;
        }
        if (null !== $this->queryTime) {
            $res['query_time'] = $this->queryTime;
        }
        if (null !== $this->queryTxHash) {
            $res['query_tx_hash'] = $this->queryTxHash;
        }
        if (null !== $this->riskStatus) {
            $res['risk_status'] = $this->riskStatus;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->uidPublicKey) {
            $res['uid_public_key'] = $this->uidPublicKey;
        }
        if (null !== $this->validAfter) {
            $res['valid_after'] = $this->validAfter;
        }
        if (null !== $this->validBefore) {
            $res['valid_before'] = $this->validBefore;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->chargeTxHash) {
            $res['charge_tx_hash'] = $this->chargeTxHash;
        }
        if (null !== $this->holderUserAccount) {
            $res['holder_user_account'] = $this->holderUserAccount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Coupon
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['bind_time'])) {
            $model->bindTime = $map['bind_time'];
        }
        if (isset($map['bind_tx_hash'])) {
            $model->bindTxHash = $map['bind_tx_hash'];
        }
        if (isset($map['cal_status'])) {
            $model->calStatus = $map['cal_status'];
        }
        if (isset($map['charge_time'])) {
            $model->chargeTime = $map['charge_time'];
        }
        if (isset($map['coupon_code'])) {
            $model->couponCode = $map['coupon_code'];
        }
        if (isset($map['coupon_ext_code'])) {
            $model->couponExtCode = $map['coupon_ext_code'];
        }
        if (isset($map['coupon_id'])) {
            $model->couponId = $map['coupon_id'];
        }
        if (isset($map['coupon_name'])) {
            $model->couponName = $map['coupon_name'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['create_tx_hash'])) {
            $model->createTxHash = $map['create_tx_hash'];
        }
        if (isset($map['desensitized_uid'])) {
            $model->desensitizedUid = $map['desensitized_uid'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }
        if (isset($map['last_time'])) {
            $model->lastTime = $map['last_time'];
        }
        if (isset($map['last_tx_hash'])) {
            $model->lastTxHash = $map['last_tx_hash'];
        }
        if (isset($map['public_key'])) {
            $model->publicKey = $map['public_key'];
        }
        if (isset($map['query_count'])) {
            $model->queryCount = $map['query_count'];
        }
        if (isset($map['query_time'])) {
            $model->queryTime = $map['query_time'];
        }
        if (isset($map['query_tx_hash'])) {
            $model->queryTxHash = $map['query_tx_hash'];
        }
        if (isset($map['risk_status'])) {
            $model->riskStatus = $map['risk_status'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['uid_public_key'])) {
            $model->uidPublicKey = $map['uid_public_key'];
        }
        if (isset($map['valid_after'])) {
            $model->validAfter = $map['valid_after'];
        }
        if (isset($map['valid_before'])) {
            $model->validBefore = $map['valid_before'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['charge_tx_hash'])) {
            $model->chargeTxHash = $map['charge_tx_hash'];
        }
        if (isset($map['holder_user_account'])) {
            $model->holderUserAccount = $map['holder_user_account'];
        }

        return $model;
    }
}
