<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class SyncIotbasicDevicegenerateRequest extends Model
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

    // 设备厂商名称
    /**
     * @var string
     */
    public $corpName;

    // 设备sn
    /**
     * @var string
     */
    public $deviceSn;

    // 公钥
    /**
     * @var string
     */
    public $pubKey;

    // 所属业务
    /**
     * @var string
     */
    public $bizScene;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'corpName'          => 'corp_name',
        'deviceSn'          => 'device_sn',
        'pubKey'            => 'pub_key',
        'bizScene'          => 'biz_scene',
    ];

    public function validate()
    {
        Model::validateRequired('corpName', $this->corpName, true);
        Model::validateRequired('deviceSn', $this->deviceSn, true);
        Model::validateRequired('pubKey', $this->pubKey, true);
        Model::validateRequired('bizScene', $this->bizScene, true);
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
        if (null !== $this->corpName) {
            $res['corp_name'] = $this->corpName;
        }
        if (null !== $this->deviceSn) {
            $res['device_sn'] = $this->deviceSn;
        }
        if (null !== $this->pubKey) {
            $res['pub_key'] = $this->pubKey;
        }
        if (null !== $this->bizScene) {
            $res['biz_scene'] = $this->bizScene;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncIotbasicDevicegenerateRequest
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
        if (isset($map['corp_name'])) {
            $model->corpName = $map['corp_name'];
        }
        if (isset($map['device_sn'])) {
            $model->deviceSn = $map['device_sn'];
        }
        if (isset($map['pub_key'])) {
            $model->pubKey = $map['pub_key'];
        }
        if (isset($map['biz_scene'])) {
            $model->bizScene = $map['biz_scene'];
        }

        return $model;
    }
}
