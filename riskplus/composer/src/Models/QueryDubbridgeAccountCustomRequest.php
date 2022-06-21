<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeAccountCustomRequest extends Model
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

    // 渠道号
    /**
     * @var string
     */
    public $channelCode;

    // 客户编码
    /**
     * @var string
     */
    public $customNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'channelCode'       => 'channel_code',
        'customNo'          => 'custom_no',
    ];

    public function validate()
    {
        Model::validateRequired('customNo', $this->customNo, true);
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
        if (null !== $this->customNo) {
            $res['custom_no'] = $this->customNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeAccountCustomRequest
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
        if (isset($map['custom_no'])) {
            $model->customNo = $map['custom_no'];
        }

        return $model;
    }
}
