<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class SetIpCodeinfoRequest extends Model
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

    // 基础参数
    /**
     * @var BaseRequestInfo
     */
    public $baseRequest;

    // 正版码对应的订单上版权方的账户链上ID
    /**
     * @var string
     */
    public $accountId;

    // 订单ID
    /**
     * @var string
     */
    public $orderId;

    // 正版码商品信息配置列表
    /**
     * @var IPCodeGoodsInfo[]
     */
    public $goodsInfoList;

    // 正版码资源位配置信息列表
    /**
     * @var IPCodeAdvertisingInfo[]
     */
    public $adInfoList;

    // ip版权方信息
    /**
     * @var IPCodeIpOwnerInfo
     */
    public $ipownerInfo;

    // (商家)配置正版码时间
    /**
     * @var string
     */
    public $codeSetTime;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'accountId'         => 'account_id',
        'orderId'           => 'order_id',
        'goodsInfoList'     => 'goods_info_list',
        'adInfoList'        => 'ad_info_list',
        'ipownerInfo'       => 'ipowner_info',
        'codeSetTime'       => 'code_set_time',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validatePattern('codeSetTime', $this->codeSetTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->goodsInfoList) {
            $res['goods_info_list'] = [];
            if (null !== $this->goodsInfoList && \is_array($this->goodsInfoList)) {
                $n = 0;
                foreach ($this->goodsInfoList as $item) {
                    $res['goods_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->adInfoList) {
            $res['ad_info_list'] = [];
            if (null !== $this->adInfoList && \is_array($this->adInfoList)) {
                $n = 0;
                foreach ($this->adInfoList as $item) {
                    $res['ad_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->ipownerInfo) {
            $res['ipowner_info'] = null !== $this->ipownerInfo ? $this->ipownerInfo->toMap() : null;
        }
        if (null !== $this->codeSetTime) {
            $res['code_set_time'] = $this->codeSetTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SetIpCodeinfoRequest
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
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['goods_info_list'])) {
            if (!empty($map['goods_info_list'])) {
                $model->goodsInfoList = [];
                $n                    = 0;
                foreach ($map['goods_info_list'] as $item) {
                    $model->goodsInfoList[$n++] = null !== $item ? IPCodeGoodsInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['ad_info_list'])) {
            if (!empty($map['ad_info_list'])) {
                $model->adInfoList = [];
                $n                 = 0;
                foreach ($map['ad_info_list'] as $item) {
                    $model->adInfoList[$n++] = null !== $item ? IPCodeAdvertisingInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['ipowner_info'])) {
            $model->ipownerInfo = IPCodeIpOwnerInfo::fromMap($map['ipowner_info']);
        }
        if (isset($map['code_set_time'])) {
            $model->codeSetTime = $map['code_set_time'];
        }

        return $model;
    }
}
