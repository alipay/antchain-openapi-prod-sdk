<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class UpdateDubbridgeAccountCustomRequest extends Model
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

    // 渠道编码
    /**
     * @var string
     */
    public $channelCode;

    // 新渠道id
    /**
     * @var string
     */
    public $newOpenId;

    // 原渠道id
    /**
     * @var string
     */
    public $sourceOpenId;

    // 客户号
    /**
     * @var string
     */
    public $customerNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'channelCode'       => 'channel_code',
        'newOpenId'         => 'new_open_id',
        'sourceOpenId'      => 'source_open_id',
        'customerNo'        => 'customer_no',
    ];

    public function validate()
    {
        Model::validateRequired('channelCode', $this->channelCode, true);
        Model::validateRequired('newOpenId', $this->newOpenId, true);
        Model::validateRequired('sourceOpenId', $this->sourceOpenId, true);
        Model::validateRequired('customerNo', $this->customerNo, true);
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
        if (null !== $this->newOpenId) {
            $res['new_open_id'] = $this->newOpenId;
        }
        if (null !== $this->sourceOpenId) {
            $res['source_open_id'] = $this->sourceOpenId;
        }
        if (null !== $this->customerNo) {
            $res['customer_no'] = $this->customerNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDubbridgeAccountCustomRequest
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
        if (isset($map['new_open_id'])) {
            $model->newOpenId = $map['new_open_id'];
        }
        if (isset($map['source_open_id'])) {
            $model->sourceOpenId = $map['source_open_id'];
        }
        if (isset($map['customer_no'])) {
            $model->customerNo = $map['customer_no'];
        }

        return $model;
    }
}
