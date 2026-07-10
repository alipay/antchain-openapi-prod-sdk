<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class DciRightInfo extends Model
{
    // 作品权利范围
    /**
     * @example PUBLICATION
     *
     * @var string
     */
    public $rightScope;

    // 权利取得方式
    /**
     * @example ORIGINAL
     *
     * @var string
     */
    public $rightObtainWay;

    // 权利归属方式
    /**
     * @example PERSONAL
     *
     * @var string
     */
    public $ownershipWay;
    protected $_name = [
        'rightScope'     => 'right_scope',
        'rightObtainWay' => 'right_obtain_way',
        'ownershipWay'   => 'ownership_way',
    ];

    public function validate()
    {
        Model::validateRequired('rightScope', $this->rightScope, true);
        Model::validateRequired('rightObtainWay', $this->rightObtainWay, true);
        Model::validateRequired('ownershipWay', $this->ownershipWay, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->rightScope) {
            $res['right_scope'] = $this->rightScope;
        }
        if (null !== $this->rightObtainWay) {
            $res['right_obtain_way'] = $this->rightObtainWay;
        }
        if (null !== $this->ownershipWay) {
            $res['ownership_way'] = $this->ownershipWay;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DciRightInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['right_scope'])) {
            $model->rightScope = $map['right_scope'];
        }
        if (isset($map['right_obtain_way'])) {
            $model->rightObtainWay = $map['right_obtain_way'];
        }
        if (isset($map['ownership_way'])) {
            $model->ownershipWay = $map['ownership_way'];
        }

        return $model;
    }
}
