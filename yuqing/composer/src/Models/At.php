<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class At extends Model
{
    // @手机号
    /**
     * @example @手机号
     *
     * @var string[]
     */
    public $atMobiles;

    // @用户ID
    /**
     * @example @用户ID
     *
     * @var string[]
     */
    public $atUserIds;

    // @所有人
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isAtAll;
    protected $_name = [
        'atMobiles' => 'at_mobiles',
        'atUserIds' => 'at_user_ids',
        'isAtAll'   => 'is_at_all',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->atMobiles) {
            $res['at_mobiles'] = $this->atMobiles;
        }
        if (null !== $this->atUserIds) {
            $res['at_user_ids'] = $this->atUserIds;
        }
        if (null !== $this->isAtAll) {
            $res['is_at_all'] = $this->isAtAll;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return At
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['at_mobiles'])) {
            if (!empty($map['at_mobiles'])) {
                $model->atMobiles = $map['at_mobiles'];
            }
        }
        if (isset($map['at_user_ids'])) {
            if (!empty($map['at_user_ids'])) {
                $model->atUserIds = $map['at_user_ids'];
            }
        }
        if (isset($map['is_at_all'])) {
            $model->isAtAll = $map['is_at_all'];
        }

        return $model;
    }
}
