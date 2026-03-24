<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class Residency extends Model
{
    // 证件是否最新（1 最新、0非最新）
    /**
     * @example 0
     *
     * @var string
     */
    public $isNewest;

    // 证件是否挂失（1 挂失、0非挂失）
    /**
     * @example 0
     *
     * @var string
     */
    public $isLosted;

    // 证件是否过期（1 过期、0非过期）
    /**
     * @example 0
     *
     * @var string
     */
    public $isExpired;

    // 户籍状态
    // 0 有效
    // 1 有效（户籍迁出，但未迁入）
    // 2 无效（死亡、失踪、迁出、服 兵役、出国境定居、消除重复登记人口、冻结户口、重载注销等）
    /**
     * @example 0
     *
     * @var string
     */
    public $residencyStatus;
    protected $_name = [
        'isNewest'        => 'is_newest',
        'isLosted'        => 'is_losted',
        'isExpired'       => 'is_expired',
        'residencyStatus' => 'residency_status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->isNewest) {
            $res['is_newest'] = $this->isNewest;
        }
        if (null !== $this->isLosted) {
            $res['is_losted'] = $this->isLosted;
        }
        if (null !== $this->isExpired) {
            $res['is_expired'] = $this->isExpired;
        }
        if (null !== $this->residencyStatus) {
            $res['residency_status'] = $this->residencyStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Residency
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['is_newest'])) {
            $model->isNewest = $map['is_newest'];
        }
        if (isset($map['is_losted'])) {
            $model->isLosted = $map['is_losted'];
        }
        if (isset($map['is_expired'])) {
            $model->isExpired = $map['is_expired'];
        }
        if (isset($map['residency_status'])) {
            $model->residencyStatus = $map['residency_status'];
        }

        return $model;
    }
}
