<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class QueryCutpaymentOneclickRequest extends Model
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

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
    /**
     * @var string
     */
    public $outerOrderNo;

    // 一键绑卡商户跳转的请求ID
    /**
     * @var string
     */
    public $preOuterOrderNo;

    // 渠道ID
    /**
     * @var string
     */
    public $channelId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outerOrderNo'      => 'outer_order_no',
        'preOuterOrderNo'   => 'pre_outer_order_no',
        'channelId'         => 'channel_id',
    ];

    public function validate()
    {
        Model::validateRequired('outerOrderNo', $this->outerOrderNo, true);
        Model::validateRequired('preOuterOrderNo', $this->preOuterOrderNo, true);
        Model::validateRequired('channelId', $this->channelId, true);
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
        if (null !== $this->outerOrderNo) {
            $res['outer_order_no'] = $this->outerOrderNo;
        }
        if (null !== $this->preOuterOrderNo) {
            $res['pre_outer_order_no'] = $this->preOuterOrderNo;
        }
        if (null !== $this->channelId) {
            $res['channel_id'] = $this->channelId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCutpaymentOneclickRequest
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
        if (isset($map['outer_order_no'])) {
            $model->outerOrderNo = $map['outer_order_no'];
        }
        if (isset($map['pre_outer_order_no'])) {
            $model->preOuterOrderNo = $map['pre_outer_order_no'];
        }
        if (isset($map['channel_id'])) {
            $model->channelId = $map['channel_id'];
        }

        return $model;
    }
}
