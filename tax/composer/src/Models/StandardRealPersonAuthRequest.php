<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class StandardRealPersonAuthRequest extends Model
{
    // 个人证件号
    /**
     * @example 个人证件号340902xxxx
     *
     * @var string
     */
    public $identityId;

    // 名字
    /**
     * @example 张三
     *
     * @var string
     */
    public $identityName;
    protected $_name = [
        'identityId'   => 'identity_id',
        'identityName' => 'identity_name',
    ];

    public function validate()
    {
        Model::validateRequired('identityId', $this->identityId, true);
        Model::validateRequired('identityName', $this->identityName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->identityId) {
            $res['identity_id'] = $this->identityId;
        }
        if (null !== $this->identityName) {
            $res['identity_name'] = $this->identityName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StandardRealPersonAuthRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['identity_id'])) {
            $model->identityId = $map['identity_id'];
        }
        if (isset($map['identity_name'])) {
            $model->identityName = $map['identity_name'];
        }

        return $model;
    }
}
