<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunUnion extends Model
{
    // 联盟内链的集合
    /**
     * @example 联盟内链的集合
     *
     * @var ALiYunAntChain[]
     */
    public $antChains;

    // 联盟信息
    /**
     * @example 联盟信息
     *
     * @var ALiYunAntConsortium[]
     */
    public $antConsortiums;

    // 联盟Id
    /**
     * @example 联盟Id
     *
     * @var string
     */
    public $consortiumId;

    // 联盟成员信息
    /**
     * @example 联盟成员信息
     *
     * @var ALiYunMember[]
     */
    public $members;

    // 阿里云分页属性
    /**
     * @example 阿里云分页属性
     *
     * @var ALiYunPagination
     */
    public $pagination;

    // is_exist
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isExist;
    protected $_name = [
        'antChains'      => 'ant_chains',
        'antConsortiums' => 'ant_consortiums',
        'consortiumId'   => 'consortium_id',
        'members'        => 'members',
        'pagination'     => 'pagination',
        'isExist'        => 'is_exist',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->antChains) {
            $res['ant_chains'] = [];
            if (null !== $this->antChains && \is_array($this->antChains)) {
                $n = 0;
                foreach ($this->antChains as $item) {
                    $res['ant_chains'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->antConsortiums) {
            $res['ant_consortiums'] = [];
            if (null !== $this->antConsortiums && \is_array($this->antConsortiums)) {
                $n = 0;
                foreach ($this->antConsortiums as $item) {
                    $res['ant_consortiums'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->consortiumId) {
            $res['consortium_id'] = $this->consortiumId;
        }
        if (null !== $this->members) {
            $res['members'] = [];
            if (null !== $this->members && \is_array($this->members)) {
                $n = 0;
                foreach ($this->members as $item) {
                    $res['members'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->pagination) {
            $res['pagination'] = null !== $this->pagination ? $this->pagination->toMap() : null;
        }
        if (null !== $this->isExist) {
            $res['is_exist'] = $this->isExist;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunUnion
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ant_chains'])) {
            if (!empty($map['ant_chains'])) {
                $model->antChains = [];
                $n                = 0;
                foreach ($map['ant_chains'] as $item) {
                    $model->antChains[$n++] = null !== $item ? ALiYunAntChain::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['ant_consortiums'])) {
            if (!empty($map['ant_consortiums'])) {
                $model->antConsortiums = [];
                $n                     = 0;
                foreach ($map['ant_consortiums'] as $item) {
                    $model->antConsortiums[$n++] = null !== $item ? ALiYunAntConsortium::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['consortium_id'])) {
            $model->consortiumId = $map['consortium_id'];
        }
        if (isset($map['members'])) {
            if (!empty($map['members'])) {
                $model->members = [];
                $n              = 0;
                foreach ($map['members'] as $item) {
                    $model->members[$n++] = null !== $item ? ALiYunMember::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['pagination'])) {
            $model->pagination = ALiYunPagination::fromMap($map['pagination']);
        }
        if (isset($map['is_exist'])) {
            $model->isExist = $map['is_exist'];
        }

        return $model;
    }
}
