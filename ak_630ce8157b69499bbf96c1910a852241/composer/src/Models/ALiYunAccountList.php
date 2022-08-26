<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models;

use AlibabaCloud\Tea\Model;

class ALiYunAccountList extends Model
{
    // pagination
    /**
     * @example pagination
     *
     * @var ALiYunPagination
     */
    public $pagination;

    // accounts
    /**
     * @example accounts
     *
     * @var ALiYunAccount[]
     */
    public $accounts;

    // 联盟管理员
    /**
     * @example true, false
     *
     * @var bool
     */
    public $consortiumAdmin;
    protected $_name = [
        'pagination'      => 'pagination',
        'accounts'        => 'accounts',
        'consortiumAdmin' => 'consortium_admin',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->pagination) {
            $res['pagination'] = null !== $this->pagination ? $this->pagination->toMap() : null;
        }
        if (null !== $this->accounts) {
            $res['accounts'] = [];
            if (null !== $this->accounts && \is_array($this->accounts)) {
                $n = 0;
                foreach ($this->accounts as $item) {
                    $res['accounts'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->consortiumAdmin) {
            $res['consortium_admin'] = $this->consortiumAdmin;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunAccountList
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['pagination'])) {
            $model->pagination = ALiYunPagination::fromMap($map['pagination']);
        }
        if (isset($map['accounts'])) {
            if (!empty($map['accounts'])) {
                $model->accounts = [];
                $n               = 0;
                foreach ($map['accounts'] as $item) {
                    $model->accounts[$n++] = null !== $item ? ALiYunAccount::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['consortium_admin'])) {
            $model->consortiumAdmin = $map['consortium_admin'];
        }

        return $model;
    }
}
