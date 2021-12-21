<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class InitIpAuthtradeRequest extends Model
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

    // 基础请求参数
    /**
     * @var BaseRequestInfo
     */
    public $baseRequest;

    // 采购者的链上账户Id
    /**
     * @var string
     */
    public $accountId;

    // IP授权交易时传入IP ID；增值服务交易时传入服务ID
    /**
     * @var string
     */
    public $ipId;

    // 0 IP交易，1 增值服务交易
    /**
     * @var int
     */
    public $goodsType;

    // 申请授权合作的备注信息
    /**
     * @var IPOrderApplyInfo
     */
    public $applyInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'accountId'         => 'account_id',
        'ipId'              => 'ip_id',
        'goodsType'         => 'goods_type',
        'applyInfo'         => 'apply_info',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('ipId', $this->ipId, true);
        Model::validateRequired('applyInfo', $this->applyInfo, true);
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
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->ipId) {
            $res['ip_id'] = $this->ipId;
        }
        if (null !== $this->goodsType) {
            $res['goods_type'] = $this->goodsType;
        }
        if (null !== $this->applyInfo) {
            $res['apply_info'] = null !== $this->applyInfo ? $this->applyInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitIpAuthtradeRequest
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
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequestInfo::fromMap($map['base_request']);
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['ip_id'])) {
            $model->ipId = $map['ip_id'];
        }
        if (isset($map['goods_type'])) {
            $model->goodsType = $map['goods_type'];
        }
        if (isset($map['apply_info'])) {
            $model->applyInfo = IPOrderApplyInfo::fromMap($map['apply_info']);
        }

        return $model;
    }
}
