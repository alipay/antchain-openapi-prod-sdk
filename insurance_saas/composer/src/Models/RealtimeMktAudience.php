<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class RealtimeMktAudience extends Model
{
    // 加密用户标识
    /**
     * @example xxxxx
     *
     * @var string
     */
    public $encryptedUserId;

    // 扩展信息
    /**
     * @example {}
     *
     * @var string
     */
    public $extInfo;
    protected $_name = [
        'encryptedUserId' => 'encrypted_user_id',
        'extInfo'         => 'ext_info',
    ];

    public function validate()
    {
        Model::validateRequired('encryptedUserId', $this->encryptedUserId, true);
        Model::validateRequired('extInfo', $this->extInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->encryptedUserId) {
            $res['encrypted_user_id'] = $this->encryptedUserId;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RealtimeMktAudience
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['encrypted_user_id'])) {
            $model->encryptedUserId = $map['encrypted_user_id'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }

        return $model;
    }
}
