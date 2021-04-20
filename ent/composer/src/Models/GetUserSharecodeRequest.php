<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT\Models;

use AlibabaCloud\Tea\Model;

class GetUserSharecodeRequest extends Model
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

    // 分享者账号，如果账号类型为手机号则格式如 +86-11 位手机号，如果账号类型为支付宝账号，则填写邮箱地址或者 11 位手机号
    /**
     * @var string
     */
    public $sharerId;

    // 分享者账号类型，PHONE：手机号，ALIPAY_LOGON_ID：支付宝账号
    /**
     * @var string
     */
    public $sharerIdType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'sharerId'          => 'sharer_id',
        'sharerIdType'      => 'sharer_id_type',
    ];

    public function validate()
    {
        Model::validateRequired('sharerId', $this->sharerId, true);
        Model::validateRequired('sharerIdType', $this->sharerIdType, true);
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
        if (null !== $this->sharerId) {
            $res['sharer_id'] = $this->sharerId;
        }
        if (null !== $this->sharerIdType) {
            $res['sharer_id_type'] = $this->sharerIdType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetUserSharecodeRequest
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
        if (isset($map['sharer_id'])) {
            $model->sharerId = $map['sharer_id'];
        }
        if (isset($map['sharer_id_type'])) {
            $model->sharerIdType = $map['sharer_id_type'];
        }

        return $model;
    }
}
