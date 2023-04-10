<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\FAIROPENNET\Models;

use AlibabaCloud\Tea\Model;

class PartyInfo extends Model
{
    /**
     * @example
     *
     * @var string
     */
    public $partyId;

    /**
     * @example
     *
     * @var string
     */
    public $desc;

    /**
     * @example
     *
     * @var string
     */
    public $privateKey;

    /**
     * @example
     *
     * @var string
     */
    public $privateKeyPasswd;

    /**
     * @example
     *
     * @var string
     */
    public $recoverKey;

    /**
     * @example
     *
     * @var string
     */
    public $recoveryKeyPasswd;
    protected $_name = [
        'partyId'           => 'party_id',
        'desc'              => 'desc',
        'privateKey'        => 'private_key',
        'privateKeyPasswd'  => 'private_key_passwd',
        'recoverKey'        => 'recover_key',
        'recoveryKeyPasswd' => 'recovery_key_passwd',
    ];

    public function validate()
    {
        Model::validateRequired('partyId', $this->partyId, true);
        Model::validateRequired('desc', $this->desc, true);
        Model::validateRequired('privateKey', $this->privateKey, true);
        Model::validateRequired('privateKeyPasswd', $this->privateKeyPasswd, true);
        Model::validateRequired('recoverKey', $this->recoverKey, true);
        Model::validateRequired('recoveryKeyPasswd', $this->recoveryKeyPasswd, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->partyId) {
            $res['party_id'] = $this->partyId;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->privateKey) {
            $res['private_key'] = $this->privateKey;
        }
        if (null !== $this->privateKeyPasswd) {
            $res['private_key_passwd'] = $this->privateKeyPasswd;
        }
        if (null !== $this->recoverKey) {
            $res['recover_key'] = $this->recoverKey;
        }
        if (null !== $this->recoveryKeyPasswd) {
            $res['recovery_key_passwd'] = $this->recoveryKeyPasswd;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PartyInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['party_id'])) {
            $model->partyId = $map['party_id'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }
        if (isset($map['private_key'])) {
            $model->privateKey = $map['private_key'];
        }
        if (isset($map['private_key_passwd'])) {
            $model->privateKeyPasswd = $map['private_key_passwd'];
        }
        if (isset($map['recover_key'])) {
            $model->recoverKey = $map['recover_key'];
        }
        if (isset($map['recovery_key_passwd'])) {
            $model->recoveryKeyPasswd = $map['recovery_key_passwd'];
        }

        return $model;
    }
}
