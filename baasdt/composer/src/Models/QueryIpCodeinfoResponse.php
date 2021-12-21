<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryIpCodeinfoResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 订单ID
    /**
     * @var string
     */
    public $orderId;

    // 额外功能，包括基础功能，是否允许收藏等
    /**
     * @var int[]
     */
    public $features;

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

    // 0:未配置，1:配置成功可展示，9:下架【本期不实现】
    /**
     * @var int
     */
    public $ipCodeStatus;

    // 正版码前缀
    //
    /**
     * @var string
     */
    public $showCodePrefix;

    // 正版码配置附加信息，信息内容由调用方自定义。
    /**
     * @var string
     */
    public $extInfo;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'orderId'        => 'order_id',
        'features'       => 'features',
        'goodsInfoList'  => 'goods_info_list',
        'adInfoList'     => 'ad_info_list',
        'ipownerInfo'    => 'ipowner_info',
        'ipCodeStatus'   => 'ip_code_status',
        'showCodePrefix' => 'show_code_prefix',
        'extInfo'        => 'ext_info',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->features) {
            $res['features'] = $this->features;
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
        if (null !== $this->ipCodeStatus) {
            $res['ip_code_status'] = $this->ipCodeStatus;
        }
        if (null !== $this->showCodePrefix) {
            $res['show_code_prefix'] = $this->showCodePrefix;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryIpCodeinfoResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['features'])) {
            if (!empty($map['features'])) {
                $model->features = $map['features'];
            }
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
        if (isset($map['ip_code_status'])) {
            $model->ipCodeStatus = $map['ip_code_status'];
        }
        if (isset($map['show_code_prefix'])) {
            $model->showCodePrefix = $map['show_code_prefix'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }

        return $model;
    }
}
