<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYCHARITY\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryActivityrecordRequest extends Model
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

    // 元徽章id
    /**
     * @var string
     */
    public $poapMetaId;

    // 支付宝用户UID
    /**
     * @var string
     */
    public $alipayUserId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'poapMetaId'        => 'poap_meta_id',
        'alipayUserId'      => 'alipay_user_id',
    ];

    public function validate()
    {
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
        if (null !== $this->poapMetaId) {
            $res['poap_meta_id'] = $this->poapMetaId;
        }
        if (null !== $this->alipayUserId) {
            $res['alipay_user_id'] = $this->alipayUserId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryActivityrecordRequest
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
        if (isset($map['poap_meta_id'])) {
            $model->poapMetaId = $map['poap_meta_id'];
        }
        if (isset($map['alipay_user_id'])) {
            $model->alipayUserId = $map['alipay_user_id'];
        }

        return $model;
    }
}
