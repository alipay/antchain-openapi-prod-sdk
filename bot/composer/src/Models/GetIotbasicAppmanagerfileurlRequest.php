<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class GetIotbasicAppmanagerfileurlRequest extends Model
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

    // 应用包id
    /**
     * @var string
     */
    public $apkId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'apkId'             => 'apk_id',
    ];

    public function validate()
    {
        Model::validateRequired('apkId', $this->apkId, true);
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
        if (null !== $this->apkId) {
            $res['apk_id'] = $this->apkId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetIotbasicAppmanagerfileurlRequest
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
        if (isset($map['apk_id'])) {
            $model->apkId = $map['apk_id'];
        }

        return $model;
    }
}
