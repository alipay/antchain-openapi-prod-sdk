<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class DistributionUser extends Model
{
    // 用户创建时间
    /**
     * @example 2018-01-02 20:00:00
     *
     * @var string
     */
    public $createTime;

    // 用户手机号
    /**
     * @example 13000005555
     *
     * @var string
     */
    public $mobile;

    // 用户唯一标识
    /**
     * @example 000:111:222:333
     *
     * @var string
     */
    public $userId;
    protected $_name = [
        'createTime' => 'create_time',
        'mobile'     => 'mobile',
        'userId'     => 'user_id',
    ];

    public function validate()
    {
        Model::validateRequired('createTime', $this->createTime, true);
        Model::validateRequired('mobile', $this->mobile, true);
        Model::validateRequired('userId', $this->userId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DistributionUser
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }

        return $model;
    }
}
