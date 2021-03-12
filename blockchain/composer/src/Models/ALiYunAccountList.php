<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

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
    protected $_name = [
        'pagination' => 'pagination',
        'accounts'   => 'accounts',
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

        return $model;
    }
}
