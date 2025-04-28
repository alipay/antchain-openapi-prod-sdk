<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CarKeyInitData extends Model
{
    // IIFFAA 根密钥
    /**
     * @example fs
     *
     * @var string
     */
    public $rootPubKey;

    // IIFAA 设备唯一ID
    /**
     * @example e2eer
     *
     * @var string
     */
    public $tuid;

    // 业务密钥
    /**
     * @example erw
     *
     * @var string
     */
    public $bizPrivKey;

    // 设备唯一密钥
    /**
     * @example fdsw
     *
     * @var string
     */
    public $devicePrivKey;

    // 无感空车凭证
    /**
     * @example rew
     *
     * @var string
     */
    public $keyLessAuthy;
    protected $_name = [
        'rootPubKey'    => 'root_pub_key',
        'tuid'          => 'tuid',
        'bizPrivKey'    => 'biz_priv_key',
        'devicePrivKey' => 'device_priv_key',
        'keyLessAuthy'  => 'key_less_authy',
    ];

    public function validate()
    {
        Model::validateRequired('rootPubKey', $this->rootPubKey, true);
        Model::validateRequired('tuid', $this->tuid, true);
        Model::validateRequired('bizPrivKey', $this->bizPrivKey, true);
        Model::validateRequired('devicePrivKey', $this->devicePrivKey, true);
        Model::validateRequired('keyLessAuthy', $this->keyLessAuthy, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->rootPubKey) {
            $res['root_pub_key'] = $this->rootPubKey;
        }
        if (null !== $this->tuid) {
            $res['tuid'] = $this->tuid;
        }
        if (null !== $this->bizPrivKey) {
            $res['biz_priv_key'] = $this->bizPrivKey;
        }
        if (null !== $this->devicePrivKey) {
            $res['device_priv_key'] = $this->devicePrivKey;
        }
        if (null !== $this->keyLessAuthy) {
            $res['key_less_authy'] = $this->keyLessAuthy;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CarKeyInitData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['root_pub_key'])) {
            $model->rootPubKey = $map['root_pub_key'];
        }
        if (isset($map['tuid'])) {
            $model->tuid = $map['tuid'];
        }
        if (isset($map['biz_priv_key'])) {
            $model->bizPrivKey = $map['biz_priv_key'];
        }
        if (isset($map['device_priv_key'])) {
            $model->devicePrivKey = $map['device_priv_key'];
        }
        if (isset($map['key_less_authy'])) {
            $model->keyLessAuthy = $map['key_less_authy'];
        }

        return $model;
    }
}
