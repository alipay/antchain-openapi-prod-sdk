<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class NotifyDubbridgeCallbackRequest extends Model
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

    // 租户id
    /**
     * @var string
     */
    public $channelCode;

    // json参数
    /**
     * @var string
     */
    public $bizParam;

    // 回调类型（1授信回调2用信回调）
    /**
     * @var string
     */
    public $bizType;

    // 对应授信/用信传给三方留存单号
    /**
     * @var string
     */
    public $seqNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'channelCode'       => 'channel_code',
        'bizParam'          => 'biz_param',
        'bizType'           => 'biz_type',
        'seqNo'             => 'seq_no',
    ];

    public function validate()
    {
        Model::validateRequired('channelCode', $this->channelCode, true);
        Model::validateRequired('bizParam', $this->bizParam, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('seqNo', $this->seqNo, true);
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
        if (null !== $this->channelCode) {
            $res['channel_code'] = $this->channelCode;
        }
        if (null !== $this->bizParam) {
            $res['biz_param'] = $this->bizParam;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->seqNo) {
            $res['seq_no'] = $this->seqNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotifyDubbridgeCallbackRequest
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
        if (isset($map['channel_code'])) {
            $model->channelCode = $map['channel_code'];
        }
        if (isset($map['biz_param'])) {
            $model->bizParam = $map['biz_param'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['seq_no'])) {
            $model->seqNo = $map['seq_no'];
        }

        return $model;
    }
}
